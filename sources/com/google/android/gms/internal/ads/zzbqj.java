package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.nativead.b;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbqj extends b.C0153b {
    private final zzbdx zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;

    public zzbqj(zzbdx zzbdx) {
        Drawable drawable;
        double d10;
        this.zza = zzbdx;
        Uri uri = null;
        try {
            a zzf = zzbdx.zzf();
            if (zzf != null) {
                drawable = (Drawable) com.google.android.gms.dynamic.b.A1(zzf);
                this.zzb = drawable;
                uri = this.zza.zze();
                this.zzc = uri;
                d10 = this.zza.zzb();
                this.zzd = d10;
                this.zza.zzd();
                this.zza.zzc();
            }
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
        drawable = null;
        this.zzb = drawable;
        try {
            uri = this.zza.zze();
        } catch (RemoteException e11) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e11);
        }
        this.zzc = uri;
        try {
            d10 = this.zza.zzb();
        } catch (RemoteException e12) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e12);
            d10 = 1.0d;
        }
        this.zzd = d10;
        try {
            this.zza.zzd();
        } catch (RemoteException e13) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e13);
        }
        try {
            this.zza.zzc();
        } catch (RemoteException e14) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e14);
        }
    }

    public final Drawable getDrawable() {
        return this.zzb;
    }

    public final double getScale() {
        return this.zzd;
    }

    public final Uri getUri() {
        return this.zzc;
    }
}
