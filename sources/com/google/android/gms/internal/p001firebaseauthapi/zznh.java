package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zznh {
    public static final zzrr zza = new zznj();

    public static <P> zzrq zza(zzcg<P> zzcg) {
        zzbv zzbv;
        zzrt zzrt = new zzrt();
        zzrt.zza(zzcg.zzb());
        for (List<zzcl<P>> it : zzcg.zzd()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    zzcl zzcl = (zzcl) it2.next();
                    int i10 = zznk.zza[zzcl.zzc().ordinal()];
                    if (i10 == 1) {
                        zzbv = zzbv.zza;
                    } else if (i10 == 2) {
                        zzbv = zzbv.zzb;
                    } else if (i10 == 3) {
                        zzbv = zzbv.zzc;
                    } else {
                        throw new IllegalStateException("Unknown key status");
                    }
                    int zza2 = zzcl.zza();
                    String zzg = zzcl.zzg();
                    if (zzg.startsWith("type.googleapis.com/google.crypto.")) {
                        zzg = zzg.substring(34);
                    }
                    zzrt.zza(zzbv, zza2, zzg, zzcl.zzd().name());
                }
            }
        }
        if (zzcg.zza() != null) {
            zzrt.zza(zzcg.zza().zza());
        }
        try {
            return zzrt.zza();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
