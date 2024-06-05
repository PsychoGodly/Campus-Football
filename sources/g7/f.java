package g7;

import g7.h;

/* compiled from: LLRBBlackValueNode */
public class f<K, V> extends j<K, V> {

    /* renamed from: e  reason: collision with root package name */
    private int f28910e = -1;

    f(K k10, V v10, h<K, V> hVar, h<K, V> hVar2) {
        super(k10, v10, hVar, hVar2);
    }

    public boolean e() {
        return false;
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
        return new f(k10, v10, hVar, hVar2);
    }

    /* access modifiers changed from: protected */
    public h.a m() {
        return h.a.BLACK;
    }

    public int size() {
        if (this.f28910e == -1) {
            this.f28910e = a().size() + 1 + f().size();
        }
        return this.f28910e;
    }

    /* access modifiers changed from: package-private */
    public void t(h<K, V> hVar) {
        if (this.f28910e == -1) {
            super.t(hVar);
            return;
        }
        throw new IllegalStateException("Can't set left after using size");
    }
}
