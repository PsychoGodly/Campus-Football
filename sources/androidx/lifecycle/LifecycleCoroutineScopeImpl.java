package androidx.lifecycle;

import androidx.lifecycle.i;
import fe.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import pe.c2;
import pe.g1;
import pe.p0;
import pe.r0;
import sd.w;
import xd.d;
import xd.g;

/* compiled from: Lifecycle.kt */
public final class LifecycleCoroutineScopeImpl extends j implements m {

    /* renamed from: a  reason: collision with root package name */
    private final i f3828a;

    /* renamed from: b  reason: collision with root package name */
    private final g f3829b;

    @f(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    /* compiled from: Lifecycle.kt */
    static final class a extends l implements p<p0, d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f3830a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f3831b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LifecycleCoroutineScopeImpl f3832c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, d<? super a> dVar) {
            super(2, dVar);
            this.f3832c = lifecycleCoroutineScopeImpl;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f3832c, dVar);
            aVar.f3831b = obj;
            return aVar;
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((a) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.f3830a == 0) {
                sd.p.b(obj);
                p0 p0Var = (p0) this.f3831b;
                if (this.f3832c.g().b().compareTo(i.b.INITIALIZED) >= 0) {
                    this.f3832c.g().a(this.f3832c);
                } else {
                    i2.d(p0Var.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
                }
                return w.f38141a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LifecycleCoroutineScopeImpl(i iVar, g gVar) {
        m.e(iVar, "lifecycle");
        m.e(gVar, "coroutineContext");
        this.f3828a = iVar;
        this.f3829b = gVar;
        if (g().b() == i.b.DESTROYED) {
            i2.d(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }

    public i g() {
        return this.f3828a;
    }

    public g getCoroutineContext() {
        return this.f3829b;
    }

    public final void h() {
        c2 unused = k.d(this, g1.c().b1(), (r0) null, new a(this, (d<? super a>) null), 2, (Object) null);
    }

    public void onStateChanged(p pVar, i.a aVar) {
        m.e(pVar, "source");
        m.e(aVar, "event");
        if (g().b().compareTo(i.b.DESTROYED) <= 0) {
            g().d(this);
            i2.d(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }
}
