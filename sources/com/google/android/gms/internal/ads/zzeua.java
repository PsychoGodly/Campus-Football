package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.b5;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.i2;
import java.util.concurrent.atomic.AtomicReference;
import t4.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeua implements zzcur, zzcwn, zzevq, t, zzcwz, zzcve, zzdcc {
    private final zzfaf zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzeua zzh = null;

    public zzeua(zzfaf zzfaf) {
        this.zza = zzfaf;
    }

    public static zzeua zzi(zzeua zzeua) {
        zzeua zzeua2 = new zzeua(zzeua.zza);
        zzeua2.zzh = zzeua;
        return zzeua2;
    }

    public final void zza(c3 c3Var) {
        zzeua zzeua = this.zzh;
        if (zzeua != null) {
            zzeua.zza(c3Var);
            return;
        }
        zzevh.zza(this.zzb, new zzetl(c3Var));
        zzevh.zza(this.zzb, new zzetr(c3Var));
    }

    public final void zzb() {
        zzeua zzeua = this.zzh;
        if (zzeua != null) {
            zzeua.zzb();
            return;
        }
        zzevh.zza(this.zzf, zzett.zza);
        zzevh.zza(this.zzd, zzetu.zza);
        zzevh.zza(this.zzd, zzetv.zza);
    }

    public final void zzbF() {
    }

    public final void zzbG(zzevq zzevq) {
        this.zzh = (zzeua) zzevq;
    }

    public final void zzbo() {
    }

    public final void zzby() {
        zzeua zzeua = this.zzh;
        if (zzeua != null) {
            zzeua.zzby();
        } else {
            zzevh.zza(this.zzf, zzetq.zza);
        }
    }

    public final void zze() {
        zzeua zzeua = this.zzh;
        if (zzeua != null) {
            zzeua.zze();
        } else {
            zzevh.zza(this.zzf, zzetx.zza);
        }
    }

    public final void zzf(int i10) {
        zzeua zzeua = this.zzh;
        if (zzeua != null) {
            zzeua.zzf(i10);
        } else {
            zzevh.zza(this.zzf, new zzetp(i10));
        }
    }

    public final void zzg() {
        zzeua zzeua = this.zzh;
        if (zzeua != null) {
            zzeua.zzg();
        } else {
            zzevh.zza(this.zze, zzetz.zza);
        }
    }

    public final void zzh(b5 b5Var) {
        zzeua zzeua = this.zzh;
        if (zzeua != null) {
            zzeua.zzh(b5Var);
        } else {
            zzevh.zza(this.zzg, new zzeto(b5Var));
        }
    }

    public final void zzj() {
        zzeua zzeua = this.zzh;
        if (zzeua != null) {
            zzeua.zzj();
            return;
        }
        this.zza.zza();
        zzevh.zza(this.zzc, zzetm.zza);
        zzevh.zza(this.zzd, zzetn.zza);
    }

    public final void zzk(c3 c3Var) {
        zzeua zzeua = this.zzh;
        if (zzeua != null) {
            zzeua.zzk(c3Var);
        } else {
            zzevh.zza(this.zzd, new zzetw(c3Var));
        }
    }

    public final void zzl(zzauy zzauy) {
        zzeua zzeua = this.zzh;
        if (zzeua != null) {
            zzeua.zzl(zzauy);
        } else {
            zzevh.zza(this.zzb, new zzets(zzauy));
        }
    }

    public final void zzn(t tVar) {
        this.zzf.set(tVar);
    }

    public final void zzo(i2 i2Var) {
        this.zzg.set(i2Var);
    }

    public final void zzp(zzavb zzavb) {
        this.zzb.set(zzavb);
    }

    public final void zzq(zzavf zzavf) {
        this.zzd.set(zzavf);
    }

    public final void zzr() {
        zzeua zzeua = this.zzh;
        if (zzeua != null) {
            zzeua.zzr();
        } else {
            zzevh.zza(this.zzd, zzety.zza);
        }
    }

    public final void zzs() {
    }
}
