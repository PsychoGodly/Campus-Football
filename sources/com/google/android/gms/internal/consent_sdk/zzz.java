package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
final class zzz {
    private final zzaa zza;
    private final zzcm zzb;
    private int zzc = 0;
    private ConsentInformation.PrivacyOptionsRequirementStatus zzd = ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;

    zzz(zzaa zzaa, zzcm zzcm) {
        this.zza = zzaa;
        this.zzb = zzcm;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.consent_sdk.zzac zza() throws com.google.android.gms.internal.consent_sdk.zzi {
        /*
            r11 = this;
            com.google.android.gms.internal.consent_sdk.zzcm r0 = r11.zzb
            int r1 = r0.zzf
            int r2 = r1 + -1
            r3 = 0
            if (r1 == 0) goto L_0x00c4
            java.lang.String r1 = "Invalid response from server."
            r4 = 2
            r5 = 3
            r6 = 1
            switch(r2) {
                case 1: goto L_0x0041;
                case 2: goto L_0x0041;
                case 3: goto L_0x0041;
                case 4: goto L_0x003e;
                case 5: goto L_0x003b;
                case 6: goto L_0x0029;
                case 7: goto L_0x0017;
                default: goto L_0x0011;
            }
        L_0x0011:
            com.google.android.gms.internal.consent_sdk.zzi r0 = new com.google.android.gms.internal.consent_sdk.zzi
            r0.<init>(r6, r1)
            throw r0
        L_0x0017:
            com.google.android.gms.internal.consent_sdk.zzi r1 = new com.google.android.gms.internal.consent_sdk.zzi
            java.lang.String r0 = r0.zzc
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Publisher misconfiguration: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r5, r0)
            throw r1
        L_0x0029:
            com.google.android.gms.internal.consent_sdk.zzi r1 = new com.google.android.gms.internal.consent_sdk.zzi
            java.lang.String r0 = r0.zzc
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Invalid response from server: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r6, r0)
            throw r1
        L_0x003b:
            r11.zzc = r6
            goto L_0x0043
        L_0x003e:
            r11.zzc = r4
            goto L_0x0043
        L_0x0041:
            r11.zzc = r5
        L_0x0043:
            int r2 = r0.zzg
            int r5 = r2 + -1
            if (r2 == 0) goto L_0x00c3
            if (r5 == r6) goto L_0x0058
            if (r5 != r4) goto L_0x0052
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r1 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED
            r11.zzd = r1
            goto L_0x005c
        L_0x0052:
            com.google.android.gms.internal.consent_sdk.zzi r0 = new com.google.android.gms.internal.consent_sdk.zzi
            r0.<init>(r6, r1)
            throw r0
        L_0x0058:
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r1 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED
            r11.zzd = r1
        L_0x005c:
            java.lang.String r1 = r0.zza
            if (r1 != 0) goto L_0x0062
            r2 = r3
            goto L_0x0069
        L_0x0062:
            com.google.android.gms.internal.consent_sdk.zzbs r2 = new com.google.android.gms.internal.consent_sdk.zzbs
            java.lang.String r5 = r0.zzb
            r2.<init>(r5, r1)
        L_0x0069:
            com.google.android.gms.internal.consent_sdk.zzaa r1 = r11.zza
            com.google.android.gms.internal.consent_sdk.zzas r1 = r1.zzc
            java.util.HashSet r5 = new java.util.HashSet
            java.util.List r0 = r0.zzd
            r5.<init>(r0)
            r1.zzi(r5)
            com.google.android.gms.internal.consent_sdk.zzcm r0 = r11.zzb
            java.util.List r0 = r0.zze
            java.util.Iterator r0 = r0.iterator()
        L_0x0081:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b9
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.consent_sdk.zzcl r1 = (com.google.android.gms.internal.consent_sdk.zzcl) r1
            int r5 = r1.zzb
            int r7 = r5 + -1
            if (r5 == 0) goto L_0x00b8
            if (r7 == 0) goto L_0x00a0
            if (r7 == r6) goto L_0x009d
            if (r7 == r4) goto L_0x009a
            goto L_0x00a0
        L_0x009a:
            java.lang.String r5 = "clear"
            goto L_0x00a1
        L_0x009d:
            java.lang.String r5 = "write"
            goto L_0x00a1
        L_0x00a0:
            r5 = r3
        L_0x00a1:
            if (r5 == 0) goto L_0x0081
            com.google.android.gms.internal.consent_sdk.zzaa r7 = r11.zza
            com.google.android.gms.internal.consent_sdk.zzg r8 = r7.zza
            java.lang.String r1 = r1.zza
            com.google.android.gms.internal.consent_sdk.zzf[] r9 = new com.google.android.gms.internal.consent_sdk.zzf[r6]
            r10 = 0
            com.google.android.gms.internal.consent_sdk.zzaq r7 = r7.zzb
            r9[r10] = r7
            r8.zzb(r5, r1, r9)
            goto L_0x0081
        L_0x00b8:
            throw r3
        L_0x00b9:
            com.google.android.gms.internal.consent_sdk.zzac r0 = new com.google.android.gms.internal.consent_sdk.zzac
            int r1 = r11.zzc
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r4 = r11.zzd
            r0.<init>(r1, r4, r2, r3)
            return r0
        L_0x00c3:
            throw r3
        L_0x00c4:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzz.zza():com.google.android.gms.internal.consent_sdk.zzac");
    }
}
