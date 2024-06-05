package androidx.lifecycle;

import androidx.lifecycle.i;
import fe.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import pe.c2;
import pe.o;
import pe.p0;
import pe.q0;
import pe.r0;
import sd.o;
import sd.w;
import xd.d;
import xd.g;

/* compiled from: RepeatOnLifecycle.kt */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements m {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i.a f3854a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z<c2> f3855b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p0 f3856c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ i.a f3857d;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ o<w> f3858f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ye.a f3859g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ p<p0, d<? super w>, Object> f3860h;

    @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, 110}, m = "invokeSuspend")
    /* compiled from: RepeatOnLifecycle.kt */
    static final class a extends l implements p<p0, d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f3861a;

        /* renamed from: b  reason: collision with root package name */
        Object f3862b;

        /* renamed from: c  reason: collision with root package name */
        int f3863c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ye.a f3864d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<p0, d<? super w>, Object> f3865f;

        @f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {111}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a  reason: collision with other inner class name */
        /* compiled from: RepeatOnLifecycle.kt */
        static final class C0057a extends l implements p<p0, d<? super w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f3866a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f3867b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ p<p0, d<? super w>, Object> f3868c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0057a(p<? super p0, ? super d<? super w>, ? extends Object> pVar, d<? super C0057a> dVar) {
                super(2, dVar);
                this.f3868c = pVar;
            }

            public final d<w> create(Object obj, d<?> dVar) {
                C0057a aVar = new C0057a(this.f3868c, dVar);
                aVar.f3867b = obj;
                return aVar;
            }

            public final Object invoke(p0 p0Var, d<? super w> dVar) {
                return ((C0057a) create(p0Var, dVar)).invokeSuspend(w.f38141a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f3866a;
                if (i10 == 0) {
                    sd.p.b(obj);
                    p<p0, d<? super w>, Object> pVar = this.f3868c;
                    this.f3866a = 1;
                    if (pVar.invoke((p0) this.f3867b, this) == c10) {
                        return c10;
                    }
                } else if (i10 == 1) {
                    sd.p.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return w.f38141a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ye.a aVar, p<? super p0, ? super d<? super w>, ? extends Object> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f3864d = aVar;
            this.f3865f = pVar;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            return new a(this.f3864d, this.f3865f, dVar);
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((a) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Throwable th;
            ye.a aVar;
            ye.a aVar2;
            p<p0, d<? super w>, Object> pVar;
            Object c10 = d.c();
            int i10 = this.f3863c;
            if (i10 == 0) {
                sd.p.b(obj);
                aVar2 = this.f3864d;
                pVar = this.f3865f;
                this.f3861a = aVar2;
                this.f3862b = pVar;
                this.f3863c = 1;
                if (aVar2.b((Object) null, this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                pVar = (p) this.f3862b;
                sd.p.b(obj);
                aVar2 = (ye.a) this.f3861a;
            } else if (i10 == 2) {
                aVar = (ye.a) this.f3861a;
                try {
                    sd.p.b(obj);
                    w wVar = w.f38141a;
                    aVar.a((Object) null);
                    return wVar;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C0057a aVar3 = new C0057a(pVar, (d<? super C0057a>) null);
                this.f3861a = aVar2;
                this.f3862b = null;
                this.f3863c = 2;
                if (q0.e(aVar3, this) == c10) {
                    return c10;
                }
                aVar = aVar2;
                w wVar2 = w.f38141a;
                aVar.a((Object) null);
                return wVar2;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                aVar = aVar2;
                th = th4;
                aVar.a((Object) null);
                throw th;
            }
        }
    }

    public final void onStateChanged(p pVar, i.a aVar) {
        m.e(pVar, "<anonymous parameter 0>");
        m.e(aVar, "event");
        if (aVar == this.f3854a) {
            this.f3855b.f36055a = k.d(this.f3856c, (g) null, (r0) null, new a(this.f3859g, this.f3860h, (d<? super a>) null), 3, (Object) null);
            return;
        }
        if (aVar == this.f3857d) {
            c2 c2Var = (c2) this.f3855b.f36055a;
            if (c2Var != null) {
                c2.a.a(c2Var, (CancellationException) null, 1, (Object) null);
            }
            this.f3855b.f36055a = null;
        }
        if (aVar == i.a.ON_DESTROY) {
            o<w> oVar = this.f3858f;
            o.a aVar2 = sd.o.f38128b;
            oVar.resumeWith(sd.o.b(w.f38141a));
        }
    }
}
