package afternoon.generic.method;

public class GenericQuiz2<T> {
    private T value;

    // 위 아래의 T는 서로 다른 것

    public <T> T quiz2Method(T t) {
        return t;
    }
}
