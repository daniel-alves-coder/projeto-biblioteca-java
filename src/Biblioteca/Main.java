package Biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList> livros = new HashMap<>();
        int opcao = 0;
        String autor;
        String obra;
        String titulo;

        while (opcao != 5) {
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

                    if (livroAdicionado){
                        System.out.println("Livro adicionado com sucesso!");
                    }else {
                        System.out.println("Esse Livro já existe na biblioteca!");
                    }
                    break;
                case 2:
                    System.out.print("Digite o titulo da obra: ");
                    titulo = scanner.nextLine();
                    FuncoesBiblioteca.pesquisar(livros, titulo);
                    break;
                case 3:
                    FuncoesBiblioteca.listar(livros);
                    break;
                case 4:
                    System.out.print("Digite o titulo da obra: ");
                    titulo = scanner.nextLine();
                    boolean livroRemovido = FuncoesBiblioteca.excluir(livros, titulo);

                    if (livroRemovido){
                        System.out.println("Livro removido com sucesso!");
                    }else{
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
        }
        scanner.close();
    }
}