package com.startapp;

import android.os.Handler;
import android.webkit.WebView;
import com.startapp.d4;

/* compiled from: Sta */
public class h6 extends d4 {

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebView f15898a;

        public a(h6 h6Var, WebView webView) {
            this.f15898a = webView;
        }

        public void run() {
            try {
                this.f15898a.setBackgroundColor(0);
            } catch (Exception unused) {
            }
        }
    }

    public void a(WebView webView) {
        new Handler().postDelayed(new a(this, webView), 1000);
    }

    public void b(WebView webView) {
        this.B = false;
        webView.setOnTouchListener(new d4.e());
        if (this.f16002h.equals("interstitial")) {
            webView.setBackgroundColor(0);
        }
    }
}
