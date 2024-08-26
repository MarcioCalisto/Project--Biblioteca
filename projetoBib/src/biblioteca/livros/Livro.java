package biblioteca.livros;

/**
 * Classe que representa um livro na biblioteca.
 */
public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    /**
     * Construtor da classe Livro.
     * @param titulo O título do livro.
     * @param autor O autor do livro.
     */
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; // Por padrão, o livro está diponivel
    }

    // Métodos Getters
    public String getTitulo() {
        return titulo;
    }
    
    public String autor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    // Método Setters
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    /**
     * Método para exibir informações do livro.
     */
    public void exibirInfo(){
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Disponível: " + (disponivel ? "Sim" : "Não"));
    }
}
