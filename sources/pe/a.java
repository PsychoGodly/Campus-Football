package pe;

import fe.l;
import fe.p;
import xd.d;
import xd.g;

/* compiled from: AbstractCoroutine.kt */
public abstract class a<T> extends k2 implements d<T>, p0 {

    /* renamed from: c  reason: collision with root package name */
    private final g f37267c;

    public a(g gVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            c0((c2) gVar.get(c2.B1));
        }
        this.f37267c = gVar.plus(this);
    }

    /* access modifiers changed from: protected */
    public String H() {
        return u0.a(this) + " was cancelled";
    }

    /* access modifiers changed from: protected */
    public void P0(Object obj) {
        x(obj);
    }

    /* access modifiers changed from: protected */
    public void R0(Throwable th, boolean z10) {
    }

    /* access modifiers changed from: protected */
    public void S0(T t10) {
    }

    public final <R> void T0(r0 r0Var, R r10, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        r0Var.c(pVar, r10, this);
    }

    public final void b0(Throwable th) {
        m0.a(this.f37267c, th);
    }

    public final g getContext() {
        return this.f37267c;
    }

    public g getCoroutineContext() {
        return this.f37267c;
    }

    public boolean isActive() {
        return super.isActive();
    }

    public String p0() {
        String b10 = j0.b(this.f37267c);
        if (b10 == null) {
            return super.p0();
        }
        return '\"' + b10 + "\":" + super.p0();
    }

    public final void resumeWith(Object obj) {
        Object m02 = m0(g0.d(obj, (l) null, 1, (Object) null));
        if (m02 != l2.f37353b) {
            P0(m02);
        }
    }

    /* access modifiers changed from: protected */
    public final void u0(Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            R0(c0Var.f37280a, c0Var.a());
            return;
        }
        S0(obj);
    }
}
