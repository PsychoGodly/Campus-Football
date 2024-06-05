package com.startapp;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: Sta */
public class ra implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public NotDisplayedReason f16358a = NotDisplayedReason.AD_CLOSED_TOO_QUICKLY;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f16359b;

    /* renamed from: c  reason: collision with root package name */
    public a f16360c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f16361d = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference<View> f16362e;

    /* renamed from: f  reason: collision with root package name */
    public final k7 f16363f;

    /* renamed from: g  reason: collision with root package name */
    public final BannerOptions f16364g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16365h = true;

    /* compiled from: Sta */
    public interface a {
    }

    public ra(View view, k7 k7Var, BannerOptions bannerOptions) {
        this.f16362e = new WeakReference<>(view);
        this.f16363f = k7Var;
        this.f16364g = bannerOptions;
    }

    public void a() {
        NotDisplayedReason notDisplayedReason;
        try {
            k7 k7Var = this.f16363f;
            if (!(k7Var == null || (notDisplayedReason = this.f16358a) == null)) {
                k7Var.a(notDisplayedReason.toString(), this.f16359b);
            }
            this.f16361d.removeCallbacksAndMessages((Object) null);
        } catch (Throwable unused) {
        }
    }

    public boolean b() {
        k7 k7Var = this.f16363f;
        return (k7Var == null || k7Var.a() || this.f16362e.get() == null) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r0 = (com.startapp.sdk.ads.nativead.NativeAdDetails.e) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            boolean r0 = r5.b()     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0077
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ all -> 0x007b }
            r0.<init>()     // Catch:{ all -> 0x007b }
            java.lang.ref.WeakReference<android.view.View> r1 = r5.f16362e     // Catch:{ all -> 0x007b }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x007b }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x007b }
            com.startapp.sdk.ads.banner.BannerOptions r2 = r5.f16364g     // Catch:{ all -> 0x007b }
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r1 = com.startapp.qa.a((android.view.View) r1, (com.startapp.sdk.ads.banner.BannerOptions) r2, (java.util.concurrent.atomic.AtomicReference<org.json.JSONObject>) r0)     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0033
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r2 = r5.f16358a     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x0029
            int r2 = r2.a()     // Catch:{ all -> 0x007b }
            int r3 = r1.a()     // Catch:{ all -> 0x007b }
            if (r2 > r3) goto L_0x0033
        L_0x0029:
            r5.f16358a = r1     // Catch:{ all -> 0x007b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x007b }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ all -> 0x007b }
            r5.f16359b = r0     // Catch:{ all -> 0x007b }
        L_0x0033:
            r0 = 0
            r2 = 1
            if (r1 != 0) goto L_0x0039
            r1 = 1
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            if (r1 == 0) goto L_0x004a
            boolean r3 = r5.f16365h     // Catch:{ all -> 0x007b }
            if (r3 == 0) goto L_0x004a
            r5.f16365h = r0     // Catch:{ all -> 0x007b }
            com.startapp.k7 r0 = r5.f16363f     // Catch:{ all -> 0x007b }
            r0.c()     // Catch:{ all -> 0x007b }
            com.startapp.ra$a r0 = r5.f16360c     // Catch:{ all -> 0x007b }
            goto L_0x006f
        L_0x004a:
            if (r1 != 0) goto L_0x006f
            boolean r0 = r5.f16365h     // Catch:{ all -> 0x007b }
            if (r0 != 0) goto L_0x006f
            r5.f16365h = r2     // Catch:{ all -> 0x007b }
            com.startapp.k7 r0 = r5.f16363f     // Catch:{ all -> 0x007b }
            r0.b()     // Catch:{ all -> 0x007b }
            com.startapp.ra$a r0 = r5.f16360c     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x006f
            com.startapp.sdk.ads.nativead.NativeAdDetails$e r0 = (com.startapp.sdk.ads.nativead.NativeAdDetails.e) r0     // Catch:{ all -> 0x007b }
            com.startapp.sdk.ads.nativead.NativeAdDetails r1 = com.startapp.sdk.ads.nativead.NativeAdDetails.this     // Catch:{ all -> 0x007b }
            com.startapp.sdk.ads.nativead.NativeAdDisplayListener r3 = r1.f16539j     // Catch:{ all -> 0x007b }
            if (r3 == 0) goto L_0x006f
            boolean r4 = r1.f16534e     // Catch:{ all -> 0x007b }
            if (r4 != 0) goto L_0x006f
            r3.adHidden(r1)     // Catch:{ all -> 0x007b }
            com.startapp.sdk.ads.nativead.NativeAdDetails r0 = com.startapp.sdk.ads.nativead.NativeAdDetails.this     // Catch:{ all -> 0x007b }
            boolean unused = r0.f16534e = r2     // Catch:{ all -> 0x007b }
        L_0x006f:
            android.os.Handler r0 = r5.f16361d     // Catch:{ all -> 0x007b }
            r1 = 100
            r0.postDelayed(r5, r1)     // Catch:{ all -> 0x007b }
            goto L_0x0082
        L_0x0077:
            r5.a()     // Catch:{ all -> 0x007b }
            goto L_0x0082
        L_0x007b:
            com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason r0 = com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason.INTERNAL_ERROR
            r5.f16358a = r0
            r5.a()
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.ra.run():void");
    }

    public ra(WeakReference<View> weakReference, k7 k7Var, BannerOptions bannerOptions) {
        this.f16362e = weakReference;
        this.f16363f = k7Var;
        this.f16364g = bannerOptions;
    }
}
