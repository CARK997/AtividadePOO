package Exercicio3;

public class Main {
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        
        int resultado1 = calc.somar(5, 10);
        double resultado2 = calc.somar(5.5, 10.5);
        int resultado3 = calc.somar(5, 10, 15);

        System.out.println("Resultado da soma de dois inteiros: " + resultado1);
        System.out.println("Resultado da soma de dois doubles: " + resultado2);
        System.out.println("Resultado da soma de três inteiros: " + resultado3);
    }
}