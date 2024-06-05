package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdet implements zzgwy {
    private final zzgxl zza;

    public zzdet(zzgxl zzgxl) {
        this.zza = zzgxl;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        if (((zzdeq) this.zza).zza().zze() != null) {
            set = Collections.singleton("banner");
        } else {
            set = Collections.emptySet();
        }
        zzgxg.zzb(set);
        return set;
    }
}
