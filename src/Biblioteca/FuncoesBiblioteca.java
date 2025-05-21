package Biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class FuncoesBiblioteca {

    public static void exibirMenu() {
        System.out.println("____________________________");
        System.out.println("MENU");
        System.out.println("____________________________");
        System.out.println("1 - Adicionar");
        System.out.println("2 - Pesquisar");
        System.out.println("3 - Listar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Sair");
        System.out.println("____________________________");
    }

    public static boolean adicionar(HashMap<String, ArrayList> listaLivros, String autor, String obra) {
        boolean livroAdicionado = false;

        if (listaLivros.containsKey(autor)) {
            for (ArrayList<String> elementos : listaLivros.values()) {
                if (elementos.contains(obra)) {
                    livroAdicionado = false;
                }else{
                    livroAdicionado = true;
                    elementos.add(obra);
                }
            }
        } else {
            ArrayList<String> livro = new ArrayList<>();
            listaLivros.put(autor, livro);
            livro.add(obra);
            livroAdicionado = true;
        }
        return livroAdicionado;
    }

    public static void listar(HashMap<String, ArrayList> listaLivros) {
        for (String autor : listaLivros.keySet()) {
            for (Object livro : listaLivros.get(autor)) {
                System.out.println(livro + " - " + autor);
            }
        }
    }

    public static void pesquisar(HashMap<String, ArrayList> listaLivros, String titulo) {
        boolean encontrado = false;
        for (String autor : listaLivros.keySet()) {
            for (Object livro : listaLivros.get(autor)) {
                if (livro.equals(titulo)) {
                    encontrado = true;
                    System.out.println("____________________________");
                    System.out.println("Livro encotrado!");
                    System.out.println("NOME : " + livro);
                    System.out.println("AUTOR: " + autor);
                }
            }
        }
        if (!encontrado) {
            System.out.println("____________________________");
            System.out.println("Esse livro não foi encontrado!");
        }

    }

    public static boolean excluir(HashMap<String, ArrayList> listaLivros, String titulo) {
        boolean livroRemovido = false;
        for (ArrayList livros : listaLivros.values()) {
            if (livros.contains(titulo)) {
                livroRemovido = true;
                livros.remove(titulo);
            }
        }
        return livroRemovido;
    }
}
