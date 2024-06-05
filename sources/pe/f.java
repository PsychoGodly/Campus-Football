package pe;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;

/* compiled from: Await.kt */
public final class f {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {66}, m = "joinAll")
    /* compiled from: Await.kt */
    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f37300a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f37301b;

        /* renamed from: c  reason: collision with root package name */
        int f37302c;

        a(xd.d<? super a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f37301b = obj;
            this.f37302c |= RecyclerView.UNDEFINED_DURATION;
            return f.b((Collection<? extends c2>) null, this);
        }
    }

    public static final <T> Object a(x0<? extends T>[] x0VarArr, xd.d<? super List<? extends T>> dVar) {
        return x0VarArr.length == 0 ? q.d() : new e(x0VarArr).c(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(java.util.Collection<? extends pe.c2> r4, xd.d<? super sd.w> r5) {
        /*
            boolean r0 = r5 instanceof pe.f.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            pe.f$a r0 = (pe.f.a) r0
            int r1 = r0.f37302c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f37302c = r1
            goto L_0x0018
        L_0x0013:
            pe.f$a r0 = new pe.f$a
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f37301b
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f37302c
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.f37300a
            java.util.Iterator r4 = (java.util.Iterator) r4
            sd.p.b(r5)
            goto L_0x003c
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            sd.p.b(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x003c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0053
            java.lang.Object r5 = r4.next()
            pe.c2 r5 = (pe.c2) r5
            r0.f37300a = r4
            r0.f37302c = r3
            java.lang.Object r5 = r5.y0(r0)
            if (r5 != r1) goto L_0x003c
            return r1
        L_0x0053:
            sd.w r4 = sd.w.f38141a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.f.b(java.util.Collection, xd.d):java.lang.Object");
    }
}
