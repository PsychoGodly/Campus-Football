package te;

import androidx.recyclerview.widget.RecyclerView;
import fe.p;
import fe.q;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import re.u;
import sd.w;
import se.e;
import td.d0;
import xd.d;

/* compiled from: Combine.kt */
public final class k {

    @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {54, 76, 79}, m = "invokeSuspend")
    /* compiled from: Combine.kt */
    static final class a extends l implements p<p0, d<? super w>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f38682a;

        /* renamed from: b  reason: collision with root package name */
        Object f38683b;

        /* renamed from: c  reason: collision with root package name */
        int f38684c;

        /* renamed from: d  reason: collision with root package name */
        int f38685d;

        /* renamed from: f  reason: collision with root package name */
        int f38686f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f38687g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e<T>[] f38688h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ fe.a<T[]> f38689i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ q<se.f<? super R>, T[], d<? super w>, Object> f38690j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ se.f<R> f38691k;

        @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {31}, m = "invokeSuspend")
        /* renamed from: te.k$a$a  reason: collision with other inner class name */
        /* compiled from: Combine.kt */
        static final class C0444a extends l implements p<p0, d<? super w>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f38692a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e<T>[] f38693b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f38694c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ AtomicInteger f38695d;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ re.d<d0<Object>> f38696f;

            /* renamed from: te.k$a$a$a  reason: collision with other inner class name */
            /* compiled from: Combine.kt */
            static final class C0445a<T> implements se.f {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ re.d<d0<Object>> f38697a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f38698b;

                @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {32, 33}, m = "emit")
                /* renamed from: te.k$a$a$a$a  reason: collision with other inner class name */
                /* compiled from: Combine.kt */
                static final class C0446a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f38699a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ C0445a<T> f38700b;

                    /* renamed from: c  reason: collision with root package name */
                    int f38701c;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0446a(C0445a<? super T> aVar, d<? super C0446a> dVar) {
                        super(dVar);
                        this.f38700b = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f38699a = obj;
                        this.f38701c |= RecyclerView.UNDEFINED_DURATION;
                        return this.f38700b.emit(null, this);
                    }
                }

                C0445a(re.d<d0<Object>> dVar, int i10) {
                    this.f38697a = dVar;
                    this.f38698b = i10;
                }

                /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(T r7, xd.d<? super sd.w> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof te.k.a.C0444a.C0445a.C0446a
                        if (r0 == 0) goto L_0x0013
                        r0 = r8
                        te.k$a$a$a$a r0 = (te.k.a.C0444a.C0445a.C0446a) r0
                        int r1 = r0.f38701c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f38701c = r1
                        goto L_0x0018
                    L_0x0013:
                        te.k$a$a$a$a r0 = new te.k$a$a$a$a
                        r0.<init>(r6, r8)
                    L_0x0018:
                        java.lang.Object r8 = r0.f38699a
                        java.lang.Object r1 = yd.d.c()
                        int r2 = r0.f38701c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L_0x0038
                        if (r2 == r4) goto L_0x0034
                        if (r2 != r3) goto L_0x002c
                        sd.p.b(r8)
                        goto L_0x0056
                    L_0x002c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L_0x0034:
                        sd.p.b(r8)
                        goto L_0x004d
                    L_0x0038:
                        sd.p.b(r8)
                        re.d<td.d0<java.lang.Object>> r8 = r6.f38697a
                        td.d0 r2 = new td.d0
                        int r5 = r6.f38698b
                        r2.<init>(r5, r7)
                        r0.f38701c = r4
                        java.lang.Object r7 = r8.c(r2, r0)
                        if (r7 != r1) goto L_0x004d
                        return r1
                    L_0x004d:
                        r0.f38701c = r3
                        java.lang.Object r7 = pe.m3.a(r0)
                        if (r7 != r1) goto L_0x0056
                        return r1
                    L_0x0056:
                        sd.w r7 = sd.w.f38141a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: te.k.a.C0444a.C0445a.emit(java.lang.Object, xd.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0444a(e<? extends T>[] eVarArr, int i10, AtomicInteger atomicInteger, re.d<d0<Object>> dVar, d<? super C0444a> dVar2) {
                super(2, dVar2);
                this.f38693b = eVarArr;
                this.f38694c = i10;
                this.f38695d = atomicInteger;
                this.f38696f = dVar;
            }

            public final d<w> create(Object obj, d<?> dVar) {
                return new C0444a(this.f38693b, this.f38694c, this.f38695d, this.f38696f, dVar);
            }

            public final Object invoke(p0 p0Var, d<? super w> dVar) {
                return ((C0444a) create(p0Var, dVar)).invokeSuspend(w.f38141a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c10 = d.c();
                int i10 = this.f38692a;
                if (i10 == 0) {
                    sd.p.b(obj);
                    e<T>[] eVarArr = this.f38693b;
                    int i11 = this.f38694c;
                    e<T> eVar = eVarArr[i11];
                    C0445a aVar = new C0445a(this.f38696f, i11);
                    this.f38692a = 1;
                    if (eVar.collect(aVar, this) == c10) {
                        return c10;
                    }
                } else if (i10 == 1) {
                    try {
                        sd.p.b(obj);
                    } catch (Throwable th) {
                        if (this.f38695d.decrementAndGet() == 0) {
                            u.a.a(this.f38696f, (Throwable) null, 1, (Object) null);
                        }
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (this.f38695d.decrementAndGet() == 0) {
                    u.a.a(this.f38696f, (Throwable) null, 1, (Object) null);
                }
                return w.f38141a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e<? extends T>[] eVarArr, fe.a<T[]> aVar, q<? super se.f<? super R>, ? super T[], ? super d<? super w>, ? extends Object> qVar, se.f<? super R> fVar, d<? super a> dVar) {
            super(2, dVar);
            this.f38688h = eVarArr;
            this.f38689i = aVar;
            this.f38690j = qVar;
            this.f38691k = fVar;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f38688h, this.f38689i, this.f38690j, this.f38691k, dVar);
            aVar.f38687g = obj;
            return aVar;
        }

        public final Object invoke(p0 p0Var, d<? super w> dVar) {
            return ((a) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00ec A[LOOP:1: B:26:0x00ec->B:32:0x010f, LOOP_START, PHI: r3 r10 
          PHI: (r3v3 int) = (r3v2 int), (r3v4 int) binds: [B:23:0x00e7, B:32:0x010f] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v3 td.d0) = (r10v2 td.d0), (r10v16 td.d0) binds: [B:23:0x00e7, B:32:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r0 = r23
                java.lang.Object r1 = yd.d.c()
                int r2 = r0.f38686f
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L_0x0076
                if (r2 == r6) goto L_0x0052
                if (r2 == r5) goto L_0x0037
                if (r2 != r4) goto L_0x002f
                int r2 = r0.f38685d
                int r3 = r0.f38684c
                java.lang.Object r7 = r0.f38683b
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.f38682a
                re.d r8 = (re.d) r8
                java.lang.Object r9 = r0.f38687g
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                sd.p.b(r24)
                r13 = r3
                r14 = r9
                r3 = r2
                r2 = r7
                r7 = r8
                r8 = r0
                goto L_0x0165
            L_0x002f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0037:
                int r2 = r0.f38685d
                int r3 = r0.f38684c
                java.lang.Object r7 = r0.f38683b
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.f38682a
                re.d r8 = (re.d) r8
                java.lang.Object r9 = r0.f38687g
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                sd.p.b(r24)
                r13 = r3
                r14 = r9
                r3 = r2
                r2 = r7
                r7 = r8
                r8 = r0
                goto L_0x00c7
            L_0x0052:
                int r2 = r0.f38685d
                int r3 = r0.f38684c
                java.lang.Object r7 = r0.f38683b
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.f38682a
                re.d r8 = (re.d) r8
                java.lang.Object r9 = r0.f38687g
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                sd.p.b(r24)
                r10 = r24
                re.h r10 = (re.h) r10
                java.lang.Object r10 = r10.k()
                r15 = r9
                r9 = r0
                r22 = r7
                r7 = r2
                r2 = r22
                goto L_0x00e1
            L_0x0076:
                sd.p.b(r24)
                java.lang.Object r2 = r0.f38687g
                pe.p0 r2 = (pe.p0) r2
                se.e<T>[] r7 = r0.f38688h
                int r13 = r7.length
                if (r13 != 0) goto L_0x0085
                sd.w r1 = sd.w.f38141a
                return r1
            L_0x0085:
                java.lang.Object[] r14 = new java.lang.Object[r13]
                ue.l0 r8 = te.s.f38708b
                r9 = 0
                r10 = 0
                r11 = 6
                r12 = 0
                r7 = r14
                td.l.g(r7, r8, r9, r10, r11, r12)
                r7 = 6
                r8 = 0
                re.d r21 = re.g.b(r13, r8, r8, r7, r8)
                java.util.concurrent.atomic.AtomicInteger r12 = new java.util.concurrent.atomic.AtomicInteger
                r12.<init>(r13)
                r11 = 0
            L_0x009d:
                if (r11 >= r13) goto L_0x00c2
                r8 = 0
                r9 = 0
                te.k$a$a r10 = new te.k$a$a
                se.e<T>[] r7 = r0.f38688h
                r20 = 0
                r15 = r10
                r16 = r7
                r17 = r11
                r18 = r12
                r19 = r21
                r15.<init>(r16, r17, r18, r19, r20)
                r15 = 3
                r16 = 0
                r7 = r2
                r11 = r15
                r15 = r12
                r12 = r16
                pe.c2 unused = pe.k.d(r7, r8, r9, r10, r11, r12)
                int r11 = r17 + 1
                r12 = r15
                goto L_0x009d
            L_0x00c2:
                byte[] r2 = new byte[r13]
                r8 = r0
                r7 = r21
            L_0x00c7:
                int r3 = r3 + r6
                byte r3 = (byte) r3
                r8.f38687g = r14
                r8.f38682a = r7
                r8.f38683b = r2
                r8.f38684c = r13
                r8.f38685d = r3
                r8.f38686f = r6
                java.lang.Object r10 = r7.d(r8)
                if (r10 != r1) goto L_0x00dc
                return r1
            L_0x00dc:
                r9 = r8
                r15 = r14
                r8 = r7
                r7 = r3
                r3 = r13
            L_0x00e1:
                java.lang.Object r10 = re.h.f(r10)
                td.d0 r10 = (td.d0) r10
                if (r10 != 0) goto L_0x00ec
                sd.w r1 = sd.w.f38141a
                return r1
            L_0x00ec:
                int r11 = r10.a()
                r12 = r15[r11]
                java.lang.Object r10 = r10.b()
                r15[r11] = r10
                ue.l0 r10 = te.s.f38708b
                if (r12 != r10) goto L_0x00fe
                int r3 = r3 + -1
            L_0x00fe:
                byte r10 = r2[r11]
                if (r10 == r7) goto L_0x0111
                byte r10 = (byte) r7
                r2[r11] = r10
                java.lang.Object r10 = r8.a()
                java.lang.Object r10 = re.h.f(r10)
                td.d0 r10 = (td.d0) r10
                if (r10 != 0) goto L_0x00ec
            L_0x0111:
                if (r3 != 0) goto L_0x0168
                fe.a<T[]> r10 = r9.f38689i
                java.lang.Object r10 = r10.invoke()
                java.lang.Object[] r10 = (java.lang.Object[]) r10
                if (r10 != 0) goto L_0x013a
                fe.q<se.f<? super R>, T[], xd.d<? super sd.w>, java.lang.Object> r10 = r9.f38690j
                se.f<R> r11 = r9.f38691k
                r9.f38687g = r15
                r9.f38682a = r8
                r9.f38683b = r2
                r9.f38684c = r3
                r9.f38685d = r7
                r9.f38686f = r5
                java.lang.Object r10 = r10.invoke(r11, r15, r9)
                if (r10 != r1) goto L_0x0134
                return r1
            L_0x0134:
                r13 = r3
                r3 = r7
                r7 = r8
                r8 = r9
                r14 = r15
                goto L_0x00c7
            L_0x013a:
                r13 = 0
                r14 = 0
                r16 = 0
                r17 = 14
                r18 = 0
                r11 = r15
                r12 = r10
                r5 = r15
                r15 = r16
                r16 = r17
                r17 = r18
                java.lang.Object[] unused = td.l.d(r11, r12, r13, r14, r15, r16, r17)
                fe.q<se.f<? super R>, T[], xd.d<? super sd.w>, java.lang.Object> r11 = r9.f38690j
                se.f<R> r12 = r9.f38691k
                r9.f38687g = r5
                r9.f38682a = r8
                r9.f38683b = r2
                r9.f38684c = r3
                r9.f38685d = r7
                r9.f38686f = r4
                java.lang.Object r10 = r11.invoke(r12, r10, r9)
                if (r10 != r1) goto L_0x0169
                return r1
            L_0x0165:
                r5 = 2
                goto L_0x00c7
            L_0x0168:
                r5 = r15
            L_0x0169:
                r13 = r3
                r14 = r5
                r3 = r7
                r7 = r8
                r8 = r9
                goto L_0x0165
            */
            throw new UnsupportedOperationException("Method not decompiled: te.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <R, T> Object a(se.f<? super R> fVar, e<? extends T>[] eVarArr, fe.a<T[]> aVar, q<? super se.f<? super R>, ? super T[], ? super d<? super w>, ? extends Object> qVar, d<? super w> dVar) {
        Object a10 = n.a(new a(eVarArr, aVar, qVar, fVar, (d<? super a>) null), dVar);
        return a10 == d.c() ? a10 : w.f38141a;
    }
}
