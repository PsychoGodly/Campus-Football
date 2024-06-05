package s1;

import androidx.work.impl.WorkDatabase;
import androidx.work.p;
import androidx.work.y;
import k1.d;
import r1.q;

/* compiled from: StopWorkRunnable */
public class i implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private static final String f22312d = p.f("StopWorkRunnable");

    /* renamed from: a  reason: collision with root package name */
    private final k1.i f22313a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22314b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f22315c;

    public i(k1.i iVar, String str, boolean z10) {
        this.f22313a = iVar;
        this.f22314b = str;
        this.f22315c = z10;
    }

    public void run() {
        boolean z10;
        WorkDatabase q10 = this.f22313a.q();
        d o10 = this.f22313a.o();
        q B = q10.B();
        q10.c();
        try {
            boolean h10 = o10.h(this.f22314b);
            if (this.f22315c) {
                z10 = this.f22313a.o().n(this.f22314b);
            } else {
                if (!h10 && B.l(this.f22314b) == y.a.RUNNING) {
                    B.b(y.a.ENQUEUED, this.f22314b);
                }
                z10 = this.f22313a.o().o(this.f22314b);
            }
            p.c().a(f22312d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f22314b, Boolean.valueOf(z10)}), new Throwable[0]);
            q10.r();
        } finally {
            q10.g();
        }
    }
}
