package com.startapp;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import java.util.LinkedList;
import java.util.concurrent.Executor;

/* compiled from: Sta */
public class va implements ua {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17431a;

    /* renamed from: b  reason: collision with root package name */
    public final n4<Executor> f17432b;

    /* renamed from: c  reason: collision with root package name */
    public final n4<v2> f17433c;

    /* renamed from: d  reason: collision with root package name */
    public final i2<WvfMetadata> f17434d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedList<WebView> f17435e = new LinkedList<>();

    /* renamed from: f  reason: collision with root package name */
    public String f17436f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17437g = true;

    /* renamed from: h  reason: collision with root package name */
    public final MessageQueue.IdleHandler f17438h = new a();

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f17439i = new b();

    /* compiled from: Sta */
    public class a implements MessageQueue.IdleHandler {
        public a() {
        }

        public boolean queueIdle() {
            va vaVar = va.this;
            vaVar.getClass();
            try {
                WebView webView = new WebView(vaVar.f17431a);
                if (vaVar.f17437g) {
                    vaVar.f17437g = false;
                    WvfMetadata a10 = vaVar.f17434d.a();
                    int b10 = j9.b(a10 != null ? a10.c() : WvfMetadata.f17107a);
                    if (b10 < 0) {
                        b10 = 0;
                    }
                    if (b10 != 1) {
                        if (b10 == 2) {
                            if (Build.VERSION.SDK_INT >= 21) {
                                webView.setWebViewClient(new ya(vaVar));
                                webView.loadUrl("http://0.0.0.0");
                                return false;
                            }
                        }
                    } else if (Build.VERSION.SDK_INT >= 17) {
                        try {
                            vaVar.f17432b.a().execute(new wa(vaVar));
                        } catch (Throwable th) {
                            if (vaVar.a(8)) {
                                i3.a(th);
                            }
                        }
                    }
                }
                try {
                    webView.setWebViewClient((WebViewClient) null);
                    vaVar.f17435e.addLast(webView);
                } catch (Throwable th2) {
                    if (vaVar.a(4)) {
                        i3.a(th2);
                    }
                }
            } catch (Throwable th3) {
                if (vaVar.a(2)) {
                    i3.a(th3);
                }
            }
            return false;
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            va vaVar = va.this;
            vaVar.getClass();
            try {
                MessageQueue myQueue = Looper.myQueue();
                if (myQueue != null) {
                    myQueue.addIdleHandler(vaVar.f17438h);
                }
            } catch (Throwable th) {
                if (vaVar.a(512)) {
                    i3.a(th);
                }
            }
        }
    }

    public va(Context context, n4<Executor> n4Var, n4<v2> n4Var2, i2<WvfMetadata> i2Var) {
        if (Build.VERSION.SDK_INT < 31 || context.isUiContext()) {
            this.f17431a = context;
        } else {
            this.f17431a = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, (Bundle) null);
        }
        this.f17432b = n4Var;
        this.f17433c = n4Var2;
        this.f17434d = i2Var;
    }

    public boolean a(int i10) {
        WvfMetadata a10 = this.f17434d.a();
        ComponentInfoEventConfig a11 = a10 != null ? a10.a() : null;
        return a11 != null && a11.a((long) i10);
    }

    public WebView b() {
        if (this.f17435e.size() < 1) {
            return new WebView(this.f17431a);
        }
        if (this.f17435e.size() == 1) {
            c();
        }
        return this.f17435e.removeFirst();
    }

    public void c() {
        try {
            this.f17433c.a().execute(this.f17439i);
        } catch (Throwable th) {
            if (a(256)) {
                i3.a(th);
            }
        }
    }

    public String a() {
        String d10 = j9.d(this.f17436f);
        if (d10 != null) {
            return d10;
        }
        try {
            return j9.d(System.getProperty("http.agent"));
        } catch (Throwable th) {
            if (a(1)) {
                i3.a(th);
            }
            return null;
        }
    }
}
