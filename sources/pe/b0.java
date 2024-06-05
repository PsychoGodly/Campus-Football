package pe;

import fe.l;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import sd.w;

/* compiled from: CancellableContinuationImpl.kt */
final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f37270a;

    /* renamed from: b  reason: collision with root package name */
    public final m f37271b;

    /* renamed from: c  reason: collision with root package name */
    public final l<Throwable, w> f37272c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f37273d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f37274e;

    public b0(Object obj, m mVar, l<? super Throwable, w> lVar, Object obj2, Throwable th) {
        this.f37270a = obj;
        this.f37271b = mVar;
        this.f37272c = lVar;
        this.f37273d = obj2;
        this.f37274e = th;
    }

    public static /* synthetic */ b0 b(b0 b0Var, Object obj, m mVar, l<Throwable, w> lVar, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = b0Var.f37270a;
        }
        if ((i10 & 2) != 0) {
            mVar = b0Var.f37271b;
        }
        m mVar2 = mVar;
        if ((i10 & 4) != 0) {
            lVar = b0Var.f37272c;
        }
        l<Throwable, w> lVar2 = lVar;
        if ((i10 & 8) != 0) {
            obj2 = b0Var.f37273d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th = b0Var.f37274e;
        }
        return b0Var.a(obj, mVar2, lVar2, obj4, th);
    }

    public final b0 a(Object obj, m mVar, l<? super Throwable, w> lVar, Object obj2, Throwable th) {
        return new b0(obj, mVar, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f37274e != null;
    }

    public final void d(p<?> pVar, Throwable th) {
        m mVar = this.f37271b;
        if (mVar != null) {
            pVar.n(mVar, th);
        }
        l<Throwable, w> lVar = this.f37272c;
        if (lVar != null) {
            pVar.q(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return m.a(this.f37270a, b0Var.f37270a) && m.a(this.f37271b, b0Var.f37271b) && m.a(this.f37272c, b0Var.f37272c) && m.a(this.f37273d, b0Var.f37273d) && m.a(this.f37274e, b0Var.f37274e);
    }

    public int hashCode() {
        Object obj = this.f37270a;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        m mVar = this.f37271b;
        int hashCode2 = (hashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        l<Throwable, w> lVar = this.f37272c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f37273d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f37274e;
        if (th != null) {
            i10 = th.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f37270a + ", cancelHandler=" + this.f37271b + ", onCancellation=" + this.f37272c + ", idempotentResume=" + this.f37273d + ", cancelCause=" + this.f37274e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, m mVar, l lVar, Object obj2, Throwable th, int i10, h hVar) {
        this(obj, (i10 & 2) != 0 ? null : mVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }
}
