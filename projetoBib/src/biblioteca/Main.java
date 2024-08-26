package biblioteca;

import biblioteca.livros.Livro; // importa a classe Livro
import biblioteca.pessoas.Cliente; // importa a classe Cliente
import biblioteca.pessoas.Funcionario; // Importa a classe Funcionario

/**
 * A classe Main é o ponto de entrada do programa.
 * Cria uma instância da biblioteca, adiciona livros e exibe operações.
 */
public class Main {
    public static void main(String[] args) {
        // Criação de uma instância da biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros a biblioteca
        Livro livro1 = new Livro("Dom Quixote", "Minguel de Cervantes");
        Livro livro2 = new Livro("1984", "George Orwell");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Listar todos os livros
        biblioteca.listarLivros();

        // Emprestar um livro 
        biblioteca.emprestarLivro("1984");

        // Tentar emprestar o mesmo livro novamente
        biblioteca.emprestarLivro("1984");

        // Devolver o livro
        biblioteca.devolverLivro("1984");

        // Listar todos os livros após as operações
        biblioteca.listarLivros();

        // Criar um cliente e um funcionário
        Cliente cliente = new Cliente("João Silva", "123.456.789.01");
        Funcionario funcionario = new Funcionario("Daniel Maia", "123.456.789.01");

        // Exibir informações de um cliente e um funcionário
        cliente.exibirInfo();
        funcionario.exibirInfo();


        }
}
