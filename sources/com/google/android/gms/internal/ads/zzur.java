package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzur {
    public static final zzur zza = new zzur(new zzcp[0]);
    public static final zzn zzb = zzuq.zza;
    private static final String zzd = zzew.zzP(0);
    public final int zzc;
    private final zzfqk zze;
    private int zzf;

    public zzur(zzcp... zzcpArr) {
        this.zze = zzfqk.zzn(zzcpArr);
        this.zzc = zzcpArr.length;
        int i10 = 0;
        while (i10 < this.zze.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.zze.size(); i12++) {
                if (((zzcp) this.zze.get(i10)).equals(this.zze.get(i12))) {
                    zzee.zzc("TrackGroupArray", MaxReward.DEFAULT_LABEL, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzur.class == obj.getClass()) {
            zzur zzur = (zzur) obj;
            return this.zzc == zzur.zzc && this.zze.equals(zzur.zze);
        }
    }

    public final int hashCode() {
        int i10 = this.zzf;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = this.zze.hashCode();
        this.zzf = hashCode;
        return hashCode;
    }

    public final int zza(zzcp zzcp) {
        int indexOf = this.zze.indexOf(zzcp);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final zzcp zzb(int i10) {
        return (zzcp) this.zze.get(i10);
    }
}
