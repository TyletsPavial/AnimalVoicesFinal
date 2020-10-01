package AnimalCollection;
import Animal.AnimalInterface;

import java.util.ArrayList;
import java.util.Collections;

public class AnimalCollection implements AnimalCollectionInterface {
    private ArrayList<AnimalInterface> animals = new ArrayList<>();

    public AnimalCollection(){}

    public AnimalCollection(AnimalInterface ... animals){
        Collections.addAll(this.animals, animals);
    }

    @Override
    public void add(AnimalInterface animal) {
        this.animals.add((AnimalInterface) animal);
    }

    public ArrayList<AnimalInterface> getAnimals() {
        return (ArrayList<AnimalInterface>) animals.clone();
    }

    public void setAnimals(ArrayList<AnimalInterface> animals) {
        this.animals = animals;
    }
}
