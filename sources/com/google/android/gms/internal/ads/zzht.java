package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzht {
    final Context zza;
    zzdm zzb = zzdm.zza;
    zzfok zzc;
    zzfok zzd;
    zzfok zze;
    zzfok zzf;
    zzfok zzg;
    zzfnj zzh;
    Looper zzi = zzew.zzE();
    zzk zzj = zzk.zza;
    int zzk = 1;
    boolean zzl = true;
    zzkq zzm = zzkq.zze;
    long zzn = 500;
    long zzo = 2000;
    boolean zzp = true;
    boolean zzq;
    zzhe zzr = new zzhe(0.97f, 1.03f, 1000, 1.0E-7f, zzew.zzv(20), zzew.zzv(500), 0.999f, (zzhd) null);

    public zzht(Context context, zzcdr zzcdr, byte[] bArr) {
        Context context2 = context;
        zzhn zzhn = new zzhn(zzcdr, (byte[]) null);
        zzho zzho = new zzho(context2);
        zzhp zzhp = new zzhp(context2);
        zzhq zzhq = zzhq.zza;
        zzhr zzhr = new zzhr(context2);
        zzhs zzhs = zzhs.zza;
        Objects.requireNonNull(context);
        this.zza = context2;
        this.zzc = zzhn;
        this.zzd = zzho;
        this.zze = zzhp;
        this.zzf = zzhq;
        this.zzg = zzhr;
        this.zzh = zzhs;
    }

    static /* synthetic */ zzsr zza(Context context) {
        return new zzsf(context, new zzzp());
    }
}
