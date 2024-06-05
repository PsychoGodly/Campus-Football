package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzek extends BroadcastReceiver {
    final /* synthetic */ zzel zza;

    /* synthetic */ zzek(zzel zzel, zzej zzej) {
        this.zza = zzel;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0055 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            java.lang.String r10 = "connectivity"
            java.lang.Object r10 = r9.getSystemService(r10)
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            r0 = 2
            r1 = 9
            r2 = 6
            r3 = 4
            r4 = 1
            r5 = 0
            r6 = 5
            if (r10 != 0) goto L_0x0014
        L_0x0012:
            r0 = 0
            goto L_0x004f
        L_0x0014:
            android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0012 }
            if (r10 == 0) goto L_0x004e
            boolean r7 = r10.isConnected()
            if (r7 != 0) goto L_0x0021
            goto L_0x004e
        L_0x0021:
            int r7 = r10.getType()
            if (r7 == 0) goto L_0x0038
            if (r7 == r4) goto L_0x004f
            if (r7 == r3) goto L_0x0038
            if (r7 == r6) goto L_0x0038
            if (r7 == r2) goto L_0x0036
            if (r7 == r1) goto L_0x0034
            r0 = 8
            goto L_0x004f
        L_0x0034:
            r0 = 7
            goto L_0x004f
        L_0x0036:
            r0 = 5
            goto L_0x004f
        L_0x0038:
            int r10 = r10.getSubtype()
            switch(r10) {
                case 1: goto L_0x004c;
                case 2: goto L_0x004c;
                case 3: goto L_0x004a;
                case 4: goto L_0x004a;
                case 5: goto L_0x004a;
                case 6: goto L_0x004a;
                case 7: goto L_0x004a;
                case 8: goto L_0x004a;
                case 9: goto L_0x004a;
                case 10: goto L_0x004a;
                case 11: goto L_0x004a;
                case 12: goto L_0x004a;
                case 13: goto L_0x0036;
                case 14: goto L_0x004a;
                case 15: goto L_0x004a;
                case 16: goto L_0x003f;
                case 17: goto L_0x004a;
                case 18: goto L_0x004f;
                case 19: goto L_0x003f;
                case 20: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            r0 = 6
            goto L_0x004f
        L_0x0041:
            int r10 = com.google.android.gms.internal.ads.zzew.zza
            r0 = 29
            if (r10 < r0) goto L_0x0012
            r0 = 9
            goto L_0x004f
        L_0x004a:
            r0 = 4
            goto L_0x004f
        L_0x004c:
            r0 = 3
            goto L_0x004f
        L_0x004e:
            r0 = 1
        L_0x004f:
            int r10 = com.google.android.gms.internal.ads.zzew.zza
            r1 = 31
            if (r10 < r1) goto L_0x0078
            if (r0 != r6) goto L_0x0078
            com.google.android.gms.internal.ads.zzel r10 = r8.zza
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r9.getSystemService(r0)     // Catch:{ RuntimeException -> 0x0074 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ RuntimeException -> 0x0074 }
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzei r1 = new com.google.android.gms.internal.ads.zzei     // Catch:{ RuntimeException -> 0x0074 }
            r1.<init>(r10)     // Catch:{ RuntimeException -> 0x0074 }
            java.util.concurrent.Executor r9 = r9.getMainExecutor()     // Catch:{ RuntimeException -> 0x0074 }
            r0.registerTelephonyCallback(r9, r1)     // Catch:{ RuntimeException -> 0x0074 }
            r0.unregisterTelephonyCallback(r1)     // Catch:{ RuntimeException -> 0x0074 }
            return
        L_0x0074:
            com.google.android.gms.internal.ads.zzel.zzc(r10, r6)
            return
        L_0x0078:
            com.google.android.gms.internal.ads.zzel r9 = r8.zza
            com.google.android.gms.internal.ads.zzel.zzc(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzek.onReceive(android.content.Context, android.content.Intent):void");
    }
}
