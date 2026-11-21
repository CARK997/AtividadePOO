package Exercicio2;

public class Main {
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria("Carolina", 1000);

        conta.setTitular("Carolina");
        conta.setSaldo(1000);

        conta.depositar(500);
        conta.sacar(200);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: R$" + conta.getSaldo());

        conta.sacar(2000);

        System.out.println("Saldo após tentativa de saque: R$" + conta.getSaldo());


    }
}
