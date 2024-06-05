package ue;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import pe.i1;
import pe.k0;
import pe.m0;
import pe.o;
import pe.w0;
import pe.z0;
import sd.w;
import xd.g;
import xd.h;

/* compiled from: LimitedDispatcher.kt */
public final class s extends k0 implements z0 {

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f38841h = AtomicIntegerFieldUpdater.newUpdater(s.class, "runningWorkers");
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final k0 f38842b;

    /* renamed from: c  reason: collision with root package name */
    private final int f38843c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ z0 f38844d;

    /* renamed from: f  reason: collision with root package name */
    private final x<Runnable> f38845f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f38846g;
    private volatile int runningWorkers;

    /* compiled from: LimitedDispatcher.kt */
    private final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Runnable f38847a;

        public a(Runnable runnable) {
            this.f38847a = runnable;
        }

        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f38847a.run();
                } catch (Throwable th) {
                    m0.a(h.f39347a, th);
                }
                Runnable c12 = s.this.d1();
                if (c12 != null) {
                    this.f38847a = c12;
                    i10++;
                    if (i10 >= 16 && s.this.f38842b.Z0(s.this)) {
                        s.this.f38842b.X0(s.this, this);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public s(k0 k0Var, int i10) {
        this.f38842b = k0Var;
        this.f38843c = i10;
        z0 z0Var = k0Var instanceof z0 ? (z0) k0Var : null;
        this.f38844d = z0Var == null ? w0.a() : z0Var;
        this.f38845f = new x<>(false);
        this.f38846g = new Object();
    }

    /* access modifiers changed from: private */
    public final Runnable d1() {
        while (true) {
            Runnable d10 = this.f38845f.d();
            if (d10 != null) {
                return d10;
            }
            synchronized (this.f38846g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38841h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f38845f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    private final boolean e1() {
        synchronized (this.f38846g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38841h;
            if (atomicIntegerFieldUpdater.get(this) >= this.f38843c) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    public i1 C0(long j10, Runnable runnable, g gVar) {
        return this.f38844d.C0(j10, runnable, gVar);
    }

    public void X0(g gVar, Runnable runnable) {
        Runnable d12;
        this.f38845f.a(runnable);
        if (f38841h.get(this) < this.f38843c && e1() && (d12 = d1()) != null) {
            this.f38842b.X0(this, new a(d12));
        }
    }

    public void Y0(g gVar, Runnable runnable) {
        Runnable d12;
        this.f38845f.a(runnable);
        if (f38841h.get(this) < this.f38843c && e1() && (d12 = d1()) != null) {
            this.f38842b.Y0(this, new a(d12));
        }
    }

    public void q(long j10, o<? super w> oVar) {
        this.f38844d.q(j10, oVar);
    }
}
