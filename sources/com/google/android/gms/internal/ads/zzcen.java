package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcen implements zzfuf {
    final /* synthetic */ List zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Uri zzc;
    final /* synthetic */ zzcep zzd;

    zzcen(zzcep zzcep, List list, String str, Uri uri) {
        this.zzd = zzcep;
        this.zza = list;
        this.zzb = str;
        this.zzc = uri;
    }

    public final void zza(Throwable th) {
        zzbza.zzj("Failed to parse gmsg params for: ".concat(String.valueOf(this.zzc)));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzd.zzP((Map) obj, this.zza, this.zzb);
    }
}
