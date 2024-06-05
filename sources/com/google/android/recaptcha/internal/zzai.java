package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.HashMap;
import kotlin.jvm.internal.h;
import pe.p0;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzai {
    public static final zzai zza = new zzai();
    private static final HashMap zzb = new HashMap();

    private zzai() {
    }

    public static final void zza(zzaf zzaf, Long l10, int i10) {
        zzah zzah = (zzah) zzb.get(zzaf);
        if (zzah != null) {
            zzkf zzf = zzkg.zzf();
            zzf.zze(i10);
            if (l10 != null) {
                zzf.zzd(zzjy.zza(l10.longValue() - zzah.zza()));
            }
            zzah.zzb().zzd((zzkg) zzf.zzj());
        }
    }

    public static final void zzb(zzaf zzaf, String str, zzs zzs) {
        zzb.put(zzaf, new zzah(zzaf, str, zzs));
    }

    public static final void zzc(zzaf zzaf, Context context, zzr zzr) {
        zze(zzaf, 3, (zzkm) null, context, zzr);
    }

    public static final void zzd(zzaf zzaf, String str, int i10, Context context, zzr zzr, String str2) {
        zzkl zzg = zzkm.zzg();
        zzg.zzp(str);
        zzg.zzd(i10);
        if (str2 != null) {
            zzg.zze(str2);
        }
        zze(zzaf, 4, (zzkm) zzg.zzj(), context, zzr);
    }

    private static final void zze(zzaf zzaf, int i10, zzkm zzkm, Context context, zzr zzr) {
        zzl zzl;
        HashMap hashMap = zzb;
        zzah zzah = (zzah) hashMap.get(zzaf);
        if (zzah != null) {
            zzkx zzc = zzah.zzc(i10, zzkm, context);
            zzj zzj = zzj.zza;
            zzkw zza2 = zzaf.zza();
            long zzf = zzc.zzf() * 1000;
            zzkw zzkw = zzkw.UNKNOWN;
            int ordinal = zza2.ordinal();
            if (ordinal != 14) {
                switch (ordinal) {
                    case 1:
                        zzl = zzl.zzd;
                        break;
                    case 2:
                        zzl = zzl.zze;
                        break;
                    case 3:
                        zzl = zzl.zzf;
                        break;
                    case 4:
                        zzl = zzl.zzg;
                        break;
                    case 5:
                        zzl = zzl.zzh;
                        break;
                    case 6:
                        zzl = zzl.zzi;
                        break;
                    case 7:
                        zzl = zzl.zzj;
                        break;
                    default:
                        zzl = zzl.zzb;
                        break;
                }
            } else {
                zzl = zzl.zzk;
            }
            zzj.zza(zzl.zza(), zzf);
            new zzao(context, new zzaq(zzr.zzc()), (p0) null, 4, (h) null).zzf(zzc);
            zzah zzah2 = (zzah) hashMap.remove(zzaf);
        }
    }
}
