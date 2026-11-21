package Exercicio7;

public class Diretor implements  Autenticavel{

    private String tokenSegurança;

    public Diretor(String tokenSeguranca){
        this.tokenSegurança = tokenSeguranca;
    
    }

    @Override 
    public boolean autenticar(String credencial){
        return tokenSegurança.equals(credencial);
    }
    
}
