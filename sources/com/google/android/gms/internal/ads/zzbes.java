package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.s2;
import java.util.List;
import n4.a0;
import q4.b;
import q4.d;
import q4.f;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbes implements f {
    private final zzber zza;
    private final b zzb;
    private final a0 zzc = new a0();
    private f.a zzd;

    public zzbes(zzber zzber) {
        Context context;
        this.zza = zzber;
        b bVar = null;
        try {
            context = (Context) com.google.android.gms.dynamic.b.A1(zzber.zzh());
        } catch (RemoteException | NullPointerException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            context = null;
        }
        if (context != null) {
            b bVar2 = new b(context);
            try {
                if (true == this.zza.zzr(com.google.android.gms.dynamic.b.B1(bVar2))) {
                    bVar = bVar2;
                }
            } catch (RemoteException e11) {
                zzbza.zzh(MaxReward.DEFAULT_LABEL, e11);
            }
        }
        this.zzb = bVar;
    }

    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return null;
        }
    }

    public final String getCustomTemplateId() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return null;
        }
    }

    public final f.a getDisplayOpenMeasurement() {
        try {
            if (this.zzd == null && this.zza.zzq()) {
                this.zzd = new zzbdr(this.zza);
            }
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
        return this.zzd;
    }

    public final d getImage(String str) {
        try {
            zzbdx zzg = this.zza.zzg(str);
            if (zzg != null) {
                return new zzbdy(zzg);
            }
            return null;
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.zza.zzj(str);
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return null;
        }
    }

    public final a0 getVideoController() {
        try {
            s2 zze = this.zza.zze();
            if (zze != null) {
                this.zzc.c(zze);
            }
        } catch (RemoteException e10) {
            zzbza.zzh("Exception occurred while getting video controller", e10);
        }
        return this.zzc;
    }

    public final b getVideoMediaView() {
        return this.zzb;
    }

    public final void performClick(String str) {
        try {
            this.zza.zzn(str);
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final void recordImpression() {
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final zzber zza() {
        return this.zza;
    }
}
