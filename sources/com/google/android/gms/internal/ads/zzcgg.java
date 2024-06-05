package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.i;
import com.google.android.gms.ads.internal.t;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcgg {
    private final zzbzg zza;
    private final Context zzb;
    private final WeakReference zzc;

    /* synthetic */ zzcgg(zzcge zzcge, zzcgf zzcgf) {
        this.zza = zzcge.zza;
        this.zzb = zzcge.zzb;
        this.zzc = zzcge.zzc;
    }

    /* access modifiers changed from: package-private */
    public final Context zza() {
        return this.zzb;
    }

    public final zzapw zzb() {
        return new zzapw(new i(this.zzb, this.zza));
    }

    /* access modifiers changed from: package-private */
    public final zzbde zzc() {
        return new zzbde(this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final zzbzg zzd() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final String zze() {
        return t.r().B(this.zzb, this.zza.zza);
    }

    /* access modifiers changed from: package-private */
    public final WeakReference zzf() {
        return this.zzc;
    }
}
