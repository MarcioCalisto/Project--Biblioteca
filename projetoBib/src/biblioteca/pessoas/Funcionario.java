package biblioteca.pessoas;

/**
 * A classe Funcionario herda de Pessoa e representa um funcionário da biblioteca. 
 * Adiciona o atributo para o cargo de funcionário.
 */

public class Funcionario extends Pessoa {
    private String cargo; // Cargo do funcionário da biblioteca.

    /**
     * Contrutor para inicializar o nome, o CPF e o cargo do funcionário.
     * 
     * @param nome O nome do funcionário.
     * @param cpf O CPF do funcionário. 
     * @param cargo O cargo do funcionário.
     */
    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
        this.cargo = cargo;
    }

    // Implementação do método exibirInfo
    // @Override
    // public void exbirInfo() {
    //     System.out.printl("Funcionário: " + getNome() + ", cpf: " + getCpf() + ", Livros emprestados: " + cargo);
    // }

    @Override
    public void exibirInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Funcionário: " + getNome() + ", cpf: " + getCpf() + ", cargo: " + cargo);
    }

}
