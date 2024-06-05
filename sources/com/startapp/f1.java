package com.startapp;

import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.BluetoothConfig;
import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class f1 extends j6<String> implements g6 {

    /* renamed from: j  reason: collision with root package name */
    public final e f15810j;

    /* renamed from: k  reason: collision with root package name */
    public final u1 f15811k;

    /* renamed from: l  reason: collision with root package name */
    public final i2<BluetoothConfig> f15812l;

    public f1(Context context, e eVar, e eVar2, u1 u1Var, v2 v2Var, i2<BluetoothConfig> i2Var) {
        super(context, eVar2, v2Var, "26787005dc4a1477", "c8ef3e50475fc527");
        this.f15810j = eVar;
        this.f15811k = u1Var;
        this.f15812l = i2Var;
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
        BluetoothConfig a10 = this.f15812l.a();
        if (a10 != null) {
            return a10.b();
        }
        return 0;
    }

    public boolean f() {
        BluetoothConfig a10;
        if (!this.f15811k.c() || (a10 = this.f15812l.a()) == null || !a10.d()) {
            return false;
        }
        return true;
    }

    public void g() {
        if (a0.a(this.f17478a, "android.permission.BLUETOOTH")) {
            Context context = this.f17478a;
            ComponentLocator.a(context).l().execute(new n2(context, this.f15810j, this).f17390d);
        }
    }
}
