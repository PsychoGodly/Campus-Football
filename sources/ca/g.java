package ca;

import android.text.TextUtils;
import w9.a;
import x9.f;
import x9.i;
import x9.k;
import x9.o;

public class g {
    public static void a() {
        if (!a.c()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(String str, int i10, String str2) {
        if (str.length() > i10) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void e(k kVar, f fVar, i iVar) {
        if (kVar == k.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (fVar == f.DEFINED_BY_JAVASCRIPT && kVar == k.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (iVar == i.DEFINED_BY_JAVASCRIPT && kVar == k.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public static void f(o oVar) {
        h(oVar);
        g(oVar);
    }

    public static void g(o oVar) {
        if (oVar.n()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    private static void h(o oVar) {
        if (!oVar.r()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    public static void i(o oVar) {
        if (!oVar.q()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void j(o oVar) {
        if (oVar.p().n() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }
}
