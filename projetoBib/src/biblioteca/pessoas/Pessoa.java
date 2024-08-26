package biblioteca.pessoas;

/*
 * Classe abstrata Pessoa que serve como base para Cliente e Funcionario.
 * Contém atributos comuns como nome e cpf
 */
public abstract class Pessoa {
    private String nome;
    private String cpf;

    /*
     * Construtor para inicializar o nome e CPF da pessoa.
     * 
     * @param nome O nome da pessoa.
     * @param cpf O CPF da pessoa.
     */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Métodos getters para acessar os atributos privados

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    // Método abstrato que séra implementado pelas subclasses
    public abstract void exibirInfo();
}
