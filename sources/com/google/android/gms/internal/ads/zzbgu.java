package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.n1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbgu implements zzbhp {
    public static final /* synthetic */ zzbgu zza = new zzbgu();

    private /* synthetic */ zzbgu() {
    }

    public final void zza(Object obj, Map map) {
        zzcfj zzcfj = (zzcfj) obj;
        zzbhp zzbhp = zzbho.zza;
        if (!((Boolean) a0.c().zzb(zzbar.zzhC)).booleanValue()) {
            zzbza.zzj("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            zzbza.zzj("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(zzcfj.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        n1.a("/canOpenApp;" + str + ";" + valueOf);
        ((zzbki) zzcfj).zzd("openableApp", hashMap);
    }
}
