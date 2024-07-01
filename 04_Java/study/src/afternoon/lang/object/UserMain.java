package afternoon.lang.object;

public class UserMain {
    public static void main(String[] args) {
        User user1 = new User("김서연", "hasesy");
        User user2 = new User("김서연", "hasesy");

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
    }
}
