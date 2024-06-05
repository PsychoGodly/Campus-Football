package com.startapp;

import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class q7 extends j6<String> implements g6 {

    /* renamed from: j  reason: collision with root package name */
    public final u1 f16324j;

    /* renamed from: k  reason: collision with root package name */
    public final i2<SensorsConfig> f16325k;

    public q7(Context context, e eVar, u1 u1Var, v2 v2Var, i2<SensorsConfig> i2Var) {
        super(context, eVar, v2Var, "cc8b2544ce91bcdf", "7099d13208ad24ae");
        this.f16324j = u1Var;
        this.f16325k = i2Var;
    }

    public Object a(String str) {
        return str;
    }

    public void a(Object obj) {
        b(obj != null ? obj.toString() : null);
    }

    public /* bridge */ /* synthetic */ Object c() {
        return MaxReward.DEFAULT_LABEL;
    }

    public long d() {
        SensorsConfig a10 = this.f16325k.a();
        if (a10 != null) {
            return a10.h();
        }
        return 0;
    }

    public boolean f() {
        SensorsConfig a10;
        if (!this.f16324j.c() || (a10 = this.f16325k.a()) == null || !a10.l()) {
            return false;
        }
        return true;
    }

    public void g() {
        Context context = this.f17478a;
        ComponentLocator.a(context).l().execute(new t2(context, this).f17390d);
    }
}
