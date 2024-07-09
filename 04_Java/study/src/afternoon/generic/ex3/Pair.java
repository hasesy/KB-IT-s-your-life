package afternoon.generic.ex3;

public class Pair<K, T> {
    private K key;
    private T value;

    public Pair(K key, T value) {
        this.key = key;
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
