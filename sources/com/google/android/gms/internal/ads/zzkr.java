package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzkr {
    private final zzht zza;

    @Deprecated
    public zzkr(Context context, zzcdr zzcdr, byte[] bArr) {
        this.zza = new zzht(context, zzcdr, (byte[]) null);
    }

    @Deprecated
    public final zzkr zza(zzjp zzjp) {
        zzht zzht = this.zza;
        zzdl.zzf(!zzht.zzq);
        Objects.requireNonNull(zzjp);
        zzht.zzf = new zzhl(zzjp);
        return this;
    }

    @Deprecated
    public final zzkr zzb(zzwk zzwk) {
        zzht zzht = this.zza;
        zzdl.zzf(!zzht.zzq);
        Objects.requireNonNull(zzwk);
        zzht.zze = new zzhm(zzwk);
        return this;
    }

    @Deprecated
    public final zzks zzc() {
        zzht zzht = this.zza;
        zzdl.zzf(!zzht.zzq);
        zzht.zzq = true;
        return new zzks(zzht);
    }
}
