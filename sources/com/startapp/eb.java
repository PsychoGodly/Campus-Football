package com.startapp;

import android.provider.Settings;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import s9.e;
import u9.a;

/* compiled from: Sta */
public class eb extends o {

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f15790k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a  reason: collision with root package name */
    public final q f15791a;

    /* renamed from: b  reason: collision with root package name */
    public final p f15792b;

    /* renamed from: c  reason: collision with root package name */
    public final List<ub> f15793c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public kb f15794d;

    /* renamed from: e  reason: collision with root package name */
    public a f15795e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15796f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f15797g = false;

    /* renamed from: h  reason: collision with root package name */
    public final String f15798h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f15799i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f15800j;

    public eb(p pVar, q qVar) {
        this.f15792b = pVar;
        this.f15791a = qVar;
        this.f15798h = UUID.randomUUID().toString();
        a((View) null);
        this.f15795e = (qVar.a() == s9.a.f30314b || qVar.a() == s9.a.f30316d) ? new fb(qVar.d()) : new mb(qVar.b(), qVar.c());
        this.f15795e.d();
        cb.a().a(this);
        this.f15795e.a(pVar);
    }

    public void a() {
        if (!this.f15796f) {
            this.f15796f = true;
            cb cbVar = cb.f15708c;
            boolean b10 = cbVar.b();
            cbVar.f15710b.add(this);
            if (!b10) {
                kc a10 = kc.a();
                a10.getClass();
                nb nbVar = nb.f16187d;
                nbVar.f16190c = a10;
                nbVar.f16188a = true;
                nbVar.f16189b = false;
                nbVar.a();
                w8.f17503h.a();
                cc ccVar = a10.f16073d;
                ccVar.f15715e = ccVar.a();
                ccVar.b();
                ccVar.f15711a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, ccVar);
            }
            float f10 = kc.a().f16070a;
            a aVar = this.f15795e;
            ec.f15801a.a(aVar.c(), "setDeviceVolume", Float.valueOf(f10));
            this.f15795e.a(this, this.f15791a);
        }
    }

    public final void a(View view) {
        this.f15794d = new kb((View) null);
    }

    public View b() {
        return (View) this.f15794d.get();
    }

    public boolean c() {
        return this.f15796f && !this.f15797g;
    }

    public boolean d() {
        return e.f30333b == this.f15792b.f16240a;
    }

    public boolean e() {
        return e.f30333b == this.f15792b.f16241b;
    }
}
