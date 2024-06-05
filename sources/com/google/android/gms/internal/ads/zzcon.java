package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.u0;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.dynamic.b;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcon extends zzcok {
    private final Context zzc;
    private final View zzd;
    private final zzcei zze;
    private final zzeyd zzf;
    private final zzcqk zzg;
    private final zzdgt zzh;
    private final zzdce zzi;
    private final zzgws zzj;
    private final Executor zzk;
    private z4 zzl;

    zzcon(zzcql zzcql, Context context, zzeyd zzeyd, View view, zzcei zzcei, zzcqk zzcqk, zzdgt zzdgt, zzdce zzdce, zzgws zzgws, Executor executor) {
        super(zzcql);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcei;
        this.zzf = zzeyd;
        this.zzg = zzcqk;
        this.zzh = zzdgt;
        this.zzi = zzdce;
        this.zzj = zzgws;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzi(zzcon zzcon) {
        zzdgt zzdgt = zzcon.zzh;
        if (zzdgt.zze() != null) {
            try {
                zzdgt.zze().zze((u0) zzcon.zzj.zzb(), b.B1(zzcon.zzc));
            } catch (RemoteException e10) {
                zzbza.zzh("RemoteException when notifyAdLoad is called", e10);
            }
        }
    }

    public final int zza() {
        if (((Boolean) a0.c().zzb(zzbar.zzhh)).booleanValue() && this.zzb.zzah) {
            if (!((Boolean) a0.c().zzb(zzbar.zzhi)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    public final View zzc() {
        return this.zzd;
    }

    public final s2 zzd() {
        try {
            return this.zzg.zza();
        } catch (zzezc unused) {
            return null;
        }
    }

    public final zzeyd zze() {
        z4 z4Var = this.zzl;
        if (z4Var != null) {
            return zzezb.zzb(z4Var);
        }
        zzeyc zzeyc = this.zzb;
        if (zzeyc.zzad) {
            for (String str : zzeyc.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new zzeyd(this.zzd.getWidth(), this.zzd.getHeight(), false);
        }
        return (zzeyd) this.zzb.zzs.get(0);
    }

    public final zzeyd zzf() {
        return this.zzf;
    }

    public final void zzg() {
        this.zzi.zza();
    }

    public final void zzh(ViewGroup viewGroup, z4 z4Var) {
        zzcei zzcei;
        if (viewGroup != null && (zzcei = this.zze) != null) {
            zzcei.zzag(zzcfx.zzc(z4Var));
            viewGroup.setMinimumHeight(z4Var.f14648c);
            viewGroup.setMinimumWidth(z4Var.f14651g);
            this.zzl = z4Var;
        }
    }

    public final void zzj() {
        this.zzk.execute(new zzcom(this));
        super.zzj();
    }
}
