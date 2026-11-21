package Exercicio5;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carol", 2000);

        Gerente gerente = new Gerente("Carolina", 3000, 5000);

        System.out.println("=== FUNCIONÁRIO ===");

        funcionario.imprimirFicha();
    
        System.out.println("=== GERENTE ===");

        gerente.imprimirFicha();

       
       
    }
}
