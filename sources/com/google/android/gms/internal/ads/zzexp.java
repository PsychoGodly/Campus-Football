package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzexp implements zzeir {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzcgd zzc;
    /* access modifiers changed from: private */
    public final zzexf zzd;
    /* access modifiers changed from: private */
    public final zzevt zze;
    private final zzeyp zzf;
    /* access modifiers changed from: private */
    public final zzfep zzg;
    private final zzeyv zzh;
    private zzfut zzi;

    public zzexp(Context context, Executor executor, zzcgd zzcgd, zzevt zzevt, zzexf zzexf, zzeyv zzeyv, zzeyp zzeyp) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgd;
        this.zze = zzevt;
        this.zzd = zzexf;
        this.zzh = zzeyv;
        this.zzf = zzeyp;
        this.zzg = zzcgd.zzy();
    }

    /* access modifiers changed from: private */
    public final zzdly zzk(zzevr zzevr) {
        zzdly zzh2 = this.zzc.zzh();
        zzctx zzctx = new zzctx();
        zzctx.zzd(this.zza);
        zzctx.zzh(((zzexo) zzevr).zza);
        zzctx.zzg(this.zzf);
        zzh2.zzd(zzctx.zzi());
        zzh2.zzc(new zzczz().zzn());
        return zzh2;
    }

    public final boolean zza() {
        throw null;
    }

    public final boolean zzb(u4 u4Var, String str, zzeip zzeip, zzeiq zzeiq) throws RemoteException {
        zzfen zzfen;
        zzbuk zzbuk = new zzbuk(u4Var, str);
        if (zzbuk.zzb == null) {
            zzbza.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new zzexi(this));
        } else {
            zzfut zzfut = this.zzi;
            if (zzfut == null || zzfut.isDone()) {
                if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
                    zzevt zzevt = this.zze;
                    if (zzevt.zzd() != null) {
                        zzfen zzh2 = ((zzdlz) zzevt.zzd()).zzh();
                        zzh2.zzh(5);
                        zzh2.zzb(zzbuk.zza.f14566q);
                        zzfen = zzh2;
                        zzezr.zza(this.zza, zzbuk.zza.f14556g);
                        if (((Boolean) a0.c().zzb(zzbar.zzif)).booleanValue() && zzbuk.zza.f14556g) {
                            this.zzc.zzj().zzm(true);
                        }
                        zzeyv zzeyv = this.zzh;
                        zzeyv.zzs(zzbuk.zzb);
                        zzeyv.zzr(z4.x());
                        zzeyv.zzE(zzbuk.zza);
                        zzeyx zzG = zzeyv.zzG();
                        zzfec zzb2 = zzfeb.zzb(this.zza, zzfem.zzf(zzG), 5, zzbuk.zza);
                        zzexo zzexo = new zzexo((zzexn) null);
                        zzexo.zza = zzG;
                        zzexo.zzb = null;
                        zzfut zzc2 = this.zze.zzc(new zzevu(zzexo, (zzbtn) null), new zzexj(this), (Object) null);
                        this.zzi = zzc2;
                        zzfuj.zzq(zzc2, new zzexm(this, zzeiq, zzfen, zzb2, zzexo), this.zzb);
                        return true;
                    }
                }
                zzfen = null;
                zzezr.zza(this.zza, zzbuk.zza.f14556g);
                this.zzc.zzj().zzm(true);
                zzeyv zzeyv2 = this.zzh;
                zzeyv2.zzs(zzbuk.zzb);
                zzeyv2.zzr(z4.x());
                zzeyv2.zzE(zzbuk.zza);
                zzeyx zzG2 = zzeyv2.zzG();
                zzfec zzb22 = zzfeb.zzb(this.zza, zzfem.zzf(zzG2), 5, zzbuk.zza);
                zzexo zzexo2 = new zzexo((zzexn) null);
                zzexo2.zza = zzG2;
                zzexo2.zzb = null;
                zzfut zzc22 = this.zze.zzc(new zzevu(zzexo2, (zzbtn) null), new zzexj(this), (Object) null);
                this.zzi = zzc22;
                zzfuj.zzq(zzc22, new zzexm(this, zzeiq, zzfen, zzb22, zzexo2), this.zzb);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        this.zzd.zza(zzezx.zzd(6, (String) null, (c3) null));
    }

    /* access modifiers changed from: package-private */
    public final void zzj(int i10) {
        this.zzh.zzo().zza(i10);
    }
}
