package ue;

import fe.l;
import kotlin.jvm.internal.n;
import pe.m0;
import sd.w;
import xd.g;

/* compiled from: OnUndeliveredElement.kt */
public final class d0 {

    /* compiled from: OnUndeliveredElement.kt */
    static final class a extends n implements l<Throwable, w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l<E, w> f38797a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ E f38798b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f38799c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l<? super E, w> lVar, E e10, g gVar) {
            super(1);
            this.f38797a = lVar;
            this.f38798b = e10;
            this.f38799c = gVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return w.f38141a;
        }

        public final void invoke(Throwable th) {
            d0.b(this.f38797a, this.f38798b, this.f38799c);
        }
    }

    public static final <E> l<Throwable, w> a(l<? super E, w> lVar, E e10, g gVar) {
        return new a(lVar, e10, gVar);
    }

    public static final <E> void b(l<? super E, w> lVar, E e10, g gVar) {
        u0 c10 = c(lVar, e10, (u0) null);
        if (c10 != null) {
            m0.a(gVar, c10);
        }
    }

    public static final <E> u0 c(l<? super E, w> lVar, E e10, u0 u0Var) {
        try {
            lVar.invoke(e10);
        } catch (Throwable th) {
            if (u0Var == null || u0Var.getCause() == th) {
                return new u0("Exception in undelivered element handler for " + e10, th);
            }
            b.a(u0Var, th);
        }
        return u0Var;
    }

    public static /* synthetic */ u0 d(l lVar, Object obj, u0 u0Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            u0Var = null;
        }
        return c(lVar, obj, u0Var);
    }
}
