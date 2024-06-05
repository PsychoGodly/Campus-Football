package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgsi extends zzgow {
    final zzgsm zza;
    zzgoy zzb = zzb();
    final /* synthetic */ zzgso zzc;

    zzgsi(zzgso zzgso) {
        this.zzc = zzgso;
        this.zza = new zzgsm(zzgso, (zzgsl) null);
    }

    private final zzgoy zzb() {
        zzgsm zzgsm = this.zza;
        if (zzgsm.hasNext()) {
            return zzgsm.next().iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.zzb != null;
    }

    public final byte zza() {
        zzgoy zzgoy = this.zzb;
        if (zzgoy != null) {
            byte zza2 = zzgoy.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza2;
        }
        throw new NoSuchElementException();
    }
}
