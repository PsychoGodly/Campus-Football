package p3;

import android.os.Handler;
import android.os.Looper;
import j4.p0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n2.c4;
import o2.u1;
import p3.e0;
import p3.x;
import r2.w;

/* compiled from: BaseMediaSource */
public abstract class a implements x {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<x.c> f21397a = new ArrayList<>(1);

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<x.c> f21398b = new HashSet<>(1);

    /* renamed from: c  reason: collision with root package name */
    private final e0.a f21399c = new e0.a();

    /* renamed from: d  reason: collision with root package name */
    private final w.a f21400d = new w.a();

    /* renamed from: f  reason: collision with root package name */
    private Looper f21401f;

    /* renamed from: g  reason: collision with root package name */
    private c4 f21402g;

    /* renamed from: h  reason: collision with root package name */
    private u1 f21403h;

    /* access modifiers changed from: protected */
    public final u1 A() {
        return (u1) k4.a.h(this.f21403h);
    }

    /* access modifiers changed from: protected */
    public final boolean B() {
        return !this.f21398b.isEmpty();
    }

    /* access modifiers changed from: protected */
    public abstract void C(p0 p0Var);

    /* access modifiers changed from: protected */
    public final void D(c4 c4Var) {
        this.f21402g = c4Var;
        Iterator<x.c> it = this.f21397a.iterator();
        while (it.hasNext()) {
            it.next().a(this, c4Var);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void E();

    public final void c(x.c cVar, p0 p0Var, u1 u1Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f21401f;
        k4.a.a(looper == null || looper == myLooper);
        this.f21403h = u1Var;
        c4 c4Var = this.f21402g;
        this.f21397a.add(cVar);
        if (this.f21401f == null) {
            this.f21401f = myLooper;
            this.f21398b.add(cVar);
            C(p0Var);
        } else if (c4Var != null) {
            d(cVar);
            cVar.a(this, c4Var);
        }
    }

    public final void d(x.c cVar) {
        k4.a.e(this.f21401f);
        boolean isEmpty = this.f21398b.isEmpty();
        this.f21398b.add(cVar);
        if (isEmpty) {
            z();
        }
    }

    public /* synthetic */ boolean i() {
        return w.b(this);
    }

    public /* synthetic */ c4 j() {
        return w.a(this);
    }

    public final void m(e0 e0Var) {
        this.f21399c.C(e0Var);
    }

    public final void n(x.c cVar) {
        this.f21397a.remove(cVar);
        if (this.f21397a.isEmpty()) {
            this.f21401f = null;
            this.f21402g = null;
            this.f21403h = null;
            this.f21398b.clear();
            E();
            return;
        }
        r(cVar);
    }

    public final void p(Handler handler, w wVar) {
        k4.a.e(handler);
        k4.a.e(wVar);
        this.f21400d.g(handler, wVar);
    }

    public final void q(Handler handler, e0 e0Var) {
        k4.a.e(handler);
        k4.a.e(e0Var);
        this.f21399c.g(handler, e0Var);
    }

    public final void r(x.c cVar) {
        boolean z10 = !this.f21398b.isEmpty();
        this.f21398b.remove(cVar);
        if (z10 && this.f21398b.isEmpty()) {
            y();
        }
    }

    public final void s(w wVar) {
        this.f21400d.t(wVar);
    }

    /* access modifiers changed from: protected */
    public final w.a t(int i10, x.b bVar) {
        return this.f21400d.u(i10, bVar);
    }

    /* access modifiers changed from: protected */
    public final w.a u(x.b bVar) {
        return this.f21400d.u(0, bVar);
    }

    /* access modifiers changed from: protected */
    public final e0.a v(int i10, x.b bVar, long j10) {
        return this.f21399c.F(i10, bVar, j10);
    }

    /* access modifiers changed from: protected */
    public final e0.a w(x.b bVar) {
        return this.f21399c.F(0, bVar, 0);
    }

    /* access modifiers changed from: protected */
    public final e0.a x(x.b bVar, long j10) {
        k4.a.e(bVar);
        return this.f21399c.F(0, bVar, j10);
    }

    /* access modifiers changed from: protected */
    public void y() {
    }

    /* access modifiers changed from: protected */
    public void z() {
    }
}
