import Animal.*;
import AnimalCollection.*;
import Checker.Checker;
import Checker.CheckerInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AnimalCollectionInterface animals = new AnimalCollection();
        animals.add(new Dog("Dog","woof"));
        animals.add(new Goose("Goose","GAAGA!"));
        animals.add(new Cat("Cat","meow"));
        CheckerInterface checker = new Checker();

        System.out.print("Enter name of animal: ");
        String animalName = in.next();

        animals.getAnimals().stream()
                .forEach(a -> checker.checkAnimal((AnimalInterface) a,animalName));

System.out.println("All animals is called "
        + animalName
        + "'s voice have already printed! \nIf nothing was printed there is no animal with this name.");
    }
}
