package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.d0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbmf {
    static final d0 zza = new zzbmd();
    static final d0 zzb = new zzbme();
    private final zzblr zzc;

    public zzbmf(Context context, zzbzg zzbzg, String str, zzfep zzfep) {
        this.zzc = new zzblr(context, zzbzg, str, zza, zzb, zzfep);
    }

    public final zzblv zza(String str, zzbly zzbly, zzblx zzblx) {
        return new zzbmj(this.zzc, str, zzbly, zzblx);
    }

    public final zzbmo zzb() {
        return new zzbmo(this.zzc);
    }
}
