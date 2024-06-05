package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.ar;
import com.applovin.impl.e0;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.sdk.AppLovinSdk;

public class MaxAdView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private MaxAdViewImpl f13996a;

    /* renamed from: b  reason: collision with root package name */
    private View f13997b;

    /* renamed from: c  reason: collision with root package name */
    private int f13998c;

    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    private void a(String str, MaxAdFormat maxAdFormat, int i10, AppLovinSdk appLovinSdk, Context context) {
        View view = new View(context.getApplicationContext());
        this.f13997b = view;
        view.setBackgroundColor(0);
        addView(this.f13997b);
        this.f13997b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f13998c = getVisibility();
        this.f13996a = new MaxAdViewImpl(str.trim(), maxAdFormat, this, this.f13997b, appLovinSdk.a(), context);
        setGravity(i10);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f13996a.logApiCall("destroy()");
        this.f13996a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f13996a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f13996a.getAdUnitId();
    }

    public String getPlacement() {
        this.f13996a.logApiCall("getPlacement()");
        return this.f13996a.getPlacement();
    }

    public void loadAd() {
        this.f13996a.logApiCall("loadAd()");
        this.f13996a.loadAd();
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (!isInEditMode()) {
            MaxAdViewImpl maxAdViewImpl = this.f13996a;
            maxAdViewImpl.logApiCall("onWindowVisibilityChanged(visibility=" + i10 + ")");
            if (this.f13996a != null && ar.a(this.f13998c, i10)) {
                this.f13996a.onWindowVisibilityChanged(i10);
            }
            this.f13998c = i10;
        }
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxAdViewImpl maxAdViewImpl = this.f13996a;
        maxAdViewImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f13996a.setAdReviewListener(maxAdReviewListener);
    }

    public void setAlpha(float f10) {
        MaxAdViewImpl maxAdViewImpl = this.f13996a;
        maxAdViewImpl.logApiCall("setAlpha(alpha=" + f10 + ")");
        View view = this.f13997b;
        if (view != null) {
            view.setAlpha(f10);
        }
    }

    public void setBackgroundColor(int i10) {
        MaxAdViewImpl maxAdViewImpl = this.f13996a;
        maxAdViewImpl.logApiCall("setBackgroundColor(color=" + i10 + ")");
        MaxAdViewImpl maxAdViewImpl2 = this.f13996a;
        if (maxAdViewImpl2 != null) {
            maxAdViewImpl2.setPublisherBackgroundColor(i10);
        }
        View view = this.f13997b;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setCustomData(String str) {
        MaxAdViewImpl maxAdViewImpl = this.f13996a;
        maxAdViewImpl.logApiCall("setCustomData(value=" + str + ")");
        this.f13996a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        MaxAdViewImpl maxAdViewImpl = this.f13996a;
        maxAdViewImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f13996a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        MaxAdViewImpl maxAdViewImpl = this.f13996a;
        maxAdViewImpl.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f13996a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxAdViewImpl maxAdViewImpl = this.f13996a;
        maxAdViewImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f13996a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        MaxAdViewImpl maxAdViewImpl = this.f13996a;
        maxAdViewImpl.logApiCall("setPlacement(placement=" + str + ")");
        this.f13996a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        MaxAdViewImpl maxAdViewImpl = this.f13996a;
        maxAdViewImpl.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f13996a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxAdViewImpl maxAdViewImpl = this.f13996a;
        maxAdViewImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f13996a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f13996a.logApiCall("startAutoRefresh()");
        this.f13996a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f13996a.logApiCall("stopAutoRefresh()");
        this.f13996a.stopAutoRefresh();
    }

    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f13996a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }

    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, e0.a(context), appLovinSdk, context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context.getApplicationContext());
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", sdk=" + appLovinSdk + ")");
        a(str, maxAdFormat, 49, appLovinSdk, context);
    }

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        MaxAdFormat maxAdFormat;
        String a10 = e0.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String a11 = e0.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        if (StringUtils.isValidString(a11)) {
            maxAdFormat = MaxAdFormat.formatFromString(a11);
        } else {
            maxAdFormat = e0.a(context);
        }
        MaxAdFormat maxAdFormat2 = maxAdFormat;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (a10 == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        } else if (TextUtils.isEmpty(a10)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        } else if (isInEditMode()) {
            a(context);
        } else {
            a(a10, maxAdFormat2, attributeIntValue, AppLovinSdk.getInstance(context), context);
        }
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i10, i11);
    }
}
