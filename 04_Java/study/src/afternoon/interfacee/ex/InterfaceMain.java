package afternoon.interfacee.ex;

public class InterfaceMain {
    public static void main(String[] args) {
        Human[] humans = new Human[3];
        humans[0] = new Korean();
        humans[1] = new American();
        humans[2] = new Spanish();

        for (Human h : humans) {
            humanCall(h);
        }
    }

    public static void humanCall(Human human) {
        human.speak();
        human.eat();
        human.hello();
    }
}
