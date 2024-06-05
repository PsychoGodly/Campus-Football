package ue;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.t0;

/* compiled from: InlineList.kt */
public final class r<E> {
    public static <E> Object a(Object obj) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, int i10, h hVar) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final Object c(Object obj, E e10) {
        if (t0.a() && !(!(e10 instanceof List))) {
            throw new AssertionError();
        } else if (obj == null) {
            return a(e10);
        } else {
            if (obj instanceof ArrayList) {
                m.c(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                ((ArrayList) obj).add(e10);
                return a(obj);
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(e10);
            return a(arrayList);
        }
    }
}
