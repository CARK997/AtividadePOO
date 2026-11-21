package Exercicio10;

public class Main {

    public static void main(String[] args) {

        LivroProduto livro = new LivroProduto(
            "Java POO", 80.00, "Carol"
        );

        EletronicoProduto eletronico = new EletronicoProduto(
            "Notebook", 3500.00, 12
        );

       
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    
        carrinho.adicionarProduto(livro);
        carrinho.adicionarProduto(eletronico);

    
        System.out.println("PRODUTOS DO CARRINHO");

        livro.exibirDetalhes();

        System.out.println("----------------");

        eletronico.exibirDetalhes();

        System.out.println("----------------");

       
        System.out.println(
            "Total do pedido: R$ " +
            carrinho.calcularTotalPedido()
        );
    }
}