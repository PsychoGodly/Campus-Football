package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaqo extends zzaog {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzaqo() {
    }

    /* access modifiers changed from: protected */
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        return hashMap;
    }

    public zzaqo(String str) {
        HashMap zza2 = zzaog.zza(str);
        if (zza2 != null) {
            this.zza = (Long) zza2.get(0);
            this.zzb = (Boolean) zza2.get(1);
            this.zzc = (Boolean) zza2.get(2);
        }
    }
}
