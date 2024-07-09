package afternoon.generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setObj(10);
        Integer integer = (Integer) integerBox.getObj();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setObj("hello");
        String str = (String) stringBox.getObj();
        System.out.println("str = " + str);

        // 타입에 안맞는 인수 전달 시
        integerBox.setObj("100");
        Integer integer2 = (Integer) integerBox.getObj();
        System.out.println("integer2 = " + integer2);
    }
}
