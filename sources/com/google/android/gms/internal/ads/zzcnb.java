package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcnb {
    private final String zza;
    private final zzbmo zzb;
    /* access modifiers changed from: private */
    public final Executor zzc;
    /* access modifiers changed from: private */
    public zzcng zzd;
    private final zzbhp zze = new zzcmy(this);
    private final zzbhp zzf = new zzcna(this);

    public zzcnb(String str, zzbmo zzbmo, Executor executor) {
        this.zza = str;
        this.zzb = zzbmo;
        this.zzc = executor;
    }

    static /* bridge */ /* synthetic */ boolean zzg(zzcnb zzcnb, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcnb.zza);
    }

    public final void zzc(zzcng zzcng) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcng;
    }

    public final void zzd(zzcei zzcei) {
        zzcei.zzad("/updateActiveView", this.zze);
        zzcei.zzad("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcei zzcei) {
        zzcei.zzau("/updateActiveView", this.zze);
        zzcei.zzau("/untrackActiveViewUnit", this.zzf);
    }
}
