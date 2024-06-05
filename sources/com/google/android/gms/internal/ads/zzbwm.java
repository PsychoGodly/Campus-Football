package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.p1;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbwm extends zzbxg {
    private final e zzb;
    private final zzbwm zzc = this;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;
    private final zzgxl zzj;
    private final zzgxl zzk;

    /* synthetic */ zzbwm(Context context, e eVar, p1 p1Var, zzbxf zzbxf, zzbwl zzbwl) {
        this.zzb = eVar;
        zzgwy zza = zzgwz.zza(context);
        this.zzd = zza;
        zzgwy zza2 = zzgwz.zza(p1Var);
        this.zze = zza2;
        zzgwy zza3 = zzgwz.zza(zzbxf);
        this.zzf = zza3;
        this.zzg = zzgwx.zzc(new zzbwe(zza, zza2, zza3));
        zzgwy zza4 = zzgwz.zza(eVar);
        this.zzh = zza4;
        zzgxl zzc2 = zzgwx.zzc(new zzbwg(zza4, zza2, zza3));
        this.zzi = zzc2;
        zzbwi zzbwi = new zzbwi(zza4, zzc2);
        this.zzj = zzbwi;
        this.zzk = zzgwx.zzc(new zzbxl(zza, zzbwi));
    }

    /* access modifiers changed from: package-private */
    public final zzbwd zza() {
        return (zzbwd) this.zzg.zzb();
    }

    /* access modifiers changed from: package-private */
    public final zzbwh zzb() {
        return new zzbwh(this.zzb, (zzbwf) this.zzi.zzb());
    }

    /* access modifiers changed from: package-private */
    public final zzbxk zzc() {
        return (zzbxk) this.zzk.zzb();
    }
}
