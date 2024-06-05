package pe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.m;
import sd.o;
import sd.w;
import xd.d;

/* compiled from: Await.kt */
final class e<T> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f37291b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x0<T>[] f37292a;
    private volatile int notCompletedCount;

    /* compiled from: Await.kt */
    private final class a extends j2 {

        /* renamed from: i  reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f37293i = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer");
        private volatile Object _disposer;

        /* renamed from: f  reason: collision with root package name */
        private final o<List<? extends T>> f37294f;

        /* renamed from: g  reason: collision with root package name */
        public i1 f37295g;

        public a(o<? super List<? extends T>> oVar) {
            this.f37294f = oVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            q((Throwable) obj);
            return w.f38141a;
        }

        public void q(Throwable th) {
            if (th != null) {
                Object m10 = this.f37294f.m(th);
                if (m10 != null) {
                    this.f37294f.r(m10);
                    e<T>.b t10 = t();
                    if (t10 != null) {
                        t10.e();
                    }
                }
            } else if (e.f37291b.decrementAndGet(e.this) == 0) {
                o<List<? extends T>> oVar = this.f37294f;
                x0[] a10 = e.this.f37292a;
                ArrayList arrayList = new ArrayList(a10.length);
                for (x0 n10 : a10) {
                    arrayList.add(n10.n());
                }
                o.a aVar = o.f38128b;
                oVar.resumeWith(o.b(arrayList));
            }
        }

        public final e<T>.b t() {
            return (b) f37293i.get(this);
        }

        public final i1 u() {
            i1 i1Var = this.f37295g;
            if (i1Var != null) {
                return i1Var;
            }
            m.t("handle");
            return null;
        }

        public final void v(e<T>.b bVar) {
            f37293i.set(this, bVar);
        }

        public final void w(i1 i1Var) {
            this.f37295g = i1Var;
        }
    }

    /* compiled from: Await.kt */
    private final class b extends m {

        /* renamed from: a  reason: collision with root package name */
        private final e<T>.defpackage.a[] f37297a;

        public b(e<T>.defpackage.a[] aVarArr) {
            this.f37297a = aVarArr;
        }

        public void d(Throwable th) {
            e();
        }

        public final void e() {
            for (e<T>.defpackage.a u10 : this.f37297a) {
                u10.u().dispose();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((Throwable) obj);
            return w.f38141a;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f37297a + ']';
        }
    }

    public e(x0<? extends T>[] x0VarArr) {
        this.f37292a = x0VarArr;
        this.notCompletedCount = x0VarArr.length;
    }

    public final Object c(d<? super List<? extends T>> dVar) {
        p pVar = new p(c.b(dVar), 1);
        pVar.C();
        int length = this.f37292a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            x0 x0Var = this.f37292a[i10];
            x0Var.start();
            a aVar = new a(pVar);
            aVar.w(x0Var.u(aVar));
            w wVar = w.f38141a;
            aVarArr[i10] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].v(bVar);
        }
        if (pVar.h()) {
            bVar.e();
        } else {
            pVar.o(bVar);
        }
        Object z10 = pVar.z();
        if (z10 == d.c()) {
            h.c(dVar);
        }
        return z10;
    }
}
