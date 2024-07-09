package afternoon.generic.method;

public class GenericQuiz1<T> {
    public T quizMethod1(T t) {
        return t;
    }

    // static 이라 따로 <T> 타입지정 해줘야 함
    public static <T> T quizMethod2(T t) {
        return t;
    }
}
