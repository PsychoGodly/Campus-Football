package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzvw extends zzvy implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzvw(int i10, zzcp zzcp, int i11, zzvq zzvq, int i12, String str) {
        super(i10, zzcp, i11);
        zzfqk zzfqk;
        int i13;
        int i14 = 0;
        this.zzf = zzwc.zzm(i12, false);
        int i15 = this.zzd.zze;
        int i16 = zzvq.zzx;
        this.zzg = 1 == (i15 & 1);
        this.zzh = (i15 & 2) != 0;
        if (zzvq.zzv.isEmpty()) {
            zzfqk = zzfqk.zzp(MaxReward.DEFAULT_LABEL);
        } else {
            zzfqk = zzvq.zzv;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= zzfqk.size()) {
                i17 = a.e.API_PRIORITY_OTHER;
                i13 = 0;
                break;
            }
            i13 = zzwc.zza(this.zzd, (String) zzfqk.get(i17), false);
            if (i13 > 0) {
                break;
            }
            i17++;
        }
        this.zzi = i17;
        this.zzj = i13;
        int i18 = this.zzd.zzf;
        int bitCount = Integer.bitCount(0);
        this.zzk = bitCount;
        int i19 = this.zzd.zzf;
        this.zzm = false;
        int zza = zzwc.zza(this.zzd, str, zzwc.zzf(str) == null);
        this.zzl = zza;
        boolean z10 = i13 > 0 || (zzvq.zzv.isEmpty() && bitCount > 0) || this.zzg || (this.zzh && zza > 0);
        if (zzwc.zzm(i12, zzvq.zzQ) && z10) {
            i14 = 1;
        }
        this.zze = i14;
    }

    /* renamed from: zza */
    public final int compareTo(zzvw zzvw) {
        zzfrs zzfrs;
        zzfpz zzd = zzfpz.zzj().zzd(this.zzf, zzvw.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzvw.zzi), zzfrs.zzc().zza()).zzb(this.zzj, zzvw.zzj).zzb(this.zzk, zzvw.zzk).zzd(this.zzg, zzvw.zzg);
        Boolean valueOf = Boolean.valueOf(this.zzh);
        Boolean valueOf2 = Boolean.valueOf(zzvw.zzh);
        if (this.zzj == 0) {
            zzfrs = zzfrs.zzc();
        } else {
            zzfrs = zzfrs.zzc().zza();
        }
        zzfpz zzb = zzd.zzc(valueOf, valueOf2, zzfrs).zzb(this.zzl, zzvw.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zze(false, false);
        }
        return zzb.zza();
    }

    public final int zzb() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzvy zzvy) {
        zzvw zzvw = (zzvw) zzvy;
        return false;
    }
}
