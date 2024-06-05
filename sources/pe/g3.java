package pe;

import androidx.recyclerview.widget.RecyclerView;
import fe.p;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import ve.b;

/* compiled from: Timeout.kt */
public final class g3 {

    @f(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {104}, m = "withTimeoutOrNull")
    /* compiled from: Timeout.kt */
    static final class a<T> extends d {

        /* renamed from: a  reason: collision with root package name */
        long f37312a;

        /* renamed from: b  reason: collision with root package name */
        Object f37313b;

        /* renamed from: c  reason: collision with root package name */
        Object f37314c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f37315d;

        /* renamed from: f  reason: collision with root package name */
        int f37316f;

        a(xd.d<? super a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f37315d = obj;
            this.f37316f |= RecyclerView.UNDEFINED_DURATION;
            return g3.d(0, (p) null, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r4 == null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final pe.e3 a(long r2, pe.z0 r4, pe.c2 r5) {
        /*
            boolean r0 = r4 instanceof pe.b1
            if (r0 == 0) goto L_0x0007
            pe.b1 r4 = (pe.b1) r4
            goto L_0x0008
        L_0x0007:
            r4 = 0
        L_0x0008:
            if (r4 == 0) goto L_0x0018
            oe.b$a r0 = oe.b.f36768b
            oe.e r0 = oe.e.MILLISECONDS
            long r0 = oe.d.o(r2, r0)
            java.lang.String r4 = r4.u0(r0)
            if (r4 != 0) goto L_0x002e
        L_0x0018:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L_0x002e:
            pe.e3 r2 = new pe.e3
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.g3.a(long, pe.z0, pe.c2):pe.e3");
    }

    private static final <U, T extends U> Object b(f3<U, ? super T> f3Var, p<? super p0, ? super xd.d<? super T>, ? extends Object> pVar) {
        g2.h(f3Var, a1.b(f3Var.f38806d.getContext()).C0(f3Var.f37305f, f3Var, f3Var.getContext()));
        return b.c(f3Var, f3Var, pVar);
    }

    public static final <T> Object c(long j10, p<? super p0, ? super xd.d<? super T>, ? extends Object> pVar, xd.d<? super T> dVar) {
        if (j10 > 0) {
            Object b10 = b(new f3(j10, dVar), pVar);
            if (b10 == d.c()) {
                h.c(dVar);
            }
            return b10;
        }
        throw new e3("Timed out immediately");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object d(long r7, fe.p<? super pe.p0, ? super xd.d<? super T>, ? extends java.lang.Object> r9, xd.d<? super T> r10) {
        /*
            boolean r0 = r10 instanceof pe.g3.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            pe.g3$a r0 = (pe.g3.a) r0
            int r1 = r0.f37316f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f37316f = r1
            goto L_0x0018
        L_0x0013:
            pe.g3$a r0 = new pe.g3$a
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.f37315d
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f37316f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r7 = r0.f37314c
            kotlin.jvm.internal.z r7 = (kotlin.jvm.internal.z) r7
            java.lang.Object r8 = r0.f37313b
            fe.p r8 = (fe.p) r8
            sd.p.b(r10)     // Catch:{ e3 -> 0x0032 }
            goto L_0x006b
        L_0x0032:
            r8 = move-exception
            goto L_0x006e
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            sd.p.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x0046
            return r3
        L_0x0046:
            kotlin.jvm.internal.z r10 = new kotlin.jvm.internal.z
            r10.<init>()
            r0.f37313b = r9     // Catch:{ e3 -> 0x006c }
            r0.f37314c = r10     // Catch:{ e3 -> 0x006c }
            r0.f37312a = r7     // Catch:{ e3 -> 0x006c }
            r0.f37316f = r4     // Catch:{ e3 -> 0x006c }
            pe.f3 r2 = new pe.f3     // Catch:{ e3 -> 0x006c }
            r2.<init>(r7, r0)     // Catch:{ e3 -> 0x006c }
            r10.f36055a = r2     // Catch:{ e3 -> 0x006c }
            java.lang.Object r7 = b(r2, r9)     // Catch:{ e3 -> 0x006c }
            java.lang.Object r8 = yd.d.c()     // Catch:{ e3 -> 0x006c }
            if (r7 != r8) goto L_0x0067
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch:{ e3 -> 0x006c }
        L_0x0067:
            if (r7 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r10 = r7
        L_0x006b:
            return r10
        L_0x006c:
            r8 = move-exception
            r7 = r10
        L_0x006e:
            pe.c2 r9 = r8.f37299a
            T r7 = r7.f36055a
            if (r9 != r7) goto L_0x0075
            return r3
        L_0x0075:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.g3.d(long, fe.p, xd.d):java.lang.Object");
    }
}
