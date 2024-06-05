package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import com.startapp.t0;
import java.util.Map;

/* compiled from: Sta */
public class h5 extends d4 {
    public MraidState K = MraidState.LOADING;
    public d L;
    public k5 M;
    public l5 N;
    public TextView O;
    public ImageView P;
    public boolean Q = false;
    public boolean R = false;
    public Handler S = null;

    /* compiled from: Sta */
    public class a implements t0.a {
        public a() {
        }

        public boolean onClickEvent(String str) {
            return h5.this.a(str, true);
        }
    }

    /* compiled from: Sta */
    public class b extends WebChromeClient {
        public b(h5 h5Var) {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            try {
                if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR && consoleMessage.message().contains("mraid")) {
                    i3 i3Var = new i3(j3.f15952e);
                    i3Var.f15914d = "MraidMode.ConsoleError";
                    i3Var.f15915e = consoleMessage.message();
                    i3Var.a();
                }
            } catch (Throwable th) {
                i3.a(th);
            }
            return super.onConsoleMessage(consoleMessage);
        }
    }

    /* compiled from: Sta */
    public class c extends o5 {
        public c(e5 e5Var) {
            super(e5Var);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (h5.this.K == MraidState.LOADING) {
                j9.a(webView, true, "mraid.setPlacementType", "interstitial");
                h5 h5Var = h5.this;
                j5.a(h5Var.f15996b, webView, h5Var.M);
                h5.this.x();
                h5.this.j();
                h5 h5Var2 = h5.this;
                if (!h5Var2.Q) {
                    h5Var2.v();
                }
                h5 h5Var3 = h5.this;
                MraidState mraidState = MraidState.DEFAULT;
                h5Var3.K = mraidState;
                g5.a(mraidState, webView);
                j9.a(webView, true, "mraid.fireReadyEvent", new Object[0]);
                h5 h5Var4 = h5.this;
                if (h5Var4.R) {
                    h5Var4.L.fireViewableChangeEvent();
                }
                h5 h5Var5 = h5.this;
                Handler handler = h5Var5.S;
                if (handler != null) {
                    handler.post(new i5(h5Var5));
                }
                h5 h5Var6 = h5.this;
                h5Var6.a((View) h5Var6.f15725y);
                h5Var6.F = SystemClock.uptimeMillis();
            }
        }
    }

    /* compiled from: Sta */
    public class d extends t0 {
        public d(t0.a aVar) {
            super(aVar);
        }

        public void close() {
            h5 h5Var = h5.this;
            MraidState mraidState = MraidState.HIDDEN;
            h5Var.K = mraidState;
            g5.a(mraidState, h5Var.f15723w);
            h5.this.H.run();
        }

        public void fireViewableChangeEvent() {
            h5 h5Var = h5.this;
            j9.a(h5Var.f15723w, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(h5Var.R));
        }

        public boolean isFeatureSupported(String str) {
            return h5.this.M.f16036b.contains(str);
        }

        public void setOrientationProperties(Map<String, String> map) {
            boolean parseBoolean = Boolean.parseBoolean(map.get("allowOrientationChange"));
            String str = map.get("forceOrientation");
            l5 l5Var = h5.this.N;
            if (l5Var.f16095a != parseBoolean || l5Var.f16096b != l5.a(str)) {
                l5 l5Var2 = h5.this.N;
                l5Var2.f16095a = parseBoolean;
                l5Var2.f16096b = l5.a(str);
                h5 h5Var = h5.this;
                applyOrientationProperties(h5Var.f15996b, h5Var.N);
            }
        }

        public void useCustomClose(String str) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            h5 h5Var = h5.this;
            if (h5Var.Q != parseBoolean) {
                boolean unused = h5Var.Q = parseBoolean;
                if (parseBoolean) {
                    h5 h5Var2 = h5.this;
                    h5Var2.getClass();
                    try {
                        ImageButton imageButton = h5Var2.f15725y;
                        if (imageButton != null) {
                            imageButton.setVisibility(4);
                        }
                    } catch (Throwable th) {
                        i3.a(th);
                    }
                } else {
                    h5.this.v();
                }
            }
        }
    }

    public boolean b(String str) {
        return false;
    }

    public boolean c() {
        if (w()) {
            return super.c();
        }
        return true;
    }

    public void e() {
        this.R = false;
        if (this.K == MraidState.DEFAULT) {
            this.L.fireViewableChangeEvent();
        }
        super.e();
    }

    public void f() {
        super.f();
        if (this.S == null && p()) {
            this.S = new Handler();
        }
        this.R = true;
        if (this.K == MraidState.DEFAULT) {
            this.L.fireViewableChangeEvent();
        }
    }

    public void onClick(View view) {
        if (w()) {
            this.L.close();
        }
    }

    public boolean p() {
        return this.f16013s > 0;
    }

    public void u() {
        this.f15723w.setWebViewClient(new c(this.L));
        this.f15723w.setWebChromeClient(new b(this));
    }

    public final boolean w() {
        return (SystemClock.uptimeMillis() - this.f15726z) / 1000 >= ((long) this.f16013s);
    }

    public final void x() {
        Activity activity = this.f15996b;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            g5.b(activity, i10, i11, this.f15723w);
            g5.a(activity, i10, i11, this.f15723w);
            g5.a(activity, 0, 0, i10, i11, this.f15723w);
            g5.b(activity, 0, 0, i10, i11, this.f15723w);
        } catch (Throwable th) {
            i3.a(th);
        }
    }

    public void a(Bundle bundle) {
        super.a(bundle);
        if (this.M == null) {
            this.M = new k5(this.f15996b);
        }
        if (this.N == null) {
            this.N = new l5(true, 2);
        }
        if (this.L == null) {
            this.L = new d(new a());
        }
    }

    public void a(Configuration configuration) {
        x();
    }

    public boolean a(String str, boolean z10) {
        MraidState mraidState = MraidState.HIDDEN;
        this.K = mraidState;
        g5.a(mraidState, this.f15723w);
        try {
            return super.a(str, z10);
        } catch (Throwable th) {
            i3.a(th);
            return false;
        }
    }

    public void a(RelativeLayout relativeLayout) {
        if (p() && !this.f16014t) {
            int a10 = f9.a((Context) this.f15996b, 32);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a10, a10);
            layoutParams.addRule(13);
            ImageView imageView = new ImageView(this.f15996b);
            this.P = imageView;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(-16777216);
            gradientDrawable.setStroke(2, -1);
            int a11 = f9.a((Context) this.f15996b, 32);
            gradientDrawable.setSize(a11, a11);
            imageView.setImageDrawable(gradientDrawable);
            this.P.setScaleType(ImageView.ScaleType.FIT_CENTER);
            relativeLayout.addView(this.P, layoutParams);
            TextView textView = new TextView(this.f15996b);
            this.O = textView;
            textView.setTextColor(-1);
            this.O.setGravity(17);
            relativeLayout.addView(this.O, layoutParams);
        }
    }
}
