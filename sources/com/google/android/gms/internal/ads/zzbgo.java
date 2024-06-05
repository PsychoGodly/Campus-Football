package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbgo implements zzfnj {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzbgo(String str) {
        this.zza = str;
    }

    public final Object apply(Object obj) {
        String str = this.zza;
        String str2 = (String) obj;
        zzbhp zzbhp = zzbho.zza;
        if (str2 != null) {
            if (((Boolean) zzbcj.zzf.zze()).booleanValue()) {
                String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                String host = Uri.parse(str).getHost();
                int i10 = 0;
                while (true) {
                    if (i10 < 3) {
                        if (host.endsWith(strArr[i10])) {
                            break;
                        }
                        i10++;
                    } else {
                        break;
                    }
                }
            }
            String str3 = (String) zzbcj.zza.zze();
            String str4 = (String) zzbcj.zzb.zze();
            if (!TextUtils.isEmpty(str3)) {
                str = str.replace(str3, str2);
            }
            if (!TextUtils.isEmpty(str4)) {
                Uri parse = Uri.parse(str);
                if (TextUtils.isEmpty(parse.getQueryParameter(str4))) {
                    return parse.buildUpon().appendQueryParameter(str4, str2).toString();
                }
            }
        }
        return str;
    }
}
