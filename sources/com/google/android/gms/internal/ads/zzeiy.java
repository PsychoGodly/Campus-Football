package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c1;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeiy implements zzeir {
    private final zzeyv zza;
    /* access modifiers changed from: private */
    public final zzcgd zzb;
    private final Context zzc;
    /* access modifiers changed from: private */
    public final zzeio zzd;
    /* access modifiers changed from: private */
    public final zzfep zze;
    private zzcra zzf;

    public zzeiy(zzcgd zzcgd, Context context, zzeio zzeio, zzeyv zzeyv) {
        this.zzb = zzcgd;
        this.zzc = context;
        this.zzd = zzeio;
        this.zza = zzeyv;
        this.zze = zzcgd.zzy();
        zzeyv.zzu(zzeio.zzd());
    }

    public final boolean zza() {
        zzcra zzcra = this.zzf;
        return zzcra != null && zzcra.zzf();
    }

    public final boolean zzb(u4 u4Var, String str, zzeip zzeip, zzeiq zzeiq) throws RemoteException {
        zzfen zzfen;
        t.r();
        if (b2.d(this.zzc) && u4Var.f14569t == null) {
            zzbza.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzA().execute(new zzeit(this));
            return false;
        } else if (str == null) {
            zzbza.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzA().execute(new zzeiu(this));
            return false;
        } else {
            zzezr.zza(this.zzc, u4Var.f14556g);
            if (((Boolean) a0.c().zzb(zzbar.zzif)).booleanValue() && u4Var.f14556g) {
                this.zzb.zzj().zzm(true);
            }
            int i10 = ((zzeis) zzeip).zza;
            zzeyv zzeyv = this.zza;
            zzeyv.zzE(u4Var);
            zzeyv.zzz(i10);
            zzeyx zzG = zzeyv.zzG();
            zzfec zzb2 = zzfeb.zzb(this.zzc, zzfem.zzf(zzG), 8, u4Var);
            c1 c1Var = zzG.zzn;
            if (c1Var != null) {
                this.zzd.zzd().zzi(c1Var);
            }
            zzder zzg = this.zzb.zzg();
            zzctx zzctx = new zzctx();
            zzctx.zzd(this.zzc);
            zzctx.zzh(zzG);
            zzg.zzf(zzctx.zzi());
            zzczz zzczz = new zzczz();
            zzczz.zzk(this.zzd.zzd(), this.zzb.zzA());
            zzg.zze(zzczz.zzn());
            zzg.zzd(this.zzd.zzc());
            zzg.zzc(new zzcoh((ViewGroup) null));
            zzdes zzg2 = zzg.zzg();
            if (((Boolean) zzbcd.zzc.zze()).booleanValue()) {
                zzfen zzf2 = zzg2.zzf();
                zzf2.zzh(8);
                zzf2.zzb(u4Var.f14566q);
                zzfen = zzf2;
            } else {
                zzfen = null;
            }
            this.zzb.zzw().zzc(1);
            zzfuu zzfuu = zzbzn.zza;
            zzgxg.zzb(zzfuu);
            ScheduledExecutorService zzB = this.zzb.zzB();
            zzcrt zza2 = zzg2.zza();
            zzcra zzcra = new zzcra(zzfuu, zzB, zza2.zzi(zza2.zzj()));
            this.zzf = zzcra;
            zzcra.zze(new zzeix(this, zzeiq, zzfen, zzb2, zzg2));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        this.zzd.zza().zza(zzezx.zzd(4, (String) null, (c3) null));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg() {
        this.zzd.zza().zza(zzezx.zzd(6, (String) null, (c3) null));
    }
}
