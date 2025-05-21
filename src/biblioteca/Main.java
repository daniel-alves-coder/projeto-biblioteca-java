package biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList> livros = new HashMap<>();
        int opcao;
        String autor, obra, titulo;

        do {
            FuncoesBiblioteca.exibirMenu();
            System.out.print("Digite a opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do autor: ");
                    autor = scanner.nextLine();
                    System.out.print("Digite o nome da obra: ");
                    obra = scanner.nextLine();

                    boolean livroAdicionado = FuncoesBiblioteca.adicionar(livros, autor, obra);

                    if (livroAdicionado) {
                        System.out.println("Livro adicionado com sucesso!");
                    } else {
                        System.out.println("Esse Livro já existe na biblioteca!");
                    }
                    break;
                case 2:
                    System.out.print("Digite o titulo da obra: ");
                    titulo = scanner.nextLine();
                    ArrayList dadosDaPesquisa = FuncoesBiblioteca.pesquisar(livros, titulo);

                    boolean livroEncontrado = (Boolean) dadosDaPesquisa.get(0);

                    if (livroEncontrado) {
                        System.out.println("____________________________");
                        System.out.println("Livro encotrado!");
                        System.out.println("NOME : " + dadosDaPesquisa.get(1));
                        System.out.println("AUTOR: " + dadosDaPesquisa.get(2));
                    } else {
                        System.out.println("____________________________");
                        System.out.println("Esse livro não foi encontrado!");
                    }

                    break;
                case 3:
                    FuncoesBiblioteca.listar(livros);
                    break;
                case 4:
                    System.out.print("Digite o titulo da obra: ");
                    titulo = scanner.nextLine();

                    boolean livroRemovido = FuncoesBiblioteca.excluir(livros, titulo);

                    if (livroRemovido) {
                        System.out.println("Livro removido com sucesso!");
                    } else {
                        System.out.println("Livro não encotrado!");
                    }
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