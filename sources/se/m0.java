package se;

import androidx.recyclerview.widget.RecyclerView;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import sd.w;
import xd.d;

/* compiled from: Share.kt */
public final class m0<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f38250a;

    /* renamed from: b  reason: collision with root package name */
    private final p<f<? super T>, d<? super w>, Object> f38251b;

    @f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
    /* compiled from: Share.kt */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f38252a;

        /* renamed from: b  reason: collision with root package name */
        Object f38253b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f38254c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m0<T> f38255d;

        /* renamed from: f  reason: collision with root package name */
        int f38256f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m0<T> m0Var, d<? super a> dVar) {
            super(dVar);
            this.f38255d = m0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f38254c = obj;
            this.f38256f |= RecyclerView.UNDEFINED_DURATION;
            return this.f38255d.d(this);
        }
    }

    public m0(f<? super T> fVar, p<? super f<? super T>, ? super d<? super w>, ? extends Object> pVar) {
        this.f38250a = fVar;
        this.f38251b = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(xd.d<? super sd.w> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof se.m0.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            se.m0$a r0 = (se.m0.a) r0
            int r1 = r0.f38256f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f38256f = r1
            goto L_0x0018
        L_0x0013:
            se.m0$a r0 = new se.m0$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f38254c
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f38256f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            sd.p.b(r7)
            goto L_0x0077
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            java.lang.Object r2 = r0.f38253b
            te.t r2 = (te.t) r2
            java.lang.Object r4 = r0.f38252a
            se.m0 r4 = (se.m0) r4
            sd.p.b(r7)     // Catch:{ all -> 0x007d }
            goto L_0x005e
        L_0x0040:
            sd.p.b(r7)
            te.t r2 = new te.t
            se.f<T> r7 = r6.f38250a
            xd.g r5 = r0.getContext()
            r2.<init>(r7, r5)
            fe.p<se.f<? super T>, xd.d<? super sd.w>, java.lang.Object> r7 = r6.f38251b     // Catch:{ all -> 0x007d }
            r0.f38252a = r6     // Catch:{ all -> 0x007d }
            r0.f38253b = r2     // Catch:{ all -> 0x007d }
            r0.f38256f = r4     // Catch:{ all -> 0x007d }
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch:{ all -> 0x007d }
            if (r7 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r4 = r6
        L_0x005e:
            r2.releaseIntercepted()
            se.f<T> r7 = r4.f38250a
            boolean r2 = r7 instanceof se.m0
            if (r2 == 0) goto L_0x007a
            se.m0 r7 = (se.m0) r7
            r2 = 0
            r0.f38252a = r2
            r0.f38253b = r2
            r0.f38256f = r3
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r1) goto L_0x0077
            return r1
        L_0x0077:
            sd.w r7 = sd.w.f38141a
            return r7
        L_0x007a:
            sd.w r7 = sd.w.f38141a
            return r7
        L_0x007d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: se.m0.d(xd.d):java.lang.Object");
    }

    public Object emit(T t10, d<? super w> dVar) {
        return this.f38250a.emit(t10, dVar);
    }
}
