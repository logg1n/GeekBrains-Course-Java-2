package multimap;

public interface MultiMapI <K, T, V> {
    void put(K key1, T key2, V value);

    V getValueT(K key1);
    T getValueK(T key2);
}