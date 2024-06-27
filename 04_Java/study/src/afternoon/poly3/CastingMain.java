package afternoon.poly3;

public class CastingMain {
    public static void main(String[] args) {
        Parent parent = new Child();

        Child poly = (Child) parent;
        poly.childMethod();

        parent.parentMethod();
//        parent.childMethod(); // 실행 안됨
    }
}
