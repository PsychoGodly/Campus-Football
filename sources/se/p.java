package se;

import com.google.android.gms.common.api.a;
import fe.q;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.h;
import sd.w;
import te.i;
import ue.m0;
import xd.d;
import xd.g;

/* compiled from: Merge.kt */
final /* synthetic */ class p {

    /* renamed from: a  reason: collision with root package name */
    private static final int f38314a = m0.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, a.e.API_PRIORITY_OTHER);

    @f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {217, 217}, m = "invokeSuspend")
    /* compiled from: Merge.kt */
    static final class a extends l implements q<f<? super R>, T, d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38315a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f38316b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f38317c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ fe.p<T, d<? super R>, Object> f38318d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(fe.p<? super T, ? super d<? super R>, ? extends Object> pVar, d<? super a> dVar) {
            super(3, dVar);
            this.f38318d = pVar;
        }

        /* renamed from: d */
        public final Object invoke(f<? super R> fVar, T t10, d<? super w> dVar) {
            a aVar = new a(this.f38318d, dVar);
            aVar.f38316b = fVar;
            aVar.f38317c = t10;
            return aVar.invokeSuspend(w.f38141a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: se.f} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = yd.d.c()
                int r1 = r5.f38315a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                sd.p.b(r6)
                goto L_0x0045
            L_0x0012:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001a:
                java.lang.Object r1 = r5.f38316b
                se.f r1 = (se.f) r1
                sd.p.b(r6)
                goto L_0x0039
            L_0x0022:
                sd.p.b(r6)
                java.lang.Object r6 = r5.f38316b
                r1 = r6
                se.f r1 = (se.f) r1
                java.lang.Object r6 = r5.f38317c
                fe.p<T, xd.d<? super R>, java.lang.Object> r4 = r5.f38318d
                r5.f38316b = r1
                r5.f38315a = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L_0x0039
                return r0
            L_0x0039:
                r3 = 0
                r5.f38316b = r3
                r5.f38315a = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L_0x0045
                return r0
            L_0x0045:
                sd.w r6 = sd.w.f38141a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: se.p.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T, R> e<R> a(e<? extends T> eVar, fe.p<? super T, ? super d<? super R>, ? extends Object> pVar) {
        return g.D(eVar, new a(pVar, (d<? super a>) null));
    }

    public static final <T, R> e<R> b(e<? extends T> eVar, q<? super f<? super R>, ? super T, ? super d<? super w>, ? extends Object> qVar) {
        return new i(qVar, eVar, (g) null, 0, (re.a) null, 28, (h) null);
    }
}
