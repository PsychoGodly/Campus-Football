package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.applovin.mediation.MaxReward;
import java.util.concurrent.Callable;
import m5.p;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class f1 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f14798a;

    public /* synthetic */ f1(Context context) {
        this.f14798a = context;
    }

    public final Object call() {
        Context context = this.f14798a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", MaxReward.DEFAULT_LABEL);
        if (TextUtils.isEmpty(string)) {
            n1.a("User agent is not initialized on Google Play Services. Initializing.");
            String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            p.a(context, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
            return defaultUserAgent;
        }
        n1.a("User agent is already initialized on Google Play Services.");
        return string;
    }
}
