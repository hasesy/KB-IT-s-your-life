package afternoon.instance;

public class InstanceMain2 {
    public static void main(String[] args) {
        Parent[] parents = { new Parent(), new Child(), new GrandChild() };

        for (Parent p : parents) {
            testInstanceOf(p);
        }
    }

    public static void testInstanceOf(Parent parent) {
        parent.parentMethod();
        System.out.println();

        if (parent instanceof Child) {
            System.out.println("매개 변수로 들어온 인스턴스가 Child 의 인스턴스가 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }

        if (parent instanceof GrandChild) {
            System.out.println("매개 변수로 들어온 인스턴스가 GrandChild 의 인스턴스가 맞음");
            GrandChild grandChild = (GrandChild) parent;
            grandChild.grandChildMethod();
        }
    }
}
