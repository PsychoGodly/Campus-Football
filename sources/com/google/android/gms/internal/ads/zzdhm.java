package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdhm implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdlf zzd;
    private final e zze;
    private zzbfr zzf;
    private zzbhp zzg;

    public zzdhm(zzdlf zzdlf, e eVar) {
        this.zzd = zzdlf;
        this.zze = eVar;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.zzc = null;
        }
    }

    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.zza == null || this.zzb == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.zza);
                hashMap.put("time_interval", String.valueOf(this.zze.a() - this.zzb.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.zzd.zzg("sendMessageToNativeJs", hashMap);
            }
            zzd();
        }
    }

    public final zzbfr zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf != null && this.zzb != null) {
            zzd();
            try {
                this.zzf.zze();
            } catch (RemoteException e10) {
                zzbza.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    public final void zzc(zzbfr zzbfr) {
        this.zzf = zzbfr;
        zzbhp zzbhp = this.zzg;
        if (zzbhp != null) {
            this.zzd.zzk("/unconfirmedClick", zzbhp);
        }
        zzdhl zzdhl = new zzdhl(this, zzbfr);
        this.zzg = zzdhl;
        this.zzd.zzi("/unconfirmedClick", zzdhl);
    }
}
