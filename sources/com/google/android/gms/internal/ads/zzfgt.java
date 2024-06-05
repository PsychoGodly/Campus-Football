package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfgt {
    private final zzfgb zza;
    private final ArrayList zzb;

    public zzfgt(zzfgb zzfgb, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzfgb;
        arrayList.add(str);
    }

    public final zzfgb zza() {
        return this.zza;
    }

    public final ArrayList zzb() {
        return this.zzb;
    }

    public final void zzc(String str) {
        this.zzb.add(str);
    }
}
