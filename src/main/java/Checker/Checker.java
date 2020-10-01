package Checker;

import Animal.AnimalInterface;

public class Checker implements CheckerInterface {
    @Override
    public void checkAnimal(AnimalInterface animal, String s) {
        if(animal.getName().toLowerCase().equals(s.toLowerCase())){
            System.out.println(animal.getVoice());
        }

    }
}
