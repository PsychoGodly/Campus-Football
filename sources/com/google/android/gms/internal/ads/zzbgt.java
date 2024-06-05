package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.n1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbgt implements zzbhp {
    public static final /* synthetic */ zzbgt zza = new zzbgt();

    private /* synthetic */ zzbgt() {
    }

    public final void zza(Object obj, Map map) {
        zzcfj zzcfj = (zzcfj) obj;
        zzbhp zzbhp = zzbho.zza;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            zzbza.zzj("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzcfj.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z10 = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z10 = false;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            hashMap.put(str2, valueOf);
            n1.a("/canOpenURLs;" + str2 + ";" + valueOf);
        }
        ((zzbki) zzcfj).zzd("openableURLs", hashMap);
    }
}
