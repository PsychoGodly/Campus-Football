package com.google.android.gms.internal.ads;

import a5.a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.f2;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamic.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzext extends zzbuv {
    private final zzexp zza;
    private final zzexf zzb;
    private final String zzc;
    /* access modifiers changed from: private */
    public final zzeyp zzd;
    private final Context zze;
    private final zzbzg zzf;
    private final zzapw zzg;
    /* access modifiers changed from: private */
    public zzdlu zzh;
    private boolean zzi = ((Boolean) a0.c().zzb(zzbar.zzaA)).booleanValue();

    public zzext(String str, zzexp zzexp, Context context, zzexf zzexf, zzeyp zzeyp, zzbzg zzbzg, zzapw zzapw) {
        this.zzc = str;
        this.zza = zzexp;
        this.zzb = zzexf;
        this.zzd = zzeyp;
        this.zze = context;
        this.zzf = zzbzg;
        this.zzg = zzapw;
    }

    private final synchronized void zzu(u4 u4Var, zzbvd zzbvd, int i10) throws RemoteException {
        boolean z10 = false;
        if (((Boolean) zzbci.zzl.zze()).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzjw)).booleanValue()) {
                z10 = true;
            }
        }
        if (this.zzf.zzc < ((Integer) a0.c().zzb(zzbar.zzjx)).intValue() || !z10) {
            q.f("#008 Must be called on the main UI thread.");
        }
        this.zzb.zze(zzbvd);
        t.r();
        if (b2.d(this.zze)) {
            if (u4Var.f14569t == null) {
                zzbza.zzg("Failed to load the ad because app ID is missing.");
                this.zzb.zza(zzezx.zzd(4, (String) null, (c3) null));
                return;
            }
        }
        if (this.zzh == null) {
            zzexh zzexh = new zzexh((String) null);
            this.zza.zzj(i10);
            this.zza.zzb(u4Var, this.zzc, zzexh, new zzexs(this));
        }
    }

    public final Bundle zzb() {
        q.f("#008 Must be called on the main UI thread.");
        zzdlu zzdlu = this.zzh;
        return zzdlu != null ? zzdlu.zza() : new Bundle();
    }

    public final p2 zzc() {
        zzdlu zzdlu;
        if (((Boolean) a0.c().zzb(zzbar.zzgp)).booleanValue() && (zzdlu = this.zzh) != null) {
            return zzdlu.zzl();
        }
        return null;
    }

    public final zzbut zzd() {
        q.f("#008 Must be called on the main UI thread.");
        zzdlu zzdlu = this.zzh;
        if (zzdlu != null) {
            return zzdlu.zzc();
        }
        return null;
    }

    public final synchronized String zze() throws RemoteException {
        zzdlu zzdlu = this.zzh;
        if (zzdlu == null || zzdlu.zzl() == null) {
            return null;
        }
        return zzdlu.zzl().zzg();
    }

    public final synchronized void zzf(u4 u4Var, zzbvd zzbvd) throws RemoteException {
        zzu(u4Var, zzbvd, 2);
    }

    public final synchronized void zzg(u4 u4Var, zzbvd zzbvd) throws RemoteException {
        zzu(u4Var, zzbvd, 3);
    }

    public final synchronized void zzh(boolean z10) {
        q.f("setImmersiveMode must be called on the main UI thread.");
        this.zzi = z10;
    }

    public final void zzi(f2 f2Var) {
        if (f2Var == null) {
            this.zzb.zzb((a) null);
        } else {
            this.zzb.zzb(new zzexr(this, f2Var));
        }
    }

    public final void zzj(i2 i2Var) {
        q.f("setOnPaidEventListener must be called on the main UI thread.");
        this.zzb.zzc(i2Var);
    }

    public final void zzk(zzbuz zzbuz) {
        q.f("#008 Must be called on the main UI thread.");
        this.zzb.zzd(zzbuz);
    }

    public final synchronized void zzl(zzbvk zzbvk) {
        q.f("#008 Must be called on the main UI thread.");
        zzeyp zzeyp = this.zzd;
        zzeyp.zza = zzbvk.zza;
        zzeyp.zzb = zzbvk.zzb;
    }

    public final synchronized void zzm(com.google.android.gms.dynamic.a aVar) throws RemoteException {
        zzn(aVar, this.zzi);
    }

    public final synchronized void zzn(com.google.android.gms.dynamic.a aVar, boolean z10) throws RemoteException {
        q.f("#008 Must be called on the main UI thread.");
        if (this.zzh == null) {
            zzbza.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzk(zzezx.zzd(9, (String) null, (c3) null));
            return;
        }
        if (((Boolean) a0.c().zzb(zzbar.zzcn)).booleanValue()) {
            this.zzg.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzh.zzh(z10, (Activity) b.A1(aVar));
    }

    public final boolean zzo() {
        q.f("#008 Must be called on the main UI thread.");
        zzdlu zzdlu = this.zzh;
        return zzdlu != null && !zzdlu.zzf();
    }

    public final void zzp(zzbve zzbve) {
        q.f("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzbve);
    }
}
