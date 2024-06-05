package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzftf extends zzftz implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    zzfut zza;
    Object zzb;

    zzftf(zzfut zzfut, Object obj) {
        Objects.requireNonNull(zzfut);
        this.zza = zzfut;
        Objects.requireNonNull(obj);
        this.zzb = obj;
    }

    public final void run() {
        zzfut zzfut = this.zza;
        Object obj = this.zzb;
        boolean z10 = true;
        boolean isCancelled = isCancelled() | (zzfut == null);
        if (obj != null) {
            z10 = false;
        }
        if (!isCancelled && !z10) {
            this.zza = null;
            if (zzfut.isCancelled()) {
                zzt(zzfut);
                return;
            }
            try {
                try {
                    Object zzf = zzf(obj, zzfuj.zzo(zzfut));
                    this.zzb = null;
                    zzg(zzf);
                } catch (Throwable th) {
                    this.zzb = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e10) {
                zze(e10.getCause());
            } catch (RuntimeException e11) {
                zze(e11);
            } catch (Error e12) {
                zze(e12);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        String str;
        zzfut zzfut = this.zza;
        Object obj = this.zzb;
        String zza2 = super.zza();
        if (zzfut != null) {
            str = "inputFuture=[" + zzfut.toString() + "], ";
        } else {
            str = MaxReward.DEFAULT_LABEL;
        }
        if (obj != null) {
            return str + "function=[" + obj.toString() + "]";
        } else if (zza2 != null) {
            return str.concat(zza2);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    /* access modifiers changed from: package-private */
    public abstract Object zzf(Object obj, Object obj2) throws Exception;

    /* access modifiers changed from: package-private */
    public abstract void zzg(Object obj);
}
