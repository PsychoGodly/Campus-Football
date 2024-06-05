package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.v2;
import n4.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdlp extends a0.a {
    private final zzdgi zza;

    public zzdlp(zzdgi zzdgi) {
        this.zza = zzdgi;
    }

    private static v2 zza(zzdgi zzdgi) {
        s2 zzj = zzdgi.zzj();
        if (zzj == null) {
            return null;
        }
        try {
            return zzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void onVideoEnd() {
        v2 zza2 = zza(this.zza);
        if (zza2 != null) {
            try {
                zza2.zze();
            } catch (RemoteException e10) {
                zzbza.zzk("Unable to call onVideoEnd()", e10);
            }
        }
    }

    public final void onVideoPause() {
        v2 zza2 = zza(this.zza);
        if (zza2 != null) {
            try {
                zza2.zzg();
            } catch (RemoteException e10) {
                zzbza.zzk("Unable to call onVideoEnd()", e10);
            }
        }
    }

    public final void onVideoStart() {
        v2 zza2 = zza(this.zza);
        if (zza2 != null) {
            try {
                zza2.zzi();
            } catch (RemoteException e10) {
                zzbza.zzk("Unable to call onVideoEnd()", e10);
            }
        }
    }
}
