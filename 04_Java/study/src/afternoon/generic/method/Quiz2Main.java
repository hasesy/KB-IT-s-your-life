package afternoon.generic.method;

public class Quiz2Main {
    public static void main(String[] args) {
        GenericQuiz2<String> quiz2 = new GenericQuiz2<>();

        String type = quiz2.<Integer>quiz2Method(10).getClass().getName();
        System.out.println(type);
    }
}
