package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzdcz {
    private final zzdee zza;
    private final zzcei zzb;

    public zzdcz(zzdee zzdee, zzcei zzcei) {
        this.zza = zzdee;
        this.zzb = zzcei;
    }

    public static final zzdbu zzh(zzfdz zzfdz) {
        return new zzdbu(zzfdz, zzbzn.zzf);
    }

    public static final zzdbu zzi(zzdej zzdej) {
        return new zzdbu(zzdej, zzbzn.zzf);
    }

    public final View zza() {
        zzcei zzcei = this.zzb;
        if (zzcei == null) {
            return null;
        }
        return zzcei.zzG();
    }

    public final View zzb() {
        zzcei zzcei = this.zzb;
        if (zzcei != null) {
            return zzcei.zzG();
        }
        return null;
    }

    public final zzcei zzc() {
        return this.zzb;
    }

    public final zzdbu zzd(Executor executor) {
        return new zzdbu(new zzdcx(this.zzb), executor);
    }

    public final zzdee zze() {
        return this.zza;
    }

    public Set zzf(zzctm zzctm) {
        return Collections.singleton(new zzdbu(zzctm, zzbzn.zzf));
    }

    public Set zzg(zzctm zzctm) {
        return Collections.singleton(new zzdbu(zzctm, zzbzn.zzf));
    }
}
