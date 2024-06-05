package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.u4;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzfeb {
    public static zzfec zza(Context context, int i10) {
        boolean z10;
        if (zzfep.zza()) {
            int i11 = i10 - 2;
            if (i11 != 20 && i11 != 21) {
                switch (i11) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        z10 = ((Boolean) zzbcd.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        z10 = ((Boolean) zzbcd.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        z10 = ((Boolean) zzbcd.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                z10 = ((Boolean) zzbcd.zze.zze()).booleanValue();
            }
            if (z10) {
                return new zzfee(context, i10);
            }
        }
        return new zzfey();
    }

    public static zzfec zzb(Context context, int i10, int i11, u4 u4Var) {
        zzfec zza = zza(context, i10);
        if (!(zza instanceof zzfee)) {
            return zza;
        }
        zza.zzh();
        zza.zzm(i11);
        if (zzfem.zze(u4Var.f14566q)) {
            zza.zze(u4Var.f14566q);
        }
        return zza;
    }
}
