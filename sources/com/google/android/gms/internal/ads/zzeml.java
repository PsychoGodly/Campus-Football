package com.google.android.gms.internal.ads;

import y4.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeml implements zzepn {
    private final zzfuu zza;
    private final zzeyx zzb;

    zzeml(zzfuu zzfuu, zzeyx zzeyx) {
        this.zza = zzfuu;
        this.zzb = zzeyx;
    }

    public final int zza() {
        return 21;
    }

    public final zzfut zzb() {
        return this.zza.zzb(new zzemk(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzemm zzc() throws Exception {
        return new zzemm("requester_type_2".equals(a0.b(this.zzb.zzd)));
    }
}
