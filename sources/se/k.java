package se;

import re.a;
import te.h;
import te.p;
import xd.g;

/* compiled from: Context.kt */
final /* synthetic */ class k {
    public static final <T> e<T> a(e<? extends T> eVar, int i10, a aVar) {
        a aVar2;
        int i11;
        boolean z10 = true;
        if (i10 >= 0 || i10 == -2 || i10 == -1) {
            if (i10 == -1 && aVar != a.SUSPEND) {
                z10 = false;
            }
            if (z10) {
                if (i10 == -1) {
                    aVar2 = a.DROP_OLDEST;
                    i11 = 0;
                } else {
                    i11 = i10;
                    aVar2 = aVar;
                }
                if (eVar instanceof p) {
                    return p.a.a((p) eVar, (g) null, i11, aVar2, 1, (Object) null);
                }
                return new h(eVar, (g) null, i11, aVar2, 2, (kotlin.jvm.internal.h) null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
    }

    public static /* synthetic */ e b(e eVar, int i10, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        return g.c(eVar, i10, aVar);
    }
}
