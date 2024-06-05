package pe;

import ue.h0;
import xd.d;

/* compiled from: Timeout.kt */
final class f3<U, T extends U> extends h0<T> implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final long f37305f;

    public f3(long j10, d<? super U> dVar) {
        super(dVar.getContext(), dVar);
        this.f37305f = j10;
    }

    public String p0() {
        return super.p0() + "(timeMillis=" + this.f37305f + ')';
    }

    public void run() {
        C(g3.a(this.f37305f, a1.b(getContext()), this));
    }
}
