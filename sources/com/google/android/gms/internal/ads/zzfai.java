package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfai {
    private final LinkedList zza = new LinkedList();
    private final int zzb;
    private final int zzc;
    private final zzfbh zzd;

    public zzfai(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = new zzfbh();
    }

    private final void zzi() {
        while (!this.zza.isEmpty() && t.b().a() - ((zzfas) this.zza.getFirst()).zzd >= ((long) this.zzc)) {
            this.zzd.zzg();
            this.zza.remove();
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final zzfas zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzfas zzfas = (zzfas) this.zza.remove();
        if (zzfas != null) {
            this.zzd.zzh();
        }
        return zzfas;
    }

    public final zzfbg zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfas zzfas) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfas);
        return true;
    }
}
