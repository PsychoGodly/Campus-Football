package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.c3;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfad implements zzcur {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzbyn zzc;

    public zzfad(Context context, zzbyn zzbyn) {
        this.zzb = context;
        this.zzc = zzbyn;
    }

    public final synchronized void zza(c3 c3Var) {
        if (c3Var.f14427a != 3) {
            this.zzc.zzi(this.zza);
        }
    }

    public final Bundle zzb() {
        return this.zzc.zzk(this.zzb, this);
    }

    public final synchronized void zzc(HashSet hashSet) {
        this.zza.clear();
        this.zza.addAll(hashSet);
    }
}
