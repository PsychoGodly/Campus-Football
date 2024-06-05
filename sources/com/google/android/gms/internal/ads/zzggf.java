package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzggf implements zzfxc {
    /* access modifiers changed from: private */
    public static final Logger zza = Logger.getLogger(zzggf.class.getName());
    /* access modifiers changed from: private */
    public static final byte[] zzb = {0};
    private static final zzggf zzc = new zzggf();

    zzggf() {
    }

    public static void zze() throws GeneralSecurityException {
        zzfxf.zzp(zzc);
    }

    public final Class zza() {
        return zzfws.class;
    }

    public final Class zzb() {
        return zzfws.class;
    }

    public final /* bridge */ /* synthetic */ Object zzc(zzfxb zzfxb) throws GeneralSecurityException {
        for (List it : zzfxb.zzd()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    zzfwx zzfwx = (zzfwx) it2.next();
                    if (zzfwx.zzb() instanceof zzggb) {
                        zzggb zzggb = (zzggb) zzfwx.zzb();
                        zzgoj zzb2 = zzgoj.zzb(zzfwx.zzg());
                        if (!zzb2.equals(zzggb.zzb())) {
                            String valueOf = String.valueOf(zzggb.zza());
                            String obj = zzggb.zzb().toString();
                            String obj2 = zzb2.toString();
                            throw new GeneralSecurityException("Mac Key with parameters " + valueOf + " has wrong output prefix (" + obj + ") instead of (" + obj2 + ")");
                        }
                    }
                }
            }
        }
        return new zzgge(zzfxb, (zzggd) null);
    }
}
