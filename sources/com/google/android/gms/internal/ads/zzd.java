package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzd {
    public static final zzd zza = new zzd((Object) null, new zzc[0], 0, -9223372036854775807L, 0);
    public static final zzn zzb = zza.zza;
    private static final zzc zze = new zzc(0).zzb(0);
    private static final String zzf = zzew.zzP(1);
    private static final String zzg = zzew.zzP(2);
    private static final String zzh = zzew.zzP(3);
    private static final String zzi = zzew.zzP(4);
    public final int zzc = 0;
    public final long zzd = 0;
    private final zzc[] zzj;

    private zzd(Object obj, zzc[] zzcArr, long j10, long j11, int i10) {
        this.zzj = zzcArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzd.class == obj.getClass()) {
            return zzew.zzU((Object) null, (Object) null) && Arrays.equals(this.zzj, ((zzd) obj).zzj);
        }
    }

    public final int hashCode() {
        return (((int) -9223372036854775807L) * 961) + Arrays.hashCode(this.zzj);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + null + ", adResumePositionUs=0, adGroups=[" + "])";
    }

    public final zzc zza(int i10) {
        return i10 < 0 ? zze : this.zzj[i10];
    }
}
