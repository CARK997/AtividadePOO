package Exercicio1;
public class Main{
    public static void main(String[] args) throws Exception {
       
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro3 = new Livro("1984", "George Orwell", 29.90);

        livro1.exibirInformacoes();
        System.out.println();
        livro2.exibirInformacoes();
        System.out.println();
        livro3.exibirInformacoes();
        System.out.println();
    }
}
