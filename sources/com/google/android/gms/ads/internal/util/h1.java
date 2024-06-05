package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import h5.j;
import m5.d;
import m5.p;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class h1 {

    /* renamed from: b  reason: collision with root package name */
    private static h1 f14810b;

    /* renamed from: a  reason: collision with root package name */
    String f14811a;

    private h1() {
    }

    public static h1 a() {
        if (f14810b == null) {
            f14810b = new h1();
        }
        return f14810b;
    }

    public final void b(Context context) {
        n1.a("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.f14811a)) {
            Context e10 = j.e(context);
            if (!d.a()) {
                if (e10 == null) {
                    e10 = null;
                }
                this.f14811a = defaultUserAgent;
            }
            SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
            if (e10 == null) {
                putString.apply();
            } else {
                p.a(context, putString, "admob_user_agent");
            }
            this.f14811a = defaultUserAgent;
        }
        n1.a("User agent is updated.");
    }
}
