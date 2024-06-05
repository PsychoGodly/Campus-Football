package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.a;

public class b extends d {

    /* renamed from: d  reason: collision with root package name */
    private static b f27382d = new b();

    private b() {
    }

    public static b g() {
        return f27382d;
    }

    public void b(boolean z10) {
        for (a adSessionStatePublisher : c.c().b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().a(z10);
        }
    }

    public boolean d() {
        for (a c10 : c.c().a()) {
            View c11 = c10.c();
            if (c11 != null && c11.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
