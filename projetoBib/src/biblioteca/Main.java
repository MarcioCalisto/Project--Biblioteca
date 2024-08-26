package biblioteca;

import biblioteca.livros.Livro; // importa a classe Livro
import biblioteca.pessoas.Cliente; // importa a classe Cliente
import biblioteca.pessoas.Funcionario; // Importa a classe Funcionario

/*
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


        // Emprestar um livro


        // Tentar emprestar o mesmo livro novamente


        // Devolver o livro


        // Listar todos os livros após as operações


        // Criar um cliente e um funcionário


        // Exibir informações de um cliente e um funcionário

        
        }
}
