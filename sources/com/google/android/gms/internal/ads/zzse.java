package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzse {
    private final zzaab zza;
    private final Map zzb = new HashMap();
    private final Set zzc = new HashSet();
    private final Map zzd = new HashMap();
    private zzff zze;

    public zzse(zzaab zzaab) {
        this.zza = zzaab;
    }

    public final void zza(zzff zzff) {
        if (zzff != this.zze) {
            this.zze = zzff;
            this.zzb.clear();
            this.zzd.clear();
        }
    }
}
