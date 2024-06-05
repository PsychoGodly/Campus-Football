package g7;

import g7.h;
import java.util.Comparator;

/* compiled from: LLRBValueNode */
public abstract class j<K, V> implements h<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final K f28915a;

    /* renamed from: b  reason: collision with root package name */
    private final V f28916b;

    /* renamed from: c  reason: collision with root package name */
    private h<K, V> f28917c;

    /* renamed from: d  reason: collision with root package name */
    private final h<K, V> f28918d;

    j(K k10, V v10, h<K, V> hVar, h<K, V> hVar2) {
        this.f28915a = k10;
        this.f28916b = v10;
        this.f28917c = hVar == null ? g.i() : hVar;
        this.f28918d = hVar2 == null ? g.i() : hVar2;
    }

    private j<K, V> i() {
        h<K, V> hVar = this.f28917c;
        h<K, V> c10 = hVar.c(null, null, p(hVar), (h<K, V>) null, (h<K, V>) null);
        h<K, V> hVar2 = this.f28918d;
        return c((Object) null, (Object) null, p(this), c10, hVar2.c(null, null, p(hVar2), (h<K, V>) null, (h<K, V>) null));
    }

    private j<K, V> l() {
        j r10 = (!this.f28918d.e() || this.f28917c.e()) ? this : r();
        if (r10.f28917c.e() && ((j) r10.f28917c).f28917c.e()) {
            r10 = r10.s();
        }
        return (!r10.f28917c.e() || !r10.f28918d.e()) ? r10 : r10.i();
    }

    private j<K, V> n() {
        j<K, V> i10 = i();
        return i10.f().a().e() ? i10.k((K) null, (V) null, (h<K, V>) null, ((j) i10.f()).s()).r().i() : i10;
    }

    private j<K, V> o() {
        j<K, V> i10 = i();
        return i10.a().a().e() ? i10.s().i() : i10;
    }

    private static h.a p(h hVar) {
        return hVar.e() ? h.a.BLACK : h.a.RED;
    }

    private h<K, V> q() {
        if (this.f28917c.isEmpty()) {
            return g.i();
        }
        j n10 = (a().e() || a().a().e()) ? this : n();
        return n10.k((Object) null, (Object) null, ((j) n10.f28917c).q(), (h) null).l();
    }

    private j<K, V> r() {
        return (j) this.f28918d.c(null, null, m(), c((Object) null, (Object) null, h.a.RED, (h) null, ((j) this.f28918d).f28917c), (j<K, V>) null);
    }

    private j<K, V> s() {
        return (j) this.f28917c.c(null, null, m(), (h) null, c((Object) null, (Object) null, h.a.RED, ((j) this.f28917c).f28918d, (h<K, V>) null));
    }

    public h<K, V> a() {
        return this.f28917c;
    }

    public h<K, V> b(K k10, V v10, Comparator<K> comparator) {
        j<K, V> jVar;
        int compare = comparator.compare(k10, this.f28915a);
        if (compare < 0) {
            jVar = k((Object) null, (Object) null, this.f28917c.b(k10, v10, comparator), (h<K, V>) null);
        } else if (compare == 0) {
            jVar = k(k10, v10, (h) null, (h) null);
        } else {
            jVar = k((Object) null, (Object) null, (h) null, this.f28918d.b(k10, v10, comparator));
        }
        return jVar.l();
    }

    public h<K, V> d(K k10, Comparator<K> comparator) {
        j<K, V> jVar;
        if (comparator.compare(k10, this.f28915a) < 0) {
            j n10 = (this.f28917c.isEmpty() || this.f28917c.e() || ((j) this.f28917c).f28917c.e()) ? this : n();
            jVar = n10.k((Object) null, (Object) null, n10.f28917c.d(k10, comparator), (h<K, V>) null);
        } else {
            j s10 = this.f28917c.e() ? s() : this;
            if (!s10.f28918d.isEmpty() && !s10.f28918d.e() && !((j) s10.f28918d).f28917c.e()) {
                s10 = s10.o();
            }
            if (comparator.compare(k10, s10.f28915a) == 0) {
                if (s10.f28918d.isEmpty()) {
                    return g.i();
                }
                h<K, V> g10 = s10.f28918d.g();
                s10 = s10.k(g10.getKey(), g10.getValue(), (h) null, ((j) s10.f28918d).q());
            }
            jVar = s10.k((Object) null, (Object) null, (h) null, s10.f28918d.d(k10, comparator));
        }
        return jVar.l();
    }

    public h<K, V> f() {
        return this.f28918d;
    }

    public h<K, V> g() {
        if (this.f28917c.isEmpty()) {
            return this;
        }
        return this.f28917c.g();
    }

    public K getKey() {
        return this.f28915a;
    }

    public V getValue() {
        return this.f28916b;
    }

    public h<K, V> h() {
        if (this.f28918d.isEmpty()) {
            return this;
        }
        return this.f28918d.h();
    }

    public boolean isEmpty() {
        return false;
    }

    /* renamed from: j */
    public j<K, V> c(K k10, V v10, h.a aVar, h<K, V> hVar, h<K, V> hVar2) {
        if (k10 == null) {
            k10 = this.f28915a;
        }
        if (v10 == null) {
            v10 = this.f28916b;
        }
        if (hVar == null) {
            hVar = this.f28917c;
        }
        if (hVar2 == null) {
            hVar2 = this.f28918d;
        }
        if (aVar == h.a.RED) {
            return new i(k10, v10, hVar, hVar2);
        }
        return new f(k10, v10, hVar, hVar2);
    }

    /* access modifiers changed from: protected */
    public abstract j<K, V> k(K k10, V v10, h<K, V> hVar, h<K, V> hVar2);

    /* access modifiers changed from: protected */
    public abstract h.a m();

    /* access modifiers changed from: package-private */
    public void t(h<K, V> hVar) {
        this.f28917c = hVar;
    }
}
