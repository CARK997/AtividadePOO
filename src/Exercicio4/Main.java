package Exercicio4;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carol", 2000);

        Gerente gerente = new Gerente("Carolina", 3000, 5000);

        System.out.println("=== FUNCIONÁRIO ===");
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Salário: R$ " + funcionario.calcularSalario());

    

        System.out.println("=== GERENTE ===");
        System.out.println("Nome: " + gerente.nome);
        System.out.println("Salário: R$ " + gerente.calcularSalario());




       
    }
}
