package com.google.firebase.firestore;

import com.google.firebase.firestore.r;
import com.google.protobuf.e1;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p8.b;
import p8.d0;
import p8.u;
import r7.p1;
import r7.q1;
import r7.r1;
import r7.s1;
import r7.t1;
import u7.f;
import u7.t;
import u8.a;
import v7.a;
import v7.d;
import v7.j;
import v7.n;
import y6.q;
import y7.g0;
import y7.o;
import y7.x;

/* compiled from: UserDataReader */
public final class g1 {

    /* renamed from: a  reason: collision with root package name */
    private final f f26461a;

    public g1(f fVar) {
        this.f26461a = fVar;
    }

    private t a(Object obj, q1 q1Var) {
        if (!obj.getClass().isArray()) {
            d0 d10 = d(o.c(obj), q1Var);
            if (d10.B0() == d0.c.MAP_VALUE) {
                return new t(d10);
            }
            throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was " + "of type: " + g0.B(obj));
        }
        throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was " + "an array");
    }

    private List<d0> c(List<Object> list) {
        p1 p1Var = new p1(t1.Argument);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(b(list.get(i10), p1Var.f().c(i10)));
        }
        return arrayList;
    }

    private d0 d(Object obj, q1 q1Var) {
        if (obj instanceof Map) {
            return f((Map) obj, q1Var);
        }
        if (obj instanceof r) {
            k((r) obj, q1Var);
            return null;
        }
        if (q1Var.h() != null) {
            q1Var.a(q1Var.h());
        }
        if (!(obj instanceof List)) {
            return j(obj, q1Var);
        }
        if (!q1Var.i() || q1Var.g() == t1.ArrayArgument) {
            return e((List) obj, q1Var);
        }
        throw q1Var.f("Nested arrays are not supported");
    }

    private <T> d0 e(List<T> list, q1 q1Var) {
        b.C0323b o02 = b.o0();
        int i10 = 0;
        for (T d10 : list) {
            d0 d11 = d(d10, q1Var.c(i10));
            if (d11 == null) {
                d11 = (d0) d0.C0().P(e1.NULL_VALUE).build();
            }
            o02.G(d11);
            i10++;
        }
        return (d0) d0.C0().G(o02).build();
    }

    private <K, V> d0 f(Map<K, V> map, q1 q1Var) {
        if (map.isEmpty()) {
            if (q1Var.h() != null && !q1Var.h().i()) {
                q1Var.a(q1Var.h());
            }
            return (d0) d0.C0().O(u.g0()).build();
        }
        u.b o02 = u.o0();
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() instanceof String) {
                String str = (String) next.getKey();
                d0 d10 = d(next.getValue(), q1Var.d(str));
                if (d10 != null) {
                    o02.H(str, d10);
                }
            } else {
                throw q1Var.f(String.format("Non-String Map key (%s) is not allowed", new Object[]{next.getValue()}));
            }
        }
        return (d0) d0.C0().N(o02).build();
    }

    private d0 j(Object obj, q1 q1Var) {
        if (obj == null) {
            return (d0) d0.C0().P(e1.NULL_VALUE).build();
        }
        if (obj instanceof Integer) {
            return (d0) d0.C0().M((long) ((Integer) obj).intValue()).build();
        }
        if (obj instanceof Long) {
            return (d0) d0.C0().M(((Long) obj).longValue()).build();
        }
        if (obj instanceof Float) {
            return (d0) d0.C0().K(((Float) obj).doubleValue()).build();
        }
        if (obj instanceof Double) {
            return (d0) d0.C0().K(((Double) obj).doubleValue()).build();
        }
        if (obj instanceof Boolean) {
            return (d0) d0.C0().I(((Boolean) obj).booleanValue()).build();
        }
        if (obj instanceof String) {
            return (d0) d0.C0().R((String) obj).build();
        }
        if (obj instanceof Date) {
            return m(new q((Date) obj));
        }
        if (obj instanceof q) {
            return m((q) obj);
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return (d0) d0.C0().L(a.k0().F(d0Var.c()).G(d0Var.d())).build();
        } else if (obj instanceof f) {
            return (d0) d0.C0().J(((f) obj).e()).build();
        } else {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (mVar.k() != null) {
                    f t10 = mVar.k().t();
                    if (!t10.equals(this.f26461a)) {
                        throw q1Var.f(String.format("Document reference is for database %s/%s but should be for database %s/%s", new Object[]{t10.f(), t10.e(), this.f26461a.f(), this.f26461a.e()}));
                    }
                }
                return (d0) d0.C0().Q(String.format("projects/%s/databases/%s/documents/%s", new Object[]{this.f26461a.f(), this.f26461a.e(), mVar.m()})).build();
            } else if (obj.getClass().isArray()) {
                throw q1Var.f("Arrays are not supported; use a List instead");
            } else {
                throw q1Var.f("Unsupported type: " + g0.B(obj));
            }
        }
    }

    private void k(r rVar, q1 q1Var) {
        boolean z10 = true;
        if (!q1Var.j()) {
            throw q1Var.f(String.format("%s() can only be used with set() and update()", new Object[]{rVar.d()}));
        } else if (q1Var.h() == null) {
            throw q1Var.f(String.format("%s() is not currently supported inside arrays", new Object[]{rVar.d()}));
        } else if (rVar instanceof r.c) {
            if (q1Var.g() == t1.MergeSet) {
                q1Var.a(q1Var.h());
            } else if (q1Var.g() == t1.Update) {
                if (q1Var.h().k() <= 0) {
                    z10 = false;
                }
                y7.b.d(z10, "FieldValue.delete() at the top level should have already been handled.", new Object[0]);
                throw q1Var.f("FieldValue.delete() can only appear at the top level of your update data");
            } else {
                throw q1Var.f("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
            }
        } else if (rVar instanceof r.e) {
            q1Var.b(q1Var.h(), n.d());
        } else if (rVar instanceof r.b) {
            q1Var.b(q1Var.h(), new a.b(c(((r.b) rVar).h())));
        } else if (rVar instanceof r.a) {
            q1Var.b(q1Var.h(), new a.C0345a(c(((r.a) rVar).h())));
        } else if (rVar instanceof r.d) {
            q1Var.b(q1Var.h(), new j(h(((r.d) rVar).h())));
        } else {
            throw y7.b.a("Unknown FieldValue type: %s", g0.B(rVar));
        }
    }

    private d0 m(q qVar) {
        return (d0) d0.C0().S(com.google.protobuf.t1.k0().G(qVar.d()).F((qVar.c() / 1000) * 1000)).build();
    }

    public d0 b(Object obj, q1 q1Var) {
        return d(o.c(obj), q1Var);
    }

    public r1 g(Object obj, d dVar) {
        p1 p1Var = new p1(t1.MergeSet);
        t a10 = a(obj, p1Var.f());
        if (dVar == null) {
            return p1Var.g(a10);
        }
        for (u7.r next : dVar.c()) {
            if (!p1Var.d(next)) {
                throw new IllegalArgumentException("Field '" + next.toString() + "' is specified in your field mask but not in your input data.");
            }
        }
        return p1Var.h(a10, dVar);
    }

    public d0 h(Object obj) {
        return i(obj, false);
    }

    public d0 i(Object obj, boolean z10) {
        p1 p1Var = new p1(z10 ? t1.ArrayArgument : t1.Argument);
        d0 b10 = b(obj, p1Var.f());
        y7.b.d(b10 != null, "Parsed data should not be null.", new Object[0]);
        y7.b.d(p1Var.e().isEmpty(), "Field transforms should have been disallowed.", new Object[0]);
        return b10;
    }

    public r1 l(Object obj) {
        p1 p1Var = new p1(t1.Set);
        return p1Var.i(a(obj, p1Var.f()));
    }

    public s1 n(List<Object> list) {
        u7.r rVar;
        y7.b.d(list.size() % 2 == 0, "Expected fieldAndValues to contain an even number of elements", new Object[0]);
        p1 p1Var = new p1(t1.Update);
        q1 f10 = p1Var.f();
        t tVar = new t();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object next2 = it.next();
            boolean z10 = next instanceof String;
            y7.b.d(z10 || (next instanceof q), "Expected argument to be String or FieldPath.", new Object[0]);
            if (z10) {
                rVar = q.b((String) next).c();
            } else {
                rVar = ((q) next).c();
            }
            if (next2 instanceof r.c) {
                f10.a(rVar);
            } else {
                d0 b10 = b(next2, f10.e(rVar));
                if (b10 != null) {
                    f10.a(rVar);
                    tVar.l(rVar, b10);
                }
            }
        }
        return p1Var.j(tVar);
    }

    public s1 o(Map<String, Object> map) {
        x.c(map, "Provided update data must not be null.");
        p1 p1Var = new p1(t1.Update);
        q1 f10 = p1Var.f();
        t tVar = new t();
        for (Map.Entry next : map.entrySet()) {
            u7.r c10 = q.b((String) next.getKey()).c();
            Object value = next.getValue();
            if (value instanceof r.c) {
                f10.a(c10);
            } else {
                d0 b10 = b(value, f10.e(c10));
                if (b10 != null) {
                    f10.a(c10);
                    tVar.l(c10, b10);
                }
            }
        }
        return p1Var.j(tVar);
    }
}
