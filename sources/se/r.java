package se;

import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import pe.c2;
import pe.i;
import pe.p0;
import pe.r0;
import sd.w;
import se.f0;
import xd.d;
import xd.g;

/* compiled from: Share.kt */
final /* synthetic */ class r {

    @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {214, 218, 219, 225}, m = "invokeSuspend")
    /* compiled from: Share.kt */
    static final class a extends l implements p<p0, d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38340a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f0 f38341b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e<T> f38342c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ u<T> f38343d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ T f38344f;

        @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
        /* renamed from: se.r$a$a  reason: collision with other inner class name */
        /* compiled from: Share.kt */
        static final class C0436a extends l implements p<Integer, d<? super Boolean>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f38345a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ int f38346b;

            C0436a(d<? super C0436a> dVar) {
                super(2, dVar);
            }

            public final d<w> create(Object obj, d<?> dVar) {
                C0436a aVar = new C0436a(dVar);
                aVar.f38346b = ((Number) obj).intValue();
                return aVar;
            }

            public final Object invoke(int i10, d<? super Boolean> dVar) {
                return ((C0436a) create(Integer.valueOf(i10), dVar)).invokeSuspend(w.f38141a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (d<? super Boolean>) (d) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = d.c();
                if (this.f38345a == 0) {
                    sd.p.b(obj);
                    return kotlin.coroutines.jvm.internal.b.a(this.f38346b > 0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {227}, m = "invokeSuspend")
        /* compiled from: Share.kt */
        static final class b extends l implements p<d0, d<? super w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f38347a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f38348b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e<T> f38349c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ u<T> f38350d;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ T f38351f;

            /* renamed from: se.r$a$b$a  reason: collision with other inner class name */
            /* compiled from: Share.kt */
            public /* synthetic */ class C0437a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f38352a;

                /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                static {
                    /*
                        se.d0[] r0 = se.d0.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        se.d0 r1 = se.d0.START     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        se.d0 r1 = se.d0.STOP     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        se.d0 r1 = se.d0.STOP_AND_RESET_REPLAY_CACHE     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        f38352a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: se.r.a.b.C0437a.<clinit>():void");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(e<? extends T> eVar, u<T> uVar, T t10, d<? super b> dVar) {
                super(2, dVar);
                this.f38349c = eVar;
                this.f38350d = uVar;
                this.f38351f = t10;
            }

            public final d<w> create(Object obj, d<?> dVar) {
                b bVar = new b(this.f38349c, this.f38350d, this.f38351f, dVar);
                bVar.f38348b = obj;
                return bVar;
            }

            /* renamed from: d */
            public final Object invoke(d0 d0Var, d<? super w> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(w.f38141a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f38347a;
                if (i10 == 0) {
                    sd.p.b(obj);
                    int i11 = C0437a.f38352a[((d0) this.f38348b).ordinal()];
                    if (i11 == 1) {
                        e<T> eVar = this.f38349c;
                        u<T> uVar = this.f38350d;
                        this.f38347a = 1;
                        if (eVar.collect(uVar, this) == c10) {
                            return c10;
                        }
                    } else if (i11 == 3) {
                        T t10 = this.f38351f;
                        if (t10 == b0.f38173a) {
                            this.f38350d.b();
                        } else {
                            this.f38350d.c(t10);
                        }
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
        a(f0 f0Var, e<? extends T> eVar, u<T> uVar, T t10, d<? super a> dVar) {
            super(2, dVar);
            this.f38341b = f0Var;
            this.f38342c = eVar;
            this.f38343d = uVar;
            this.f38344f = t10;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            return new a(this.f38341b, this.f38342c, this.f38343d, this.f38344f, dVar);
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((a) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f38340a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        sd.p.b(obj);
                    } else if (!(i10 == 3 || i10 == 4)) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                sd.p.b(obj);
                return w.f38141a;
            }
            sd.p.b(obj);
            f0 f0Var = this.f38341b;
            f0.a aVar = f0.f38194a;
            if (f0Var == aVar.a()) {
                e<T> eVar = this.f38342c;
                u<T> uVar = this.f38343d;
                this.f38340a = 1;
                if (eVar.collect(uVar, this) == c10) {
                    return c10;
                }
            } else if (this.f38341b == aVar.b()) {
                i0<Integer> e10 = this.f38343d.e();
                C0436a aVar2 = new C0436a((d<? super C0436a>) null);
                this.f38340a = 2;
                if (g.p(e10, aVar2, this) == c10) {
                    return c10;
                }
            } else {
                e<d0> k10 = g.k(this.f38341b.a(this.f38343d.e()));
                b bVar = new b(this.f38342c, this.f38343d, this.f38344f, (d<? super b>) null);
                this.f38340a = 4;
                if (g.j(k10, bVar, this) == c10) {
                    return c10;
                }
            }
            return w.f38141a;
            e<T> eVar2 = this.f38342c;
            u<T> uVar2 = this.f38343d;
            this.f38340a = 3;
            if (eVar2.collect(uVar2, this) == c10) {
                return c10;
            }
            return w.f38141a;
        }
    }

    public static final <T> z<T> a(u<T> uVar) {
        return new w(uVar, (c2) null);
    }

    public static final <T> i0<T> b(v<T> vVar) {
        return new x(vVar, (c2) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r9 == 0) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <T> se.e0<T> c(se.e<? extends T> r8, int r9) {
        /*
            boolean r0 = pe.t0.a()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            if (r9 < 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            if (r0 == 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L_0x0016:
            re.d$a r0 = re.d.C1
            int r0 = r0.a()
            int r0 = ke.i.a(r9, r0)
            int r0 = r0 - r9
            boolean r3 = r8 instanceof te.e
            if (r3 == 0) goto L_0x0053
            r3 = r8
            te.e r3 = (te.e) r3
            se.e r4 = r3.j()
            if (r4 == 0) goto L_0x0053
            se.e0 r8 = new se.e0
            int r5 = r3.f38650b
            r6 = -3
            if (r5 == r6) goto L_0x003c
            r6 = -2
            if (r5 == r6) goto L_0x003c
            if (r5 == 0) goto L_0x003c
            r1 = r5
            goto L_0x004b
        L_0x003c:
            re.a r6 = r3.f38651c
            re.a r7 = re.a.SUSPEND
            if (r6 != r7) goto L_0x0047
            if (r5 != 0) goto L_0x0045
            goto L_0x004a
        L_0x0045:
            r1 = r0
            goto L_0x004b
        L_0x0047:
            if (r9 != 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r1 = 0
        L_0x004b:
            re.a r9 = r3.f38651c
            xd.g r0 = r3.f38649a
            r8.<init>(r4, r1, r9, r0)
            return r8
        L_0x0053:
            se.e0 r9 = new se.e0
            re.a r1 = re.a.SUSPEND
            xd.h r2 = xd.h.f39347a
            r9.<init>(r8, r0, r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: se.r.c(se.e, int):se.e0");
    }

    private static final <T> c2 d(p0 p0Var, g gVar, e<? extends T> eVar, u<T> uVar, f0 f0Var, T t10) {
        return i.c(p0Var, gVar, m.a(f0Var, f0.f38194a.a()) ? r0.DEFAULT : r0.UNDISPATCHED, new a(f0Var, eVar, uVar, t10, (d<? super a>) null));
    }

    public static final <T> z<T> e(z<? extends T> zVar, p<? super f<? super T>, ? super d<? super w>, ? extends Object> pVar) {
        return new n0(zVar, pVar);
    }

    public static final <T> z<T> f(e<? extends T> eVar, p0 p0Var, f0 f0Var, int i10) {
        e0<? extends T> c10 = c(eVar, i10);
        u a10 = b0.a(i10, c10.f38191b, c10.f38192c);
        return new w(a10, d(p0Var, c10.f38193d, c10.f38190a, a10, f0Var, b0.f38173a));
    }
}
