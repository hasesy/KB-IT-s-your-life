package afternoon.nested.local.ex1;

import java.util.Random;

public class Ex4Main {
    public static void complicatedProgram(Dice dice) {
        System.out.println("복잡한 과정 시작");
        System.out.println("복잡한 과정 종료 후, 원하는 기능 실행");

        dice.run();

        System.out.println("다시 복잡한 과정 시작");
        System.out.println("복잡한 과정 종료 후 프로그램 종료");
    }

    public static void main(String[] args) {
        Dice diceOnce = new Dice() {
            @Override
            public void run() {
                int rand = new Random().nextInt(6) + 1;
                System.out.println("주사위의 값은 : " + rand);
            }
        };

        Dice diceSum = new Dice() {
            @Override
            public void run() {
                int rand1 = new Random().nextInt(6) + 1;
                int rand2 = new Random().nextInt(6) + 1;
                int sum = rand1 + rand2;
                System.out.println("주사위를 두 번 굴린 값의 합은 : " + sum);
            }
        };
        
        complicatedProgram(diceOnce);
        complicatedProgram(diceSum);
    }
}
