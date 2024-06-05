package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.startapp.a;
import com.startapp.a0;
import com.startapp.i3;
import com.startapp.j9;
import com.startapp.r6;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.common.Constants;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.u1;
import com.startapp.w0;
import java.util.Map;

/* compiled from: Sta */
public class MetaDataRequest extends w0 {

    /* renamed from: j0  reason: collision with root package name */
    public final e f17077j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f17078k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f17079l0 = b();

    /* renamed from: m0  reason: collision with root package name */
    public boolean f17080m0;

    /* renamed from: n0  reason: collision with root package name */
    public float f17081n0;

    /* renamed from: o0  reason: collision with root package name */
    public RequestReason f17082o0;

    /* renamed from: p0  reason: collision with root package name */
    public String f17083p0;

    /* renamed from: q0  reason: collision with root package name */
    public String f17084q0;

    /* renamed from: r0  reason: collision with root package name */
    public Integer f17085r0;

    /* renamed from: s0  reason: collision with root package name */
    public Pair<String, String> f17086s0;

    /* renamed from: t0  reason: collision with root package name */
    public Integer f17087t0;

    /* renamed from: u0  reason: collision with root package name */
    public Boolean f17088u0;

    /* renamed from: v0  reason: collision with root package name */
    public long f17089v0;

    /* compiled from: Sta */
    public enum RequestReason {
        LAUNCH(1),
        APP_IDLE(2),
        IN_APP_PURCHASE(3),
        CUSTOM(4),
        PERIODIC(5),
        PAS(6),
        CONSENT(7),
        IMPLICIT_LAUNCH(8),
        EXTRAS(9);
        
        private int index;

        /* access modifiers changed from: public */
        RequestReason(int i10) {
            this.index = i10;
        }
    }

    public MetaDataRequest(Context context, e eVar, RequestReason requestReason) {
        super(2);
        this.f17077j0 = eVar;
        this.f17078k0 = eVar.getInt("totalSessions", 0);
        this.f17081n0 = eVar.getFloat("inAppPurchaseAmount", 0.0f);
        this.f17080m0 = eVar.getBoolean("payingUser", false);
        this.f17083p0 = MetaData.w().F();
        this.f17082o0 = requestReason;
        this.f17084q0 = a(context, eVar, StartAppSDKInternal.a().b());
        f(context);
        this.f17086s0 = SimpleTokenUtils.a();
        this.f17089v0 = SimpleTokenUtils.c();
        u1 g10 = ComponentLocator.a(context).g();
        this.f17087t0 = g10.b();
        this.f17088u0 = g10.a();
        a(ComponentLocator.a(context).b().a());
    }

    public void a(r6 r6Var) throws SDKException {
        super.a(r6Var);
        r6Var.a(a.f15590b, (Object) a.a(), true, true);
        r6Var.a("totalSessions", (Object) Integer.valueOf(this.f17078k0), true, true);
        r6Var.a("daysSinceFirstSession", (Object) Integer.valueOf(this.f17079l0), true, true);
        r6Var.a("payingUser", (Object) Boolean.valueOf(this.f17080m0), true, true);
        r6Var.a("profileId", (Object) this.f17083p0, false, true);
        r6Var.a("paidAmount", (Object) Float.valueOf(this.f17081n0), true, true);
        r6Var.a("reason", (Object) this.f17082o0, true, true);
        r6Var.a("ct", (Object) this.f17087t0, false, true);
        r6Var.a("apc", (Object) this.f17088u0, false, true);
        Object obj = StartAppSDKInternal.D;
        r6Var.a("testAdsEnabled", (Object) StartAppSDKInternal.d.f16847a.C ? Boolean.TRUE : null, false, true);
        r6Var.a("apkHash", (Object) this.f17084q0, false, true);
        r6Var.a("ian", (Object) this.f17085r0, false, true);
        Pair<String, String> pair = this.f17086s0;
        r6Var.a((String) pair.first, (Object) pair.second, false, true);
        if (Build.VERSION.SDK_INT >= 9) {
            long j10 = this.f17089v0;
            if (j10 != 0) {
                r6Var.a("firstInstalledAppTS", (Object) Long.valueOf(j10), false, true);
            }
        }
    }

    public final int b() {
        return (int) ((System.currentTimeMillis() - this.f17077j0.getLong("firstSessionTime", System.currentTimeMillis())) / 86400000);
    }

    public void f(Context context) {
        SimpleTokenConfig K = MetaData.f17070k.K();
        if (K != null && K.a(context)) {
            int i10 = a0.f15596a;
            int i11 = 0;
            try {
                for (PackageInfo next : a0.a(context.getPackageManager())) {
                    if (!a0.a(next) || next.packageName.equals(Constants.f17126a)) {
                        i11++;
                    }
                }
            } catch (Throwable unused) {
            }
            if (i11 > 0) {
                this.f17085r0 = Integer.valueOf(i11);
            }
        }
    }

    public static String a(Context context, e eVar, boolean z10) {
        String str = null;
        String string = eVar.getString("shared_prefs_app_apk_hash", (String) null);
        if (!TextUtils.isEmpty(string) && !z10) {
            return string;
        }
        Map<Activity, Integer> map = j9.f15982a;
        try {
            str = a0.a("SHA-256", context);
        } catch (Throwable th) {
            i3.a(th);
        }
        e.a a10 = eVar.edit();
        a10.a("shared_prefs_app_apk_hash", str);
        a10.f17013a.putString("shared_prefs_app_apk_hash", str);
        a10.apply();
        return str;
    }
}
