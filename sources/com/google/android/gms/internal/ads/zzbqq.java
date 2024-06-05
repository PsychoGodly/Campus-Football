package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.s3;
import com.google.android.gms.ads.nativead.b;
import com.google.android.gms.ads.nativead.d;
import java.util.List;
import n4.o;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbqq implements d {
    private final zzber zza;
    private d.a zzb;

    public zzbqq(zzber zzber) {
        this.zza = zzber;
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

    public final String getCustomFormatId() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return null;
        }
    }

    public final d.a getDisplayOpenMeasurement() {
        try {
            if (this.zzb == null && this.zza.zzq()) {
                this.zzb = new zzbqi(this.zza);
            }
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
        return this.zzb;
    }

    public final b.C0153b getImage(String str) {
        try {
            zzbdx zzg = this.zza.zzg(str);
            if (zzg != null) {
                return new zzbqj(zzg);
            }
            return null;
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
            return null;
        }
    }

    public final o getMediaContent() {
        try {
            if (this.zza.zzf() != null) {
                return new s3(this.zza.zzf(), this.zza);
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
}
