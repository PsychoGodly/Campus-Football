package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import c5.a;
import com.google.android.gms.internal.ads.zzbyt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n4.x;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class z2 {

    /* renamed from: a  reason: collision with root package name */
    private final Date f14628a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14629b;

    /* renamed from: c  reason: collision with root package name */
    private final List f14630c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14631d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f14632e;

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f14633f;

    /* renamed from: g  reason: collision with root package name */
    private final Map f14634g;

    /* renamed from: h  reason: collision with root package name */
    private final String f14635h;

    /* renamed from: i  reason: collision with root package name */
    private final String f14636i;

    /* renamed from: j  reason: collision with root package name */
    private final a f14637j;

    /* renamed from: k  reason: collision with root package name */
    private final int f14638k;

    /* renamed from: l  reason: collision with root package name */
    private final Set f14639l;

    /* renamed from: m  reason: collision with root package name */
    private final Bundle f14640m;

    /* renamed from: n  reason: collision with root package name */
    private final Set f14641n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f14642o;

    /* renamed from: p  reason: collision with root package name */
    private final String f14643p;

    /* renamed from: q  reason: collision with root package name */
    private final int f14644q;

    public z2(y2 y2Var, a aVar) {
        this.f14628a = y2Var.f14615g;
        this.f14629b = y2Var.f14616h;
        this.f14630c = y2Var.f14617i;
        this.f14631d = y2Var.f14618j;
        this.f14632e = Collections.unmodifiableSet(y2Var.f14609a);
        this.f14633f = y2Var.f14610b;
        this.f14634g = Collections.unmodifiableMap(y2Var.f14611c);
        this.f14635h = y2Var.f14619k;
        this.f14636i = y2Var.f14620l;
        this.f14638k = y2Var.f14621m;
        this.f14639l = Collections.unmodifiableSet(y2Var.f14612d);
        this.f14640m = y2Var.f14613e;
        this.f14641n = Collections.unmodifiableSet(y2Var.f14614f);
        this.f14642o = y2Var.f14622n;
        this.f14643p = y2Var.f14623o;
        this.f14644q = y2Var.f14624p;
    }

    @Deprecated
    public final int a() {
        return this.f14631d;
    }

    public final int b() {
        return this.f14644q;
    }

    public final int c() {
        return this.f14638k;
    }

    public final Bundle d() {
        return this.f14640m;
    }

    public final Bundle e(Class cls) {
        return this.f14633f.getBundle(cls.getName());
    }

    public final Bundle f() {
        return this.f14633f;
    }

    public final a g() {
        return this.f14637j;
    }

    public final String h() {
        return this.f14643p;
    }

    public final String i() {
        return this.f14629b;
    }

    public final String j() {
        return this.f14635h;
    }

    public final String k() {
        return this.f14636i;
    }

    @Deprecated
    public final Date l() {
        return this.f14628a;
    }

    public final List m() {
        return new ArrayList(this.f14630c);
    }

    public final Set n() {
        return this.f14641n;
    }

    public final Set o() {
        return this.f14632e;
    }

    @Deprecated
    public final boolean p() {
        return this.f14642o;
    }

    public final boolean q(Context context) {
        x d10 = m3.g().d();
        x.b();
        String zzz = zzbyt.zzz(context);
        return this.f14639l.contains(zzz) || d10.d().contains(zzz);
    }
}
