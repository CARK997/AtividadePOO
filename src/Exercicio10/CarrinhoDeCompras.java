package Exercicio10;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        produtos.add(p);

    }

    public double calcularTotalPedido() {
        double total = 0;

        for (Produto p : produtos) {
            total += p.getPreco();

        }

        return total;
    }
}