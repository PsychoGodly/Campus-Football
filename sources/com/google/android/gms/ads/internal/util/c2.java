package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.internal.ads.zzawe;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzcfm;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class c2 extends b {
    public c2() {
        super((i2) null);
    }

    public final int a() {
        return 16974374;
    }

    public final CookieManager b(Context context) {
        t.r();
        if (b2.b()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzbza.zzh("Failed to obtain CookieManager.", th);
            t.q().zzu(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final WebResourceResponse c(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i10, str3, map, inputStream);
    }

    public final zzcep d(zzcei zzcei, zzawe zzawe, boolean z10) {
        return new zzcfm(zzcei, zzawe, z10);
    }
}
