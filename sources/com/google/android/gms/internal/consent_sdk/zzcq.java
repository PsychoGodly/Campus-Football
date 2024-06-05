package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzcq {
    public static zzco zza(Context context, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, -1);
        int length = split.length;
        if (length == 1) {
            String valueOf = String.valueOf(context.getPackageName());
            str2 = split[0];
            str3 = valueOf.concat("_preferences");
        } else {
            if (length == 2) {
                str3 = split[0];
                str2 = split[1];
            }
            return null;
        }
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2)) {
            return new zzco(str3, str2);
        }
        return null;
    }

    public static void zzb(Context context, Set set) {
        zzcp zzcp = new zzcp(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzco zza = zza(context, str);
            if (zza == null) {
                Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str)));
            } else {
                zzcp.zzd(zza.zza).remove(zza.zzb);
            }
        }
        zzcp.zzb();
    }
}
