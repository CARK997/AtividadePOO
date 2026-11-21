package Exercicio6;

public class Main {

    public static void main(String[] args) {  

        Quadrado quadrado = new Quadrado("Rosa", 5);
        Circulo circulo = new Circulo("vermelho", 2);

         System.out.println("=== QUADRADO ===");
        System.out.println("Cor: " + quadrado.cor);
        System.out.println("Área: " + quadrado.calcularArea());

        System.out.println("\n=== CÍRCULO ===");
        System.out.println("Cor: " + circulo.cor);
        System.out.println("Área: " + circulo.calcularArea());
    }
    
}
