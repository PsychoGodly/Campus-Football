package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcez implements zzbhp {
    final /* synthetic */ zzcfb zza;

    zzcez(zzcfb zzcfb) {
        this.zza = zzcfb;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzcei = (zzcei) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.zza) {
                        zzcfb zzcfb = this.zza;
                        if (zzcfb.zzG != parseInt) {
                            zzcfb.zzG = parseInt;
                            this.zza.requestLayout();
                        }
                    }
                } catch (Exception e10) {
                    zzbza.zzk("Exception occurred while getting webview content height", e10);
                }
            }
        }
    }
}
