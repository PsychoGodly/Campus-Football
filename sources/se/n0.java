package se;

import androidx.recyclerview.widget.RecyclerView;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import sd.w;
import xd.d;

/* compiled from: Share.kt */
final class n0<T> implements z<T> {

    /* renamed from: a  reason: collision with root package name */
    private final z<T> f38273a;

    /* renamed from: b  reason: collision with root package name */
    private final p<f<? super T>, d<? super w>, Object> f38274b;

    @f(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {409}, m = "collect")
    /* compiled from: Share.kt */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f38275a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0<T> f38276b;

        /* renamed from: c  reason: collision with root package name */
        int f38277c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n0<T> n0Var, d<? super a> dVar) {
            super(dVar);
            this.f38276b = n0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f38275a = obj;
            this.f38277c |= RecyclerView.UNDEFINED_DURATION;
            return this.f38276b.collect((f) null, this);
        }
    }

    public n0(z<? extends T> zVar, p<? super f<? super T>, ? super d<? super w>, ? extends Object> pVar) {
        this.f38273a = zVar;
        this.f38274b = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(se.f<? super T> r6, xd.d<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof se.n0.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            se.n0$a r0 = (se.n0.a) r0
            int r1 = r0.f38277c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f38277c = r1
            goto L_0x0018
        L_0x0013:
            se.n0$a r0 = new se.n0$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f38275a
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f38277c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002d:
            sd.p.b(r7)
            goto L_0x0046
        L_0x0031:
            sd.p.b(r7)
            se.z<T> r7 = r5.f38273a
            se.m0 r2 = new se.m0
            fe.p<se.f<? super T>, xd.d<? super sd.w>, java.lang.Object> r4 = r5.f38274b
            r2.<init>(r6, r4)
            r0.f38277c = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            sd.d r6 = new sd.d
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: se.n0.collect(se.f, xd.d):java.lang.Object");
    }
}
