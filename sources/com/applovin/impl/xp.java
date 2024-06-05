package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.UUID;

public final class xp {

    /* renamed from: a  reason: collision with root package name */
    private final k f13436a;

    /* renamed from: b  reason: collision with root package name */
    private String f13437b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13438c = a(qj.f11005i, (String) sj.a(qj.f11004h, (Object) null, k.k()));

    /* renamed from: d  reason: collision with root package name */
    private final String f13439d;

    public xp(k kVar) {
        this.f13436a = kVar;
        this.f13439d = a(qj.f11006j, (String) kVar.a(oj.f10303g));
        a(d());
    }

    private String d() {
        if (!((Boolean) this.f13436a.a(oj.T3)).booleanValue()) {
            this.f13436a.c(qj.f11003g);
        }
        String str = (String) this.f13436a.a(qj.f11003g);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f13436a.L();
        if (t.a()) {
            t L = this.f13436a.L();
            L.a("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    public String a() {
        return this.f13439d;
    }

    public String b() {
        return this.f13438c;
    }

    public String c() {
        return this.f13437b;
    }

    public static String a(k kVar) {
        qj qjVar = qj.f11007k;
        String str = (String) kVar.a(qjVar);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String valueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        kVar.b(qjVar, (Object) valueOf);
        return valueOf;
    }

    private String a(qj qjVar, String str) {
        String str2 = (String) sj.a(qjVar, (Object) null, k.k());
        if (StringUtils.isValidString(str2)) {
            return str2;
        }
        if (!StringUtils.isValidString(str)) {
            str = UUID.randomUUID().toString().toLowerCase(Locale.US);
        }
        sj.b(qjVar, (Object) str, k.k());
        return str;
    }

    public void a(String str) {
        if (((Boolean) this.f13436a.a(oj.T3)).booleanValue()) {
            this.f13436a.b(qj.f11003g, (Object) str);
        }
        this.f13437b = str;
        this.f13436a.o().b(str, a());
    }
}
