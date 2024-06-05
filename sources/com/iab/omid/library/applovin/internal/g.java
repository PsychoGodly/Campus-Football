package com.iab.omid.library.applovin.internal;

import android.content.Context;

public class g {

    /* renamed from: b  reason: collision with root package name */
    private static g f27395b = new g();

    /* renamed from: a  reason: collision with root package name */
    private Context f27396a;

    private g() {
    }

    public static g b() {
        return f27395b;
    }

    public Context a() {
        return this.f27396a;
    }

    public void a(Context context) {
        this.f27396a = context != null ? context.getApplicationContext() : null;
    }
}
