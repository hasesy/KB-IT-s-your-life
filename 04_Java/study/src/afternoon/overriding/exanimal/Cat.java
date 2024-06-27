package afternoon.overriding.exanimal;

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("고양이는 야~옹");
    }
}
