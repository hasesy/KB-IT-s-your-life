package afternoon.poly4.ex;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Duck();

        for (int i = 0; i < animals.length; i++) {
            animalDo(animals[i]);

            if (animals[i] instanceof Fly) {
                flyDo((Fly)animals[i]);
            }
        }
    }

    public static void animalDo(Animal animal) {
        animal.eat();
        animal.sound();
    }

    public static void flyDo(Fly duck) {
        duck.fly();
    }
}
