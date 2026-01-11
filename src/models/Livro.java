package models;

import java.time.LocalDate;

public class Livro {
    private Integer id;
    private String titulo;
    private Autor autor;
    private Boolean disponivel;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

    public Livro(
        Integer id,
        String titulo,
        Autor autor,
        Boolean disponivel,
        LocalDate dataCadastro,
        LocalDate dataAtualizacao
    ) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    @Override
    public String toString() {
        return String.format(
            "ID: %d TITULO: %s AUTOR: %s DISPONÍVEL: %s DATA_CADASTRO: %td/%<tm/%<ty DATA_ATUALIZACAO: %td/%<tm/%<ty",
            this.id,
            this.titulo,
            this.autor.getNome(),
            this.disponivel ? "SIM" : "NÃO",
            this.dataCadastro,
            this.dataAtualizacao
        );
    }
}
