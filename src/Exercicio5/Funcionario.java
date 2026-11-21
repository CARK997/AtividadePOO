package Exercicio5;

public class Funcionario {
    
   protected String nome;
   protected double salarioBase;
    

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        
    }
    public double calcularSalario() {
        return salarioBase * 1.10;
    }

    public void imprimirFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$ " + salarioBase);
    }


}

