package re;

import androidx.recyclerview.widget.RecyclerView;
import fe.l;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.n;
import pe.j0;
import pe.o;
import pe.p0;
import pe.r0;
import sd.o;
import sd.w;
import xd.g;
import xd.h;

/* compiled from: Produce.kt */
public final class p {

    @f(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {153}, m = "awaitClose")
    /* compiled from: Produce.kt */
    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f38017a;

        /* renamed from: b  reason: collision with root package name */
        Object f38018b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f38019c;

        /* renamed from: d  reason: collision with root package name */
        int f38020d;

        a(xd.d<? super a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f38019c = obj;
            this.f38020d |= RecyclerView.UNDEFINED_DURATION;
            return p.a((r<?>) null, (fe.a<w>) null, this);
        }
    }

    /* compiled from: Produce.kt */
    static final class b extends n implements l<Throwable, w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o<w> f38021a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(o<? super w> oVar) {
            super(1);
            this.f38021a = oVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return w.f38141a;
        }

        public final void invoke(Throwable th) {
            o<w> oVar = this.f38021a;
            o.a aVar = sd.o.f38128b;
            oVar.resumeWith(sd.o.b(w.f38141a));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: fe.a<sd.w>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(re.r<?> r4, fe.a<sd.w> r5, xd.d<? super sd.w> r6) {
        /*
            boolean r0 = r6 instanceof re.p.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            re.p$a r0 = (re.p.a) r0
            int r1 = r0.f38020d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f38020d = r1
            goto L_0x0018
        L_0x0013:
            re.p$a r0 = new re.p$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f38019c
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.f38020d
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r4 = r0.f38018b
            r5 = r4
            fe.a r5 = (fe.a) r5
            java.lang.Object r4 = r0.f38017a
            re.r r4 = (re.r) r4
            sd.p.b(r6)     // Catch:{ all -> 0x0032 }
            goto L_0x007a
        L_0x0032:
            r4 = move-exception
            goto L_0x0080
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003c:
            sd.p.b(r6)
            xd.g r6 = r0.getContext()
            pe.c2$b r2 = pe.c2.B1
            xd.g$b r6 = r6.get(r2)
            if (r6 != r4) goto L_0x004d
            r6 = 1
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            if (r6 == 0) goto L_0x0084
            r0.f38017a = r4     // Catch:{ all -> 0x0032 }
            r0.f38018b = r5     // Catch:{ all -> 0x0032 }
            r0.f38020d = r3     // Catch:{ all -> 0x0032 }
            pe.p r6 = new pe.p     // Catch:{ all -> 0x0032 }
            xd.d r2 = yd.c.b(r0)     // Catch:{ all -> 0x0032 }
            r6.<init>(r2, r3)     // Catch:{ all -> 0x0032 }
            r6.C()     // Catch:{ all -> 0x0032 }
            re.p$b r2 = new re.p$b     // Catch:{ all -> 0x0032 }
            r2.<init>(r6)     // Catch:{ all -> 0x0032 }
            r4.f(r2)     // Catch:{ all -> 0x0032 }
            java.lang.Object r4 = r6.z()     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = yd.d.c()     // Catch:{ all -> 0x0032 }
            if (r4 != r6) goto L_0x0077
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch:{ all -> 0x0032 }
        L_0x0077:
            if (r4 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r5.invoke()
            sd.w r4 = sd.w.f38141a
            return r4
        L_0x0080:
            r5.invoke()
            throw r4
        L_0x0084:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: re.p.a(re.r, fe.a, xd.d):java.lang.Object");
    }

    public static final <E> t<E> b(p0 p0Var, g gVar, int i10, a aVar, r0 r0Var, l<? super Throwable, w> lVar, fe.p<? super r<? super E>, ? super xd.d<? super w>, ? extends Object> pVar) {
        q qVar = new q(j0.d(p0Var, gVar), g.b(i10, aVar, (l) null, 4, (Object) null));
        if (lVar != null) {
            qVar.u(lVar);
        }
        qVar.T0(r0Var, qVar, pVar);
        return qVar;
    }

    public static /* synthetic */ t c(p0 p0Var, g gVar, int i10, a aVar, r0 r0Var, l lVar, fe.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = h.f39347a;
        }
        g gVar2 = gVar;
        int i12 = (i11 & 2) != 0 ? 0 : i10;
        if ((i11 & 4) != 0) {
            aVar = a.SUSPEND;
        }
        a aVar2 = aVar;
        if ((i11 & 8) != 0) {
            r0Var = r0.DEFAULT;
        }
        r0 r0Var2 = r0Var;
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        return b(p0Var, gVar2, i12, aVar2, r0Var2, lVar, pVar);
    }
}
