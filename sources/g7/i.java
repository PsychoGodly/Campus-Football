package g7;

import g7.h;

/* compiled from: LLRBRedValueNode */
public class i<K, V> extends j<K, V> {
    i(K k10, V v10) {
        super(k10, v10, g.i(), g.i());
    }

    public boolean e() {
        return true;
    }

    /* access modifiers changed from: protected */
    public j<K, V> k(K k10, V v10, h<K, V> hVar, h<K, V> hVar2) {
        if (k10 == null) {
            k10 = getKey();
        }
        if (v10 == null) {
            v10 = getValue();
        }
        if (hVar == null) {
            hVar = a();
        }
        if (hVar2 == null) {
            hVar2 = f();
        }
        return new i(k10, v10, hVar, hVar2);
    }

    /* access modifiers changed from: protected */
    public h.a m() {
        return h.a.RED;
    }

    public int size() {
        return a().size() + 1 + f().size();
    }

    i(K k10, V v10, h<K, V> hVar, h<K, V> hVar2) {
        super(k10, v10, hVar, hVar2);
    }
}
