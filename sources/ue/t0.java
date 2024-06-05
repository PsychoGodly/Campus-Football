package ue;

import kotlin.jvm.internal.m;
import pe.a3;
import xd.g;

/* compiled from: ThreadContext.kt */
final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final g f38849a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f38850b;

    /* renamed from: c  reason: collision with root package name */
    private final a3<Object>[] f38851c;

    /* renamed from: d  reason: collision with root package name */
    private int f38852d;

    public t0(g gVar, int i10) {
        this.f38849a = gVar;
        this.f38850b = new Object[i10];
        this.f38851c = new a3[i10];
    }

    public final void a(a3<?> a3Var, Object obj) {
        Object[] objArr = this.f38850b;
        int i10 = this.f38852d;
        objArr[i10] = obj;
        a3<Object>[] a3VarArr = this.f38851c;
        this.f38852d = i10 + 1;
        m.c(a3Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        a3VarArr[i10] = a3Var;
    }

    public final void b(g gVar) {
        int length = this.f38851c.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                a3<Object> a3Var = this.f38851c[length];
                m.b(a3Var);
                a3Var.v0(gVar, this.f38850b[length]);
                if (i10 >= 0) {
                    length = i10;
                } else {
                    return;
                }
            }
        }
    }
}
