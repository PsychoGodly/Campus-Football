package androidx.activity;

import fe.a;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.m;
import sd.w;

/* compiled from: OnBackPressedCallback.kt */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private boolean f716a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f717b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private a<w> f718c;

    public l(boolean z10) {
        this.f716a = z10;
    }

    public final void a(a aVar) {
        m.e(aVar, "cancellable");
        this.f717b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f716a;
    }

    public final void d() {
        for (a cancel : this.f717b) {
            cancel.cancel();
        }
    }

    public final void e(a aVar) {
        m.e(aVar, "cancellable");
        this.f717b.remove(aVar);
    }

    public final void f(boolean z10) {
        this.f716a = z10;
        a<w> aVar = this.f718c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void g(a<w> aVar) {
        this.f718c = aVar;
    }
}
