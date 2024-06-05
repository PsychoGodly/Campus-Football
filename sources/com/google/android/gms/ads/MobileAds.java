package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.m3;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.zzbrt;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbza;
import n4.r;
import n4.x;
import n4.z;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(Context context) {
        m3.g().l(context);
    }

    public static void enableSameAppKey(boolean z10) {
        m3.g().m(z10);
    }

    public static InitializationStatus getInitializationStatus() {
        return m3.g().f();
    }

    public static x getRequestConfiguration() {
        return m3.g().d();
    }

    public static z getVersion() {
        m3.g();
        String[] split = TextUtils.split("22.0.0", "\\.");
        if (split.length != 3) {
            return new z(0, 0, 0);
        }
        try {
            return new z(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (NumberFormatException unused) {
            return new z(0, 0, 0);
        }
    }

    public static void initialize(Context context) {
        m3.g().n(context, (String) null, (OnInitializationCompleteListener) null);
    }

    public static void openAdInspector(Context context, r rVar) {
        m3.g().q(context, rVar);
    }

    public static void openDebugMenu(Context context, String str) {
        m3.g().r(context, str);
    }

    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        m3.g().s(cls);
    }

    public static void registerWebView(WebView webView) {
        m3.g();
        q.f("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzbza.zzg("The webview to be registered cannot be null.");
            return;
        }
        zzbxr zza = zzbrt.zza(webView.getContext());
        if (zza == null) {
            zzbza.zzj("Internal error, query info generator is null.");
            return;
        }
        try {
            zza.zzi(b.B1(webView));
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public static void setAppMuted(boolean z10) {
        m3.g().t(z10);
    }

    public static void setAppVolume(float f10) {
        m3.g().u(f10);
    }

    private static void setPlugin(String str) {
        m3.g().v(str);
    }

    public static void setRequestConfiguration(x xVar) {
        m3.g().w(xVar);
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        m3.g().n(context, (String) null, onInitializationCompleteListener);
    }
}
