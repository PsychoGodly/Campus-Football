package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzaqz {
    static zzfvw zza;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r0 != null) goto L_0x0035;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean zza(com.google.android.gms.internal.ads.zzaqx r6) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            com.google.android.gms.internal.ads.zzfvw r0 = zza
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            com.google.android.gms.internal.ads.zzbaj r0 = com.google.android.gms.internal.ads.zzbar.zzcN
            com.google.android.gms.internal.ads.zzbap r2 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 0
            if (r0 == 0) goto L_0x001b
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0035
        L_0x001b:
            r0 = 0
            if (r6 != 0) goto L_0x001f
            goto L_0x0033
        L_0x001f:
            java.lang.String r3 = "L2vZ2OO3rwdvrPw7w8gxoc6uBumpVgtFZaDCD4UMQe7ip3FstmhcWfdbGlrdar2/"
            java.lang.String r4 = "ZBu/zDVJcH0s7e1wI2CAP7CbHihYO+AvFuVQbZgL9s8="
            java.lang.reflect.Method r6 = r6.zzj(r3, r4)
            if (r6 != 0) goto L_0x002a
            goto L_0x0033
        L_0x002a:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Object r6 = r6.invoke(r0, r3)
            java.lang.String r6 = (java.lang.String) r6
            r0 = r6
        L_0x0033:
            if (r0 == 0) goto L_0x011e
        L_0x0035:
            byte[] r6 = com.google.android.gms.internal.ads.zzaoh.zzb(r0, r1)     // Catch:{ IllegalArgumentException -> 0x011e }
            com.google.android.gms.internal.ads.zzfwp r6 = com.google.android.gms.internal.ads.zzfwt.zza(r6)     // Catch:{  }
            com.google.android.gms.internal.ads.zzgmh r0 = com.google.android.gms.internal.ads.zzgbf.zza     // Catch:{  }
            java.util.List r0 = r0.zzd()     // Catch:{  }
            java.util.Iterator r0 = r0.iterator()     // Catch:{  }
        L_0x0047:
            boolean r3 = r0.hasNext()     // Catch:{  }
            if (r3 == 0) goto L_0x010e
            java.lang.Object r3 = r0.next()     // Catch:{  }
            com.google.android.gms.internal.ads.zzglg r3 = (com.google.android.gms.internal.ads.zzglg) r3     // Catch:{  }
            java.lang.String r4 = r3.zzf()     // Catch:{  }
            boolean r4 = r4.isEmpty()     // Catch:{  }
            if (r4 != 0) goto L_0x0106
            java.lang.String r4 = r3.zze()     // Catch:{  }
            boolean r4 = r4.isEmpty()     // Catch:{  }
            if (r4 != 0) goto L_0x00fe
            java.lang.String r4 = r3.zzd()     // Catch:{  }
            boolean r4 = r4.isEmpty()     // Catch:{  }
            if (r4 != 0) goto L_0x00f6
            java.lang.String r4 = r3.zzd()     // Catch:{  }
            java.lang.String r5 = "TinkAead"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.zzd()     // Catch:{  }
            java.lang.String r5 = "TinkMac"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.zzd()     // Catch:{  }
            java.lang.String r5 = "TinkHybridDecrypt"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.zzd()     // Catch:{  }
            java.lang.String r5 = "TinkHybridEncrypt"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.zzd()     // Catch:{  }
            java.lang.String r5 = "TinkPublicKeySign"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.zzd()     // Catch:{  }
            java.lang.String r5 = "TinkPublicKeyVerify"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.zzd()     // Catch:{  }
            java.lang.String r5 = "TinkStreamingAead"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.zzd()     // Catch:{  }
            java.lang.String r5 = "TinkDeterministicAead"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.zzd()     // Catch:{  }
            com.google.android.gms.internal.ads.zzfvr r4 = com.google.android.gms.internal.ads.zzfxf.zza(r4)     // Catch:{  }
            com.google.android.gms.internal.ads.zzfxc r5 = r4.zza()     // Catch:{  }
            com.google.android.gms.internal.ads.zzfxf.zzp(r5)     // Catch:{  }
            r3.zzf()     // Catch:{  }
            r3.zze()     // Catch:{  }
            r3.zza()     // Catch:{  }
            com.google.android.gms.internal.ads.zzfvy r4 = r4.zzb()     // Catch:{  }
            boolean r3 = r3.zzg()     // Catch:{  }
            com.google.android.gms.internal.ads.zzfxf.zzn(r4, r3)     // Catch:{  }
            goto L_0x0047
        L_0x00f6:
            java.lang.String r6 = "Missing catalogue_name."
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{  }
            r0.<init>(r6)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x00fe:
            java.lang.String r6 = "Missing primitive_name."
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{  }
            r0.<init>(r6)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x0106:
            java.lang.String r6 = "Missing type_url."
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{  }
            r0.<init>(r6)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x010e:
            com.google.android.gms.internal.ads.zzgbj.zzd()     // Catch:{  }
            java.lang.Class<com.google.android.gms.internal.ads.zzfvw> r0 = com.google.android.gms.internal.ads.zzfvw.class
            java.lang.Object r6 = r6.zzd(r0)     // Catch:{  }
            com.google.android.gms.internal.ads.zzfvw r6 = (com.google.android.gms.internal.ads.zzfvw) r6     // Catch:{  }
            zza = r6     // Catch:{  }
            if (r6 == 0) goto L_0x011e
            return r1
        L_0x011e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqz.zza(com.google.android.gms.internal.ads.zzaqx):boolean");
    }
}
