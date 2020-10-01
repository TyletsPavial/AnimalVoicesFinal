package Checker;

import Animal.AnimalInterface;
import AnimalCollection.AnimalCollectionInterface;

public interface CheckerInterface <A extends AnimalInterface>{
    void checkAnimal(A animal, String s);
}
