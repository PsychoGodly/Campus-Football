package te;

import androidx.recyclerview.widget.RecyclerView;
import fe.p;
import fe.q;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.z;
import pe.c2;
import pe.p0;
import pe.q0;
import pe.t0;
import sd.w;
import se.e;
import se.f;
import xd.d;
import xd.g;

/* compiled from: Merge.kt */
public final class i<T, R> extends g<T, R> {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final q<f<? super R>, T, d<? super w>, Object> f38663f;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {27}, m = "invokeSuspend")
    /* compiled from: Merge.kt */
    static final class a extends l implements p<p0, d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38664a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f38665b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i<T, R> f38666c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f<R> f38667d;

        /* renamed from: te.i$a$a  reason: collision with other inner class name */
        /* compiled from: Merge.kt */
        static final class C0442a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ z<c2> f38668a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p0 f38669b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ i<T, R> f38670c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f<R> f38671d;

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {34}, m = "invokeSuspend")
            /* renamed from: te.i$a$a$a  reason: collision with other inner class name */
            /* compiled from: Merge.kt */
            static final class C0443a extends l implements p<p0, d<? super w>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f38672a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ i<T, R> f38673b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ f<R> f38674c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ T f38675d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0443a(i<T, R> iVar, f<? super R> fVar, T t10, d<? super C0443a> dVar) {
                    super(2, dVar);
                    this.f38673b = iVar;
                    this.f38674c = fVar;
                    this.f38675d = t10;
                }

                public final d<w> create(Object obj, d<?> dVar) {
                    return new C0443a(this.f38673b, this.f38674c, this.f38675d, dVar);
                }

                public final Object invoke(p0 p0Var, d<? super w> dVar) {
                    return ((C0443a) create(p0Var, dVar)).invokeSuspend(w.f38141a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object c10 = d.c();
                    int i10 = this.f38672a;
                    if (i10 == 0) {
                        sd.p.b(obj);
                        q r10 = this.f38673b.f38663f;
                        f<R> fVar = this.f38674c;
                        T t10 = this.f38675d;
                        this.f38672a = 1;
                        if (r10.invoke(fVar, t10, this) == c10) {
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

            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {30}, m = "emit")
            /* renamed from: te.i$a$a$b */
            /* compiled from: Merge.kt */
            static final class b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a  reason: collision with root package name */
                Object f38676a;

                /* renamed from: b  reason: collision with root package name */
                Object f38677b;

                /* renamed from: c  reason: collision with root package name */
                Object f38678c;

                /* renamed from: d  reason: collision with root package name */
                /* synthetic */ Object f38679d;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C0442a<T> f38680f;

                /* renamed from: g  reason: collision with root package name */
                int f38681g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(C0442a<? super T> aVar, d<? super b> dVar) {
                    super(dVar);
                    this.f38680f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f38679d = obj;
                    this.f38681g |= RecyclerView.UNDEFINED_DURATION;
                    return this.f38680f.emit(null, this);
                }
            }

            C0442a(z<c2> zVar, p0 p0Var, i<T, R> iVar, f<? super R> fVar) {
                this.f38668a = zVar;
                this.f38669b = p0Var;
                this.f38670c = iVar;
                this.f38671d = fVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r8, xd.d<? super sd.w> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof te.i.a.C0442a.b
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    te.i$a$a$b r0 = (te.i.a.C0442a.b) r0
                    int r1 = r0.f38681g
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f38681g = r1
                    goto L_0x0018
                L_0x0013:
                    te.i$a$a$b r0 = new te.i$a$a$b
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f38679d
                    java.lang.Object r1 = yd.d.c()
                    int r2 = r0.f38681g
                    r3 = 1
                    if (r2 == 0) goto L_0x003b
                    if (r2 != r3) goto L_0x0033
                    java.lang.Object r8 = r0.f38678c
                    pe.c2 r8 = (pe.c2) r8
                    java.lang.Object r8 = r0.f38677b
                    java.lang.Object r0 = r0.f38676a
                    te.i$a$a r0 = (te.i.a.C0442a) r0
                    sd.p.b(r9)
                    goto L_0x005e
                L_0x0033:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x003b:
                    sd.p.b(r9)
                    kotlin.jvm.internal.z<pe.c2> r9 = r7.f38668a
                    T r9 = r9.f36055a
                    pe.c2 r9 = (pe.c2) r9
                    if (r9 == 0) goto L_0x005d
                    te.j r2 = new te.j
                    r2.<init>()
                    r9.i(r2)
                    r0.f38676a = r7
                    r0.f38677b = r8
                    r0.f38678c = r9
                    r0.f38681g = r3
                    java.lang.Object r9 = r9.y0(r0)
                    if (r9 != r1) goto L_0x005d
                    return r1
                L_0x005d:
                    r0 = r7
                L_0x005e:
                    kotlin.jvm.internal.z<pe.c2> r9 = r0.f38668a
                    pe.p0 r1 = r0.f38669b
                    r2 = 0
                    pe.r0 r3 = pe.r0.UNDISPATCHED
                    te.i$a$a$a r4 = new te.i$a$a$a
                    te.i<T, R> r5 = r0.f38670c
                    se.f<R> r0 = r0.f38671d
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    pe.c2 r8 = pe.k.d(r1, r2, r3, r4, r5, r6)
                    r9.f36055a = r8
                    sd.w r8 = sd.w.f38141a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: te.i.a.C0442a.emit(java.lang.Object, xd.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i<T, R> iVar, f<? super R> fVar, d<? super a> dVar) {
            super(2, dVar);
            this.f38666c = iVar;
            this.f38667d = fVar;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f38666c, this.f38667d, dVar);
            aVar.f38665b = obj;
            return aVar;
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((a) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f38664a;
            if (i10 == 0) {
                sd.p.b(obj);
                z zVar = new z();
                i<T, R> iVar = this.f38666c;
                e<S> eVar = iVar.f38659d;
                C0442a aVar = new C0442a(zVar, (p0) this.f38665b, iVar, this.f38667d);
                this.f38664a = 1;
                if (eVar.collect(aVar, this) == c10) {
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(q qVar, e eVar, g gVar, int i10, re.a aVar, int i11, h hVar) {
        this(qVar, eVar, (i11 & 4) != 0 ? xd.h.f39347a : gVar, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? re.a.SUSPEND : aVar);
    }

    /* access modifiers changed from: protected */
    public e<R> i(g gVar, int i10, re.a aVar) {
        return new i(this.f38663f, this.f38659d, gVar, i10, aVar);
    }

    /* access modifiers changed from: protected */
    public Object q(f<? super R> fVar, d<? super w> dVar) {
        if (!t0.a() || (fVar instanceof w)) {
            Object e10 = q0.e(new a(this, fVar, (d<? super a>) null), dVar);
            return e10 == d.c() ? e10 : w.f38141a;
        }
        throw new AssertionError();
    }

    public i(q<? super f<? super R>, ? super T, ? super d<? super w>, ? extends Object> qVar, e<? extends T> eVar, g gVar, int i10, re.a aVar) {
        super(eVar, gVar, i10, aVar);
        this.f38663f = qVar;
    }
}
