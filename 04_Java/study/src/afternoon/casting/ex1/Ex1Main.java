package afternoon.casting.ex1;

public class Ex1Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.eat();
        cat.eat();
        ((Dog) dog).sound();
        ((Cat) cat).sound();
    }
}
