package afternoon.poly3;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.parentMethod();
        ((Child) parent).childMethod();
    }
}
