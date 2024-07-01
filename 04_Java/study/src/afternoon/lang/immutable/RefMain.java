package afternoon.lang.immutable;

public class RefMain {
    public static void main(String[] args) {
        User user1 = new User("서연");
        User user2 = user1;

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);

        user2.setName("예지");
        System.out.println("user2의 이름을 '예지'로 변경");
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
    }
}
