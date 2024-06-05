package se;

import androidx.recyclerview.widget.RecyclerView;
import fe.l;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.z;
import sd.w;
import te.s;

/* compiled from: Distinct.kt */
final class d<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final e<T> f38177a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T, Object> f38178b;

    /* renamed from: c  reason: collision with root package name */
    public final p<Object, Object, Boolean> f38179c;

    /* compiled from: Distinct.kt */
    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d<T> f38180a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z<Object> f38181b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f<T> f38182c;

        @f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {77}, m = "emit")
        /* renamed from: se.d$a$a  reason: collision with other inner class name */
        /* compiled from: Distinct.kt */
        static final class C0431a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f38183a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a<T> f38184b;

            /* renamed from: c  reason: collision with root package name */
            int f38185c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0431a(a<? super T> aVar, xd.d<? super C0431a> dVar) {
                super(dVar);
                this.f38184b = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f38183a = obj;
                this.f38185c |= RecyclerView.UNDEFINED_DURATION;
                return this.f38184b.emit(null, this);
            }
        }

        a(d<T> dVar, z<Object> zVar, f<? super T> fVar) {
            this.f38180a = dVar;
            this.f38181b = zVar;
            this.f38182c = fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r6, xd.d<? super sd.w> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof se.d.a.C0431a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                se.d$a$a r0 = (se.d.a.C0431a) r0
                int r1 = r0.f38185c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f38185c = r1
                goto L_0x0018
            L_0x0013:
                se.d$a$a r0 = new se.d$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f38183a
                java.lang.Object r1 = yd.d.c()
                int r2 = r0.f38185c
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                sd.p.b(r7)
                goto L_0x0067
            L_0x0029:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0031:
                sd.p.b(r7)
                se.d<T> r7 = r5.f38180a
                fe.l<T, java.lang.Object> r7 = r7.f38178b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.z<java.lang.Object> r2 = r5.f38181b
                T r2 = r2.f36055a
                ue.l0 r4 = te.s.f38707a
                if (r2 == r4) goto L_0x0058
                se.d<T> r4 = r5.f38180a
                fe.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f38179c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x0055
                goto L_0x0058
            L_0x0055:
                sd.w r6 = sd.w.f38141a
                return r6
            L_0x0058:
                kotlin.jvm.internal.z<java.lang.Object> r2 = r5.f38181b
                r2.f36055a = r7
                se.f<T> r7 = r5.f38182c
                r0.f38185c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L_0x0067
                return r1
            L_0x0067:
                sd.w r6 = sd.w.f38141a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: se.d.a.emit(java.lang.Object, xd.d):java.lang.Object");
        }
    }

    public d(e<? extends T> eVar, l<? super T, ? extends Object> lVar, p<Object, Object, Boolean> pVar) {
        this.f38177a = eVar;
        this.f38178b = lVar;
        this.f38179c = pVar;
    }

    public Object collect(f<? super T> fVar, xd.d<? super w> dVar) {
        z zVar = new z();
        zVar.f36055a = s.f38707a;
        Object collect = this.f38177a.collect(new a(this, zVar, fVar), dVar);
        return collect == d.c() ? collect : w.f38141a;
    }
}
