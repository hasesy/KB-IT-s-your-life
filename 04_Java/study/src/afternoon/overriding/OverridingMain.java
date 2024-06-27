package afternoon.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Parent value = " + parent.value);
        parent.method();

        Child child = new Child();
        System.out.println("Child value = " + child.value);
        child.method();

        Parent poly = new Child();
        System.out.println("Poly value = " + poly.value);
        poly.method(); // Child method
        // 오버라이딩 된 메서드가 항상 우선권을 가짐
    }
}
