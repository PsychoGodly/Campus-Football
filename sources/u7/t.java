package u7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p8.d0;
import p8.u;
import v7.d;
import y7.b;

/* compiled from: ObjectValue */
public final class t implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private d0 f30650a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Object> f30651b;

    public t(d0 d0Var) {
        this.f30651b = new HashMap();
        b.d(d0Var.B0() == d0.c.MAP_VALUE, "ObjectValues should be backed by a MapValue", new Object[0]);
        b.d(!v.c(d0Var), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.f30650a = d0Var;
    }

    private u a(r rVar, Map<String, Object> map) {
        u.b bVar;
        d0 f10 = f(this.f30650a, rVar);
        if (z.w(f10)) {
            bVar = (u.b) f10.x0().b();
        } else {
            bVar = u.o0();
        }
        boolean z10 = false;
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value instanceof Map) {
                u a10 = a((r) rVar.a(str), (Map) value);
                if (a10 != null) {
                    bVar.H(str, (d0) d0.C0().O(a10).build());
                }
            } else if (value instanceof d0) {
                bVar.H(str, (d0) value);
            } else if (bVar.F(str)) {
                b.d(value == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                bVar.I(str);
            }
            z10 = true;
        }
        if (z10) {
            return (u) bVar.build();
        }
        return null;
    }

    private d0 b() {
        synchronized (this.f30651b) {
            u a10 = a(r.f30634c, this.f30651b);
            if (a10 != null) {
                this.f30650a = (d0) d0.C0().O(a10).build();
                this.f30651b.clear();
            }
        }
        return this.f30650a;
    }

    private d e(u uVar) {
        HashSet hashSet = new HashSet();
        for (Map.Entry next : uVar.i0().entrySet()) {
            r q10 = r.q((String) next.getKey());
            if (z.w((d0) next.getValue())) {
                Set<r> c10 = e(((d0) next.getValue()).x0()).c();
                if (c10.isEmpty()) {
                    hashSet.add(q10);
                } else {
                    for (r c11 : c10) {
                        hashSet.add((r) q10.c(c11));
                    }
                }
            } else {
                hashSet.add(q10);
            }
        }
        return d.b(hashSet);
    }

    private d0 f(d0 d0Var, r rVar) {
        if (rVar.i()) {
            return d0Var;
        }
        for (int i10 = 0; i10 < rVar.k() - 1; i10++) {
            d0Var = d0Var.x0().j0(rVar.h(i10), (d0) null);
            if (!z.w(d0Var)) {
                return null;
            }
        }
        return d0Var.x0().j0(rVar.g(), (d0) null);
    }

    public static t g(Map<String, d0> map) {
        return new t((d0) d0.C0().N(u.o0().G(map)).build());
    }

    private void o(r rVar, d0 d0Var) {
        Map<String, Object> hashMap;
        Map<String, Object> map = this.f30651b;
        for (int i10 = 0; i10 < rVar.k() - 1; i10++) {
            String h10 = rVar.h(i10);
            Object obj = map.get(h10);
            if (obj instanceof Map) {
                hashMap = (Map) obj;
            } else {
                if (obj instanceof d0) {
                    d0 d0Var2 = (d0) obj;
                    if (d0Var2.B0() == d0.c.MAP_VALUE) {
                        HashMap hashMap2 = new HashMap(d0Var2.x0().i0());
                        map.put(h10, hashMap2);
                        map = hashMap2;
                    }
                }
                hashMap = new HashMap<>();
                map.put(h10, hashMap);
            }
            map = hashMap;
        }
        map.put(rVar.g(), d0Var);
    }

    /* renamed from: c */
    public t clone() {
        return new t(b());
    }

    public void d(r rVar) {
        b.d(!rVar.i(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
        o(rVar, (d0) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return z.q(b(), ((t) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return b().hashCode();
    }

    public d0 i(r rVar) {
        return f(b(), rVar);
    }

    public d j() {
        return e(b().x0());
    }

    public Map<String, d0> k() {
        return b().x0().i0();
    }

    public void l(r rVar, d0 d0Var) {
        b.d(!rVar.i(), "Cannot set field for empty path on ObjectValue", new Object[0]);
        o(rVar, d0Var);
    }

    public void m(Map<r, d0> map) {
        for (Map.Entry next : map.entrySet()) {
            r rVar = (r) next.getKey();
            if (next.getValue() == null) {
                d(rVar);
            } else {
                l(rVar, (d0) next.getValue());
            }
        }
    }

    public String toString() {
        return "ObjectValue{internalValue=" + z.b(b()) + '}';
    }

    public t() {
        this((d0) d0.C0().O(u.g0()).build());
    }
}
