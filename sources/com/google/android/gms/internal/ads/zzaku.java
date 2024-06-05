package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaku {
    public final Object zza;
    public final zzajx zzb;
    public final zzakx zzc;
    public boolean zzd;

    private zzaku(zzakx zzakx) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzakx;
    }

    private zzaku(Object obj, zzajx zzajx) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzajx;
        this.zzc = null;
    }

    public static zzaku zza(zzakx zzakx) {
        return new zzaku(zzakx);
    }

    public static zzaku zzb(Object obj, zzajx zzajx) {
        return new zzaku(obj, zzajx);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
