package afternoon.poly4;

public class Hasesy implements Animal, Human{
    @Override
    public void eat() {
        System.out.println("하세시가 고기를 구워먹습니다!");
    }

    @Override
    public void sleep() {
        System.out.println("하세시가 기절합니다!");
    }

    @Override
    public void think() {
        System.out.println("하세시가 운동을 해야 하나 고민합니다!");
    }
}
