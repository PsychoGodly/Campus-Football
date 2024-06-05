package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzejl implements zzepn {
    private final zzfuu zza;
    private final zzeyx zzb;
    private final zzezj zzc;

    zzejl(zzfuu zzfuu, zzeyx zzeyx, zzezj zzezj) {
        this.zza = zzfuu;
        this.zzb = zzeyx;
        this.zzc = zzezj;
    }

    public final int zza() {
        return 5;
    }

    public final zzfut zzb() {
        return this.zza.zzb(new zzejk(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzejm zzc() throws Exception {
        String str = null;
        if (((Boolean) a0.c().zzb(zzbar.zzgL)).booleanValue() && "requester_type_2".equals(y4.a0.b(this.zzb.zzd))) {
            str = zzezj.zza();
        }
        return new zzejm(str);
    }
}
