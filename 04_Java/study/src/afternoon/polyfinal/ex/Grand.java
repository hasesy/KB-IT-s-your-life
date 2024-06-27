package afternoon.polyfinal.ex;

public class Grand implements Car{
    @Override
    public void openDoor() {
        System.out.println("그랜져, 차 문을 엽니다.");
    }

    @Override
    public void drive() {
        System.out.println("그랜져 주행 시작");
        System.out.println("그랜져 주행 종료");
    }
}
