package com.startapp;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.mediation.MaxReward;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.inappbrowser.AnimatingProgressBar;
import com.startapp.sdk.inappbrowser.NavigationBarLayout;
import java.util.HashMap;

/* compiled from: Sta */
public class c3 extends k2 implements View.OnClickListener {
    public static boolean C = false;
    public FrameLayout A;
    public String B;

    /* renamed from: w  reason: collision with root package name */
    public RelativeLayout f15683w;

    /* renamed from: x  reason: collision with root package name */
    public NavigationBarLayout f15684x;

    /* renamed from: y  reason: collision with root package name */
    public WebView f15685y;

    /* renamed from: z  reason: collision with root package name */
    public AnimatingProgressBar f15686z;

    /* compiled from: Sta */
    public class a extends WebChromeClient {
        public a() {
        }

        public void onProgressChanged(WebView webView, int i10) {
            c3.this.f15686z.setProgress(i10);
        }

        public void onReceivedTitle(WebView webView, String str) {
            if (str != null && !str.equals(MaxReward.DEFAULT_LABEL)) {
                c3.this.f15684x.f17230f.setText(str);
            }
        }
    }

    /* compiled from: Sta */
    public static class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public Context f15688a;

        /* renamed from: b  reason: collision with root package name */
        public c3 f15689b;

        /* renamed from: c  reason: collision with root package name */
        public NavigationBarLayout f15690c;

        /* renamed from: d  reason: collision with root package name */
        public AnimatingProgressBar f15691d;

        /* renamed from: e  reason: collision with root package name */
        public int f15692e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f15693f = false;

        public b(Context context, NavigationBarLayout navigationBarLayout, AnimatingProgressBar animatingProgressBar, c3 c3Var) {
            this.f15688a = context;
            this.f15691d = animatingProgressBar;
            this.f15690c = navigationBarLayout;
            this.f15689b = c3Var;
        }

        public void onPageFinished(WebView webView, String str) {
            if (!c3.C) {
                this.f15690c.a(webView);
                int i10 = this.f15692e - 1;
                this.f15692e = i10;
                if (i10 == 0) {
                    this.f15693f = false;
                    this.f15691d.a();
                    if (this.f15691d.isShown()) {
                        this.f15691d.setVisibility(8);
                    }
                    this.f15690c.a(webView);
                }
                super.onPageFinished(webView, str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (!c3.C) {
                if (this.f15693f) {
                    this.f15692e = 1;
                    this.f15691d.a();
                    this.f15690c.a(webView);
                } else {
                    this.f15692e = Math.max(this.f15692e, 1);
                }
                this.f15691d.setVisibility(0);
                this.f15690c.f17231g.setText(str);
                this.f15690c.a(webView);
                super.onPageStarted(webView, str, bitmap);
            }
        }

        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            this.f15691d.a();
            super.onReceivedError(webView, i10, str, str2);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (webView != null && str != null && !j9.b(webView.getContext(), str) && !c3.C) {
                if (!this.f15693f) {
                    this.f15693f = true;
                    this.f15691d.a();
                    this.f15692e = 0;
                }
                this.f15692e++;
                if (com.startapp.sdk.adsbase.a.c(str) && !com.startapp.sdk.adsbase.a.b(str)) {
                    return false;
                }
                this.f15692e = 1;
                com.startapp.sdk.adsbase.a.b(this.f15688a, str, (String) null);
                c3 c3Var = this.f15689b;
                if (c3Var != null) {
                    c3Var.i();
                }
            }
            return true;
        }
    }

    public c3(String str) {
        this.B = str;
    }

    public void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        w4.a((Context) this.f15996b).a(this.f15998d, new IntentFilter("com.startapp.android.CloseAdActivity"));
        C = false;
        this.f15683w = new RelativeLayout(this.f15996b);
        String str = this.B;
        if (this.f15684x == null) {
            NavigationBarLayout navigationBarLayout = new NavigationBarLayout(this.f15996b);
            this.f15684x = navigationBarLayout;
            navigationBarLayout.setDescendantFocusability(262144);
            navigationBarLayout.setBackgroundColor(Color.parseColor("#e9e9e9"));
            navigationBarLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, f9.a(navigationBarLayout.getContext(), 60)));
            navigationBarLayout.setId(2101);
            HashMap hashMap = new HashMap();
            hashMap.put("BACK", new u5((Bitmap) null, 14, 22, "back_.png"));
            hashMap.put("BACK_DARK", new u5((Bitmap) null, 14, 22, "back_dark.png"));
            hashMap.put("FORWARD", new u5((Bitmap) null, 14, 22, "forward_.png"));
            hashMap.put("FORWARD_DARK", new u5((Bitmap) null, 14, 22, "forward_dark.png"));
            hashMap.put("X", new u5((Bitmap) null, 23, 23, "x_dark.png"));
            hashMap.put("BROWSER", new u5((Bitmap) null, 28, 28, "browser_icon_dark.png"));
            navigationBarLayout.f17233i = hashMap;
            NavigationBarLayout navigationBarLayout2 = this.f15684x;
            navigationBarLayout2.getClass();
            Typeface typeface = Typeface.DEFAULT;
            Typeface typeface2 = typeface;
            navigationBarLayout2.f17230f = f9.a(navigationBarLayout2.getContext(), navigationBarLayout2.f17230f, typeface2, 1, 16.46f, NavigationBarLayout.f17223j, 2102);
            navigationBarLayout2.f17231g = f9.a(navigationBarLayout2.getContext(), navigationBarLayout2.f17230f, typeface2, 1, 12.12f, NavigationBarLayout.f17224k, 2107);
            navigationBarLayout2.f17230f.setText("Loading...");
            RelativeLayout relativeLayout = new RelativeLayout(navigationBarLayout2.getContext());
            navigationBarLayout2.f17225a = relativeLayout;
            relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            navigationBarLayout2.f17225a.addView(navigationBarLayout2.f17230f, f9.a(navigationBarLayout2.getContext(), new int[]{0, 0, 0, 0}, new int[0]));
            RelativeLayout relativeLayout2 = navigationBarLayout2.f17225a;
            TextView textView = navigationBarLayout2.f17231g;
            RelativeLayout.LayoutParams a10 = f9.a(navigationBarLayout2.getContext(), new int[]{0, 0, 0, 0}, new int[0]);
            a10.addRule(3, 2102);
            relativeLayout2.addView(textView, a10);
            for (u5 next : navigationBarLayout2.f17233i.values()) {
                Bitmap a11 = a1.a(navigationBarLayout2.getContext(), next.f17369d);
                if (a11 != null) {
                    next.f17366a = Bitmap.createScaledBitmap(a11, f9.a(navigationBarLayout2.getContext(), next.f17367b), f9.a(navigationBarLayout2.getContext(), next.f17368c), true);
                }
            }
            navigationBarLayout2.f17226b = f9.a(navigationBarLayout2.getContext(), navigationBarLayout2.f17226b, navigationBarLayout2.f17233i.get("X").f17366a, 2103);
            navigationBarLayout2.f17228d = f9.a(navigationBarLayout2.getContext(), navigationBarLayout2.f17228d, navigationBarLayout2.f17233i.get("BROWSER").f17366a, 2104);
            navigationBarLayout2.f17229e = f9.a(navigationBarLayout2.getContext(), navigationBarLayout2.f17229e, navigationBarLayout2.f17233i.get("BACK").f17366a, 2105);
            navigationBarLayout2.f17227c = f9.a(navigationBarLayout2.getContext(), navigationBarLayout2.f17227c, navigationBarLayout2.f17233i.get("FORWARD").f17366a, 2106);
            int a12 = f9.a(navigationBarLayout2.getContext(), 10);
            navigationBarLayout2.f17227c.setPadding(a12, a12, a12, a12);
            navigationBarLayout2.f17227c.setEnabled(false);
            navigationBarLayout2.f17229e.setPadding(a12, a12, a12, a12);
            navigationBarLayout2.addView(navigationBarLayout2.f17226b, f9.a(navigationBarLayout2.getContext(), new int[]{0, 0, 16, 0}, new int[]{15, 11}));
            ImageView imageView = navigationBarLayout2.f17228d;
            RelativeLayout.LayoutParams a13 = f9.a(navigationBarLayout2.getContext(), new int[]{0, 0, 17, 0}, new int[]{15});
            a13.addRule(0, 2103);
            navigationBarLayout2.addView(imageView, a13);
            RelativeLayout relativeLayout3 = navigationBarLayout2.f17225a;
            RelativeLayout.LayoutParams a14 = f9.a(navigationBarLayout2.getContext(), new int[]{16, 6, 16, 0}, new int[]{9});
            a14.addRule(0, 2104);
            navigationBarLayout2.addView(relativeLayout3, a14);
            this.f15684x.setButtonsListener(this);
        }
        this.f15683w.addView(this.f15684x);
        this.f15686z = new AnimatingProgressBar(this.f15996b, (AttributeSet) null, 16842872);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#45d200"));
        this.f15686z.setProgressDrawable(new ClipDrawable(shapeDrawable, 3, 1));
        this.f15686z.setBackgroundColor(-1);
        this.f15686z.setId(2108);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, f9.a((Context) this.f15996b, 4));
        layoutParams.addRule(3, 2101);
        this.f15683w.addView(this.f15686z, layoutParams);
        this.A = new FrameLayout(this.f15996b);
        if (this.f15685y == null) {
            try {
                j();
                this.f15685y.loadUrl(str);
            } catch (Throwable th) {
                i3.a(th);
                this.f15684x.a();
                com.startapp.sdk.adsbase.a.b(this.f15996b, str, (String) null);
                this.f15996b.finish();
            }
        }
        this.A.addView(this.f15685y);
        this.A.setBackgroundColor(-1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        layoutParams2.addRule(3, 2108);
        this.f15683w.addView(this.A, layoutParams2);
        if (bundle2 != null) {
            this.f15685y.restoreState(bundle2);
        }
        this.f15996b.setContentView(this.f15683w, new RelativeLayout.LayoutParams(-2, -2));
    }

    public void b(Bundle bundle) {
        this.f15685y.saveState(bundle);
    }

    public void e() {
    }

    public void f() {
    }

    public void i() {
        try {
            C = true;
            this.f15685y.stopLoading();
            this.f15685y.removeAllViews();
            this.f15685y.postInvalidate();
            a0.a(this.f15685y);
            this.f15685y.destroy();
            this.f15685y = null;
        } catch (Exception unused) {
        }
        this.f15684x.a();
        this.f15996b.finish();
    }

    public final void j() {
        WebView b10 = ComponentLocator.a((Context) this.f15996b).x().b();
        this.f15685y = b10;
        b10.getSettings().setJavaScriptEnabled(true);
        this.f15685y.getSettings().setUseWideViewPort(true);
        this.f15685y.getSettings().setLoadWithOverviewMode(true);
        this.f15685y.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f15685y.getSettings().setBuiltInZoomControls(true);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f15685y.getSettings().setDisplayZoomControls(false);
        }
        this.f15685y.setWebViewClient(new b(this.f15996b, this.f15684x, this.f15686z, this));
        this.f15685y.setWebChromeClient(new a());
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case 2103:
                i();
                return;
            case 2104:
                WebView webView = this.f15685y;
                if (webView != null) {
                    com.startapp.sdk.adsbase.a.b(this.f15996b, webView.getUrl(), (String) null);
                    i();
                    return;
                }
                return;
            case 2105:
                WebView webView2 = this.f15685y;
                if (webView2 != null && webView2.canGoBack()) {
                    this.f15686z.a();
                    this.f15685y.goBack();
                    return;
                }
                return;
            case 2106:
                WebView webView3 = this.f15685y;
                if (webView3 != null && webView3.canGoForward()) {
                    this.f15686z.a();
                    this.f15685y.goForward();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public boolean a(int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return false;
        }
        WebView webView = this.f15685y;
        if (webView == null || !webView.canGoBack()) {
            i();
            return true;
        }
        this.f15686z.a();
        this.f15685y.goBack();
        return true;
    }
}
