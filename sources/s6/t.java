package s6;

import java.io.Serializable;

/* compiled from: ImmutableEntry */
class t<K, V> extends e<K, V> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final K f30241a;

    /* renamed from: b  reason: collision with root package name */
    final V f30242b;

    t(K k10, V v10) {
        this.f30241a = k10;
        this.f30242b = v10;
    }

    public final K getKey() {
        return this.f30241a;
    }

    public final V getValue() {
        return this.f30242b;
    }

    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
