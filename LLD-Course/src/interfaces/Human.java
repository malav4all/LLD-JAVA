package interfaces;

public class Human extends Mammal implements Omnivores, PlantEater {

    public void eatPlant() {
        System.out.println("Human is Eating a Plant");
    }

    public void eatAnimal() {
        System.out.println("Human  eat animals.");
    }
}
