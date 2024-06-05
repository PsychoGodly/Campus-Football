package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.e0;
import com.google.android.gms.ads.internal.client.h0;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeuo implements zzeir {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzcgd zzc;
    /* access modifiers changed from: private */
    public final zzeib zzd;
    /* access modifiers changed from: private */
    public final zzeif zze;
    /* access modifiers changed from: private */
    public final ViewGroup zzf;
    private zzbbp zzg;
    /* access modifiers changed from: private */
    public final zzcxd zzh;
    /* access modifiers changed from: private */
    public final zzfep zzi;
    /* access modifiers changed from: private */
    public final zzczk zzj;
    private final zzeyv zzk;
    /* access modifiers changed from: private */
    public zzfut zzl;

    public zzeuo(Context context, Executor executor, z4 z4Var, zzcgd zzcgd, zzeib zzeib, zzeif zzeif, zzeyv zzeyv, zzczk zzczk) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgd;
        this.zzd = zzeib;
        this.zze = zzeif;
        this.zzk = zzeyv;
        this.zzh = zzcgd.zze();
        this.zzi = zzcgd.zzy();
        this.zzf = new FrameLayout(context);
        this.zzj = zzczk;
        zzeyv.zzr(z4Var);
    }

    public final boolean zza() {
        zzfut zzfut = this.zzl;
        return zzfut != null && !zzfut.isDone();
    }

    public final boolean zzb(u4 u4Var, String str, zzeip zzeip, zzeiq zzeiq) throws RemoteException {
        zzcph zzcph;
        zzfen zzfen;
        if (str == null) {
            zzbza.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new zzeuk(this));
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) a0.c().zzb(zzbar.zzif)).booleanValue() && u4Var.f14556g) {
                this.zzc.zzj().zzm(true);
            }
            zzeyv zzeyv = this.zzk;
            zzeyv.zzs(str);
            zzeyv.zzE(u4Var);
            zzeyx zzG = zzeyv.zzG();
            zzfec zzb2 = zzfeb.zzb(this.zza, zzfem.zzf(zzG), 3, u4Var);
            if (!((Boolean) zzbcq.zzd.zze()).booleanValue() || !this.zzk.zzg().f14656l) {
                if (((Boolean) a0.c().zzb(zzbar.zzhy)).booleanValue()) {
                    zzcpg zzd2 = this.zzc.zzd();
                    zzctx zzctx = new zzctx();
                    zzctx.zzd(this.zza);
                    zzctx.zzh(zzG);
                    zzd2.zzi(zzctx.zzi());
                    zzczz zzczz = new zzczz();
                    zzczz.zzj(this.zzd, this.zzb);
                    zzczz.zzk(this.zzd, this.zzb);
                    zzd2.zzf(zzczz.zzn());
                    zzd2.zze(new zzegk(this.zzg));
                    zzd2.zzd(new zzden(zzdgt.zza, (h0) null));
                    zzd2.zzg(new zzcqe(this.zzh, this.zzj));
                    zzd2.zzc(new zzcoh(this.zzf));
                    zzcph = zzd2.zzj();
                } else {
                    zzcpg zzd3 = this.zzc.zzd();
                    zzctx zzctx2 = new zzctx();
                    zzctx2.zzd(this.zza);
                    zzctx2.zzh(zzG);
                    zzd3.zzi(zzctx2.zzi());
                    zzczz zzczz2 = new zzczz();
                    zzczz2.zzj(this.zzd, this.zzb);
                    zzczz2.zza(this.zzd, this.zzb);
                    zzczz2.zza(this.zze, this.zzb);
                    zzczz2.zzl(this.zzd, this.zzb);
                    zzczz2.zzd(this.zzd, this.zzb);
                    zzczz2.zze(this.zzd, this.zzb);
                    zzczz2.zzf(this.zzd, this.zzb);
                    zzczz2.zzb(this.zzd, this.zzb);
                    zzczz2.zzk(this.zzd, this.zzb);
                    zzczz2.zzi(this.zzd, this.zzb);
                    zzd3.zzf(zzczz2.zzn());
                    zzd3.zze(new zzegk(this.zzg));
                    zzd3.zzd(new zzden(zzdgt.zza, (h0) null));
                    zzd3.zzg(new zzcqe(this.zzh, this.zzj));
                    zzd3.zzc(new zzcoh(this.zzf));
                    zzcph = zzd3.zzj();
                }
                zzcph zzcph2 = zzcph;
                if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
                    zzfen zzj2 = zzcph2.zzj();
                    zzj2.zzh(3);
                    zzj2.zzb(u4Var.f14566q);
                    zzfen = zzj2;
                } else {
                    zzfen = null;
                }
                zzcrt zzd4 = zzcph2.zzd();
                zzfut zzi2 = zzd4.zzi(zzd4.zzj());
                this.zzl = zzi2;
                zzfuj.zzq(zzi2, new zzeun(this, zzeiq, zzfen, zzb2, zzcph2), this.zzb);
                return true;
            }
            zzeib zzeib = this.zzd;
            if (zzeib != null) {
                zzeib.zza(zzezx.zzd(7, (String) null, (c3) null));
            }
            return false;
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final zzeyv zzi() {
        return this.zzk;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        this.zzd.zza(zzezx.zzd(6, (String) null, (c3) null));
    }

    public final void zzn() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzo(e0 e0Var) {
        this.zze.zza(e0Var);
    }

    public final void zzp(zzcxe zzcxe) {
        this.zzh.zzm(zzcxe, this.zzb);
    }

    public final void zzq(zzbbp zzbbp) {
        this.zzg = zzbbp;
    }

    public final boolean zzr() {
        ViewParent parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        t.r();
        return b2.t(view, view.getContext());
    }
}
