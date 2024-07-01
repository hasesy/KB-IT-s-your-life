package afternoon.lang.math;

public class MathMain {
    public static void main(String[] args) {
        // 기본 연산
        System.out.println(Math.max(10, 20)); // 20
        System.out.println(Math.min(10, 20)); // 10
        System.out.println(Math.abs(-10)); // 10

        // 소수점 연산
        System.out.println(Math.ceil(2.1)); // 3.0
        System.out.println(Math.floor(2.1)); // 2.0
        System.out.println(Math.round(2.1)); // 2

        // 기타
        System.out.println(Math.sqrt(9)); // 3.0
        System.out.println(Math.random()); // 0 <= rand < 1
    }
}
