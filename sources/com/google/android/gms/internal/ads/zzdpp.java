package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.n1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzdpp {
    protected final String zza = ((String) zzbce.zzb.zze());
    protected final Map zzb = new HashMap();
    protected final Executor zzc;
    protected final zzbzf zzd;
    protected final boolean zze;
    private final zzfdu zzf;
    private final boolean zzg;
    private final boolean zzh;

    protected zzdpp(Executor executor, zzbzf zzbzf, zzfdu zzfdu) {
        this.zzc = executor;
        this.zzd = zzbzf;
        this.zze = ((Boolean) a0.c().zzb(zzbar.zzbN)).booleanValue();
        this.zzf = zzfdu;
        this.zzg = ((Boolean) a0.c().zzb(zzbar.zzbQ)).booleanValue();
        this.zzh = ((Boolean) a0.c().zzb(zzbar.zzgD)).booleanValue();
    }

    private final void zza(Map map, boolean z10) {
        if (!map.isEmpty()) {
            String zza2 = this.zzf.zza(map);
            n1.a(zza2);
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
            if (!this.zze) {
                return;
            }
            if (z10 && !this.zzg) {
                return;
            }
            if (!parseBoolean || this.zzh) {
                this.zzc.execute(new zzdpo(this, zza2));
                return;
            }
            return;
        }
        zzbza.zze("Empty paramMap.");
    }

    /* access modifiers changed from: protected */
    public final String zzb(Map map) {
        return this.zzf.zza(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zzb);
    }

    public final void zzd(Map map) {
        zza(map, true);
    }

    public final void zze(Map map) {
        zza(map, false);
    }
}
