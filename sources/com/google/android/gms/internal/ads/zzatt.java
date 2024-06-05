package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.b1;
import o4.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzatt extends b1 {
    private final e zza;

    public zzatt(e eVar) {
        this.zza = eVar;
    }

    public final e zzb() {
        return this.zza;
    }

    public final void zzc(String str, String str2) {
        this.zza.onAppEvent(str, str2);
    }
}
