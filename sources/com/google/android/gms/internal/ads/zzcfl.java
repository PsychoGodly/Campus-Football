package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzcfl extends zzcep {
    public zzcfl(zzcei zzcei, zzawe zzawe, boolean z10) {
        super(zzcei, zzawe, z10);
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse zzN(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcei)) {
            zzbza.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcei zzcei = (zzcei) webView;
        zzbwb zzbwb = this.zza;
        if (zzbwb != null) {
            zzbwb.zzd(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcei.zzN() != null) {
            zzcei.zzN().zzE();
        }
        if (zzcei.zzO().zzi()) {
            str2 = (String) a0.c().zzb(zzbar.zzM);
        } else if (zzcei.zzaA()) {
            str2 = (String) a0.c().zzb(zzbar.zzL);
        } else {
            str2 = (String) a0.c().zzb(zzbar.zzK);
        }
        t.r();
        return b2.S(zzcei.getContext(), zzcei.zzn().zza, str2);
    }
}
