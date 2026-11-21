package Exercicio1;

public class Livro {

    String titulo;
    String autor;
    double preco;

    public Livro() {
        this.titulo = "titulo nao informado";
        this.autor = "autor nao informado";
        this.preco = 0.0;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = 0.0;
    }

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$" + preco);
    }

}
