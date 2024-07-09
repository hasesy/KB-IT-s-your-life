package afternoon.generic.method;

public class GenericMethodMain {
    public static void main(String[] args) {
        Integer integerValue1  = GenericMethod.<Integer>numberMethod(10);
        Integer integerValue2 = GenericMethod.numberMethod(10);

        Double doubleValue = GenericMethod.numberMethod(10.3);
        Float floatValue = GenericMethod.numberMethod(10f);

        String str = GenericMethod.genericMethod("hello");
    }
}
