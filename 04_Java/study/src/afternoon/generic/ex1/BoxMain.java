package afternoon.generic.ex1;

public class BoxMain {
    public static void main(String[] args) {
        IntergerBox intergerBox = new IntergerBox();
        intergerBox.setValue(10);
        Integer Integer = intergerBox.getValue();
        System.out.println("Integer = " + Integer);

        StringBox stringBox = new StringBox();
        stringBox.setValue("Hello");
        String str = stringBox.getValue();
        System.out.println("str = " + str);
    }
}
