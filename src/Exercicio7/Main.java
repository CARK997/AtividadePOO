package Exercicio7;

public class Main {

    public static void validarAcesso(Autenticavel usuario, String credencial) {

        if (usuario.autenticar(credencial)) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Acesso negado!");
        }
    }

    public static void main(String[] args) {

        Diretor diretor = new Diretor("TOKEN123");

        Cliente cliente = new Cliente("senha456");

        System.out.println("=== DIRETOR ===");
        validarAcesso(diretor, "TOKEN123");

        System.out.println("\n=== CLIENTE ===");
        validarAcesso(cliente, "senha456");
    }
}
