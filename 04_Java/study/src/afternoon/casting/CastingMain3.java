package afternoon.casting;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();

        // UpCasting
        Parent parent1 = child; // 부모는 자식을 담을 수 있다.
        Parent parent2 = (Parent) child; // 안 보이지만 생략된 부분

//        parent1.childMethod(); // 안됨

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
