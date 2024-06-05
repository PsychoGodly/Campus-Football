package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class n2 extends v0 {

    /* renamed from: e  reason: collision with root package name */
    public final e f16167e;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h1 f16168a;

        public a(h1 h1Var) {
            this.f16168a = h1Var;
        }

        public void run() {
            this.f16168a.c();
            n2.this.f17388b.a(this.f16168a.b());
        }
    }

    public n2(Context context, e eVar, g6 g6Var) {
        super(context, g6Var);
        this.f16167e = eVar;
    }

    public void a() {
        try {
            long millis = TimeUnit.SECONDS.toMillis((long) MetaData.f17070k.i().c());
            h1 h1Var = new h1(this.f17387a, this.f17388b);
            this.f17389c.postDelayed(new a(h1Var), millis);
            h1Var.a(b());
        } catch (Throwable th) {
            i3.a(th);
            this.f17388b.a((Object) null);
        }
    }

    public final boolean b() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z10 = currentTimeMillis - this.f16167e.getLong("lastBtDiscoveringTime", 0) >= ((long) MetaData.f17070k.i().a()) * 60000;
        if (z10) {
            e.a a10 = this.f16167e.edit();
            a10.a("lastBtDiscoveringTime", Long.valueOf(currentTimeMillis));
            a10.f17013a.putLong("lastBtDiscoveringTime", currentTimeMillis);
            a10.apply();
        }
        return z10;
    }
}
