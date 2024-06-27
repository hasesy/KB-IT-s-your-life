package afternoon.overriding.exanimal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = {new Animal(), new Dog(), new Cat(), new Duck()};

        for (Animal a : animals) {
            animalCall(a);
        }
    }


    public static void animalCall(Animal animal) {
        animal.sound();

        if (animal instanceof Duck) {
            ((Duck) animal).fly();
        }
    }
}

