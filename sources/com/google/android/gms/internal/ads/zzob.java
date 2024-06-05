package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzob {
    private final Handler zza;
    private final zzoc zzb;

    public zzob(Handler handler, zzoc zzoc) {
        this.zza = zzoc == null ? null : handler;
        this.zzb = zzoc;
    }

    public final void zza(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznr(this, exc));
        }
    }

    public final void zzb(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznx(this, exc));
        }
    }

    public final void zzc(String str, long j10, long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznw(this, str, j10, j11));
        }
    }

    public final void zzd(String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzny(this, str));
        }
    }

    public final void zze(zzhb zzhb) {
        zzhb.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzns(this, zzhb));
        }
    }

    public final void zzf(zzhb zzhb) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznt(this, zzhb));
        }
    }

    public final void zzg(zzaf zzaf, zzhc zzhc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznz(this, zzaf, zzhc));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(Exception exc) {
        zzoc zzoc = this.zzb;
        int i10 = zzew.zza;
        zzoc.zzb(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(Exception exc) {
        zzoc zzoc = this.zzb;
        int i10 = zzew.zza;
        zzoc.zzi(exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(String str, long j10, long j11) {
        zzoc zzoc = this.zzb;
        int i10 = zzew.zza;
        zzoc.zzc(str, j10, j11);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(String str) {
        zzoc zzoc = this.zzb;
        int i10 = zzew.zza;
        zzoc.zzd(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzhb zzhb) {
        zzhb.zza();
        zzoc zzoc = this.zzb;
        int i10 = zzew.zza;
        zzoc.zze(zzhb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(zzhb zzhb) {
        zzoc zzoc = this.zzb;
        int i10 = zzew.zza;
        zzoc.zzf(zzhb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(zzaf zzaf, zzhc zzhc) {
        int i10 = zzew.zza;
        this.zzb.zzg(zzaf, zzhc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(long j10) {
        zzoc zzoc = this.zzb;
        int i10 = zzew.zza;
        zzoc.zzh(j10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(boolean z10) {
        zzoc zzoc = this.zzb;
        int i10 = zzew.zza;
        zzoc.zzm(z10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(int i10, long j10, long j11) {
        zzoc zzoc = this.zzb;
        int i11 = zzew.zza;
        zzoc.zzj(i10, j10, j11);
    }

    public final void zzr(long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznu(this, j10));
        }
    }

    public final void zzs(boolean z10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zznv(this, z10));
        }
    }

    public final void zzt(int i10, long j10, long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzoa(this, i10, j10, j11));
        }
    }
}
