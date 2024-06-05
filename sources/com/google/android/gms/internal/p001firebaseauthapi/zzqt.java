package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzqt implements zzcp<zzce, zzce> {
    private static final zzqt zza = new zzqt();
    private static final zzod<zznd, zzce> zzb = zzod.zza(zzqs.zza, zznd.class, zzce.class);

    zzqt() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzct.zza(zza);
        zznr.zza().zza(zzb);
    }

    public final Class<zzce> zza() {
        return zzce.class;
    }

    public final Class<zzce> zzb() {
        return zzce.class;
    }

    public final /* synthetic */ Object zza(zzcg zzcg) throws GeneralSecurityException {
        for (List it : zzcg.zzd()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    zzcl zzcl = (zzcl) it2.next();
                    if (zzcl.zzb() instanceof zzqr) {
                        zzqr zzqr = (zzqr) zzcl.zzb();
                        zzxt zza2 = zzxt.zza(zzcl.zzh());
                        if (!zza2.equals(zzqr.zzb())) {
                            String valueOf = String.valueOf(zzqr.zza());
                            String valueOf2 = String.valueOf(zzqr.zzb());
                            String valueOf3 = String.valueOf(zza2);
                            throw new GeneralSecurityException("Mac Key with parameters " + valueOf + " has wrong output prefix (" + valueOf2 + ") instead of (" + valueOf3 + ")");
                        }
                    }
                }
            }
        }
        return new zzqv(zzcg);
    }
}
