package se;

import androidx.recyclerview.widget.RecyclerView;
import fe.p;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.w;

/* compiled from: Transform.kt */
final /* synthetic */ class s {

    /* compiled from: SafeCollector.common.kt */
    public static final class a implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f38353a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f38354b;

        /* renamed from: se.s$a$a  reason: collision with other inner class name */
        /* compiled from: Emitters.kt */
        public static final class C0438a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f38355a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p f38356b;

            @f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223, 224}, m = "emit")
            /* renamed from: se.s$a$a$a  reason: collision with other inner class name */
            /* compiled from: Emitters.kt */
            public static final class C0439a extends d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f38357a;

                /* renamed from: b  reason: collision with root package name */
                int f38358b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C0438a f38359c;

                /* renamed from: d  reason: collision with root package name */
                Object f38360d;

                /* renamed from: f  reason: collision with root package name */
                Object f38361f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0439a(C0438a aVar, xd.d dVar) {
                    super(dVar);
                    this.f38359c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f38357a = obj;
                    this.f38358b |= RecyclerView.UNDEFINED_DURATION;
                    return this.f38359c.emit(null, this);
                }
            }

            public C0438a(f fVar, p pVar) {
                this.f38355a = fVar;
                this.f38356b = pVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r6, xd.d<? super sd.w> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof se.s.a.C0438a.C0439a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    se.s$a$a$a r0 = (se.s.a.C0438a.C0439a) r0
                    int r1 = r0.f38358b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f38358b = r1
                    goto L_0x0018
                L_0x0013:
                    se.s$a$a$a r0 = new se.s$a$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f38357a
                    java.lang.Object r1 = yd.d.c()
                    int r2 = r0.f38358b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003e
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    sd.p.b(r7)
                    goto L_0x006a
                L_0x002c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0034:
                    java.lang.Object r6 = r0.f38361f
                    se.f r6 = (se.f) r6
                    java.lang.Object r2 = r0.f38360d
                    sd.p.b(r7)
                    goto L_0x005c
                L_0x003e:
                    sd.p.b(r7)
                    se.f r7 = r5.f38355a
                    fe.p r2 = r5.f38356b
                    r0.f38360d = r6
                    r0.f38361f = r7
                    r0.f38358b = r4
                    r4 = 6
                    kotlin.jvm.internal.l.a(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.l.a(r4)
                    if (r2 != r1) goto L_0x005a
                    return r1
                L_0x005a:
                    r2 = r6
                    r6 = r7
                L_0x005c:
                    r7 = 0
                    r0.f38360d = r7
                    r0.f38361f = r7
                    r0.f38358b = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L_0x006a
                    return r1
                L_0x006a:
                    sd.w r6 = sd.w.f38141a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: se.s.a.C0438a.emit(java.lang.Object, xd.d):java.lang.Object");
            }
        }

        public a(e eVar, p pVar) {
            this.f38353a = eVar;
            this.f38354b = pVar;
        }

        public Object collect(f fVar, xd.d dVar) {
            Object collect = this.f38353a.collect(new C0438a(fVar, this.f38354b), dVar);
            if (collect == d.c()) {
                return collect;
            }
            return w.f38141a;
        }
    }

    public static final <T> e<T> a(e<? extends T> eVar, p<? super T, ? super xd.d<? super w>, ? extends Object> pVar) {
        return new a(eVar, pVar);
    }
}
