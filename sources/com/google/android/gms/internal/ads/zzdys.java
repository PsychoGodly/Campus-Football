package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdys implements zzfdb {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final zzfdj zzc;

    public zzdys(Set set, zzfdj zzfdj) {
        this.zzc = zzfdj;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdyr zzdyr = (zzdyr) it.next();
            this.zza.put(zzdyr.zzb, zzdyr.zza);
            this.zzb.put(zzdyr.zzc, zzdyr.zza);
        }
    }

    public final void zzbB(zzfcu zzfcu, String str) {
    }

    public final void zzbC(zzfcu zzfcu, String str, Throwable th) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "f.");
        if (this.zzb.containsKey(zzfcu)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfcu))), "f.");
        }
    }

    public final void zzc(zzfcu zzfcu, String str) {
        this.zzc.zzd("task.".concat(String.valueOf(str)));
        if (this.zza.containsKey(zzfcu)) {
            this.zzc.zzd("label.".concat(String.valueOf((String) this.zza.get(zzfcu))));
        }
    }

    public final void zzd(zzfcu zzfcu, String str) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "s.");
        if (this.zzb.containsKey(zzfcu)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfcu))), "s.");
        }
    }
}
