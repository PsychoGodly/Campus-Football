package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfwp {
    private final zzgll zza;
    private final List zzb;
    private final zzggl zzc = zzggl.zza;

    private zzfwp(zzgll zzgll, List list) {
        this.zza = zzgll;
        this.zzb = list;
    }

    static final zzfwp zza(zzgll zzgll) throws GeneralSecurityException {
        if (zzgll != null && zzgll.zza() > 0) {
            return new zzfwp(zzgll, zzg(zzgll));
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public static final zzfwp zzb(zzfwh zzfwh) throws GeneralSecurityException {
        zzgcx zzgcx = new zzgcx(zzgea.zza(zzfwh.zza()));
        zzfwm zzfwm = new zzfwm();
        zzfwk zzfwk = new zzfwk(zzgcx, (zzfwj) null);
        zzfwk.zzd();
        zzfwk.zze();
        zzfwm.zza(zzfwk);
        return zzfwm.zzb();
    }

    private static zzgdz zze(zzglk zzglk) {
        try {
            return zzgdz.zza(zzglk.zzc().zzg(), zzglk.zzc().zzf(), zzglk.zzc().zzc(), zzglk.zzf(), zzglk.zzf() == zzgme.RAW ? null : Integer.valueOf(zzglk.zza()));
        } catch (GeneralSecurityException e10) {
            throw new zzgej("Creating a protokey serialization failed", e10);
        }
    }

    private static Object zzf(zzglk zzglk, Class cls) throws GeneralSecurityException {
        try {
            return zzfxf.zzg(zzglk.zzc(), cls);
        } catch (GeneralSecurityException e10) {
            if (e10.getMessage().contains("No key manager found for key type ") || e10.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e10;
        }
    }

    private static List zzg(zzgll zzgll) {
        zzfwg zzfwg;
        ArrayList arrayList = new ArrayList(zzgll.zza());
        for (zzglk zzglk : zzgll.zzi()) {
            int zza2 = zzglk.zza();
            try {
                zzfvx zza3 = zzgdf.zzb().zza(zze(zzglk), zzfxg.zza());
                int zzk = zzglk.zzk() - 2;
                if (zzk == 1) {
                    zzfwg = zzfwg.zza;
                } else if (zzk == 2) {
                    zzfwg = zzfwg.zzb;
                } else if (zzk == 3) {
                    zzfwg = zzfwg.zzc;
                } else {
                    throw new GeneralSecurityException("Unknown key status");
                }
                arrayList.add(new zzfwo(zza3, zzfwg, zza2, zza2 == zzgll.zzc(), (zzfwn) null));
            } catch (GeneralSecurityException unused) {
                arrayList.add((Object) null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static final Object zzh(zzfvx zzfvx, Class cls) throws GeneralSecurityException {
        try {
            return zzfxf.zzf(zzfvx, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final String toString() {
        return zzfxh.zza(this.zza).toString();
    }

    /* access modifiers changed from: package-private */
    public final zzgll zzc() {
        return this.zza;
    }

    public final Object zzd(Class cls) throws GeneralSecurityException {
        Class zze = zzfxf.zze(cls);
        if (zze != null) {
            zzfxh.zzb(this.zza);
            zzfww zzfww = new zzfww(zze, (zzfwv) null);
            zzfww.zzc(this.zzc);
            for (int i10 = 0; i10 < this.zza.zza(); i10++) {
                zzglk zze2 = this.zza.zze(i10);
                if (zze2.zzk() == 3) {
                    Object zzf = zzf(zze2, zze);
                    Object zzh = this.zzb.get(i10) != null ? zzh(((zzfwo) this.zzb.get(i10)).zza(), zze) : null;
                    if (zze2.zza() == this.zza.zzc()) {
                        zzfww.zzb(zzh, zzf, zze2);
                    } else {
                        zzfww.zza(zzh, zzf, zze2);
                    }
                }
            }
            return zzfxf.zzk(zzfww.zzd(), cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }
}
