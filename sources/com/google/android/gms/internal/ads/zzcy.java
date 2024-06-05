package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcy {
    public static final zzcy zza = new zzcy(zzfqk.zzo());
    public static final zzn zzb = zzcv.zza;
    private static final String zzc = zzew.zzP(0);
    private final zzfqk zzd;

    public zzcy(List list) {
        this.zzd = zzfqk.zzm(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzcy.class != obj.getClass()) {
            return false;
        }
        return this.zzd.equals(((zzcy) obj).zzd);
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final zzfqk zza() {
        return this.zzd;
    }

    public final boolean zzb(int i10) {
        for (int i11 = 0; i11 < this.zzd.size(); i11++) {
            zzcx zzcx = (zzcx) this.zzd.get(i11);
            if (zzcx.zzc() && zzcx.zza() == i10) {
                return true;
            }
        }
        return false;
    }
}
