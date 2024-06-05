package com.applovin.impl.sdk;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.lc;
import com.applovin.impl.oj;
import com.applovin.impl.x3;

public class t {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f12037b;

    /* renamed from: a  reason: collision with root package name */
    private final k f12038a;

    t(k kVar) {
        this.f12038a = kVar;
        a("SDK Session Begin");
    }

    public static void a(boolean z10) {
        f12037b = z10;
    }

    public static void c(String str, String str2, Throwable th) {
        if (!f12037b || a()) {
            Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
        }
    }

    public static void e(String str, String str2) {
        g(str, str2);
    }

    public static void g(String str, String str2) {
        if (!f12037b || a()) {
            Log.d("AppLovinSdk", "[" + str + "] " + str2);
        }
    }

    public static void h(String str, String str2) {
        c(str, str2, (Throwable) null);
    }

    public static void i(String str, String str2) {
        if (!f12037b || a()) {
            Log.i("AppLovinSdk", "[" + str + "] " + str2);
        }
    }

    public static void j(String str, String str2) {
        if (!f12037b || a()) {
            Log.w("AppLovinSdk", "[" + str + "] " + str2);
        }
    }

    public static void l(String str, String str2) {
        k kVar = k.A0;
        if (kVar != null) {
            kVar.L();
            if (a()) {
                k.A0.L().k(str, str2);
            }
        }
    }

    public void b(String str, String str2) {
        a(str, str2, (Throwable) null);
    }

    public void d(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void f(String str, String str2) {
        int intValue;
        if (a(this.f12038a) && !TextUtils.isEmpty(str2) && (intValue = ((Integer) this.f12038a.a(oj.f10439x)).intValue()) > 0) {
            int length = str2.length();
            int i10 = ((length + intValue) - 1) / intValue;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * intValue;
                a(str, str2.substring(i12, Math.min(length, i12 + intValue)));
            }
        }
    }

    public void k(String str, String str2) {
        d(str, str2, (Throwable) null);
    }

    private void a(String str) {
        lc lcVar = new lc();
        lcVar.a().a(str).a();
        g("AppLovinSdk", lcVar.toString());
    }

    public static void b(String str, String str2, Throwable th) {
        k kVar = k.A0;
        if (kVar != null) {
            kVar.L();
            if (a()) {
                k.A0.L().a(str, str2, th);
            }
        }
    }

    public void d(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public static void c(String str, String str2) {
        b(str, str2, (Throwable) null);
    }

    public void a(String str, Throwable th) {
        if (x3.e()) {
            for (Throwable th2 : th.getSuppressed()) {
                b(str, th2.toString());
            }
        }
    }

    public void a(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void a(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public static boolean a() {
        return a(k.A0);
    }

    public static boolean a(k kVar) {
        return kVar != null && kVar.h0().c();
    }
}
