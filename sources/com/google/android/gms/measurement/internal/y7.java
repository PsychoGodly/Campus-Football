package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class y7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcv f25298a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b7 f25299b;

    y7(b7 b7Var, zzcv zzcv) {
        this.f25299b = b7Var;
        this.f25298a = zzcv;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0089 A[SYNTHETIC, Splitter:B:17:0x0089] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.b7 r0 = r7.f25299b
            com.google.android.gms.measurement.internal.da r0 = r0.p()
            boolean r1 = com.google.android.gms.internal.measurement.zzpr.zza()
            r2 = 0
            if (r1 == 0) goto L_0x0067
            com.google.android.gms.measurement.internal.f r1 = r0.a()
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.e0.D0
            boolean r1 = r1.n(r3)
            if (r1 == 0) goto L_0x0067
            com.google.android.gms.measurement.internal.y4 r1 = r0.e()
            com.google.android.gms.measurement.internal.y6 r1 = r1.E()
            boolean r1 = r1.y()
            if (r1 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.n4 r0 = r0.zzj()
            com.google.android.gms.measurement.internal.p4 r0 = r0.H()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.a(r1)
            goto L_0x0074
        L_0x0035:
            com.google.android.gms.measurement.internal.y4 r1 = r0.e()
            m5.e r3 = r0.zzb()
            long r3 = r3.a()
            boolean r1 = r1.t(r3)
            if (r1 != 0) goto L_0x0074
            com.google.android.gms.measurement.internal.y4 r1 = r0.e()
            com.google.android.gms.measurement.internal.d5 r1 = r1.f25279q
            long r3 = r1.a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0058
            goto L_0x0074
        L_0x0058:
            com.google.android.gms.measurement.internal.y4 r0 = r0.e()
            com.google.android.gms.measurement.internal.d5 r0 = r0.f25279q
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0075
        L_0x0067:
            com.google.android.gms.measurement.internal.n4 r0 = r0.zzj()
            com.google.android.gms.measurement.internal.p4 r0 = r0.H()
            java.lang.String r1 = "getSessionId has been disabled."
            r0.a(r1)
        L_0x0074:
            r0 = r2
        L_0x0075:
            if (r0 == 0) goto L_0x0089
            com.google.android.gms.measurement.internal.b7 r1 = r7.f25299b
            com.google.android.gms.measurement.internal.w5 r1 = r1.f25124a
            com.google.android.gms.measurement.internal.ib r1 = r1.G()
            com.google.android.gms.internal.measurement.zzcv r2 = r7.f25298a
            long r3 = r0.longValue()
            r1.K(r2, r3)
            return
        L_0x0089:
            com.google.android.gms.internal.measurement.zzcv r0 = r7.f25298a     // Catch:{ RemoteException -> 0x008f }
            r0.zza(r2)     // Catch:{ RemoteException -> 0x008f }
            return
        L_0x008f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.b7 r1 = r7.f25299b
            com.google.android.gms.measurement.internal.w5 r1 = r1.f25124a
            com.google.android.gms.measurement.internal.n4 r1 = r1.zzj()
            com.google.android.gms.measurement.internal.p4 r1 = r1.B()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.y7.run():void");
    }
}
