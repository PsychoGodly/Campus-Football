package com.startapp;

import android.content.Context;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;

/* compiled from: Sta */
public class m0 {

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BannerListener f16124a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f16125b;

        public a(BannerListener bannerListener, View view, Context context) {
            this.f16124a = bannerListener;
            this.f16125b = view;
        }

        public void run() {
            try {
                this.f16124a.onReceiveAd(this.f16125b);
            } catch (Throwable th) {
                j9.a((Object) this.f16124a, th);
            }
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BannerListener f16126a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f16127b;

        public b(BannerListener bannerListener, View view, Context context) {
            this.f16126a = bannerListener;
            this.f16127b = view;
        }

        public void run() {
            try {
                this.f16126a.onFailedToReceiveAd(this.f16127b);
            } catch (Throwable th) {
                j9.a((Object) this.f16126a, th);
            }
        }
    }

    /* compiled from: Sta */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BannerListener f16128a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f16129b;

        public c(BannerListener bannerListener, View view, Context context) {
            this.f16128a = bannerListener;
            this.f16129b = view;
        }

        public void run() {
            try {
                this.f16128a.onClick(this.f16129b);
            } catch (Throwable th) {
                j9.a((Object) this.f16128a, th);
            }
        }
    }

    public static void a(Context context, BannerListener bannerListener, View view, String str) {
        c cVar = null;
        d2.a("onClicked", bannerListener != null, str, (String) null);
        if (bannerListener != null) {
            cVar = new c(bannerListener, view, context);
        }
        com.startapp.sdk.adsbase.a.a((Runnable) cVar);
    }

    public static void b(Context context, BannerListener bannerListener, View view, String str) {
        b bVar = null;
        d2.a("onLoadFailed", bannerListener != null, str, (String) null);
        if (bannerListener != null) {
            bVar = new b(bannerListener, view, context);
        }
        com.startapp.sdk.adsbase.a.a((Runnable) bVar);
    }

    public static void c(Context context, BannerListener bannerListener, View view, String str) {
        a aVar = null;
        d2.a("onLoad", bannerListener != null, str, (String) null);
        if (bannerListener != null) {
            aVar = new a(bannerListener, view, context);
        }
        com.startapp.sdk.adsbase.a.a((Runnable) aVar);
    }
}
