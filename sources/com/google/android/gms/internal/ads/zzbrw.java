package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class zzbrw extends zzbrq {
    final /* synthetic */ List zza;

    zzbrw(zzbrz zzbrz, List list) {
        this.zza = list;
    }

    public final void zze(String str) {
        zzbza.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    public final void zzf(List list) {
        zzbza.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}
