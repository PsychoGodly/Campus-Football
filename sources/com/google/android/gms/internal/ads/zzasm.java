package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzasm implements Callable {
    protected final String zza = getClass().getSimpleName();
    protected final zzaqx zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzamv zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzasm(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11) {
        this.zzb = zzaqx;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzamv;
        this.zzg = i10;
        this.zzh = i11;
    }

    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzk() throws Exception {
        int i10;
        try {
            long nanoTime = System.nanoTime();
            Method zzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = zzj;
            if (zzj == null) {
                return null;
            }
            zza();
            zzapr zzd2 = this.zzb.zzd();
            if (!(zzd2 == null || (i10 = this.zzg) == Integer.MIN_VALUE)) {
                zzd2.zzc(this.zzh, i10, (System.nanoTime() - nanoTime) / 1000, (String) null, (Exception) null);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
