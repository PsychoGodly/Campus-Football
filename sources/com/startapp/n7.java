package com.startapp;

import android.content.Context;
import android.os.Build;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.common.SDKException;

/* compiled from: Sta */
public class n7 extends w0 {

    /* renamed from: j0  reason: collision with root package name */
    public q6 f16181j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f16182k0;

    public n7(Context context) {
        super(1);
        this.f16181j0 = n6.a(context);
        this.f16182k0 = a0.a(context);
    }

    public void a(r6 r6Var) throws SDKException {
        super.a(r6Var);
        r6Var.a("placement", (Object) "INAPP_DOWNLOAD", true, true);
        q6 q6Var = this.f16181j0;
        if (q6Var != null) {
            r6Var.a("install_referrer", (Object) q6Var.f16323a.getString("install_referrer"), true, true);
            r6Var.a("referrer_click_timestamp_seconds", (Object) Long.valueOf(this.f16181j0.f16323a.getLong("referrer_click_timestamp_seconds")), true, true);
            r6Var.a("install_begin_timestamp_seconds", (Object) Long.valueOf(this.f16181j0.f16323a.getLong("install_begin_timestamp_seconds")), true, true);
        }
        r6Var.a("apkSig", (Object) this.f16182k0, true, true);
        if (Build.VERSION.SDK_INT >= 9) {
            long j10 = SimpleTokenUtils.f16786c;
            if (j10 != 0) {
                r6Var.a("firstInstalledAppTS", (Object) Long.valueOf(j10), false, true);
            }
        }
    }
}
