package pe;

import sd.n;
import sd.s;
import sd.w;
import ue.h0;
import ue.p0;
import xd.d;
import xd.g;

/* compiled from: CoroutineContext.kt */
public final class i3<T> extends h0<T> {

    /* renamed from: f  reason: collision with root package name */
    private final ThreadLocal<n<g, Object>> f37320f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i3(xd.g r3, xd.d<? super T> r4) {
        /*
            r2 = this;
            pe.j3 r0 = pe.j3.f37327a
            xd.g$b r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000d
            xd.g r0 = r3.plus(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f37320f = r0
            xd.g r4 = r4.getContext()
            xd.e$b r0 = xd.e.E1
            xd.g$b r4 = r4.get(r0)
            boolean r4 = r4 instanceof pe.k0
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = ue.p0.c(r3, r4)
            ue.p0.a(r3, r4)
            r2.V0(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.i3.<init>(xd.g, xd.d):void");
    }

    /* access modifiers changed from: protected */
    public void P0(Object obj) {
        if (this.threadLocalIsSet) {
            n nVar = this.f37320f.get();
            if (nVar != null) {
                p0.a((g) nVar.a(), nVar.b());
            }
            this.f37320f.remove();
        }
        Object a10 = g0.a(obj, this.f38806d);
        d<T> dVar = this.f38806d;
        g context = dVar.getContext();
        i3<?> i3Var = null;
        Object c10 = p0.c(context, i3Var);
        if (c10 != p0.f38831a) {
            i3Var = j0.g(dVar, context, c10);
        }
        try {
            this.f38806d.resumeWith(a10);
            w wVar = w.f38141a;
        } finally {
            if (i3Var == null || i3Var.U0()) {
                p0.a(context, c10);
            }
        }
    }

    public final boolean U0() {
        boolean z10 = this.threadLocalIsSet && this.f37320f.get() == null;
        this.f37320f.remove();
        return !z10;
    }

    public final void V0(g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f37320f.set(s.a(gVar, obj));
    }
}
