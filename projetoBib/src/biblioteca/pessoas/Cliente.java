package biblioteca.pessoas;

/*
 * A classe Cliente herda de Pessoa e representa um cliente na biblioteca.
 * Adiciona o atributo para o número de livros emprestados.
 */
public class Cliente extends Pessoa {
    private int numLivroEmprestados; // Número de livros emprestados pelo cliente.

    /*
     * Construtor para inicializar o nome, CPF e definir o número de livros emprestados como zero.
     * 
     * @param nome O nome do cliente.
     * @param cpf O CPF do cliente.
     */
    public Cliente(String nome, String cpf) {
        super(nome, cpf);       // Chama o construtor da classe base Pessoa.
        this.numLivroEmprestados = 0; // Inicializa o número de livros emprestados como zero.
    }

    // Implementação do método abstrato exbirInfo
    @Override
    public void exibirInfo() {
        System.out.println("Cliente: " + getNome() + ", cpf: " + getCpf() + ", Livros emprestados: " + numLivroEmprestados);
    }

    // Métodos para gerenciar o número de livros emprestados

    public void emprestarLivro() {
        numLivroEmprestados ++;
    }

    public void devolverLivro() {
        numLivroEmprestados --;
    }
}
