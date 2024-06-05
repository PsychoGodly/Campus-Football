package com.applovin.impl.adview;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.e;
import com.applovin.impl.oj;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.sdk.AppLovinSdkUtils;

class f extends Dialog implements r6 {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f6462a;

    /* renamed from: b  reason: collision with root package name */
    private final k f6463b;

    /* renamed from: c  reason: collision with root package name */
    private final t f6464c;

    /* renamed from: d  reason: collision with root package name */
    private final b f6465d;

    /* renamed from: f  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f6466f;

    /* renamed from: g  reason: collision with root package name */
    private RelativeLayout f6467g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public e f6468h;

    class a implements Animation.AnimationListener {
        a() {
        }

        public void onAnimationEnd(Animation animation) {
            f.this.f6468h.setClickable(true);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    f(com.applovin.impl.sdk.ad.a aVar, b bVar, Activity activity, k kVar) {
        super(activity, 16973840);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (bVar == null) {
            throw new IllegalArgumentException("No main view specified");
        } else if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (activity != null) {
            this.f6463b = kVar;
            this.f6464c = kVar.L();
            this.f6462a = activity;
            this.f6465d = bVar;
            this.f6466f = aVar;
            requestWindowFeature(1);
            setCancelable(false);
        } else {
            throw new IllegalArgumentException("No activity specified");
        }
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f6465d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f6462a);
        this.f6467g = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f6467g.setBackgroundColor(-1157627904);
        this.f6467g.addView(this.f6465d);
        if (!this.f6466f.k1()) {
            a(this.f6466f.d1());
            g();
        }
        setContentView(this.f6467g);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f6467g.removeView(this.f6465d);
        super.dismiss();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        try {
            if (this.f6468h == null) {
                a();
            }
            this.f6468h.setVisibility(0);
            this.f6468h.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            alphaAnimation.setAnimationListener(new a());
            this.f6468h.startAnimation(alphaAnimation);
        } catch (Throwable th) {
            if (t.a()) {
                this.f6464c.a("ExpandedAdDialog", "Unable to fade in close button", th);
            }
            a();
        }
    }

    private void g() {
        this.f6462a.runOnUiThread(new g0(this));
    }

    public b c() {
        return this.f6465d;
    }

    public void dismiss() {
        this.f6462a.runOnUiThread(new h0(this));
    }

    public void onBackPressed() {
        this.f6465d.a("javascript:al_onBackPressed();");
        dismiss();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f6462a.getWindow().getAttributes().flags, this.f6462a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (t.a()) {
                this.f6464c.b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (t.a()) {
                this.f6464c.a("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }

    private void a() {
        this.f6465d.a("javascript:al_onCloseTapped();");
        dismiss();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.f6468h.isClickable()) {
            this.f6468h.performClick();
        }
    }

    private void a(e.a aVar) {
        if (this.f6468h == null) {
            e a10 = e.a(aVar, this.f6462a);
            this.f6468h = a10;
            a10.setVisibility(8);
            this.f6468h.setOnClickListener(new f0(this));
            this.f6468h.setClickable(false);
            int a11 = a(((Integer) this.f6463b.a(oj.T1)).intValue());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a11, a11);
            layoutParams.addRule(10);
            k kVar = this.f6463b;
            oj ojVar = oj.W1;
            int i10 = 9;
            layoutParams.addRule(((Boolean) kVar.a(ojVar)).booleanValue() ? 9 : 11);
            this.f6468h.a(a11);
            int a12 = a(((Integer) this.f6463b.a(oj.V1)).intValue());
            int a13 = a(((Integer) this.f6463b.a(oj.U1)).intValue());
            layoutParams.setMargins(a13, a12, a13, 0);
            this.f6467g.addView(this.f6468h, layoutParams);
            this.f6468h.bringToFront();
            int a14 = a(((Integer) this.f6463b.a(oj.X1)).intValue());
            View view = new View(this.f6462a);
            view.setBackgroundColor(0);
            int i11 = a11 + a14;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i11, i11);
            layoutParams2.addRule(10);
            if (!((Boolean) this.f6463b.a(ojVar)).booleanValue()) {
                i10 = 11;
            }
            layoutParams2.addRule(i10);
            layoutParams2.setMargins(a13 - a(5), a12 - a(5), a13 - a(5), 0);
            view.setOnClickListener(new e0(this));
            this.f6467g.addView(view, layoutParams2);
            view.bringToFront();
        } else if (t.a()) {
            this.f6464c.k("ExpandedAdDialog", "Attempting to create duplicate close button");
        }
    }

    public com.applovin.impl.sdk.ad.a b() {
        return this.f6466f;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a();
    }

    private int a(int i10) {
        return AppLovinSdkUtils.dpToPx(this.f6462a, i10);
    }
}
