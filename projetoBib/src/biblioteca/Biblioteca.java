package biblioteca;

import biblioteca.livros.Livro; // Importa a classe Livro do pacote livros
import java.util.ArrayList;
import java.util.List; // Importa a classe ArrayList para manipulação de listas


/**
 * Classe Biblioteca que gerencia uma coleção de livros.
 */
public class Biblioteca {
    private List<Livro> livros; // Lista que armazena os livros da biblioteca

    /**
     * Construtor da classe Biblioteca.
     * Inicializa a lista de livros como um novo ArrayList.
     */
    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    /**
     * Método para adicionar um livro à biblioteca.
     * @param livro O livro a ser adicionado.
     */
    public void adicionarLivro(Livro livro) {
        livros.add(livro); // Adiciona o livro à lista de livros
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    /**
     * Método para listar todos os livros da biblioteca.
     */
    public void listarLivros() {
        System.out.println("Livros na biblioteca: ");
        for (Livro livro : livros) {
            livro.exibirInfo(); // Chama método para exibir infomações do livro
        }
    }

    /**
     * Método para buscar um livro pelo título.
     * @param titulo O título do livro a ser buscado.
     * @return O livro encontrado, ou null se não encontrado.
     */
    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro; // Retorna o livro se encontrado
            }
        }
        System.out.println("Livro não encontrado: " + titulo);
        return null; // Retorna null se o livro não for encontrado
    } 

    /**
     * Método para emprestar um livro.
     * @param titulo O título do livro a ser emprestado.
     */
    public void emprestarLivro(String titulo) {
        // Busca o livro pelo título fornecido
        Livro livro = buscarLivroPorTitulo(titulo);
        
        // Verifica se o livro foi encontrado e se está disponível para empréstimo
        if (livro != null && livro.isDisponivel()) {
            livro.setDisponivel(false); // Marca o livro como não disponível
            System.out.println("Livro emprestado: " + livro.getTitulo());
        } else {
            // Caso o livro não esteja disponível ou não tenha sido encontrado
            System.out.println("Livro não disponível para empréstimo.");
        }
    }
    
    /**
     * Método para devolver um livro.
     * @param titulo O título do livro a ser devolvido.
     */
    public void devolverLivro(String titulo) {
        Livro livro = buscarLivroPorTitulo(titulo);
        if (livro != null && !livro.isDisponivel()) {
            livro.setDisponivel(true); // Marca o livro como disponível
            System.out.println("Livro devolvido: " + livro.getTitulo());
        } else {
            System.out.println("Livro não encontrado ou já estava disponível");
        }

    }
}
