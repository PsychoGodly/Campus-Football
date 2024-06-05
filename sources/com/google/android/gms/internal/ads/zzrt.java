package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzrt implements zzsu {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zztb zzc = new zztb();
    private final zzpt zzd = new zzpt();
    private Looper zze;
    private zzcn zzf;
    private zzno zzg;

    public /* synthetic */ zzcn zzL() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final zzno zzb() {
        zzno zzno = this.zzg;
        zzdl.zzb(zzno);
        return zzno;
    }

    /* access modifiers changed from: protected */
    public final zzpt zzc(zzss zzss) {
        return this.zzd.zza(0, zzss);
    }

    /* access modifiers changed from: protected */
    public final zzpt zzd(int i10, zzss zzss) {
        return this.zzd.zza(0, zzss);
    }

    /* access modifiers changed from: protected */
    public final zztb zze(zzss zzss) {
        return this.zzc.zza(0, zzss, 0);
    }

    /* access modifiers changed from: protected */
    public final zztb zzf(int i10, zzss zzss, long j10) {
        return this.zzc.zza(0, zzss, 0);
    }

    public final void zzg(Handler handler, zzpu zzpu) {
        Objects.requireNonNull(zzpu);
        this.zzd.zzb(handler, zzpu);
    }

    public final void zzh(Handler handler, zztc zztc) {
        Objects.requireNonNull(zztc);
        this.zzc.zzb(handler, zztc);
    }

    public final void zzi(zzst zzst) {
        boolean z10 = !this.zzb.isEmpty();
        this.zzb.remove(zzst);
        if (z10 && this.zzb.isEmpty()) {
            zzj();
        }
    }

    /* access modifiers changed from: protected */
    public void zzj() {
    }

    public final void zzk(zzst zzst) {
        Objects.requireNonNull(this.zze);
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.add(zzst);
        if (isEmpty) {
            zzl();
        }
    }

    /* access modifiers changed from: protected */
    public void zzl() {
    }

    public final void zzm(zzst zzst, zzgi zzgi, zzno zzno) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z10 = true;
        if (!(looper == null || looper == myLooper)) {
            z10 = false;
        }
        zzdl.zzd(z10);
        this.zzg = zzno;
        zzcn zzcn = this.zzf;
        this.zza.add(zzst);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzst);
            zzn(zzgi);
        } else if (zzcn != null) {
            zzk(zzst);
            zzst.zza(this, zzcn);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zzn(zzgi zzgi);

    /* access modifiers changed from: protected */
    public final void zzo(zzcn zzcn) {
        this.zzf = zzcn;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzst) arrayList.get(i10)).zza(this, zzcn);
        }
    }

    public final void zzp(zzst zzst) {
        this.zza.remove(zzst);
        if (this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            zzq();
            return;
        }
        zzi(zzst);
    }

    /* access modifiers changed from: protected */
    public abstract void zzq();

    public final void zzr(zzpu zzpu) {
        this.zzd.zzc(zzpu);
    }

    public final void zzs(zztc zztc) {
        this.zzc.zzm(zztc);
    }

    /* access modifiers changed from: protected */
    public final boolean zzt() {
        return !this.zzb.isEmpty();
    }

    public /* synthetic */ boolean zzu() {
        return true;
    }
}
