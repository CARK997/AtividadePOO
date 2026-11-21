package Exercicio4;

public class Gerente extends Funcionario{

    double bonusEscopo;

    public Gerente(String nome, double salarioBase, double bonusEscopo) {
       super(nome, salarioBase);
        this.bonusEscopo = bonusEscopo;
    }

    @Override 
    public double calcularSalario() {
        return salarioBase * 1.10 + bonusEscopo;
    }
    
}
