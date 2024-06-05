package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import q4.d;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbdy extends d {
    private final zzbdx zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzbdy(zzbdx zzbdx) {
        Drawable drawable;
        double d10;
        int i10;
        this.zza = zzbdx;
        Uri uri = null;
        try {
            a zzf2 = zzbdx.zzf();
            if (zzf2 != null) {
                drawable = (Drawable) b.A1(zzf2);
                this.zzb = drawable;
                uri = this.zza.zze();
                this.zzc = uri;
                d10 = this.zza.zzb();
                this.zzd = d10;
                int i11 = -1;
                i10 = this.zza.zzd();
                this.zze = i10;
                i11 = this.zza.zzc();
                this.zzf = i11;
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
        int i112 = -1;
        try {
            i10 = this.zza.zzd();
        } catch (RemoteException e13) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e13);
            i10 = -1;
        }
        this.zze = i10;
        try {
            i112 = this.zza.zzc();
        } catch (RemoteException e14) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e14);
        }
        this.zzf = i112;
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

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zze;
    }
}
