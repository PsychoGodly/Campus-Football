package kotlin.jvm.internal;

import fe.c;
import fe.d;
import fe.e;
import fe.f;
import fe.g;
import fe.h;
import fe.i;
import fe.j;
import fe.k;
import fe.l;
import fe.m;
import fe.n;
import fe.o;
import fe.p;
import fe.q;
import fe.r;
import fe.s;
import fe.t;
import fe.u;
import fe.v;
import fe.w;
import ge.a;
import ge.b;
import java.util.Map;

/* compiled from: TypeIntrinsics */
public class c0 {
    public static Map a(Object obj) {
        if ((obj instanceof a) && !(obj instanceof b)) {
            h(obj, "kotlin.collections.MutableMap");
        }
        return c(obj);
    }

    public static Object b(Object obj, int i10) {
        if (obj != null && !e(obj, i10)) {
            h(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Map c(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw g(e10);
        }
    }

    public static int d(Object obj) {
        if (obj instanceof i) {
            return ((i) obj).getArity();
        }
        if (obj instanceof fe.a) {
            return 0;
        }
        if (obj instanceof l) {
            return 1;
        }
        if (obj instanceof p) {
            return 2;
        }
        if (obj instanceof q) {
            return 3;
        }
        if (obj instanceof r) {
            return 4;
        }
        if (obj instanceof s) {
            return 5;
        }
        if (obj instanceof t) {
            return 6;
        }
        if (obj instanceof u) {
            return 7;
        }
        if (obj instanceof v) {
            return 8;
        }
        if (obj instanceof w) {
            return 9;
        }
        if (obj instanceof fe.b) {
            return 10;
        }
        if (obj instanceof c) {
            return 11;
        }
        if (obj instanceof d) {
            return 12;
        }
        if (obj instanceof e) {
            return 13;
        }
        if (obj instanceof f) {
            return 14;
        }
        if (obj instanceof g) {
            return 15;
        }
        if (obj instanceof h) {
            return 16;
        }
        if (obj instanceof i) {
            return 17;
        }
        if (obj instanceof j) {
            return 18;
        }
        if (obj instanceof k) {
            return 19;
        }
        if (obj instanceof m) {
            return 20;
        }
        if (obj instanceof n) {
            return 21;
        }
        return obj instanceof o ? 22 : -1;
    }

    public static boolean e(Object obj, int i10) {
        return (obj instanceof sd.c) && d(obj) == i10;
    }

    private static <T extends Throwable> T f(T t10) {
        return m.l(t10, c0.class.getName());
    }

    public static ClassCastException g(ClassCastException classCastException) {
        throw ((ClassCastException) f(classCastException));
    }

    public static void h(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        i(name + " cannot be cast to " + str);
    }

    public static void i(String str) {
        throw g(new ClassCastException(str));
    }
}
