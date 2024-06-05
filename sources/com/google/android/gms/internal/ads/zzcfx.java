package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.z4;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcfx {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcfx(int i10, int i11, int i12) {
        this.zzc = i10;
        this.zzb = i11;
        this.zza = i12;
    }

    public static zzcfx zza() {
        return new zzcfx(0, 0, 0);
    }

    public static zzcfx zzb(int i10, int i11) {
        return new zzcfx(1, i10, i11);
    }

    public static zzcfx zzc(z4 z4Var) {
        if (z4Var.f14649d) {
            return new zzcfx(3, 0, 0);
        }
        if (z4Var.f14654j) {
            return new zzcfx(2, 0, 0);
        }
        if (z4Var.f14653i) {
            return zza();
        }
        return zzb(z4Var.f14651g, z4Var.f14648c);
    }

    public static zzcfx zzd() {
        return new zzcfx(5, 0, 0);
    }

    public static zzcfx zze() {
        return new zzcfx(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
