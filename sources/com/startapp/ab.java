package com.startapp;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;

/* compiled from: Sta */
public class ab implements ua {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15613a;

    /* renamed from: b  reason: collision with root package name */
    public final i2<WvfMetadata> f15614b;

    /* renamed from: c  reason: collision with root package name */
    public WebView f15615c;

    /* renamed from: d  reason: collision with root package name */
    public String f15616d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15617e;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: com.startapp.ab$a$a  reason: collision with other inner class name */
        /* compiled from: Sta */
        public class C0163a implements MessageQueue.IdleHandler {
            public C0163a() {
            }

            public boolean queueIdle() {
                ab abVar = ab.this;
                if (abVar.f15615c != null) {
                    return false;
                }
                try {
                    WebView webView = new WebView(abVar.f15613a);
                    if (abVar.f15616d == null) {
                        abVar.f15616d = webView.getSettings().getUserAgentString();
                    }
                    abVar.f15615c = webView;
                    return false;
                } catch (Throwable unused) {
                    return false;
                }
            }
        }

        public a() {
        }

        public void run() {
            try {
                MessageQueue myQueue = Looper.myQueue();
                if (myQueue != null) {
                    myQueue.addIdleHandler(new C0163a());
                }
            } catch (Throwable th) {
                i3.a(th);
            }
        }
    }

    public ab(Context context, i2<WvfMetadata> i2Var) {
        if (Build.VERSION.SDK_INT < 31 || context.isUiContext()) {
            this.f15613a = context;
        } else {
            this.f15613a = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, (Bundle) null);
        }
        this.f15614b = i2Var;
    }

    public boolean a(int i10) {
        WvfMetadata a10 = this.f15614b.a();
        ComponentInfoEventConfig a11 = a10 != null ? a10.a() : null;
        return a11 != null && a11.a((long) i10);
    }

    public WebView b() {
        WebView webView = this.f15615c;
        if (webView == null) {
            webView = new WebView(this.f15613a);
            if (this.f15616d == null) {
                this.f15616d = webView.getSettings().getUserAgentString();
            }
        } else {
            this.f15615c = null;
            com.startapp.sdk.adsbase.a.a((Runnable) new a());
        }
        return webView;
    }

    public void c() {
        com.startapp.sdk.adsbase.a.a((Runnable) new a());
    }

    public String a() {
        int i10;
        String str = this.f15616d;
        long j10 = 0;
        if (str == null || str.length() < 1) {
            i10 = 0;
            if (Build.VERSION.SDK_INT > 16) {
                WvfMetadata a10 = this.f15614b.a();
                int b10 = j9.b(a10 != null ? a10.c() : WvfMetadata.f17107a);
                if (b10 < 0) {
                    b10 = 0;
                }
                if (b10 == 1) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        str = WebSettings.getDefaultUserAgent(this.f15613a);
                        j10 = System.currentTimeMillis() - currentTimeMillis;
                        i10 = 2;
                    } catch (Throwable th) {
                        if (a(8)) {
                            i3.a(th);
                        }
                    }
                }
            }
            if (str == null || str.length() < 1) {
                try {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    str = System.getProperty("http.agent");
                    j10 = System.currentTimeMillis() - currentTimeMillis2;
                    i10 = 4;
                } catch (Throwable th2) {
                    if (a(16)) {
                        i3.a(th2);
                    }
                }
            }
        } else {
            i10 = 1;
        }
        if (!this.f15617e) {
            this.f15617e = true;
            if (a(i10)) {
                i3 i3Var = new i3(j3.f15951d);
                i3Var.f15914d = "WVF.gua";
                i3Var.f15919i = String.valueOf(i10);
                i3Var.f15915e = str + ", " + j10 + " ms";
                i3Var.a();
            }
        }
        return str;
    }
}
