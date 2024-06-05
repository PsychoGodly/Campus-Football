package ye;

import java.util.concurrent.atomic.AtomicReferenceArray;
import ue.i0;
import xd.g;

/* compiled from: Semaphore.kt */
final class f extends i0<f> {

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReferenceArray f39469f = new AtomicReferenceArray(e.f39468f);

    public f(long j10, f fVar, int i10) {
        super(j10, fVar, i10);
    }

    public int n() {
        return e.f39468f;
    }

    public void o(int i10, Throwable th, g gVar) {
        r().set(i10, e.f39467e);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.f39469f;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f38808c + ", hashCode=" + hashCode() + ']';
    }
}
