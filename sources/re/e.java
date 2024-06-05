package re;

import fe.l;
import java.util.concurrent.CancellationException;
import pe.a;
import pe.d2;
import pe.k2;
import sd.w;
import xd.d;
import xd.g;

/* compiled from: ChannelCoroutine.kt */
public class e<E> extends a<w> implements d<E> {

    /* renamed from: d  reason: collision with root package name */
    private final d<E> f38004d;

    public e(g gVar, d<E> dVar, boolean z10, boolean z11) {
        super(gVar, z10, z11);
        this.f38004d = dVar;
    }

    public void E(Throwable th) {
        CancellationException I0 = k2.I0(this, th, (String) null, 1, (Object) null);
        this.f38004d.i(I0);
        C(I0);
    }

    /* access modifiers changed from: protected */
    public final d<E> U0() {
        return this.f38004d;
    }

    public Object a() {
        return this.f38004d.a();
    }

    public Object b(d<? super E> dVar) {
        return this.f38004d.b(dVar);
    }

    public Object c(E e10, d<? super w> dVar) {
        return this.f38004d.c(e10, dVar);
    }

    public Object d(d<? super h<? extends E>> dVar) {
        Object d10 = this.f38004d.d(dVar);
        Object unused = d.c();
        return d10;
    }

    public boolean e(Throwable th) {
        return this.f38004d.e(th);
    }

    public void f(l<? super Throwable, w> lVar) {
        this.f38004d.f(lVar);
    }

    public Object g(E e10) {
        return this.f38004d.g(e10);
    }

    public final void i(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new d2(H(), (Throwable) null, this);
            }
            E(cancellationException);
        }
    }

    public f<E> iterator() {
        return this.f38004d.iterator();
    }

    public boolean q() {
        return this.f38004d.q();
    }
}
