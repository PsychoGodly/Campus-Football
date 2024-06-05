package ue;

import fe.l;
import pe.b3;
import pe.m1;
import pe.t0;
import sd.w;
import xd.d;

/* compiled from: DispatchedContinuation.kt */
public final class m {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final l0 f38819a = new l0("UNDEFINED");

    /* renamed from: b  reason: collision with root package name */
    public static final l0 f38820b = new l0("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (r8.U0() != false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void b(xd.d<? super T> r6, java.lang.Object r7, fe.l<? super java.lang.Throwable, sd.w> r8) {
        /*
            boolean r0 = r6 instanceof ue.l
            if (r0 == 0) goto L_0x00ba
            ue.l r6 = (ue.l) r6
            java.lang.Object r8 = pe.g0.b(r7, r8)
            pe.k0 r0 = r6.f38814d
            xd.g r1 = r6.getContext()
            boolean r0 = r0.Z0(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f38816g = r8
            r6.f37289c = r1
            pe.k0 r7 = r6.f38814d
            xd.g r8 = r6.getContext()
            r7.X0(r8, r6)
            goto L_0x00bd
        L_0x0026:
            boolean r0 = pe.t0.a()
            pe.b3 r0 = pe.b3.f37276a
            pe.m1 r0 = r0.b()
            boolean r2 = r0.i1()
            if (r2 == 0) goto L_0x003f
            r6.f38816g = r8
            r6.f37289c = r1
            r0.e1(r6)
            goto L_0x00bd
        L_0x003f:
            r0.g1(r1)
            r2 = 0
            xd.g r3 = r6.getContext()     // Catch:{ all -> 0x00ad }
            pe.c2$b r4 = pe.c2.B1     // Catch:{ all -> 0x00ad }
            xd.g$b r3 = r3.get(r4)     // Catch:{ all -> 0x00ad }
            pe.c2 r3 = (pe.c2) r3     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x006d
            boolean r4 = r3.isActive()     // Catch:{ all -> 0x00ad }
            if (r4 != 0) goto L_0x006d
            java.util.concurrent.CancellationException r3 = r3.L()     // Catch:{ all -> 0x00ad }
            r6.b(r8, r3)     // Catch:{ all -> 0x00ad }
            sd.o$a r8 = sd.o.f38128b     // Catch:{ all -> 0x00ad }
            java.lang.Object r8 = sd.p.a(r3)     // Catch:{ all -> 0x00ad }
            java.lang.Object r8 = sd.o.b(r8)     // Catch:{ all -> 0x00ad }
            r6.resumeWith(r8)     // Catch:{ all -> 0x00ad }
            r8 = 1
            goto L_0x006e
        L_0x006d:
            r8 = 0
        L_0x006e:
            if (r8 != 0) goto L_0x00a6
            xd.d<T> r8 = r6.f38815f     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = r6.f38817h     // Catch:{ all -> 0x00ad }
            xd.g r4 = r8.getContext()     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = ue.p0.c(r4, r3)     // Catch:{ all -> 0x00ad }
            ue.l0 r5 = ue.p0.f38831a     // Catch:{ all -> 0x00ad }
            if (r3 == r5) goto L_0x0085
            pe.i3 r8 = pe.j0.g(r8, r4, r3)     // Catch:{ all -> 0x00ad }
            goto L_0x0086
        L_0x0085:
            r8 = r2
        L_0x0086:
            xd.d<T> r5 = r6.f38815f     // Catch:{ all -> 0x0099 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x0099 }
            sd.w r7 = sd.w.f38141a     // Catch:{ all -> 0x0099 }
            if (r8 == 0) goto L_0x0095
            boolean r7 = r8.U0()     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x00a6
        L_0x0095:
            ue.p0.a(r4, r3)     // Catch:{ all -> 0x00ad }
            goto L_0x00a6
        L_0x0099:
            r7 = move-exception
            if (r8 == 0) goto L_0x00a2
            boolean r8 = r8.U0()     // Catch:{ all -> 0x00ad }
            if (r8 == 0) goto L_0x00a5
        L_0x00a2:
            ue.p0.a(r4, r3)     // Catch:{ all -> 0x00ad }
        L_0x00a5:
            throw r7     // Catch:{ all -> 0x00ad }
        L_0x00a6:
            boolean r7 = r0.l1()     // Catch:{ all -> 0x00ad }
            if (r7 != 0) goto L_0x00a6
            goto L_0x00b1
        L_0x00ad:
            r7 = move-exception
            r6.f(r7, r2)     // Catch:{ all -> 0x00b5 }
        L_0x00b1:
            r0.b1(r1)
            goto L_0x00bd
        L_0x00b5:
            r6 = move-exception
            r0.b1(r1)
            throw r6
        L_0x00ba:
            r6.resumeWith(r7)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.m.b(xd.d, java.lang.Object, fe.l):void");
    }

    public static /* synthetic */ void c(d dVar, Object obj, l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }

    public static final boolean d(l<? super w> lVar) {
        w wVar = w.f38141a;
        boolean a10 = t0.a();
        m1 b10 = b3.f37276a.b();
        if (b10.j1()) {
            return false;
        }
        if (b10.i1()) {
            lVar.f38816g = wVar;
            lVar.f37289c = 1;
            b10.e1(lVar);
            return true;
        }
        b10.g1(true);
        try {
            lVar.run();
            do {
            } while (b10.l1());
        } catch (Throwable th) {
            b10.b1(true);
            throw th;
        }
        b10.b1(true);
        return false;
    }
}
