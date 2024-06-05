package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdpl implements zzfdb {
    private final Map zza = new HashMap();
    private final zzdpd zzb;
    private final e zzc;
    private final Map zzd = new HashMap();

    public zzdpl(zzdpd zzdpd, Set set, e eVar) {
        this.zzb = zzdpd;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdpk zzdpk = (zzdpk) it.next();
            this.zzd.put(zzdpk.zzc, zzdpk);
        }
        this.zzc = eVar;
    }

    private final void zze(zzfcu zzfcu, boolean z10) {
        zzfcu zzb2 = ((zzdpk) this.zzd.get(zzfcu)).zzb;
        if (this.zza.containsKey(zzb2)) {
            String str = true != z10 ? "f." : "s.";
            this.zzb.zza().put("label.".concat(((zzdpk) this.zzd.get(zzfcu)).zza), str.concat(String.valueOf(Long.toString(this.zzc.b() - ((Long) this.zza.get(zzb2)).longValue()))));
        }
    }

    public final void zzbB(zzfcu zzfcu, String str) {
    }

    public final void zzbC(zzfcu zzfcu, String str, Throwable th) {
        if (this.zza.containsKey(zzfcu)) {
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(this.zzc.b() - ((Long) this.zza.get(zzfcu)).longValue()))));
        }
        if (this.zzd.containsKey(zzfcu)) {
            zze(zzfcu, false);
        }
    }

    public final void zzc(zzfcu zzfcu, String str) {
        this.zza.put(zzfcu, Long.valueOf(this.zzc.b()));
    }

    public final void zzd(zzfcu zzfcu, String str) {
        if (this.zza.containsKey(zzfcu)) {
            long b10 = this.zzc.b() - ((Long) this.zza.get(zzfcu)).longValue();
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(b10))));
        }
        if (this.zzd.containsKey(zzfcu)) {
            zze(zzfcu, true);
        }
    }
}
