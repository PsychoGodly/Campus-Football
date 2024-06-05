package ue;

import kotlin.jvm.internal.m;
import ue.i0;

/* compiled from: ConcurrentLinkedList.kt */
public final class j0<S extends i0<S>> {
    public static <S extends i0<S>> Object a(Object obj) {
        return obj;
    }

    public static final S b(Object obj) {
        if (obj != e.f38800a) {
            m.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (i0) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final boolean c(Object obj) {
        return obj == e.f38800a;
    }
}
