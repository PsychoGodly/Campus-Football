package com.google.android.gms.internal.ads;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfhx {
    public static zzans zza(Context context, String str, String str2) {
        return new zzfhw(context, str, str2).zzb(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
    }
}
