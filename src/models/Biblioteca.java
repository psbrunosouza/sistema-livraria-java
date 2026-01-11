package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Biblioteca {
    private final List<Livro> livros = List.of(
        new Livro(
            1,
            "O Senhor dos Aneis",
            new Autor(1, "J.R.R.Tolkien", LocalDate.of(1892, 1, 3)),
            true,
            LocalDate.now(),
            LocalDate.now()
        )
    );
    private final List<Autor> autores = List.of(
        new Autor(
            1,
            "J.R.R.Tolkien",
            LocalDate.of(1892, 1, 3)
        )
    );

    private final List<Emprestimo> emprestimos = new ArrayList<>();

    public List<Livro> listarLivrosDisponiveis() {
        return this.livros.stream().filter(Livro::getDisponivel).toList();
    }

    public Livro obterLivro (Integer id) {
        return this.livros.stream().filter(l -> l.getId().equals(id)).findFirst().orElseThrow();
    }

    public void obterLivroComoEmprestimo(Livro livro, String nomeCliente) {
        Emprestimo emprestimo = new Emprestimo(
            ThreadLocalRandom.current().nextInt(1, 9999),
            livro,
            nomeCliente,
            LocalDate.now(),
            LocalDate.now().plusDays(7)
        );

        this.emprestimos.add(emprestimo);

        for (Livro l : livros) {
            if (l.getId().equals(livro.getId())) {
                l.setDisponivel(false);
            }
        }

        System.out.printf("O livro %s foi emprestado ao cliente %s\n", livro.getTitulo(), nomeCliente);
    }
}
