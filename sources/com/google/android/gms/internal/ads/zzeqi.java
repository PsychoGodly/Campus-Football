package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeqi implements zzepn {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzbya zzd;

    public zzeqi(zzbya zzbya, Executor executor, String str, PackageInfo packageInfo, int i10, byte[] bArr) {
        this.zzd = zzbya;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    public final int zza() {
        return 41;
    }

    public final zzfut zzb() {
        return zzfuj.zzf(zzfuj.zzl(zzfuj.zzh(this.zzb), zzeqg.zza, this.zza), Throwable.class, new zzeqh(this), this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzc(Throwable th) throws Exception {
        return zzfuj.zzh(new zzeqj(this.zzb));
    }
}
