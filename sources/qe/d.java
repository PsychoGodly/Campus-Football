package qe;

import android.os.Handler;
import android.os.Looper;
import fe.l;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import pe.g1;
import pe.g2;
import pe.i1;
import pe.o;
import pe.r2;
import sd.w;
import xd.g;

/* compiled from: HandlerDispatcher.kt */
public final class d extends e {
    private volatile d _immediate;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Handler f37723b;

    /* renamed from: c  reason: collision with root package name */
    private final String f37724c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f37725d;

    /* renamed from: f  reason: collision with root package name */
    private final d f37726f;

    /* compiled from: Runnable.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f37727a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f37728b;

        public a(o oVar, d dVar) {
            this.f37727a = oVar;
            this.f37728b = dVar;
        }

        public final void run() {
            this.f37727a.j(this.f37728b, w.f38141a);
        }
    }

    /* compiled from: HandlerDispatcher.kt */
    static final class b extends n implements l<Throwable, w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f37729a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f37730b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, Runnable runnable) {
            super(1);
            this.f37729a = dVar;
            this.f37730b = runnable;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return w.f38141a;
        }

        public final void invoke(Throwable th) {
            this.f37729a.f37723b.removeCallbacks(this.f37730b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Handler handler, String str, boolean z10) {
        super((h) null);
        d dVar = null;
        this.f37723b = handler;
        this.f37724c = str;
        this.f37725d = z10;
        this._immediate = z10 ? this : dVar;
        d dVar2 = this._immediate;
        if (dVar2 == null) {
            dVar2 = new d(handler, str, true);
            this._immediate = dVar2;
        }
        this.f37726f = dVar2;
    }

    private final void f1(g gVar, Runnable runnable) {
        g2.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        g1.b().X0(gVar, runnable);
    }

    /* access modifiers changed from: private */
    public static final void h1(d dVar, Runnable runnable) {
        dVar.f37723b.removeCallbacks(runnable);
    }

    public i1 C0(long j10, Runnable runnable, g gVar) {
        if (this.f37723b.postDelayed(runnable, i.d(j10, 4611686018427387903L))) {
            return new c(this, runnable);
        }
        f1(gVar, runnable);
        return r2.f37394a;
    }

    public void X0(g gVar, Runnable runnable) {
        if (!this.f37723b.post(runnable)) {
            f1(gVar, runnable);
        }
    }

    public boolean Z0(g gVar) {
        return !this.f37725d || !m.a(Looper.myLooper(), this.f37723b.getLooper());
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f37723b == this.f37723b;
    }

    /* renamed from: g1 */
    public d b1() {
        return this.f37726f;
    }

    public int hashCode() {
        return System.identityHashCode(this.f37723b);
    }

    public void q(long j10, o<? super w> oVar) {
        a aVar = new a(oVar, this);
        if (this.f37723b.postDelayed(aVar, i.d(j10, 4611686018427387903L))) {
            oVar.o(new b(this, aVar));
        } else {
            f1(oVar.getContext(), aVar);
        }
    }

    public String toString() {
        String c12 = c1();
        if (c12 != null) {
            return c12;
        }
        String str = this.f37724c;
        if (str == null) {
            str = this.f37723b.toString();
        }
        if (!this.f37725d) {
            return str;
        }
        return str + ".immediate";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Handler handler, String str, int i10, h hVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public d(Handler handler, String str) {
        this(handler, str, false);
    }
}
