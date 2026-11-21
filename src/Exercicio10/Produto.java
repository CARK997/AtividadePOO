package Exercicio10;

public abstract class  Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco ){

        this.nome = nome;
        this.preco = preco;

        if(preco <= 0){
            throw new IllegalArgumentException(
                "O preço deve ser maior que zero"
            );
        }
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public abstract void exibirDetalhes();
    
}
