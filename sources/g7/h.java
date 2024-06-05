package g7;

import java.util.Comparator;

/* compiled from: LLRBNode */
public interface h<K, V> {

    /* compiled from: LLRBNode */
    public enum a {
        RED,
        BLACK
    }

    h<K, V> a();

    h<K, V> b(K k10, V v10, Comparator<K> comparator);

    h<K, V> c(K k10, V v10, a aVar, h<K, V> hVar, h<K, V> hVar2);

    h<K, V> d(K k10, Comparator<K> comparator);

    boolean e();

    h<K, V> f();

    h<K, V> g();

    K getKey();

    V getValue();

    h<K, V> h();

    boolean isEmpty();

    int size();
}
