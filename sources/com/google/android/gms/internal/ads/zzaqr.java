package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzaqr implements zzfjo {
    private final zzfhr zza;
    private final zzfii zzb;
    private final zzarf zzc;
    private final zzaqq zzd;
    private final zzaqa zze;
    private final zzarh zzf;
    private final zzaqy zzg;
    private final zzaqp zzh;

    zzaqr(zzfhr zzfhr, zzfii zzfii, zzarf zzarf, zzaqq zzaqq, zzaqa zzaqa, zzarh zzarh, zzaqy zzaqy, zzaqp zzaqp) {
        this.zza = zzfhr;
        this.zzb = zzfii;
        this.zzc = zzarf;
        this.zzd = zzaqq;
        this.zze = zzaqa;
        this.zzf = zzarh;
        this.zzg = zzaqy;
        this.zzh = zzaqp;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzans zzb2 = this.zzb.zzb();
        hashMap.put("v", this.zza.zzb());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
        hashMap.put("int", zzb2.zzh());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzaqy zzaqy = this.zzg;
        if (zzaqy != null) {
            hashMap.put("tcq", Long.valueOf(zzaqy.zzc()));
            hashMap.put("tpq", Long.valueOf(this.zzg.zzg()));
            hashMap.put("tcv", Long.valueOf(this.zzg.zzd()));
            hashMap.put("tpv", Long.valueOf(this.zzg.zzh()));
            hashMap.put("tchv", Long.valueOf(this.zzg.zzb()));
            hashMap.put("tphv", Long.valueOf(this.zzg.zzf()));
            hashMap.put("tcc", Long.valueOf(this.zzg.zza()));
            hashMap.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return hashMap;
    }

    public final Map zza() {
        Map zze2 = zze();
        zze2.put("lts", Long.valueOf(this.zzc.zza()));
        return zze2;
    }

    public final Map zzb() {
        Map zze2 = zze();
        zzans zza2 = this.zzb.zza();
        zze2.put("gai", Boolean.valueOf(this.zza.zzd()));
        zze2.put("did", zza2.zzg());
        zze2.put("dst", Integer.valueOf(zza2.zzal() - 1));
        zze2.put("doo", Boolean.valueOf(zza2.zzai()));
        zzaqa zzaqa = this.zze;
        if (zzaqa != null) {
            zze2.put("nt", Long.valueOf(zzaqa.zza()));
        }
        zzarh zzarh = this.zzf;
        if (zzarh != null) {
            zze2.put("vs", Long.valueOf(zzarh.zzc()));
            zze2.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return zze2;
    }

    public final Map zzc() {
        Map zze2 = zze();
        zzaqp zzaqp = this.zzh;
        if (zzaqp != null) {
            zze2.put("vst", zzaqp.zza());
        }
        return zze2;
    }

    /* access modifiers changed from: package-private */
    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
