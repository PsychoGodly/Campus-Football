package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbxh {
    static Uri zza(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i10 = indexOf + 1;
        return Uri.parse(str.substring(0, i10) + str2 + "=" + str3 + "&" + str.substring(i10));
    }

    public static String zzb(Uri uri, Context context) {
        if (!t.p().zzu(context)) {
            return uri.toString();
        }
        String zza = t.p().zza(context);
        if (zza == null) {
            return uri.toString();
        }
        String str = (String) a0.c().zzb(zzbar.zzac);
        String uri2 = uri.toString();
        if (((Boolean) a0.c().zzb(zzbar.zzab)).booleanValue() && uri2.contains(str)) {
            t.p().zzm(context, zza);
            return zzd(uri2, context).replace(str, zza);
        } else if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri2;
        } else {
            String uri3 = zza(zzd(uri2, context), "fbs_aeid", zza).toString();
            t.p().zzm(context, zza);
            return uri3;
        }
    }

    public static String zzc(String str, Context context, boolean z10) {
        String zza;
        if ((((Boolean) a0.c().zzb(zzbar.zzaj)).booleanValue() && !z10) || !t.p().zzu(context) || TextUtils.isEmpty(str) || (zza = t.p().zza(context)) == null) {
            return str;
        }
        String str2 = (String) a0.c().zzb(zzbar.zzac);
        if (!((Boolean) a0.c().zzb(zzbar.zzab)).booleanValue() || !str.contains(str2)) {
            if (str.contains("fbs_aeid")) {
                return str;
            }
            if (t.r().F(str)) {
                t.p().zzm(context, zza);
                return zza(zzd(str, context), "fbs_aeid", zza).toString();
            } else if (!t.r().G(str)) {
                return str;
            } else {
                t.p().zzn(context, zza);
                return zza(zzd(str, context), "fbs_aeid", zza).toString();
            }
        } else if (t.r().F(str)) {
            t.p().zzm(context, zza);
            return zzd(str, context).replace(str2, zza);
        } else if (!t.r().G(str)) {
            return str;
        } else {
            t.p().zzn(context, zza);
            return zzd(str, context).replace(str2, zza);
        }
    }

    private static String zzd(String str, Context context) {
        String zze = t.p().zze(context);
        String zzc = t.p().zzc(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zze)) {
            str = zza(str, "gmp_app_id", zze).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(zzc)) ? str : zza(str, "fbs_aiid", zzc).toString();
    }
}
