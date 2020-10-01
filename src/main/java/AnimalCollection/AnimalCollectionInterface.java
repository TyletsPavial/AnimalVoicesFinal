package AnimalCollection;

import Animal.AnimalInterface;

import java.util.ArrayList;

public interface AnimalCollectionInterface <A extends AnimalInterface>{
    public void add(AnimalInterface animal);
    public ArrayList<AnimalInterface> getAnimals();
}
