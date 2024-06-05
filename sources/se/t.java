package se;

import fe.q;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import sd.w;
import te.k;
import xd.d;

/* compiled from: Zip.kt */
final /* synthetic */ class t {

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements e<R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f38362a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f38363b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f38364c;

        public a(e eVar, e eVar2, q qVar) {
            this.f38362a = eVar;
            this.f38363b = eVar2;
            this.f38364c = qVar;
        }

        public Object collect(f<? super R> fVar, d<? super w> dVar) {
            Object a10 = k.a(fVar, new e[]{this.f38362a, this.f38363b}, t.c(), new b(this.f38364c, (d<? super b>) null), dVar);
            if (a10 == d.c()) {
                return a10;
            }
            return w.f38141a;
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {33, 33}, m = "invokeSuspend")
    /* compiled from: Zip.kt */
    static final class b extends l implements q<f<? super R>, Object[], d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38365a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f38366b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f38367c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q<T1, T2, d<? super R>, Object> f38368d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q<? super T1, ? super T2, ? super d<? super R>, ? extends Object> qVar, d<? super b> dVar) {
            super(3, dVar);
            this.f38368d = qVar;
        }

        /* renamed from: d */
        public final Object invoke(f<? super R> fVar, Object[] objArr, d<? super w> dVar) {
            b bVar = new b(this.f38368d, dVar);
            bVar.f38366b = fVar;
            bVar.f38367c = objArr;
            return bVar.invokeSuspend(w.f38141a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: se.f} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = yd.d.c()
                int r1 = r6.f38365a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                sd.p.b(r7)
                goto L_0x004c
            L_0x0012:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001a:
                java.lang.Object r1 = r6.f38366b
                se.f r1 = (se.f) r1
                sd.p.b(r7)
                goto L_0x0040
            L_0x0022:
                sd.p.b(r7)
                java.lang.Object r7 = r6.f38366b
                r1 = r7
                se.f r1 = (se.f) r1
                java.lang.Object r7 = r6.f38367c
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                fe.q<T1, T2, xd.d<? super R>, java.lang.Object> r4 = r6.f38368d
                r5 = 0
                r5 = r7[r5]
                r7 = r7[r3]
                r6.f38366b = r1
                r6.f38365a = r3
                java.lang.Object r7 = r4.invoke(r5, r7, r6)
                if (r7 != r0) goto L_0x0040
                return r0
            L_0x0040:
                r3 = 0
                r6.f38366b = r3
                r6.f38365a = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L_0x004c
                return r0
            L_0x004c:
                sd.w r7 = sd.w.f38141a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: se.t.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Zip.kt */
    static final class c extends n implements fe.a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f38369a = new c();

        c() {
            super(0);
        }

        /* renamed from: a */
        public final Void invoke() {
            return null;
        }
    }

    public static final <T1, T2, R> e<R> b(e<? extends T1> eVar, e<? extends T2> eVar2, q<? super T1, ? super T2, ? super d<? super R>, ? extends Object> qVar) {
        return new a(eVar, eVar2, qVar);
    }

    /* access modifiers changed from: private */
    public static final <T> fe.a<T[]> c() {
        return c.f38369a;
    }
}
