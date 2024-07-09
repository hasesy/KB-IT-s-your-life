package afternoon.generic.method;

public class GenericMethod {
    public static <T> T genericMethod(T t) {
        System.out.println("Generic method print : " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("Number method print : " + t);
        return t;
    }
}
