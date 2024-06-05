package se;

import androidx.recyclerview.widget.RecyclerView;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.v;
import sd.w;
import xd.d;

/* compiled from: SharingStarted.kt */
final class h0 implements f0 {

    @f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {155}, m = "invokeSuspend")
    /* compiled from: SharingStarted.kt */
    static final class a extends l implements p<f<? super d0>, d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38199a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f38200b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i0<Integer> f38201c;

        /* renamed from: se.h0$a$a  reason: collision with other inner class name */
        /* compiled from: SharingStarted.kt */
        static final class C0432a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v f38202a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f<d0> f38203b;

            @f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {158}, m = "emit")
            /* renamed from: se.h0$a$a$a  reason: collision with other inner class name */
            /* compiled from: SharingStarted.kt */
            static final class C0433a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f38204a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C0432a<T> f38205b;

                /* renamed from: c  reason: collision with root package name */
                int f38206c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0433a(C0432a<? super T> aVar, d<? super C0433a> dVar) {
                    super(dVar);
                    this.f38205b = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f38204a = obj;
                    this.f38206c |= RecyclerView.UNDEFINED_DURATION;
                    return this.f38205b.d(0, this);
                }
            }

            C0432a(v vVar, f<? super d0> fVar) {
                this.f38202a = vVar;
                this.f38203b = fVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object d(int r5, xd.d<? super sd.w> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof se.h0.a.C0432a.C0433a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    se.h0$a$a$a r0 = (se.h0.a.C0432a.C0433a) r0
                    int r1 = r0.f38206c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f38206c = r1
                    goto L_0x0018
                L_0x0013:
                    se.h0$a$a$a r0 = new se.h0$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f38204a
                    java.lang.Object r1 = yd.d.c()
                    int r2 = r0.f38206c
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    sd.p.b(r6)
                    goto L_0x004b
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    sd.p.b(r6)
                    if (r5 <= 0) goto L_0x004e
                    kotlin.jvm.internal.v r5 = r4.f38202a
                    boolean r6 = r5.f36051a
                    if (r6 != 0) goto L_0x004e
                    r5.f36051a = r3
                    se.f<se.d0> r5 = r4.f38203b
                    se.d0 r6 = se.d0.START
                    r0.f38206c = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    sd.w r5 = sd.w.f38141a
                    return r5
                L_0x004e:
                    sd.w r5 = sd.w.f38141a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: se.h0.a.C0432a.d(int, xd.d):java.lang.Object");
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
                return d(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i0<Integer> i0Var, d<? super a> dVar) {
            super(2, dVar);
            this.f38201c = i0Var;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f38201c, dVar);
            aVar.f38200b = obj;
            return aVar;
        }

        public final Object invoke(f<? super d0> fVar, d<? super w> dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f38199a;
            if (i10 == 0) {
                sd.p.b(obj);
                v vVar = new v();
                i0<Integer> i0Var = this.f38201c;
                C0432a aVar = new C0432a(vVar, (f) this.f38200b);
                this.f38199a = 1;
                if (i0Var.collect(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                sd.p.b(obj);
            }
            throw new sd.d();
        }
    }

    public e<d0> a(i0<Integer> i0Var) {
        return g.r(new a(i0Var, (d<? super a>) null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
