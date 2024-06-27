package afternoon.poly4.ex;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("고양이가 사료를 먹습니다!");
    }

    @Override
    public void sound() {
        System.out.println("고양이가 냐~옹");
    }
}
