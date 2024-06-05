package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.StaleDcConfig;

/* compiled from: Sta */
public class b8 extends w1<a8> {

    /* renamed from: e  reason: collision with root package name */
    public final e f15659e;

    /* renamed from: f  reason: collision with root package name */
    public final i2<StaleDcConfig> f15660f;

    public b8(Context context, e eVar, i2<StaleDcConfig> i2Var) {
        super(context, 86400000);
        this.f15659e = eVar;
        this.f15660f = i2Var;
    }

    public Object a(boolean z10) {
        a8 a8Var = new a8();
        String str = null;
        if (!z10) {
            str = this.f15659e.getString("a83b59c2138cbf65", (String) null);
        }
        if (str == null) {
            Context context = this.f17478a;
            context.getPackageName();
            str = j9.b(context);
            e.a a10 = this.f15659e.edit();
            a10.a("a83b59c2138cbf65", str);
            a10.f17013a.putString("a83b59c2138cbf65", str);
            a10.apply();
        }
        a8Var.f15609a = str;
        return a8Var;
    }

    public Object c() {
        return new a8();
    }
}
