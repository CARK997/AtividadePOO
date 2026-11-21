package Exercicio9;

public class ContaBancaria {
    
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
       if(titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Titular inválido. O nome não pode ser nulo ou vazio.");
        }
    }

    public void setSaldo(double saldo) {
        if(saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido. O saldo não pode ser negativo.");
        }
    }
    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser positivo.");
        }
    }
    public void sacar(double valor)
            throws SaldoInsuficienteException {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido. O valor deve ser positivo.");
        } else if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

   
}
