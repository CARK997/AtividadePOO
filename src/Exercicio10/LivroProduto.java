package Exercicio10;

public class LivroProduto extends Produto {

    private String autor;

    public LivroProduto(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

      @Override
    public void exibirDetalhes() {

        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Autor: " + autor);
    }
}
