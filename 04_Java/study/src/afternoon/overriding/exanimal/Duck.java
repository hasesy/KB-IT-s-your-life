package afternoon.overriding.exanimal;

public class Duck extends Animal {
    @Override
    public void sound() {
        System.out.println("오리는 꽥~! 꽥~!");
    }

    public void fly() {
        System.out.println("오리 날다~~~~~~");
    }
}
