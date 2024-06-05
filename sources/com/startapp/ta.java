package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.startapp.j9;
import com.startapp.sdk.adsbase.AdsConstants;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Sta */
public class ta {

    /* renamed from: a  reason: collision with root package name */
    public final ua f17318a;

    /* renamed from: b  reason: collision with root package name */
    public final Queue<WeakReference<WebView>> f17319b = new LinkedList();

    /* compiled from: Sta */
    public class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Handler f17320a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f17321b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WebView f17322c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ j9.b f17323d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ AtomicLong f17324e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f17325f;

        /* renamed from: com.startapp.ta$a$a  reason: collision with other inner class name */
        /* compiled from: Sta */
        public class C0172a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ long f17327a;

            public C0172a(long j10) {
                this.f17327a = j10;
            }

            public void run() {
                if (a.this.f17321b.compareAndSet(false, true)) {
                    a aVar = a.this;
                    ta.this.a(aVar.f17322c);
                    a aVar2 = a.this;
                    aVar2.f17323d.a(false, aVar2.f17324e.get(), this.f17327a, true);
                }
            }
        }

        /* compiled from: Sta */
        public class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f17329a;

            public b(String str) {
                this.f17329a = str;
            }

            public void run() {
                if (a.this.f17321b.compareAndSet(false, true)) {
                    a aVar = a.this;
                    ta.this.a(aVar.f17322c);
                    a.this.f17323d.a(3, String.valueOf(this.f17329a));
                }
            }
        }

        public a(Handler handler, AtomicBoolean atomicBoolean, WebView webView, j9.b bVar, AtomicLong atomicLong, int i10) {
            this.f17320a = handler;
            this.f17321b = atomicBoolean;
            this.f17322c = webView;
            this.f17323d = bVar;
            this.f17324e = atomicLong;
            this.f17325f = i10;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            long a10 = j9.a();
            this.f17320a.removeCallbacksAndMessages((Object) null);
            this.f17320a.postDelayed(new C0172a(a10), (long) this.f17325f);
        }

        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            this.f17320a.removeCallbacksAndMessages((Object) null);
            this.f17320a.post(new b(str));
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (webView == null || str == null || j9.b(webView.getContext(), str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f17331a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ WebView f17332b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j9.b f17333c;

        public b(AtomicBoolean atomicBoolean, WebView webView, j9.b bVar) {
            this.f17331a = atomicBoolean;
            this.f17332b = webView;
            this.f17333c = bVar;
        }

        public void run() {
            if (this.f17331a.compareAndSet(false, true)) {
                ta.this.a(this.f17332b);
                this.f17333c.a(2, "Unknown error");
            }
        }
    }

    /* compiled from: Sta */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f17335a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ WebView f17336b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j9.b f17337c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ AtomicLong f17338d;

        public c(AtomicBoolean atomicBoolean, WebView webView, j9.b bVar, AtomicLong atomicLong) {
            this.f17335a = atomicBoolean;
            this.f17336b = webView;
            this.f17337c = bVar;
            this.f17338d = atomicLong;
        }

        public void run() {
            if (this.f17335a.compareAndSet(false, true)) {
                ta.this.a(this.f17336b);
                this.f17337c.a(false, this.f17338d.get(), j9.a(), false);
            }
        }
    }

    public ta(Context context, ua uaVar) {
        this.f17318a = uaVar;
    }

    public void a(WebView webView) {
        webView.stopLoading();
        webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        if (this.f17319b.size() < 3) {
            this.f17319b.add(new WeakReference(webView));
        } else {
            webView.destroy();
        }
    }

    public void a(String str, j9.b bVar) {
        int i10;
        String str2 = str;
        j9.b bVar2 = bVar;
        if ("true".equals(j9.a(str2, "@doNotRender@", "@doNotRender@"))) {
            bVar.a(true, 0, 0, false);
            return;
        }
        WebView webView = null;
        while (webView == null) {
            try {
                if (this.f17319b.size() <= 0) {
                    break;
                }
                WeakReference poll = this.f17319b.poll();
                if (poll != null) {
                    webView = (WebView) poll.get();
                }
            } catch (Throwable th) {
                i3.a(th);
                bVar2.a(1, "WebView instantiation Error");
                return;
            }
        }
        if (webView == null) {
            webView = this.f17318a.b();
        }
        WebView webView2 = webView;
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        Handler handler = new Handler(Looper.getMainLooper());
        AtomicLong atomicLong = new AtomicLong();
        if (AdsConstants.f16776f.booleanValue()) {
            webView2.getSettings().setBlockNetworkImage(false);
            webView2.getSettings().setLoadsImagesAutomatically(true);
            webView2.getSettings().setJavaScriptEnabled(true);
            i10 = 25000;
        } else {
            i10 = 0;
        }
        webView2.setWebChromeClient(new WebChromeClient());
        a aVar = r1;
        AtomicLong atomicLong2 = atomicLong;
        a aVar2 = new a(handler, atomicBoolean, webView2, bVar, atomicLong, i10);
        webView2.setWebViewClient(aVar);
        atomicLong2.set(j9.a());
        if (!j9.a(webView2, str2)) {
            handler.removeCallbacksAndMessages((Object) null);
            handler.post(new b(atomicBoolean, webView2, bVar2));
            return;
        }
        handler.postDelayed(new c(atomicBoolean, webView2, bVar, atomicLong2), 25000);
    }
}
