package Exercicio8;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Dry"));
        animais.add(new Gato("Ice"));
        animais.add(new Vaca("ganja"));

        for(Animal animal : animais){
            animal.emitirSom();
        }

    }
    
}
