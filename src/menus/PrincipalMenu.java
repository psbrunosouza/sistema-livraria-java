package menus;

import models.Biblioteca;
import models.Livro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrincipalMenu {
    public static void exibir(Biblioteca biblioteca) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("[SIM/S]/[NAO|N] Visualizar a lista de livros?");

            String opcao = bufferedReader.readLine().toLowerCase();

            if (opcao.equals("s") || opcao.equals("sim")) {
                System.out.println(biblioteca.listarLivrosDisponiveis());

                System.out.println("---------------------------------------");

                System.out.println("Informe o id do livro desejado: ");
                Integer livroId = Integer.parseInt(bufferedReader.readLine());

                System.out.println("Informe o nome do cliente: ");
                String nomeCliente = bufferedReader.readLine();

                Livro livro = biblioteca.obterLivro(livroId);

                biblioteca.obterLivroComoEmprestimo(livro, nomeCliente);
            }else if(opcao.equals("n") || opcao.equals("nao")) {
                System.out.println("Sistema encerrado.");
                break;
            }

        }
    }
}
