package pe;

import fe.l;
import java.util.concurrent.CancellationException;
import me.d;
import sd.w;
import xd.a;

/* compiled from: NonCancellable.kt */
public final class q2 extends a implements c2 {

    /* renamed from: a  reason: collision with root package name */
    public static final q2 f37387a = new q2();

    private q2() {
        super(c2.B1);
    }

    public d<c2> A() {
        return j.e();
    }

    public CancellationException L() {
        throw new IllegalStateException("This job is always active");
    }

    public i1 R(boolean z10, boolean z11, l<? super Throwable, w> lVar) {
        return r2.f37394a;
    }

    public c2 getParent() {
        return null;
    }

    public u h0(w wVar) {
        return r2.f37394a;
    }

    public void i(CancellationException cancellationException) {
    }

    public boolean isActive() {
        return true;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    public i1 u(l<? super Throwable, w> lVar) {
        return r2.f37394a;
    }

    public Object y0(xd.d<? super w> dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }
}
