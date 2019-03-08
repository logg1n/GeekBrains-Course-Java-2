package multimap;

import java.util.Arrays;
import java.util.HashSet;

public class MultiMap <K, T, V> implements MultiMapI  {
    private HashSet<MultiMap> set = new HashSet<> ();
    private MultiMap <K, T, V> temp;
    private K key;
    private T title;
    private V value;

    public MultiMap() {
        if (temp == null){
            temp = this;
        }
    }

    @Override
    public void put(Object key1, Object key2, Object value) {
        temp.key = (K)key1;
        temp.title = (T)key2;
        temp.value = (V)value;
        set.add (temp);
        temp = new MultiMap ();
    }

    @Override
    public V getValueK(Object key1) {
        for (MultiMap k : set){
            if (k.key.equals (key1)){
                return (V)k.value;
            }
        }
        return null;
    }

    public int size(){
        return set.size ();
    }

    @Override
    public Object[] getValueT(Object key1) {
        Object[] t = new Object[5];

        int i = 0;
        for (MultiMap k : set){
            if (k.title.equals (key1)){
                t[i++] = k.value;
                if (i > t.length){
                    t = resizeIn(t);
                }
            }
        }

        t = reorganization(t);
        return t;
    }

    private Object[] reorganization(Object[] t) {
        Object[] obj;
        int reallySize = 0;

        for (int i = 0; i < t.length-1; i++){
            if (t[i] != null) {
                reallySize++;
            }
            else break;
        }
        obj = resizeDec (t, reallySize);
        return obj;
    }

    private Object[] resizeDec(Object[] t, int s) {
        Object[] o = Arrays.copyOf (t, s);
        return o;
    }

    private Object[] resizeIn(Object[] t) {
        Object[] o = Arrays.copyOf (t, t.length*2);
        return o;
    }
}