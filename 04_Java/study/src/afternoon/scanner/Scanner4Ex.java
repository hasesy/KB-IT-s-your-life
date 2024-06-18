package afternoon.scanner;

import java.util.Scanner;

public class Scanner4Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시작 정수를 입력하세요 : ");
        int startNum = sc.nextInt();
        System.out.print("종료 정수를 입력하세요 : ");
        int endNum = sc.nextInt();

        if (startNum > endNum) {
            System.out.println("시작 정수가 종료 정수 보다 큽니다!");
            return;
        }

        int sum = 0;

        for (int i = startNum; i <= endNum; i++) {
            sum += i;
        }

        System.out.println("시작 수 부터 종료 수 까지의 합은 : " + sum);
    }
}
