package map;

import java.util.ArrayList;
import java.util.List;

public class MyMap<K, V> {
    /* FIELDS */
    private final List<K> keys;
    private final List<V> values;


    /* CONSTRUCTOR */
    public MyMap() {
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    /* METHODS */
    public void put(K key, V value) {
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            values.set(index, value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public V get(K key) {
        if (!keys.contains(key))
            return null;

        int index = keys.indexOf(key);
        return values.get(index);
    }

    public V remove(K key) {
        if (!keys.contains(key))
            return null;

        int index = keys.indexOf(key);
        keys.remove(index);
        return values.remove(index);
    }
}
