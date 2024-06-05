package ue;

import kotlin.jvm.internal.m;

/* compiled from: LockFreeLinkedList.kt */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f38853a = new l0("CONDITION_FALSE");

    public static final Object a() {
        return f38853a;
    }

    public static final w b(Object obj) {
        w wVar;
        f0 f0Var = obj instanceof f0 ? (f0) obj : null;
        if (f0Var != null && (wVar = f0Var.f38803a) != null) {
            return wVar;
        }
        m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (w) obj;
    }
}
