package com.iab.omid.library.applovin.internal;

import android.content.Context;
import com.iab.omid.library.applovin.internal.d;
import com.iab.omid.library.applovin.utils.f;
import java.util.Date;

public class a implements d.a {

    /* renamed from: f  reason: collision with root package name */
    private static a f27376f = new a(new d());

    /* renamed from: a  reason: collision with root package name */
    protected f f27377a = new f();

    /* renamed from: b  reason: collision with root package name */
    private Date f27378b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27379c;

    /* renamed from: d  reason: collision with root package name */
    private d f27380d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f27381e;

    private a(d dVar) {
        this.f27380d = dVar;
    }

    public static a a() {
        return f27376f;
    }

    private void c() {
        if (this.f27379c && this.f27378b != null) {
            for (com.iab.omid.library.applovin.adsession.a adSessionStatePublisher : c.c().a()) {
                adSessionStatePublisher.getAdSessionStatePublisher().a(b());
            }
        }
    }

    public Date b() {
        Date date = this.f27378b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a10 = this.f27377a.a();
        Date date = this.f27378b;
        if (date == null || a10.after(date)) {
            this.f27378b = a10;
            c();
        }
    }

    public void a(Context context) {
        if (!this.f27379c) {
            this.f27380d.a(context);
            this.f27380d.a((d.a) this);
            this.f27380d.e();
            this.f27381e = this.f27380d.c();
            this.f27379c = true;
        }
    }

    public void a(boolean z10) {
        if (!this.f27381e && z10) {
            d();
        }
        this.f27381e = z10;
    }
}
