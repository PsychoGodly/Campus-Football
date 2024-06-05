package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcp {
    public static final zzn zza = zzco.zza;
    private static final String zze = zzew.zzP(0);
    private static final String zzf = zzew.zzP(1);
    public final int zzb = 1;
    public final String zzc;
    public final int zzd;
    private final zzaf[] zzg;
    private int zzh;

    public zzcp(String str, zzaf... zzafArr) {
        this.zzc = str;
        this.zzg = zzafArr;
        int zzb2 = zzbt.zzb(zzafArr[0].zzm);
        this.zzd = zzb2 == -1 ? zzbt.zzb(zzafArr[0].zzl) : zzb2;
        zzd(zzafArr[0].zzd);
        int i10 = zzafArr[0].zzf;
    }

    private static String zzd(String str) {
        return (str == null || str.equals("und")) ? MaxReward.DEFAULT_LABEL : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcp.class == obj.getClass()) {
            zzcp zzcp = (zzcp) obj;
            return this.zzc.equals(zzcp.zzc) && Arrays.equals(this.zzg, zzcp.zzg);
        }
    }

    public final int hashCode() {
        int i10 = this.zzh;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = ((this.zzc.hashCode() + 527) * 31) + Arrays.hashCode(this.zzg);
        this.zzh = hashCode;
        return hashCode;
    }

    public final int zza(zzaf zzaf) {
        for (int i10 = 0; i10 <= 0; i10++) {
            if (zzaf == this.zzg[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public final zzaf zzb(int i10) {
        return this.zzg[i10];
    }

    public final zzcp zzc(String str) {
        return new zzcp(str, this.zzg);
    }
}
