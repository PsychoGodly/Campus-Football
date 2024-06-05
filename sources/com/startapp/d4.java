package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.startapp.k2;
import com.startapp.k7;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: Sta */
public class d4 extends k2 implements View.OnClickListener {
    public k7 A;
    public boolean B = true;
    public boolean C = false;
    public int D = 0;
    public boolean E = false;
    public long F;
    public b6 G;
    public Runnable H = new a();
    public Runnable I = new b();
    public final k7.a J = new c();

    /* renamed from: w  reason: collision with root package name */
    public WebView f15723w;

    /* renamed from: x  reason: collision with root package name */
    public RelativeLayout f15724x;

    /* renamed from: y  reason: collision with root package name */
    public ImageButton f15725y;

    /* renamed from: z  reason: collision with root package name */
    public long f15726z = 0;

    /* compiled from: Sta */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            d4.this.i();
            d4.this.b();
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            d4 d4Var = d4.this;
            d4Var.B = true;
            WebView webView = d4Var.f15723w;
            if (webView != null) {
                webView.setOnTouchListener((View.OnTouchListener) null);
            }
        }
    }

    /* compiled from: Sta */
    public class c implements k7.a {
        public c() {
        }

        public void onSent(String str) {
            d4 d4Var = d4.this;
            d4Var.getClass();
            Intent intent = new Intent("com.startapp.android.ShowDisplayBroadcastListener");
            intent.putExtra("dParam", str);
            w4.a((Context) d4Var.f15996b).a(intent);
        }
    }

    /* compiled from: Sta */
    public class d implements View.OnLongClickListener {
        public d(d4 d4Var) {
        }

        public boolean onLongClick(View view) {
            return true;
        }
    }

    /* compiled from: Sta */
    public class e implements View.OnTouchListener {
        public e() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            d4.this.B = true;
            if (motionEvent.getAction() == 2) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Sta */
    public class f implements Runnable {
        public f() {
        }

        public void run() {
            d4.this.b();
        }
    }

    /* compiled from: Sta */
    public class g implements Runnable {
        public g() {
        }

        public void run() {
            WebView webView = d4.this.f15723w;
            if (webView != null) {
                a0.a(webView);
            }
        }
    }

    /* compiled from: Sta */
    public class h extends WebViewClient {
        public h() {
        }

        public void onPageFinished(WebView webView, String str) {
            d4.this.a(webView);
            d4 d4Var = d4.this;
            j9.a(d4Var.f15723w, true, "gClientInterface.setMode", d4Var.f16002h);
            Object[] objArr = {"externalLinks"};
            j9.a(d4.this.f15723w, true, "enableScheme", objArr);
            d4.this.r();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (webView == null || str == null || j9.b(webView.getContext(), str)) {
                return true;
            }
            if (!d4.this.B) {
                i3 i3Var = new i3(j3.f15952e);
                i3Var.f15914d = "fake_click";
                i3Var.f15917g = d4.this.a();
                StringBuilder a10 = p0.a("jsTag=");
                a10.append(d4.this.E);
                i3Var.f15915e = a10.toString();
                i3Var.a();
            }
            d4 d4Var = d4.this;
            if (!d4Var.E || d4Var.B) {
                return d4Var.a(str, false);
            }
            return false;
        }
    }

    public void a(Bundle bundle) {
        w4.a((Context) this.f15996b).a(this.f15998d, new IntentFilter("com.startapp.android.CloseAdActivity"));
        if (bundle != null) {
            if (bundle.containsKey("postrollHtml")) {
                a(bundle.getString("postrollHtml"));
            }
            this.C = bundle.getBoolean("videoCompletedBroadcastSent", false);
            this.D = bundle.getInt("replayNum");
        }
    }

    public void a(WebView webView) {
    }

    public void a(RelativeLayout relativeLayout) {
    }

    public void b() {
        this.f15996b.runOnUiThread(new k2.b());
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f16847a.f16821o = false;
        k7 k7Var = this.A;
        if (k7Var != null) {
            k7Var.a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
        }
        this.f15996b.runOnUiThread(new g());
    }

    public boolean c() {
        if (this.f16015u != null && SystemClock.uptimeMillis() - this.F < this.f16015u.longValue()) {
            return true;
        }
        i();
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f16847a.f16821o = false;
        this.A.a("AD_CLOSED_TOO_QUICKLY", (JSONObject) null);
        return false;
    }

    public void d() {
        if (this.f15998d != null) {
            w4.a((Context) this.f15996b).a(this.f15998d);
        }
        this.f15998d = null;
        b6 b6Var = this.G;
        if (b6Var != null) {
            b6Var.a();
            this.G = null;
        }
        WebView webView = this.f15723w;
        Map<Activity, Integer> map = j9.f15982a;
        new Handler(Looper.getMainLooper()).postAtTime((Runnable) null, webView, SystemClock.uptimeMillis() + 1000);
    }

    public void e() {
        k7 k7Var = this.A;
        if (k7Var != null) {
            k7Var.b();
        }
        WebView webView = this.f15723w;
        if (webView != null) {
            a0.a(webView);
        }
    }

    public void f() {
        Ad ad2 = this.f16006l;
        if (ad2 instanceof InterstitialAd ? ((InterstitialAd) ad2).d() : false) {
            b();
            return;
        }
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f16847a.f16821o = true;
        if (this.A == null) {
            k7 k7Var = new k7(this.f15996b, this.f16008n, this.f16003i, n(), m());
            this.A = k7Var;
            k7Var.a(this.J);
        }
        WebView webView = this.f15723w;
        if (webView == null) {
            RelativeLayout relativeLayout = new RelativeLayout(this.f15996b);
            this.f15724x = relativeLayout;
            relativeLayout.setContentDescription("StartApp Ad");
            this.f15724x.setId(1475346432);
            this.f15996b.setContentView(this.f15724x);
            try {
                WebView b10 = ComponentLocator.a((Context) this.f15996b).x().b();
                this.f15723w = b10;
                b10.setBackgroundColor(-16777216);
                this.f15996b.getWindow().getDecorView().findViewById(16908290).setBackgroundColor(7829367);
                this.f15723w.setVerticalScrollBarEnabled(false);
                this.f15723w.setHorizontalScrollBarEnabled(false);
                this.f15723w.getSettings().setJavaScriptEnabled(true);
                WebView webView2 = this.f15723w;
                if (Build.VERSION.SDK_INT >= 17) {
                    webView2.getSettings().setMediaPlaybackRequiresUserGesture(false);
                }
                if (this.f16016v) {
                    a0.a(this.f15723w, (Paint) null);
                }
                this.f15723w.setOnLongClickListener(new d(this));
                this.f15723w.setLongClickable(false);
                this.f15723w.addJavascriptInterface(l(), "startappwall");
                q();
                b(this.f15723w);
                u();
                j9.a(this.f15723w, this.f16007m);
                this.E = "true".equals(j9.a(this.f16007m, "@jsTag@", "@jsTag@"));
                this.f15724x.addView(this.f15723w, new RelativeLayout.LayoutParams(-1, -1));
                RelativeLayout relativeLayout2 = this.f15724x;
                AdInformationObject adInformationObject = new AdInformationObject(this.f15996b, AdInformationObject.Size.LARGE, this.f16008n, this.f16009o, this.f16006l.getConsentData(), this.f16006l.getRequestUrl(), this.f16006l.getDParam());
                this.f15997c = adInformationObject;
                adInformationObject.a(relativeLayout2);
            } catch (Throwable th) {
                i3.a(th);
                b();
            }
        } else {
            a0.b(webView);
            this.A.c();
        }
        this.f15726z = SystemClock.uptimeMillis();
    }

    public void i() {
        String[] strArr = this.f15999e;
        if (strArr != null && strArr.length > 0 && strArr[0] != null) {
            com.startapp.sdk.adsbase.a.a((Context) this.f15996b, strArr[0], o());
        }
    }

    public void j() {
        try {
            RelativeLayout relativeLayout = new RelativeLayout(this.f15996b);
            ImageButton imageButton = new ImageButton(this.f15996b);
            this.f15725y = imageButton;
            imageButton.setBackgroundColor(0);
            this.f15725y.setOnClickListener(this);
            int a10 = f9.a((Context) this.f15996b, 50);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a10, a10);
            layoutParams.addRule(13);
            relativeLayout.addView(this.f15725y, layoutParams);
            a(relativeLayout);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a10, a10);
            layoutParams2.addRule(10);
            layoutParams2.addRule(11);
            this.f15724x.addView(relativeLayout, layoutParams2);
        } catch (Throwable th) {
            i3.a(th);
        }
    }

    public long k() {
        return (SystemClock.uptimeMillis() - this.f15726z) / 1000;
    }

    public j4 l() {
        Activity activity = this.f15996b;
        Runnable runnable = this.H;
        Runnable runnable2 = this.I;
        j4 j4Var = new j4((Context) activity, runnable, o(), a(0));
        j4Var.f15970d = runnable;
        j4Var.f15971e = runnable2;
        return j4Var;
    }

    public long m() {
        Long l10 = this.f16011q;
        if (l10 != null) {
            return TimeUnit.SECONDS.toMillis(l10.longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.f17070k.s());
    }

    public TrackingParams n() {
        return new TrackingParams(this.f16010p);
    }

    public TrackingParams o() {
        return new CloseTrackingParams(k(), this.f16010p);
    }

    public void onClick(View view) {
    }

    public boolean p() {
        return false;
    }

    public void q() {
        this.A.c();
    }

    public void r() {
        a((View) this.f15725y);
        this.F = SystemClock.uptimeMillis();
    }

    public void s() {
    }

    public void t() {
        if (p() && !this.C && this.D == 0) {
            this.C = true;
            Intent intent = new Intent("com.startapp.android.OnVideoCompleted");
            intent.putExtra("dParam", a());
            w4.a((Context) this.f15996b).a(intent);
            s();
        }
    }

    public void u() {
        this.f15723w.setWebViewClient(new h());
    }

    public void v() {
        try {
            if (this.f15725y != null) {
                this.f15725y.setImageDrawable(new BitmapDrawable(this.f15996b.getResources(), c1.a("iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA39pVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMDY3IDc5LjE1Nzc0NywgMjAxNS8wMy8zMC0yMzo0MDo0MiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDozODRkZTAxYi00OWRkLWM4NDYtYThkNC0wZWRiMDMwYTZlODAiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6QkE0Q0U2MUY2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6QkE0Q0U2MUU2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChXaW5kb3dzKSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOjlkZjAyMGU0LTNlYmUtZTY0ZC04YjRiLWM5ZWY4MTU4ZjFhYyIgc3RSZWY6ZG9jdW1lbnRJRD0iYWRvYmU6ZG9jaWQ6cGhvdG9zaG9wOmU1MzEzNDdlLTZjMDEtMTFlNS1hZGZlLThmMTBjZWYxMGRiZSIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PngNsEEAAANeSURBVHjatFfNS1tBEH+pUZOQ0B4i3sTSxHMRFNQoFBEP7dHgvyDiKWgguQra9F+oxqNiwOTQ+oFI1ZM3jSf1YK5FL41ooaKZzu+x+4gv2bx9Rgd+JNn5zO7s7IzH0CQiCvLHZ8YnxkfGe8ZbwS4zSowTxi/GT4/Hc2u8BLHjCOM745b06VboRJpx7GN8ZfyDxUqlQgcHB5RMJmloaIg6Ozupra3NBL5jDTzIQFYQdDOw5db5B8YxLDw+PtLKygr19PQQWDqIRqOUzWZNXUHH2rvBgr2M39C6uLig/v5+bcd2QLdUKskgYLNX57yvIL2zs0OhUOjZziU6Ojro8PBQBnGl3Alm+BknkMI54mybdS4BW3t7ezKIInzVCwDJYm4Zon4p5xLYzfPzcxlEpl7S3SNpmjlznZwQiXn/5CjEnTUzt5GBsbExamlpUfLBg0wjG8vLy3IXlqTzEAoH7m4kElEqTk1Nmfd7bW2tbhBYAw8ykFXZgQ9RJ1CsQghgEr/29/eVStPT09XFhdbX18nr9Vr81tZWyuVyFh+yMzMzSnvwJWjyDS+MYic2NzeV17O7u9vg2m79jsfjBv9bg7PbxOrqqjExMWHxIdvV1aW0V+VrFDtwhFCGh4cbnl0mk6kp+BsbGybsBNlGtkZGRqToEQK4xjfUc6csXlhYcHyFFhcXHe3Al6BrQz427e3tWldpfn5e6Rw83cIkHyvXAUAZb4SdsKZbPe0BaB+Bz+cjTiDlDmxtbZkybo9AKwn9fj9tb2875gBkINvIFnzJJMQ1PMV9GBgYUF6bQCBgFAoFY3x8/Ml6KpUy0un0kzXIQBY6KqrydapViPL5fM0/Rfcj+fhuJw5CqxBpleJYLEY3NzeW8dnZ2RoZrEmCLHQcSvGdWYrFe7CEFTwUqqjR85XLZUokEkoZ8CADWe3HqKoTcnyOdW5KI5m+vj56eHiQz3G0bkNyeXn5ag3J2dmZ/PffVC1Z8bVast3d3eqWLKDVlAaDwaadh8Nhvaa0XluOHg7n9lzn0MWRarfltp0oysEErRqGDTeDCbK9ajApuh7TxGiWERlrjWZzc3M0ODhYM5phDTzbaHb/rNHMFkhUNK13LobTv6K2RJ3se1yO519s4/k7wf5jG89/6I7n/wUYAGo3YtcprD4sAAAAAElFTkSuQmCC")));
                this.f15725y.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f15725y.setVisibility(0);
            }
        } catch (Throwable th) {
            i3.a(th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c A[SYNTHETIC, Splitter:B:11:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            com.startapp.k7 r0 = r5.A
            r1 = 0
            r0.a(r1, r1)
            com.startapp.sdk.adsbase.Ad r0 = r5.f16006l
            android.app.Activity r1 = r5.f15996b
            android.content.Context r1 = com.startapp.h0.a(r1)
            if (r1 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            android.app.Activity r1 = r5.f15996b
        L_0x0013:
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r2 = r5.f16008n
            boolean r1 = com.startapp.sdk.adsbase.a.a((android.content.Context) r1, (com.startapp.sdk.adsbase.model.AdPreferences.Placement) r2)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0025
            java.util.Map<android.app.Activity, java.lang.Integer> r1 = com.startapp.j9.f15982a
            boolean r0 = r0 instanceof com.startapp.sdk.ads.splash.SplashAd
            if (r0 != 0) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            boolean r1 = r5.b((java.lang.String) r6)
            if (r1 == 0) goto L_0x0045
            int r1 = com.startapp.sdk.adsbase.a.a((java.lang.String) r6)     // Catch:{ all -> 0x0040 }
            boolean[] r4 = r5.f16000f     // Catch:{ all -> 0x0040 }
            boolean r4 = r4[r1]     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x003c
            if (r0 != 0) goto L_0x003c
            r5.b(r6, r1, r7)     // Catch:{ all -> 0x0040 }
            goto L_0x0054
        L_0x003c:
            r5.a(r6, r1, r7)     // Catch:{ all -> 0x0040 }
            goto L_0x0054
        L_0x0040:
            r6 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r6)
            return r3
        L_0x0045:
            boolean[] r1 = r5.f16000f
            boolean r1 = r1[r3]
            if (r1 == 0) goto L_0x0051
            if (r0 != 0) goto L_0x0051
            r5.b(r6, r3, r7)
            goto L_0x0054
        L_0x0051:
            r5.a(r6, r3, r7)
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.d4.a(java.lang.String, boolean):boolean");
    }

    public void b(WebView webView) {
        this.B = false;
        webView.setOnTouchListener(new e());
    }

    public void b(Bundle bundle) {
        String str = this.f16007m;
        if (str != null) {
            bundle.putString("postrollHtml", str);
        }
        bundle.putBoolean("videoCompletedBroadcastSent", this.C);
        bundle.putInt("replayNum", this.D);
    }

    public boolean b(String str) {
        return !this.E && str.contains("index=");
    }

    public final void b(String str, int i10, boolean z10) {
        int i11 = i10;
        boolean m10 = MetaData.f17070k.m();
        Activity activity = this.f15996b;
        String[] strArr = this.f16004j;
        String[] strArr2 = i11 < strArr.length ? new String[]{strArr[i11]} : null;
        String[] strArr3 = this.f16005k;
        String str2 = i11 < strArr3.length ? strArr3[i11] : null;
        TrackingParams o10 = o();
        long z11 = AdsCommonMetaData.f16770h.z();
        long y10 = AdsCommonMetaData.f16770h.y();
        boolean a10 = a(i11);
        Boolean[] boolArr = this.f16012r;
        com.startapp.sdk.adsbase.a.a(activity, str, strArr2, str2, o10, z11, y10, a10, (boolArr == null || i11 < 0 || i11 >= boolArr.length) ? null : boolArr[i11], z10, m10 ? new f() : null);
    }

    public final void a(String str, int i10, boolean z10) {
        Intent intent = new Intent("com.startapp.android.OnClickCallback");
        intent.putExtra("dParam", a());
        w4.a((Context) this.f15996b).a(intent);
        Context a10 = h0.a(this.f15996b);
        if (a10 == null) {
            a10 = this.f15996b;
        }
        boolean a11 = com.startapp.sdk.adsbase.a.a(a10, this.f16008n);
        Activity activity = this.f15996b;
        String[] strArr = this.f16004j;
        boolean z11 = true;
        String[] strArr2 = i10 < strArr.length ? new String[]{strArr[i10]} : null;
        TrackingParams o10 = o();
        if (!a(i10) || a11) {
            z11 = false;
        }
        com.startapp.sdk.adsbase.a.a((Context) activity, str, strArr2, o10, z11, z10);
        if (MetaData.f17070k.m()) {
            b();
        }
    }

    public void a(View view) {
        AdInformationView adInformationView;
        if (MetaData.f17070k.V()) {
            b6 b6Var = new b6(this.f15723w);
            this.G = b6Var;
            if (b6Var.c()) {
                try {
                    AdInformationObject adInformationObject = this.f15997c;
                    if (!(adInformationObject == null || (adInformationView = adInformationObject.f16860b) == null)) {
                        this.G.a(adInformationView, s9.c.OTHER, (String) null);
                    }
                    if (view != null) {
                        this.G.a(view, s9.c.CLOSE_AD, (String) null);
                    }
                } catch (RuntimeException unused) {
                }
                this.G.a(this.f15723w);
                this.G.e();
                this.G.d();
                this.G.b();
            }
        }
    }
}
