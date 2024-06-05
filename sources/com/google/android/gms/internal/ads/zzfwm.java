package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfwm {
    private final List zza = new ArrayList();

    /* access modifiers changed from: private */
    public final void zzd() {
        for (zzfwk zzj : this.zza) {
            zzj.zza = false;
        }
    }

    public final zzfwm zza(zzfwk zzfwk) {
        if (zzfwk.zzf == null) {
            if (zzfwk.zza) {
                zzd();
            }
            zzfwk.zzf = this;
            this.zza.add(zzfwk);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }

    public final zzfwp zzb() throws GeneralSecurityException {
        int i10;
        int i11;
        zzgli zzd = zzgll.zzd();
        List list = this.zza;
        int i12 = 0;
        while (i12 < list.size() - 1) {
            if (((zzfwk) list.get(i12)).zze != zzfwl.zza || ((zzfwk) list.get(i12 + 1)).zze == zzfwl.zza) {
                i12++;
            } else {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzfwk zzfwk : this.zza) {
            zzfwg unused = zzfwk.zzb;
            if (zzfwk.zze != null) {
                if (zzfwk.zze == zzfwl.zza) {
                    i10 = 0;
                    while (true) {
                        if (i10 != 0 && !hashSet.contains(Integer.valueOf(i10))) {
                            break;
                        }
                        i10 = zzgek.zza();
                    }
                } else {
                    zzfwl unused2 = zzfwk.zze;
                    i10 = 0;
                }
                Integer valueOf = Integer.valueOf(i10);
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(valueOf);
                    zzfvx unused3 = zzfwk.zzc;
                    zzfwu zzh = zzfwk.zzd;
                    zzfwg zzc = zzfwk.zzc();
                    if (zzfwg.zza.equals(zzc)) {
                        i11 = 3;
                    } else if (zzfwg.zzb.equals(zzc)) {
                        i11 = 4;
                    } else if (zzfwg.zzc.equals(zzc)) {
                        i11 = 5;
                    } else {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzgea zza2 = ((zzgcx) zzh).zza();
                    zzgky zzc2 = zzfxf.zzc(zza2.zzb());
                    zzglj zzd2 = zzglk.zzd();
                    zzd2.zzb(i10);
                    zzd2.zzd(i11);
                    zzd2.zza(zzc2);
                    zzd2.zzc(zza2.zzb().zze());
                    zzd.zza((zzglk) zzd2.zzal());
                    if (zzfwk.zza) {
                        if (num == null) {
                            num = valueOf;
                        } else {
                            throw new GeneralSecurityException("Two primaries were set");
                        }
                    }
                } else {
                    throw new GeneralSecurityException("Id " + i10 + " is used twice in the keyset");
                }
            } else {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
        }
        if (num != null) {
            zzd.zzb(num.intValue());
            return zzfwp.zza((zzgll) zzd.zzal());
        }
        throw new GeneralSecurityException("No primary was set");
    }
}
