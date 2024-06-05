package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* compiled from: Sta */
public class k {

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdEventListener f15991a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Ad f15992b;

        public a(AdEventListener adEventListener, Ad ad2, Context context) {
            this.f15991a = adEventListener;
            this.f15992b = ad2;
        }

        public void run() {
            try {
                this.f15991a.onReceiveAd(this.f15992b);
            } catch (Throwable th) {
                j9.a((Object) this.f15991a, th);
            }
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdEventListener f15993a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Ad f15994b;

        public b(AdEventListener adEventListener, Ad ad2, Context context) {
            this.f15993a = adEventListener;
            this.f15994b = ad2;
        }

        public void run() {
            try {
                this.f15993a.onFailedToReceiveAd(this.f15994b);
            } catch (Throwable th) {
                j9.a((Object) this.f15993a, th);
            }
        }
    }

    public static void a(Context context, AdEventListener adEventListener, Ad ad2, boolean z10) {
        b bVar = null;
        if (!z10) {
            d2.a("onLoadFailed", adEventListener != null, (String) null, ad2 != null ? ad2.getErrorMessage() : null);
        }
        if (adEventListener != null) {
            bVar = new b(adEventListener, ad2, context);
        }
        com.startapp.sdk.adsbase.a.a((Runnable) bVar);
    }

    public static void b(Context context, AdEventListener adEventListener, Ad ad2, boolean z10) {
        a aVar = null;
        if (!z10) {
            d2.a("onLoad", adEventListener != null, (String) null, (String) null);
        }
        if (adEventListener != null) {
            aVar = new a(adEventListener, ad2, context);
        }
        com.startapp.sdk.adsbase.a.a((Runnable) aVar);
    }
}
