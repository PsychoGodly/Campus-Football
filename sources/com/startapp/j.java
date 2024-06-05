package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* compiled from: Sta */
public class j {

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdDisplayListener f15934a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Ad f15935b;

        public a(AdDisplayListener adDisplayListener, Ad ad2, Context context) {
            this.f15934a = adDisplayListener;
            this.f15935b = ad2;
        }

        public void run() {
            try {
                this.f15934a.adNotDisplayed(this.f15935b);
            } catch (Throwable th) {
                j9.a((Object) this.f15934a, th);
            }
        }
    }

    public static void a(Context context, AdDisplayListener adDisplayListener, Ad ad2) {
        a aVar = null;
        d2.a("adNotDisplayed", adDisplayListener != null, (String) null, ad2 != null ? ad2.getErrorMessage() : null);
        if (adDisplayListener != null) {
            aVar = new a(adDisplayListener, ad2, context);
        }
        com.startapp.sdk.adsbase.a.a((Runnable) aVar);
    }
}
