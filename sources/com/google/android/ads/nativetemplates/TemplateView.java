package com.google.android.ads.nativetemplates;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.nativead.b;
import io.flutter.plugins.googlemobileads.k0;
import io.flutter.plugins.googlemobileads.l0;
import io.flutter.plugins.googlemobileads.m0;
import y1.a;

public final class TemplateView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f14164a;

    /* renamed from: b  reason: collision with root package name */
    private a f14165b;

    /* renamed from: c  reason: collision with root package name */
    private b f14166c;

    /* renamed from: d  reason: collision with root package name */
    private NativeAdView f14167d;

    /* renamed from: f  reason: collision with root package name */
    private TextView f14168f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f14169g;

    /* renamed from: h  reason: collision with root package name */
    private RatingBar f14170h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f14171i;

    /* renamed from: j  reason: collision with root package name */
    private ImageView f14172j;

    /* renamed from: k  reason: collision with root package name */
    private MediaView f14173k;

    /* renamed from: l  reason: collision with root package name */
    private Button f14174l;

    /* renamed from: m  reason: collision with root package name */
    private ConstraintLayout f14175m;

    public TemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet);
    }

    private boolean a(b bVar) {
        return !TextUtils.isEmpty(bVar.getStore()) && TextUtils.isEmpty(bVar.getAdvertiser());
    }

    private void b() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        Button button;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        Button button2;
        Button button3;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        Button button4;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        ColorDrawable v10 = this.f14165b.v();
        if (v10 != null) {
            this.f14175m.setBackground(v10);
            TextView textView13 = this.f14168f;
            if (textView13 != null) {
                textView13.setBackground(v10);
            }
            TextView textView14 = this.f14169g;
            if (textView14 != null) {
                textView14.setBackground(v10);
            }
            TextView textView15 = this.f14171i;
            if (textView15 != null) {
                textView15.setBackground(v10);
            }
        }
        Typeface y10 = this.f14165b.y();
        if (!(y10 == null || (textView12 = this.f14168f) == null)) {
            textView12.setTypeface(y10);
        }
        Typeface C = this.f14165b.C();
        if (!(C == null || (textView11 = this.f14169g) == null)) {
            textView11.setTypeface(C);
        }
        Typeface G = this.f14165b.G();
        if (!(G == null || (textView10 = this.f14171i) == null)) {
            textView10.setTypeface(G);
        }
        Typeface t10 = this.f14165b.t();
        if (!(t10 == null || (button4 = this.f14174l) == null)) {
            button4.setTypeface(t10);
        }
        if (!(this.f14165b.z() == null || (textView9 = this.f14168f) == null)) {
            textView9.setTextColor(this.f14165b.z().intValue());
        }
        if (!(this.f14165b.D() == null || (textView8 = this.f14169g) == null)) {
            textView8.setTextColor(this.f14165b.D().intValue());
        }
        if (!(this.f14165b.H() == null || (textView7 = this.f14171i) == null)) {
            textView7.setTextColor(this.f14165b.H().intValue());
        }
        if (!(this.f14165b.u() == null || (button3 = this.f14174l) == null)) {
            button3.setTextColor(this.f14165b.u().intValue());
        }
        float s10 = this.f14165b.s();
        if (s10 > 0.0f && (button2 = this.f14174l) != null) {
            button2.setTextSize(s10);
        }
        float x10 = this.f14165b.x();
        if (x10 > 0.0f && (textView6 = this.f14168f) != null) {
            textView6.setTextSize(x10);
        }
        float B = this.f14165b.B();
        if (B > 0.0f && (textView5 = this.f14169g) != null) {
            textView5.setTextSize(B);
        }
        float F = this.f14165b.F();
        if (F > 0.0f && (textView4 = this.f14171i) != null) {
            textView4.setTextSize(F);
        }
        ColorDrawable r10 = this.f14165b.r();
        if (!(r10 == null || (button = this.f14174l) == null)) {
            button.setBackground(r10);
        }
        ColorDrawable w10 = this.f14165b.w();
        if (!(w10 == null || (textView3 = this.f14168f) == null)) {
            textView3.setBackground(w10);
        }
        ColorDrawable A = this.f14165b.A();
        if (!(A == null || (textView2 = this.f14169g) == null)) {
            textView2.setBackground(A);
        }
        ColorDrawable E = this.f14165b.E();
        if (!(E == null || (textView = this.f14171i) == null)) {
            textView.setBackground(E);
        }
        invalidate();
        requestLayout();
    }

    /* JADX INFO: finally extract failed */
    private void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, m0.f34102z0, 0, 0);
        try {
            this.f14164a = obtainStyledAttributes.getResourceId(m0.A0, l0.gnt_medium_template_view);
            obtainStyledAttributes.recycle();
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.f14164a, this);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void c() {
        this.f14166c.destroy();
    }

    public NativeAdView getNativeAdView() {
        return this.f14167d;
    }

    public String getTemplateTypeName() {
        int i10 = this.f14164a;
        if (i10 == l0.gnt_medium_template_view) {
            return "medium_template";
        }
        return i10 == l0.gnt_small_template_view ? "small_template" : MaxReward.DEFAULT_LABEL;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f14167d = (NativeAdView) findViewById(k0.native_ad_view);
        this.f14168f = (TextView) findViewById(k0.primary);
        this.f14169g = (TextView) findViewById(k0.secondary);
        this.f14171i = (TextView) findViewById(k0.body);
        RatingBar ratingBar = (RatingBar) findViewById(k0.rating_bar);
        this.f14170h = ratingBar;
        ratingBar.setEnabled(false);
        this.f14174l = (Button) findViewById(k0.cta);
        this.f14172j = (ImageView) findViewById(k0.f34026d);
        this.f14173k = (MediaView) findViewById(k0.media_view);
        this.f14175m = (ConstraintLayout) findViewById(k0.background);
    }

    public void setNativeAd(b bVar) {
        this.f14166c = bVar;
        String store = bVar.getStore();
        String advertiser = bVar.getAdvertiser();
        String headline = bVar.getHeadline();
        String body = bVar.getBody();
        String callToAction = bVar.getCallToAction();
        Double starRating = bVar.getStarRating();
        b.C0153b icon = bVar.getIcon();
        this.f14167d.setCallToActionView(this.f14174l);
        this.f14167d.setHeadlineView(this.f14168f);
        this.f14167d.setMediaView(this.f14173k);
        this.f14169g.setVisibility(0);
        if (a(bVar)) {
            this.f14167d.setStoreView(this.f14169g);
        } else if (!TextUtils.isEmpty(advertiser)) {
            this.f14167d.setAdvertiserView(this.f14169g);
            store = advertiser;
        } else {
            store = MaxReward.DEFAULT_LABEL;
        }
        this.f14168f.setText(headline);
        this.f14174l.setText(callToAction);
        if (starRating == null || starRating.doubleValue() <= 0.0d) {
            this.f14169g.setText(store);
            this.f14169g.setVisibility(0);
            this.f14170h.setVisibility(8);
        } else {
            this.f14169g.setVisibility(8);
            this.f14170h.setVisibility(0);
            this.f14170h.setRating(starRating.floatValue());
            this.f14167d.setStarRatingView(this.f14170h);
        }
        if (icon != null) {
            this.f14172j.setVisibility(0);
            this.f14172j.setImageDrawable(icon.getDrawable());
        } else {
            this.f14172j.setVisibility(8);
        }
        TextView textView = this.f14171i;
        if (textView != null) {
            textView.setText(body);
            this.f14167d.setBodyView(this.f14171i);
        }
        this.f14167d.setNativeAd(bVar);
    }

    public void setStyles(a aVar) {
        this.f14165b = aVar;
        b();
    }
}
