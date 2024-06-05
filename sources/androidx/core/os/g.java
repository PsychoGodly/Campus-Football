package androidx.core.os;

import android.os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import sd.o;
import sd.p;
import xd.d;

/* compiled from: OutcomeReceiver.kt */
final class g<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {

    /* renamed from: a  reason: collision with root package name */
    private final d<R> f2970a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(d<? super R> dVar) {
        super(false);
        m.e(dVar, "continuation");
        this.f2970a = dVar;
    }

    public void onError(E e10) {
        m.e(e10, "error");
        if (compareAndSet(false, true)) {
            d<R> dVar = this.f2970a;
            o.a aVar = o.f38128b;
            dVar.resumeWith(o.b(p.a(e10)));
        }
    }

    public void onResult(R r10) {
        m.e(r10, "result");
        if (compareAndSet(false, true)) {
            d<R> dVar = this.f2970a;
            o.a aVar = o.f38128b;
            dVar.resumeWith(o.b(r10));
        }
    }

    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
