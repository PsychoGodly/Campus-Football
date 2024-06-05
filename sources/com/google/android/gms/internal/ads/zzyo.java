package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzyo {
    private final Handler zza;
    private final zzyp zzb;

    public zzyo(Handler handler, zzyp zzyp) {
        this.zza = zzyp == null ? null : handler;
        this.zzb = zzyp;
    }

    public final void zza(String str, long j10, long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzyk(this, str, j10, j11));
        }
    }

    public final void zzb(String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzyn(this, str));
        }
    }

    public final void zzc(zzhb zzhb) {
        zzhb.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzyj(this, zzhb));
        }
    }

    public final void zzd(int i10, long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzye(this, i10, j10));
        }
    }

    public final void zze(zzhb zzhb) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzyi(this, zzhb));
        }
    }

    public final void zzf(zzaf zzaf, zzhc zzhc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzyl(this, zzaf, zzhc));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(String str, long j10, long j11) {
        zzyp zzyp = this.zzb;
        int i10 = zzew.zza;
        zzyp.zzo(str, j10, j11);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(String str) {
        zzyp zzyp = this.zzb;
        int i10 = zzew.zza;
        zzyp.zzp(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(zzhb zzhb) {
        zzhb.zza();
        zzyp zzyp = this.zzb;
        int i10 = zzew.zza;
        zzyp.zzq(zzhb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(int i10, long j10) {
        zzyp zzyp = this.zzb;
        int i11 = zzew.zza;
        zzyp.zzk(i10, j10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzhb zzhb) {
        zzyp zzyp = this.zzb;
        int i10 = zzew.zza;
        zzyp.zzr(zzhb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzaf zzaf, zzhc zzhc) {
        int i10 = zzew.zza;
        this.zzb.zzt(zzaf, zzhc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(Object obj, long j10) {
        zzyp zzyp = this.zzb;
        int i10 = zzew.zza;
        zzyp.zzl(obj, j10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(long j10, int i10) {
        zzyp zzyp = this.zzb;
        int i11 = zzew.zza;
        zzyp.zzs(j10, i10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(Exception exc) {
        zzyp zzyp = this.zzb;
        int i10 = zzew.zza;
        zzyp.zzn(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(zzda zzda) {
        zzyp zzyp = this.zzb;
        int i10 = zzew.zza;
        zzyp.zzu(zzda);
    }

    public final void zzq(Object obj) {
        if (this.zza != null) {
            this.zza.post(new zzyf(this, obj, SystemClock.elapsedRealtime()));
        }
    }

    public final void zzr(long j10, int i10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzyh(this, j10, i10));
        }
    }

    public final void zzs(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzyg(this, exc));
        }
    }

    public final void zzt(zzda zzda) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzym(this, zzda));
        }
    }
}
