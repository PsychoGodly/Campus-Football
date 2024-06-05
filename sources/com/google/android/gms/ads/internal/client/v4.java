package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class v4 {

    /* renamed from: a  reason: collision with root package name */
    private Bundle f14583a = new Bundle();

    /* renamed from: b  reason: collision with root package name */
    private List f14584b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f14585c = false;

    /* renamed from: d  reason: collision with root package name */
    private int f14586d = -1;

    /* renamed from: e  reason: collision with root package name */
    private final Bundle f14587e = new Bundle();

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f14588f = new Bundle();

    /* renamed from: g  reason: collision with root package name */
    private final List f14589g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private int f14590h = -1;

    /* renamed from: i  reason: collision with root package name */
    private String f14591i = null;

    /* renamed from: j  reason: collision with root package name */
    private final List f14592j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private int f14593k = 60000;

    public final u4 a() {
        return new u4(8, -1, this.f14583a, -1, this.f14584b, this.f14585c, this.f14586d, false, (String) null, (k4) null, (Location) null, (String) null, this.f14587e, this.f14588f, this.f14589g, (String) null, (String) null, false, (a1) null, this.f14590h, this.f14591i, this.f14592j, this.f14593k, (String) null);
    }

    public final v4 b(Bundle bundle) {
        this.f14583a = bundle;
        return this;
    }

    public final v4 c(int i10) {
        this.f14593k = i10;
        return this;
    }

    public final v4 d(boolean z10) {
        this.f14585c = z10;
        return this;
    }

    public final v4 e(List list) {
        this.f14584b = list;
        return this;
    }

    public final v4 f(String str) {
        this.f14591i = str;
        return this;
    }

    public final v4 g(int i10) {
        this.f14586d = i10;
        return this;
    }

    public final v4 h(int i10) {
        this.f14590h = i10;
        return this;
    }
}
