package biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList> livros = new HashMap<>();
        int opcao = 0;
        String autor, obra, titulo;

        do {
            boolean opcaoValida = false;

            do {
                try {
                    FuncoesBiblioteca.exibirMenu();
                    System.out.print("Digite a opção: ");
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("____________________________");
                    opcaoValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Você digitou a opção incorretamente! Tente novamente.");
                    scanner.nextLine();
                }
            } while (!opcaoValida);

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do autor: ");
                    autor = scanner.nextLine();
                    System.out.print("Digite o nome da obra: ");
                    obra = scanner.nextLine();
                    System.out.println("____________________________");

                    boolean livroAdicionado = FuncoesBiblioteca.adicionar(livros, autor, obra);

                    System.out.println((livroAdicionado) ? "Livro adicionado com sucesso!" : "Esse Livro já existe na biblioteca!");

                    break;
                case 2:
                    System.out.print("Digite o titulo da obra: ");
                    titulo = scanner.nextLine();
                    System.out.println("____________________________");

                    ArrayList dadosDaPesquisa = FuncoesBiblioteca.pesquisar(livros, titulo);

                    boolean livroEncontrado = (Boolean) dadosDaPesquisa.get(0);

                    if (livroEncontrado) {
                        System.out.println("Livro encotrado!");
                        System.out.println("NOME : " + dadosDaPesquisa.get(1));
                        System.out.println("AUTOR: " + dadosDaPesquisa.get(2));
                    } else {
                        System.out.println("Esse livro não foi encontrado!");
                    }

                    break;
                case 3:
                    FuncoesBiblioteca.listar(livros);
                    break;
                case 4:
                    System.out.print("Digite o titulo da obra: ");
                    titulo = scanner.nextLine();
                    System.out.println("____________________________");

                    boolean livroRemovido = FuncoesBiblioteca.excluir(livros, titulo);

                    System.out.println((livroRemovido) ? "Livro removido com sucesso!" : "Livro não encotrado!");
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção Invalida!, Digite novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}