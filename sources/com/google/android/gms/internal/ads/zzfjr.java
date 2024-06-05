package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfjr {
    final zzfju zza;
    final boolean zzb;

    private zzfjr(zzfju zzfju) {
        this.zza = zzfju;
        this.zzb = zzfju != null;
    }

    public static zzfjr zzb(Context context, String str, String str2) {
        zzfju zzfju;
        try {
            IBinder d10 = DynamiteModule.e(context, DynamiteModule.f15496b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
            if (d10 == null) {
                zzfju = null;
            } else {
                IInterface queryLocalInterface = d10.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                zzfju = queryLocalInterface instanceof zzfju ? (zzfju) queryLocalInterface : new zzfjs(d10);
            }
            try {
                zzfju.zze(b.B1(context), str, (String) null);
                Log.i("GASS", "GassClearcutLogger Initialized.");
                return new zzfjr(zzfju);
            } catch (RemoteException | zzfit | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfjr(new zzfjv());
            }
        } catch (Exception e10) {
            throw new zzfit(e10);
        } catch (Exception e11) {
            throw new zzfit(e11);
        }
    }

    public static zzfjr zzc() {
        zzfjv zzfjv = new zzfjv();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfjr(zzfjv);
    }

    public final zzfjq zza(byte[] bArr) {
        return new zzfjq(this, bArr, (zzfjp) null);
    }
}
