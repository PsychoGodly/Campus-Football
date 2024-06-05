package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzejx implements zzepn {
    private final Set zza;

    zzejx(Set set) {
        this.zza = set;
    }

    public final int zza() {
        return 8;
    }

    public final zzfut zzb() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.zza) {
            arrayList.add(add);
        }
        return zzfuj.zzh(new zzejw(arrayList));
    }
}
