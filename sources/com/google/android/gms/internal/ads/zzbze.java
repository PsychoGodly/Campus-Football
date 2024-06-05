package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbze {
    public static Context zza(Context context) throws zzbzd {
        return zzc(context).b();
    }

    public static Object zzb(Context context, String str, zzbzc zzbzc) throws zzbzd {
        try {
            return zzbzc.zza(zzc(context).d(str));
        } catch (Exception e10) {
            throw new zzbzd(e10);
        }
    }

    private static DynamiteModule zzc(Context context) throws zzbzd {
        try {
            return DynamiteModule.e(context, DynamiteModule.f15496b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e10) {
            throw new zzbzd(e10);
        }
    }
}
