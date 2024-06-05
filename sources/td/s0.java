package td;

import fe.p;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.m;
import sd.w;
import xd.d;

/* compiled from: SlidingWindow.kt */
public final class s0 {

    @f(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, 58}, m = "invokeSuspend")
    /* compiled from: SlidingWindow.kt */
    static final class a extends k implements p<me.f<? super List<? extends T>>, d<? super w>, Object> {

        /* renamed from: b  reason: collision with root package name */
        Object f38626b;

        /* renamed from: c  reason: collision with root package name */
        Object f38627c;

        /* renamed from: d  reason: collision with root package name */
        int f38628d;

        /* renamed from: f  reason: collision with root package name */
        int f38629f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f38630g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f38631h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f38632i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Iterator<T> f38633j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f38634k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ boolean f38635l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10, int i11, Iterator<? extends T> it, boolean z10, boolean z11, d<? super a> dVar) {
            super(2, dVar);
            this.f38631h = i10;
            this.f38632i = i11;
            this.f38633j = it;
            this.f38634k = z10;
            this.f38635l = z11;
        }

        public final d<w> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f38631h, this.f38632i, this.f38633j, this.f38634k, this.f38635l, dVar);
            aVar.f38630g = obj;
            return aVar;
        }

        /* renamed from: d */
        public final Object invoke(me.f<? super List<? extends T>> fVar, d<? super w> dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(w.f38141a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0129  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0133  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0125 A[SYNTHETIC] */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = yd.d.c()
                int r1 = r12.f38629f
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L_0x005a
                if (r1 == r6) goto L_0x0046
                if (r1 == r5) goto L_0x0041
                if (r1 == r4) goto L_0x002f
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                goto L_0x0041
            L_0x0019:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0021:
                java.lang.Object r1 = r12.f38626b
                td.n0 r1 = (td.n0) r1
                java.lang.Object r4 = r12.f38630g
                me.f r4 = (me.f) r4
                sd.p.b(r13)
                r13 = r12
                goto L_0x014d
            L_0x002f:
                java.lang.Object r1 = r12.f38627c
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r5 = r12.f38626b
                td.n0 r5 = (td.n0) r5
                java.lang.Object r8 = r12.f38630g
                me.f r8 = (me.f) r8
                sd.p.b(r13)
                r13 = r12
                goto L_0x011f
            L_0x0041:
                sd.p.b(r13)
                goto L_0x0169
            L_0x0046:
                int r1 = r12.f38628d
                java.lang.Object r2 = r12.f38627c
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r3 = r12.f38626b
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.lang.Object r4 = r12.f38630g
                me.f r4 = (me.f) r4
                sd.p.b(r13)
                r13 = r12
                r8 = r1
                goto L_0x00a8
            L_0x005a:
                sd.p.b(r13)
                java.lang.Object r13 = r12.f38630g
                me.f r13 = (me.f) r13
                int r1 = r12.f38631h
                r8 = 1024(0x400, float:1.435E-42)
                int r1 = ke.i.c(r1, r8)
                int r8 = r12.f38632i
                int r9 = r12.f38631h
                int r8 = r8 - r9
                if (r8 < 0) goto L_0x00dc
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r1)
                r1 = 0
                java.util.Iterator<T> r3 = r12.f38633j
                r4 = r13
                r13 = r12
                r11 = r3
                r3 = r2
                r2 = r11
            L_0x007d:
                boolean r9 = r2.hasNext()
                if (r9 == 0) goto L_0x00ba
                java.lang.Object r9 = r2.next()
                if (r1 <= 0) goto L_0x008c
                int r1 = r1 + -1
                goto L_0x007d
            L_0x008c:
                r3.add(r9)
                int r9 = r3.size()
                int r10 = r13.f38631h
                if (r9 != r10) goto L_0x007d
                r13.f38630g = r4
                r13.f38626b = r3
                r13.f38627c = r2
                r13.f38628d = r8
                r13.f38629f = r6
                java.lang.Object r1 = r4.a(r3, r13)
                if (r1 != r0) goto L_0x00a8
                return r0
            L_0x00a8:
                boolean r1 = r13.f38634k
                if (r1 == 0) goto L_0x00b0
                r3.clear()
                goto L_0x00b8
            L_0x00b0:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r13.f38631h
                r1.<init>(r3)
                r3 = r1
            L_0x00b8:
                r1 = r8
                goto L_0x007d
            L_0x00ba:
                boolean r1 = r3.isEmpty()
                r1 = r1 ^ r6
                if (r1 == 0) goto L_0x0169
                boolean r1 = r13.f38635l
                if (r1 != 0) goto L_0x00cd
                int r1 = r3.size()
                int r2 = r13.f38631h
                if (r1 != r2) goto L_0x0169
            L_0x00cd:
                r13.f38630g = r7
                r13.f38626b = r7
                r13.f38627c = r7
                r13.f38629f = r5
                java.lang.Object r13 = r4.a(r3, r13)
                if (r13 != r0) goto L_0x0169
                return r0
            L_0x00dc:
                td.n0 r5 = new td.n0
                r5.<init>(r1)
                java.util.Iterator<T> r1 = r12.f38633j
                r8 = r13
                r13 = r12
            L_0x00e5:
                boolean r9 = r1.hasNext()
                if (r9 == 0) goto L_0x0125
                java.lang.Object r9 = r1.next()
                r5.h(r9)
                boolean r9 = r5.n()
                if (r9 == 0) goto L_0x00e5
                int r9 = r5.size()
                int r10 = r13.f38631h
                if (r9 >= r10) goto L_0x0105
                td.n0 r5 = r5.m(r10)
                goto L_0x00e5
            L_0x0105:
                boolean r9 = r13.f38634k
                if (r9 == 0) goto L_0x010b
                r9 = r5
                goto L_0x0110
            L_0x010b:
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>(r5)
            L_0x0110:
                r13.f38630g = r8
                r13.f38626b = r5
                r13.f38627c = r1
                r13.f38629f = r4
                java.lang.Object r9 = r8.a(r9, r13)
                if (r9 != r0) goto L_0x011f
                return r0
            L_0x011f:
                int r9 = r13.f38632i
                r5.o(r9)
                goto L_0x00e5
            L_0x0125:
                boolean r1 = r13.f38635l
                if (r1 == 0) goto L_0x0169
                r1 = r5
                r4 = r8
            L_0x012b:
                int r5 = r1.size()
                int r8 = r13.f38632i
                if (r5 <= r8) goto L_0x0153
                boolean r5 = r13.f38634k
                if (r5 == 0) goto L_0x0139
                r5 = r1
                goto L_0x013e
            L_0x0139:
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r1)
            L_0x013e:
                r13.f38630g = r4
                r13.f38626b = r1
                r13.f38627c = r7
                r13.f38629f = r3
                java.lang.Object r5 = r4.a(r5, r13)
                if (r5 != r0) goto L_0x014d
                return r0
            L_0x014d:
                int r5 = r13.f38632i
                r1.o(r5)
                goto L_0x012b
            L_0x0153:
                boolean r3 = r1.isEmpty()
                r3 = r3 ^ r6
                if (r3 == 0) goto L_0x0169
                r13.f38630g = r7
                r13.f38626b = r7
                r13.f38627c = r7
                r13.f38629f = r2
                java.lang.Object r13 = r4.a(r1, r13)
                if (r13 != r0) goto L_0x0169
                return r0
            L_0x0169:
                sd.w r13 = sd.w.f38141a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: td.s0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(int i10, int i11) {
        String str;
        if (!(i10 > 0 && i11 > 0)) {
            if (i10 != i11) {
                str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
            } else {
                str = "size " + i10 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final <T> Iterator<List<T>> b(Iterator<? extends T> it, int i10, int i11, boolean z10, boolean z11) {
        m.e(it, "iterator");
        if (!it.hasNext()) {
            return z.f38642a;
        }
        return h.a(new a(i10, i11, it, z11, z10, (d<? super a>) null));
    }
}
