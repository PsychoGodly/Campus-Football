package androidx.work;

import androidx.work.impl.utils.futures.c;
import fe.l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.n;
import pe.c2;
import sd.w;
import w6.f;

/* compiled from: ListenableFuture.kt */
public final class m<R> implements f<R> {

    /* renamed from: a  reason: collision with root package name */
    private final c2 f5325a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final c<R> f5326b;

    /* compiled from: ListenableFuture.kt */
    static final class a extends n implements l<Throwable, w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m<R> f5327a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m<R> mVar) {
            super(1);
            this.f5327a = mVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return w.f38141a;
        }

        public final void invoke(Throwable th) {
            if (th == null) {
                if (!this.f5327a.f5326b.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else if (th instanceof CancellationException) {
                this.f5327a.f5326b.cancel(true);
            } else {
                c b10 = this.f5327a.f5326b;
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                b10.q(th);
            }
        }
    }

    public m(c2 c2Var, c<R> cVar) {
        kotlin.jvm.internal.m.e(c2Var, "job");
        kotlin.jvm.internal.m.e(cVar, "underlying");
        this.f5325a = c2Var;
        this.f5326b = cVar;
        c2Var.u(new a(this));
    }

    public void a(Runnable runnable, Executor executor) {
        this.f5326b.a(runnable, executor);
    }

    public final void c(R r10) {
        this.f5326b.p(r10);
    }

    public boolean cancel(boolean z10) {
        return this.f5326b.cancel(z10);
    }

    public R get() {
        return this.f5326b.get();
    }

    public R get(long j10, TimeUnit timeUnit) {
        return this.f5326b.get(j10, timeUnit);
    }

    public boolean isCancelled() {
        return this.f5326b.isCancelled();
    }

    public boolean isDone() {
        return this.f5326b.isDone();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ m(pe.c2 r1, androidx.work.impl.utils.futures.c r2, int r3, kotlin.jvm.internal.h r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000d
            androidx.work.impl.utils.futures.c r2 = androidx.work.impl.utils.futures.c.t()
            java.lang.String r3 = "create()"
            kotlin.jvm.internal.m.d(r2, r3)
        L_0x000d:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.m.<init>(pe.c2, androidx.work.impl.utils.futures.c, int, kotlin.jvm.internal.h):void");
    }
}
