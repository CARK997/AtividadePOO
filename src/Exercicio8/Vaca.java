package Exercicio8;

public class Vaca extends Animal {

      public Vaca(String nome){
        super(nome);
    }

    @Override 
    public void emitirSom(){
        System.out.println(nome + " faz: MUUUU!");
    }

}
