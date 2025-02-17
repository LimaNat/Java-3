package com.mycompany.biblioteca;

public class livro {
    private String titulo;
    private String autor;
    private String Npaginas;
    private float preco;

    public livro(String titulo, String autor, String Npaginas, float preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.Npaginas = Npaginas;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getNpaginas() {
        return Npaginas;
    }

    public float getPreco() {
        return preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNpaginas(String Npaginas) {
        this.Npaginas = Npaginas;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    

    }
}
