package afternoon.nested.local.ex3;

public class AnonymousMain {
    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("안녕하세요. 익명 클래스 hello 입니다.");
            }
        };

        hello.hello();
    }
}
