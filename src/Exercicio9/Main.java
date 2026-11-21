package Exercicio9;

public class Main {
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria("Carolina", 500);

        try{
            conta.sacar(700);
        } catch(SaldoInsuficienteException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
