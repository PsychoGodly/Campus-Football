package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdhq implements zzbhp {
    public final /* synthetic */ zzdhu zza;

    public /* synthetic */ zzdhq(zzdhu zzdhu) {
        this.zza = zzdhu;
    }

    public final void zza(Object obj, Map map) {
        zzcei zzcei = (zzcei) obj;
        zzcei.zzN().zzA(new zzdht(this.zza, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            zzcei.loadData(str, "text/html", "UTF-8");
        } else {
            zzcei.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
        }
    }
}
