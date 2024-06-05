package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.internal.ads.zzawe;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzcfk;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class b {
    private b() {
    }

    /* synthetic */ b(i2 i2Var) {
    }

    public static b l(int i10) {
        return i10 >= 30 ? new h2() : i10 >= 28 ? new g2() : i10 >= 26 ? new e2() : i10 >= 24 ? new d2() : i10 >= 21 ? new c2() : new b();
    }

    public int a() {
        return 1;
    }

    public CookieManager b(Context context) {
        t.r();
        if (b2.b()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzbza.zzh("Failed to obtain CookieManager.", th);
            t.q().zzu(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebResourceResponse c(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public zzcep d(zzcei zzcei, zzawe zzawe, boolean z10) {
        return new zzcfk(zzcei, zzawe, z10);
    }

    public boolean e(Activity activity, Configuration configuration) {
        return false;
    }

    public void f(Context context, String str, String str2) {
    }

    public boolean g(Context context, String str) {
        return false;
    }

    public int h(Context context, TelephonyManager telephonyManager) {
        return AdError.NO_FILL_ERROR_CODE;
    }

    public int i(AudioManager audioManager) {
        return 0;
    }

    public void j(Activity activity) {
    }

    public int k(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
