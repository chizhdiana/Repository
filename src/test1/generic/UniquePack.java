package test1.generic;

/**
 * Created by diana on 10.11.16.
 */

public class UniquePack<K extends Number, V> { // несколько дженериков
    private K key;
    private V value;


    public UniquePack(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

