package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbvi {
    public static final zzbuw zza(Context context, String str, zzbnf zzbnf) {
        try {
            IBinder zze = ((zzbva) zzbze.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzbvh.zza)).zze(b.B1(context), str, zzbnf, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzbuw ? (zzbuw) queryLocalInterface : new zzbuu(zze);
        } catch (RemoteException | zzbzd e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
            return null;
        }
    }
}
