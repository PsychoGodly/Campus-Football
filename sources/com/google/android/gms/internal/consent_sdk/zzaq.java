package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzaq implements zzf {
    private final Application zza;
    private final zzas zzb;
    private final Executor zzc;

    public zzaq(Application application, zzas zzas, Executor executor) {
        this.zza = application;
        this.zzb = zzas;
        this.zzc = executor;
    }

    public final Executor zza() {
        return this.zzc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzb(java.lang.String r9, org.json.JSONObject r10) {
        /*
            r8 = this;
            int r0 = r9.hashCode()
            r1 = 94746189(0x5a5b64d, float:1.5583492E-35)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x001b
            r1 = 113399775(0x6c257df, float:7.3103804E-35)
            if (r0 == r1) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r0 = "write"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0025
            r9 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "clear"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0025
            r9 = 1
            goto L_0x0026
        L_0x0025:
            r9 = -1
        L_0x0026:
            java.lang.String r0 = "UserMessagingPlatform"
            if (r9 == 0) goto L_0x0084
            if (r9 == r3) goto L_0x002d
            return r2
        L_0x002d:
            java.lang.String r9 = "keys"
            org.json.JSONArray r9 = r10.optJSONArray(r9)
            if (r9 == 0) goto L_0x0072
            int r1 = r9.length()
            if (r1 != 0) goto L_0x003c
            goto L_0x0072
        L_0x003c:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            int r1 = r9.length()
        L_0x0045:
            if (r2 >= r1) goto L_0x006c
            java.lang.String r4 = r9.optString(r2)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x0066
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Action[clear]: empty key at index: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r0, r4)
            goto L_0x0069
        L_0x0066:
            r10.add(r4)
        L_0x0069:
            int r2 = r2 + 1
            goto L_0x0045
        L_0x006c:
            android.app.Application r9 = r8.zza
            com.google.android.gms.internal.consent_sdk.zzcq.zzb(r9, r10)
            goto L_0x0083
        L_0x0072:
            java.lang.String r9 = r10.toString()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "Action[clear]: wrong args."
            java.lang.String r9 = r10.concat(r9)
            android.util.Log.d(r0, r9)
        L_0x0083:
            return r3
        L_0x0084:
            com.google.android.gms.internal.consent_sdk.zzcp r9 = new com.google.android.gms.internal.consent_sdk.zzcp
            android.app.Application r1 = r8.zza
            r9.<init>(r1)
            java.util.Iterator r1 = r10.keys()
        L_0x008f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00dd
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r10.opt(r2)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Writing to storage: ["
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = "] "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.d(r0, r5)
            boolean r4 = r9.zzc(r2, r4)
            if (r4 == 0) goto L_0x00cf
            com.google.android.gms.internal.consent_sdk.zzas r4 = r8.zzb
            java.util.Set r4 = r4.zzd()
            r4.add(r2)
            goto L_0x008f
        L_0x00cf:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Failed writing key: "
            java.lang.String r2 = r4.concat(r2)
            android.util.Log.d(r0, r2)
            goto L_0x008f
        L_0x00dd:
            com.google.android.gms.internal.consent_sdk.zzas r10 = r8.zzb
            r10.zzf()
            r9.zzb()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzaq.zzb(java.lang.String, org.json.JSONObject):boolean");
    }
}
