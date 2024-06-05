package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzccy extends zzccu {
    public zzccy(zzcbj zzcbj) {
        super(zzcbj);
    }

    public final void zzf() {
    }

    public final boolean zzt(String str) {
        String zze = zzbyt.zze(str);
        zzcbj zzcbj = (zzcbj) this.zzc.get();
        if (!(zzcbj == null || zze == null)) {
            zzcbj.zzt(zze, this);
        }
        zzbza.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, zze, "noop", "Noop cache is a noop.");
        return false;
    }
}
