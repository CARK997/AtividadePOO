package Exercicio10;

public class EletronicoProduto extends Produto {

    private int mesesGarantia;

    public EletronicoProduto(String nome, double preco, int mesesGarantia) {
        super(nome, preco);
        this.mesesGarantia = mesesGarantia;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    @Override
    public void exibirDetalhes() {

        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Garantia: " + mesesGarantia + " meses");
    }
}