package afternoon.polyfinal.ex;

import java.util.Scanner;

public class K5Car implements Car {
    private int oil;
    final int EFFICIENCY = 2;

    K5Car() {
        this.oil = 0;
    }

    @Override
    public void openDoor() {
        System.out.println("K5, 차 문을 엽니다.");
    }

    @Override
    public void drive() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("K5 에 주유할 기름의 양을 입력하세요. : ");
        this.oil = scanner.nextInt();

        System.out.println("K5 가 주행을 시작합니다.");
        int distance = 0;

        for (int i = EFFICIENCY; i <= this.oil; i += EFFICIENCY) {
            distance++;
            System.out.println("K5 가 " + distance + "km 를 주행했습니다.");
        }
        System.out.println("K5 가 최종 주행한 거리는 " + distance + "km 입니다.");
        System.out.println("K5 주행 종료");
    }
}
