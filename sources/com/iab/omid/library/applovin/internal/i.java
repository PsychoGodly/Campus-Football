package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.adsession.a;
import com.iab.omid.library.applovin.devicevolume.b;
import com.iab.omid.library.applovin.devicevolume.c;
import com.iab.omid.library.applovin.devicevolume.e;
import com.iab.omid.library.applovin.internal.d;
import com.iab.omid.library.applovin.walking.TreeWalker;

public class i implements d.a, c {

    /* renamed from: f  reason: collision with root package name */
    private static i f27401f;

    /* renamed from: a  reason: collision with root package name */
    private float f27402a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    private final e f27403b;

    /* renamed from: c  reason: collision with root package name */
    private final b f27404c;

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.applovin.devicevolume.d f27405d;

    /* renamed from: e  reason: collision with root package name */
    private c f27406e;

    public i(e eVar, b bVar) {
        this.f27403b = eVar;
        this.f27404c = bVar;
    }

    private c a() {
        if (this.f27406e == null) {
            this.f27406e = c.c();
        }
        return this.f27406e;
    }

    public static i c() {
        if (f27401f == null) {
            f27401f = new i(new e(), new b());
        }
        return f27401f;
    }

    public float b() {
        return this.f27402a;
    }

    public void d() {
        b.g().a((d.a) this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f27405d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f27405d.d();
    }

    public void a(float f10) {
        this.f27402a = f10;
        for (a adSessionStatePublisher : a().a()) {
            adSessionStatePublisher.getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f27405d = this.f27403b.a(new Handler(), context, this.f27404c.a(), this);
    }

    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
