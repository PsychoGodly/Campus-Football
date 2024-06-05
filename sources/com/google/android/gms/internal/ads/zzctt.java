package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.p1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzctt {
    private final zzfda zza;
    private final zzbzg zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzgws zzg;
    private final String zzh;
    private final zzepq zzi;
    private final p1 zzj;
    private final zzeyx zzk;

    public zzctt(zzfda zzfda, zzbzg zzbzg, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzgws zzgws, p1 p1Var, String str2, zzepq zzepq, zzeyx zzeyx) {
        this.zza = zzfda;
        this.zzb = zzbzg;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzgws;
        this.zzh = str2;
        this.zzi = zzepq;
        this.zzj = p1Var;
        this.zzk = zzeyx;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbtn zza(zzfut zzfut) throws Exception {
        return new zzbtn((Bundle) zzfut.get(), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, (String) ((zzfut) this.zzg.zzb()).get(), this.zzh, (zzfaq) null, (String) null, ((Boolean) a0.c().zzb(zzbar.zzgK)).booleanValue() && this.zzj.zzP(), this.zzk.zzb());
    }

    public final zzfut zzb() {
        zzfda zzfda = this.zza;
        return zzfck.zzc(this.zzi.zza(new Bundle()), zzfcu.SIGNALS, zzfda).zza();
    }

    public final zzfut zzc() {
        zzfut zzb2 = zzb();
        return this.zza.zza(zzfcu.REQUEST_PARCEL, zzb2, (zzfut) this.zzg.zzb()).zza(new zzcts(this, zzb2)).zza();
    }
}
