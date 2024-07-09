package afternoon.generic.limit;

public class GenericWorld<T extends Number> {
    private T number;

    public T getValue() {
        return number;
    }

    public void setValue(T number) {
        this.number = number;
    }

    public double transDouble() {
        return this.number.doubleValue();
    }

    @Override
    public String toString() {
        return "GenericWorld{" +
                "number=" + number +
                '}';
    }
}
