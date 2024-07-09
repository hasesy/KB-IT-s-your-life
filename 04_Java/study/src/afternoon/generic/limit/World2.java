package afternoon.generic.limit;

public class World2 {
    public static void main(String[] args) {
        GenericWorld<Integer> integerWorld = new GenericWorld<>();
        integerWorld.setValue(10);
        integerWorld.transDouble();
        System.out.println(integerWorld.getValue());

        GenericWorld<Long> LongWorld = new GenericWorld<>();
        LongWorld.setValue(20L);
        LongWorld.transDouble();
        System.out.println(LongWorld.getValue());
    }
}
