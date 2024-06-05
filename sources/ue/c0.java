package ue;

import com.applovin.mediation.MaxReward;
import pe.i1;
import pe.o;
import pe.o2;
import pe.z0;
import sd.d;
import sd.w;
import xd.g;

/* compiled from: MainDispatchers.kt */
final class c0 extends o2 implements z0 {

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f38794b;

    /* renamed from: c  reason: collision with root package name */
    private final String f38795c;

    public c0(Throwable th, String str) {
        this.f38794b = th;
        this.f38795c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void e1() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f38794b
            if (r0 == 0) goto L_0x0036
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f38795c
            if (r1 == 0) goto L_0x0025
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r1 = ""
        L_0x0027:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f38794b
            r1.<init>(r0, r2)
            throw r1
        L_0x0036:
            ue.b0.d()
            sd.d r0 = new sd.d
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.c0.e1():java.lang.Void");
    }

    public i1 C0(long j10, Runnable runnable, g gVar) {
        e1();
        throw new d();
    }

    public boolean Z0(g gVar) {
        e1();
        throw new d();
    }

    public o2 b1() {
        return this;
    }

    /* renamed from: d1 */
    public Void X0(g gVar, Runnable runnable) {
        e1();
        throw new d();
    }

    /* renamed from: f1 */
    public Void q(long j10, o<? super w> oVar) {
        e1();
        throw new d();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f38794b != null) {
            str = ", cause=" + this.f38794b;
        } else {
            str = MaxReward.DEFAULT_LABEL;
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }
}
