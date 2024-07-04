package afternoon.nested.local.ex1;

import java.util.*;

public class Ex6Main {
    public static void complicatedProgram(Fortune fortune) {
        System.out.println("복잡한 과정 시작");
        System.out.println("복잡한 과정 종료 후, 원하는 기능 실행");

        fortune.run();

        System.out.println("다시 복잡한 과정 시작");
        System.out.println("복잡한 과정 종료 후 프로그램 종료");
    }

    public static void main(String[] args) {
        complicatedProgram(new Fortune() {
            @Override
            public void run() {
                int[] randNums = new int[3];
                randNums[0] = new Random().nextInt(100) + 1;
                randNums[1] = new Random().nextInt(100) + 1;
                randNums[2] = new Random().nextInt(100) + 1;

                Scanner scanner = new Scanner(System.in);
                System.out.print("오늘의 행운 번호를 입력하세요 : ");
                int input = scanner.nextInt();


                if (contains(randNums, input)) {
                    System.out.println("와우!! 완전한 행운의 날입니다! 맞춘 행운의 번호는 " + input + "입니다!");
                } else {
                    System.out.println("입력하신 번호는 불운의 번호이니 오늘은 피하세요!");
                }
            }

        });
    }

    static boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
