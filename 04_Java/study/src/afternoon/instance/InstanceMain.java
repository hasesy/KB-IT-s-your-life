package afternoon.instance;

public class InstanceMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        GrandChild grandChild = new GrandChild();

        System.out.println(parent instanceof GrandChild);
        System.out.println(child instanceof GrandChild);
        System.out.println(grandChild instanceof GrandChild);
    }
}
