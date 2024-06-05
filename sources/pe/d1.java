package pe;

import kotlin.jvm.internal.m;
import we.h;
import xd.d;

/* compiled from: DispatchedTask.kt */
public abstract class d1<T> extends h {

    /* renamed from: c  reason: collision with root package name */
    public int f37289c;

    public d1(int i10) {
        this.f37289c = i10;
    }

    public void b(Object obj, Throwable th) {
    }

    public abstract d<T> c();

    public Throwable d(Object obj) {
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null) {
            return c0Var.f37280a;
        }
        return null;
    }

    public <T> T e(Object obj) {
        return obj;
    }

    public final void f(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                b.a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            m.b(th);
            m0.a(c().getContext(), new s0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object g();

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00af, code lost:
        if (r4.U0() != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d8, code lost:
        if (r4.U0() != false) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            boolean r0 = pe.t0.a()
            if (r0 == 0) goto L_0x0017
            int r0 = r10.f37289c
            r1 = -1
            if (r0 == r1) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0011
            goto L_0x0017
        L_0x0011:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0017:
            we.i r0 = r10.f39257b
            xd.d r1 = r10.c()     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            kotlin.jvm.internal.m.c(r1, r2)     // Catch:{ all -> 0x00de }
            ue.l r1 = (ue.l) r1     // Catch:{ all -> 0x00de }
            xd.d<T> r2 = r1.f38815f     // Catch:{ all -> 0x00de }
            java.lang.Object r1 = r1.f38817h     // Catch:{ all -> 0x00de }
            xd.g r3 = r2.getContext()     // Catch:{ all -> 0x00de }
            java.lang.Object r1 = ue.p0.c(r3, r1)     // Catch:{ all -> 0x00de }
            ue.l0 r4 = ue.p0.f38831a     // Catch:{ all -> 0x00de }
            r5 = 0
            if (r1 == r4) goto L_0x003a
            pe.i3 r4 = pe.j0.g(r2, r3, r1)     // Catch:{ all -> 0x00de }
            goto L_0x003b
        L_0x003a:
            r4 = r5
        L_0x003b:
            xd.g r6 = r2.getContext()     // Catch:{ all -> 0x00d1 }
            java.lang.Object r7 = r10.g()     // Catch:{ all -> 0x00d1 }
            java.lang.Throwable r8 = r10.d(r7)     // Catch:{ all -> 0x00d1 }
            if (r8 != 0) goto L_0x005a
            int r9 = r10.f37289c     // Catch:{ all -> 0x00d1 }
            boolean r9 = pe.e1.b(r9)     // Catch:{ all -> 0x00d1 }
            if (r9 == 0) goto L_0x005a
            pe.c2$b r9 = pe.c2.B1     // Catch:{ all -> 0x00d1 }
            xd.g$b r6 = r6.get(r9)     // Catch:{ all -> 0x00d1 }
            pe.c2 r6 = (pe.c2) r6     // Catch:{ all -> 0x00d1 }
            goto L_0x005b
        L_0x005a:
            r6 = r5
        L_0x005b:
            if (r6 == 0) goto L_0x008a
            boolean r9 = r6.isActive()     // Catch:{ all -> 0x00d1 }
            if (r9 != 0) goto L_0x008a
            java.util.concurrent.CancellationException r6 = r6.L()     // Catch:{ all -> 0x00d1 }
            r10.b(r7, r6)     // Catch:{ all -> 0x00d1 }
            sd.o$a r7 = sd.o.f38128b     // Catch:{ all -> 0x00d1 }
            boolean r7 = pe.t0.d()     // Catch:{ all -> 0x00d1 }
            if (r7 == 0) goto L_0x007e
            boolean r7 = r2 instanceof kotlin.coroutines.jvm.internal.e     // Catch:{ all -> 0x00d1 }
            if (r7 != 0) goto L_0x0077
            goto L_0x007e
        L_0x0077:
            r7 = r2
            kotlin.coroutines.jvm.internal.e r7 = (kotlin.coroutines.jvm.internal.e) r7     // Catch:{ all -> 0x00d1 }
            java.lang.Throwable r6 = ue.k0.i(r6, r7)     // Catch:{ all -> 0x00d1 }
        L_0x007e:
            java.lang.Object r6 = sd.p.a(r6)     // Catch:{ all -> 0x00d1 }
            java.lang.Object r6 = sd.o.b(r6)     // Catch:{ all -> 0x00d1 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00d1 }
            goto L_0x00a7
        L_0x008a:
            if (r8 == 0) goto L_0x009a
            sd.o$a r6 = sd.o.f38128b     // Catch:{ all -> 0x00d1 }
            java.lang.Object r6 = sd.p.a(r8)     // Catch:{ all -> 0x00d1 }
            java.lang.Object r6 = sd.o.b(r6)     // Catch:{ all -> 0x00d1 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00d1 }
            goto L_0x00a7
        L_0x009a:
            sd.o$a r6 = sd.o.f38128b     // Catch:{ all -> 0x00d1 }
            java.lang.Object r6 = r10.e(r7)     // Catch:{ all -> 0x00d1 }
            java.lang.Object r6 = sd.o.b(r6)     // Catch:{ all -> 0x00d1 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00d1 }
        L_0x00a7:
            sd.w r2 = sd.w.f38141a     // Catch:{ all -> 0x00d1 }
            if (r4 == 0) goto L_0x00b1
            boolean r4 = r4.U0()     // Catch:{ all -> 0x00de }
            if (r4 == 0) goto L_0x00b4
        L_0x00b1:
            ue.p0.a(r3, r1)     // Catch:{ all -> 0x00de }
        L_0x00b4:
            sd.o$a r1 = sd.o.f38128b     // Catch:{ all -> 0x00be }
            r0.a()     // Catch:{ all -> 0x00be }
            java.lang.Object r0 = sd.o.b(r2)     // Catch:{ all -> 0x00be }
            goto L_0x00c9
        L_0x00be:
            r0 = move-exception
            sd.o$a r1 = sd.o.f38128b
            java.lang.Object r0 = sd.p.a(r0)
            java.lang.Object r0 = sd.o.b(r0)
        L_0x00c9:
            java.lang.Throwable r0 = sd.o.d(r0)
            r10.f(r5, r0)
            goto L_0x00fd
        L_0x00d1:
            r2 = move-exception
            if (r4 == 0) goto L_0x00da
            boolean r4 = r4.U0()     // Catch:{ all -> 0x00de }
            if (r4 == 0) goto L_0x00dd
        L_0x00da:
            ue.p0.a(r3, r1)     // Catch:{ all -> 0x00de }
        L_0x00dd:
            throw r2     // Catch:{ all -> 0x00de }
        L_0x00de:
            r1 = move-exception
            sd.o$a r2 = sd.o.f38128b     // Catch:{ all -> 0x00eb }
            r0.a()     // Catch:{ all -> 0x00eb }
            sd.w r0 = sd.w.f38141a     // Catch:{ all -> 0x00eb }
            java.lang.Object r0 = sd.o.b(r0)     // Catch:{ all -> 0x00eb }
            goto L_0x00f6
        L_0x00eb:
            r0 = move-exception
            sd.o$a r2 = sd.o.f38128b
            java.lang.Object r0 = sd.p.a(r0)
            java.lang.Object r0 = sd.o.b(r0)
        L_0x00f6:
            java.lang.Throwable r0 = sd.o.d(r0)
            r10.f(r1, r0)
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.d1.run():void");
    }
}
