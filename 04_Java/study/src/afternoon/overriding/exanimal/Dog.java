package afternoon.overriding.exanimal;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("강아지가 멍멍!");
    }
}
