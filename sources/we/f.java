package we;

import java.util.concurrent.Executor;
import pe.s1;
import xd.g;

/* compiled from: Dispatcher.kt */
public class f extends s1 {

    /* renamed from: c  reason: collision with root package name */
    private final int f39251c;

    /* renamed from: d  reason: collision with root package name */
    private final int f39252d;

    /* renamed from: f  reason: collision with root package name */
    private final long f39253f;

    /* renamed from: g  reason: collision with root package name */
    private final String f39254g;

    /* renamed from: h  reason: collision with root package name */
    private a f39255h = c1();

    public f(int i10, int i11, long j10, String str) {
        this.f39251c = i10;
        this.f39252d = i11;
        this.f39253f = j10;
        this.f39254g = str;
    }

    private final a c1() {
        return new a(this.f39251c, this.f39252d, this.f39253f, this.f39254g);
    }

    public void X0(g gVar, Runnable runnable) {
        a.B(this.f39255h, runnable, (i) null, false, 6, (Object) null);
    }

    public void Y0(g gVar, Runnable runnable) {
        a.B(this.f39255h, runnable, (i) null, true, 2, (Object) null);
    }

    public Executor b1() {
        return this.f39255h;
    }

    public final void d1(Runnable runnable, i iVar, boolean z10) {
        this.f39255h.A(runnable, iVar, z10);
    }
}
