package le;

import le.h;

/* compiled from: KProperty.kt */
public interface i<V> extends h<V>, fe.a<V> {

    /* compiled from: KProperty.kt */
    public interface a<V> extends h.a<V>, fe.a<V> {
    }

    V get();

    Object getDelegate();

    a<V> getGetter();
}
