package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdkg extends zzbjz implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbdi {
    private View zza;
    private s2 zzb;
    private zzdgd zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdkg(zzdgd zzdgd, zzdgi zzdgi) {
        this.zza = zzdgi.zzf();
        this.zzb = zzdgi.zzj();
        this.zzc = zzdgd;
        if (zzdgi.zzr() != null) {
            zzdgi.zzr().zzam(this);
        }
    }

    private final void zzg() {
        View view;
        zzdgd zzdgd = this.zzc;
        if (zzdgd != null && (view = this.zza) != null) {
            zzdgd.zzA(view, Collections.emptyMap(), Collections.emptyMap(), zzdgd.zzW(this.zza));
        }
    }

    private final void zzh() {
        View view = this.zza;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.zza);
            }
        }
    }

    private static final void zzi(zzbkd zzbkd, int i10) {
        try {
            zzbkd.zze(i10);
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void onGlobalLayout() {
        zzg();
    }

    public final void onScrollChanged() {
        zzg();
    }

    public final s2 zzb() throws RemoteException {
        q.f("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        zzbza.zzg("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    public final zzbdu zzc() {
        q.f("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzbza.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdgd zzdgd = this.zzc;
        if (zzdgd == null || zzdgd.zzc() == null) {
            return null;
        }
        return zzdgd.zzc().zza();
    }

    public final void zzd() throws RemoteException {
        q.f("#008 Must be called on the main UI thread.");
        zzh();
        zzdgd zzdgd = this.zzc;
        if (zzdgd != null) {
            zzdgd.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    public final void zze(a aVar) throws RemoteException {
        q.f("#008 Must be called on the main UI thread.");
        zzf(aVar, new zzdkf(this));
    }

    public final void zzf(a aVar, zzbkd zzbkd) throws RemoteException {
        q.f("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzbza.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbkd, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            zzbza.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            zzi(zzbkd, 0);
        } else if (this.zze) {
            zzbza.zzg("Instream ad should not be used again.");
            zzi(zzbkd, 1);
        } else {
            this.zze = true;
            zzh();
            ((ViewGroup) b.A1(aVar)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            t.z();
            zzcaa.zza(this.zza, this);
            t.z();
            zzcaa.zzb(this.zza, this);
            zzg();
            try {
                zzbkd.zzf();
            } catch (RemoteException e10) {
                zzbza.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
