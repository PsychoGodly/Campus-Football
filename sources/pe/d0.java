package pe;

import fe.l;
import kotlin.jvm.internal.m;
import sd.w;

/* compiled from: CompletionState.kt */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f37287a;

    /* renamed from: b  reason: collision with root package name */
    public final l<Throwable, w> f37288b;

    public d0(Object obj, l<? super Throwable, w> lVar) {
        this.f37287a = obj;
        this.f37288b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return m.a(this.f37287a, d0Var.f37287a) && m.a(this.f37288b, d0Var.f37288b);
    }

    public int hashCode() {
        Object obj = this.f37287a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f37288b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f37287a + ", onCancellation=" + this.f37288b + ')';
    }
}
