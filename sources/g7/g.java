package g7;

import g7.h;
import java.util.Comparator;

/* compiled from: LLRBEmptyNode */
public class g<K, V> implements h<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private static final g f28911a = new g();

    private g() {
    }

    public static <K, V> g<K, V> i() {
        return f28911a;
    }

    public h<K, V> a() {
        return this;
    }

    public h<K, V> b(K k10, V v10, Comparator<K> comparator) {
        return new i(k10, v10);
    }

    public h<K, V> c(K k10, V v10, h.a aVar, h<K, V> hVar, h<K, V> hVar2) {
        return this;
    }

    public h<K, V> d(K k10, Comparator<K> comparator) {
        return this;
    }

    public boolean e() {
        return false;
    }

    public h<K, V> f() {
        return this;
    }

    public h<K, V> g() {
        return this;
    }

    public K getKey() {
        return null;
    }

    public V getValue() {
        return null;
    }

    public h<K, V> h() {
        return this;
    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return 0;
    }
}
