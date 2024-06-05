package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.common.internal.q;
import r4.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbit {
    private final Context zza;
    private final b zzb;
    private zzbip zzc;

    public zzbit(Context context, b bVar) {
        q.o(Build.VERSION.SDK_INT >= 21, "Android version must be Lollipop or higher");
        q.k(context);
        q.k(bVar);
        this.zza = context;
        this.zzb = bVar;
        zzbar.zzc(context);
    }

    public static final boolean zzc(String str) {
        if (!((Boolean) a0.c().zzb(zzbar.zziO)).booleanValue()) {
            return false;
        }
        q.k(str);
        if (str.length() > ((Integer) a0.c().zzb(zzbar.zziQ)).intValue()) {
            zzbza.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"gmsg".equals(parse.getScheme()) || !"mobileads.google.com".equals(parse.getHost()) || !"/h5ads".equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    private final void zzd() {
        if (this.zzc == null) {
            this.zzc = x.a().j(this.zza, new zzbnc(), this.zzb);
        }
    }

    public final void zza() {
        if (((Boolean) a0.c().zzb(zzbar.zziO)).booleanValue()) {
            zzd();
            zzbip zzbip = this.zzc;
            if (zzbip != null) {
                try {
                    zzbip.zze();
                } catch (RemoteException e10) {
                    zzbza.zzl("#007 Could not call remote method.", e10);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzbip zzbip = this.zzc;
        if (zzbip == null) {
            return false;
        }
        try {
            zzbip.zzf(str);
            return true;
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
            return true;
        }
    }
}
