package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.api.a;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzvk extends zzvy implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg = zzwc.zzf(this.zzd.zzd);
    private final zzvq zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    public zzvk(int i10, zzcp zzcp, int i11, zzvq zzvq, int i12, boolean z10, zzfnv zzfnv) {
        super(i10, zzcp, i11);
        int i13;
        int i14;
        int i15;
        boolean z11;
        this.zzh = zzvq;
        int i16 = 0;
        this.zzi = zzwc.zzm(i12, false);
        int i17 = 0;
        while (true) {
            int size = zzvq.zzq.size();
            i13 = a.e.API_PRIORITY_OTHER;
            if (i17 >= size) {
                i17 = a.e.API_PRIORITY_OTHER;
                i14 = 0;
                break;
            }
            i14 = zzwc.zza(this.zzd, (String) zzvq.zzq.get(i17), false);
            if (i14 > 0) {
                break;
            }
            i17++;
        }
        this.zzk = i17;
        this.zzj = i14;
        int i18 = this.zzd.zzf;
        this.zzl = Integer.bitCount(0);
        zzaf zzaf = this.zzd;
        int i19 = zzaf.zzf;
        this.zzm = true;
        this.zzp = 1 == (zzaf.zze & 1);
        this.zzq = zzaf.zzz;
        this.zzr = zzaf.zzA;
        this.zzs = zzaf.zzi;
        this.zzf = zzfnv.zza(zzaf);
        String[] zzag = zzew.zzag();
        int i20 = 0;
        while (true) {
            if (i20 >= zzag.length) {
                i20 = a.e.API_PRIORITY_OTHER;
                i15 = 0;
                break;
            }
            i15 = zzwc.zza(this.zzd, zzag[i20], false);
            if (i15 > 0) {
                break;
            }
            i20++;
        }
        this.zzn = i20;
        this.zzo = i15;
        int i21 = 0;
        while (true) {
            if (i21 < zzvq.zzu.size()) {
                String str = this.zzd.zzm;
                if (str != null && str.equals(zzvq.zzu.get(i21))) {
                    i13 = i21;
                    break;
                }
                i21++;
            } else {
                break;
            }
        }
        this.zzt = i13;
        this.zzu = (i12 & 384) == 128;
        this.zzv = (i12 & 64) == 64;
        zzvq zzvq2 = this.zzh;
        if (zzwc.zzm(i12, zzvq2.zzQ) && ((z11 = this.zzf) || zzvq2.zzK)) {
            i16 = (!zzwc.zzm(i12, false) || !z11 || this.zzd.zzi == -1 || (!zzvq2.zzS && z10)) ? 1 : 2;
        }
        this.zze = i16;
    }

    /* renamed from: zza */
    public final int compareTo(zzvk zzvk) {
        zzfrs zzfrs;
        if (!this.zzf || !this.zzi) {
            zzfrs = zzwc.zzc.zza();
        } else {
            zzfrs = zzwc.zzc;
        }
        zzfpz zzc = zzfpz.zzj().zzd(this.zzi, zzvk.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzvk.zzk), zzfrs.zzc().zza()).zzb(this.zzj, zzvk.zzj).zzb(this.zzl, zzvk.zzl).zzd(this.zzp, zzvk.zzp).zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzvk.zzn), zzfrs.zzc().zza()).zzb(this.zzo, zzvk.zzo).zzd(this.zzf, zzvk.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzvk.zzt), zzfrs.zzc().zza());
        Integer valueOf = Integer.valueOf(this.zzs);
        Integer valueOf2 = Integer.valueOf(zzvk.zzs);
        boolean z10 = this.zzh.zzz;
        zzfpz zzc2 = zzc.zzc(valueOf, valueOf2, zzwc.zzd).zzd(this.zzu, zzvk.zzu).zzd(this.zzv, zzvk.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzvk.zzq), zzfrs).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzvk.zzr), zzfrs);
        Integer valueOf3 = Integer.valueOf(this.zzs);
        Integer valueOf4 = Integer.valueOf(zzvk.zzs);
        if (!zzew.zzU(this.zzg, zzvk.zzg)) {
            zzfrs = zzwc.zzd;
        }
        return zzc2.zzc(valueOf3, valueOf4, zzfrs).zza();
    }

    public final int zzb() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzvy zzvy) {
        String str;
        zzvk zzvk = (zzvk) zzvy;
        boolean z10 = this.zzh.zzN;
        zzaf zzaf = this.zzd;
        int i10 = zzaf.zzz;
        if (i10 == -1) {
            return false;
        }
        zzaf zzaf2 = zzvk.zzd;
        if (i10 != zzaf2.zzz || (str = zzaf.zzm) == null || !TextUtils.equals(str, zzaf2.zzm)) {
            return false;
        }
        boolean z11 = this.zzh.zzM;
        int i11 = this.zzd.zzA;
        return i11 != -1 && i11 == zzvk.zzd.zzA && this.zzu == zzvk.zzu && this.zzv == zzvk.zzv;
    }
}
