package afternoon.scanner;

import java.util.Scanner;

public class Scanner6Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNum = (int) (Math.random() * 100);

        while (true) {
            System.out.print("랜덤 숫자를 입력하세요 : ");
            int input = scanner.nextInt();

            if (input == randomNum) {
                System.out.println("정답입니다! 랜덤 숫자는 " + randomNum);
                break;
            } else if (input < randomNum) {
                System.out.println("Up");
            } else {
                System.out.println("Down");
            }
        }
    }
}
