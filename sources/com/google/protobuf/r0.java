package com.google.protobuf;

import com.google.protobuf.o0;
import java.util.Map;

/* compiled from: MapFieldSchemaLite */
class r0 implements q0 {
    r0() {
    }

    private static <K, V> int i(int i10, Object obj, Object obj2) {
        p0 p0Var = (p0) obj;
        o0 o0Var = (o0) obj2;
        int i11 = 0;
        if (p0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : p0Var.entrySet()) {
            i11 += o0Var.a(i10, entry.getKey(), entry.getValue());
        }
        return i11;
    }

    private static <K, V> p0<K, V> j(Object obj, Object obj2) {
        p0<K, V> p0Var = (p0) obj;
        p0 p0Var2 = (p0) obj2;
        if (!p0Var2.isEmpty()) {
            if (!p0Var.j()) {
                p0Var = p0Var.m();
            }
            p0Var.l(p0Var2);
        }
        return p0Var;
    }

    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    public Object b(Object obj) {
        ((p0) obj).k();
        return obj;
    }

    public o0.a<?, ?> c(Object obj) {
        return ((o0) obj).c();
    }

    public Map<?, ?> d(Object obj) {
        return (p0) obj;
    }

    public Object e(Object obj) {
        return p0.e().m();
    }

    public int f(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    public boolean g(Object obj) {
        return !((p0) obj).j();
    }

    public Map<?, ?> h(Object obj) {
        return (p0) obj;
    }
}
