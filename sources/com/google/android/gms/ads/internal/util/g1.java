package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.applovin.mediation.MaxReward;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class g1 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f14802a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f14803b;

    public /* synthetic */ g1(Context context, Context context2) {
        this.f14802a = context;
        this.f14803b = context2;
    }

    public final Object call() {
        SharedPreferences sharedPreferences;
        Context context = this.f14802a;
        Context context2 = this.f14803b;
        boolean z10 = false;
        if (context != null) {
            n1.a("Attempting to read user agent from Google Play Services.");
            sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
        } else {
            n1.a("Attempting to read user agent from local cache.");
            sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
            z10 = true;
        }
        String string = sharedPreferences.getString("user_agent", MaxReward.DEFAULT_LABEL);
        if (TextUtils.isEmpty(string)) {
            n1.a("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(context2);
            if (z10) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                n1.a("Persisting user agent.");
            }
        }
        return string;
    }
}
