package com.applovin.adview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.impl.adview.a;
import com.applovin.impl.sdk.t;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinAdView extends RelativeLayout {
    public static final String NAMESPACE = "http://schemas.applovin.com/android/1.0";

    /* renamed from: a  reason: collision with root package name */
    private a f5993a;

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinAdSize, (String) null, context);
    }

    private void a(AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, Context context, AttributeSet attributeSet) {
        if (!isInEditMode()) {
            a aVar = new a();
            this.f5993a = aVar;
            aVar.a(this, context, appLovinAdSize, str, appLovinSdk, attributeSet);
            return;
        }
        a(attributeSet, context);
    }

    public void destroy() {
        a aVar = this.f5993a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public a getController() {
        return this.f5993a;
    }

    public AppLovinAdSize getSize() {
        a aVar = this.f5993a;
        if (aVar != null) {
            return aVar.m();
        }
        return null;
    }

    public String getZoneId() {
        a aVar = this.f5993a;
        if (aVar != null) {
            return aVar.n();
        }
        return null;
    }

    public void loadNextAd() {
        a aVar = this.f5993a;
        if (aVar != null) {
            aVar.v();
        } else {
            t.i("AppLovinSdk", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f5993a;
        if (aVar != null) {
            aVar.A();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        a aVar = this.f5993a;
        if (aVar != null) {
            aVar.B();
        }
        super.onDetachedFromWindow();
    }

    public void pause() {
        a aVar = this.f5993a;
        if (aVar != null) {
            aVar.E();
        }
    }

    public void renderAd(AppLovinAd appLovinAd) {
        a aVar = this.f5993a;
        if (aVar != null) {
            aVar.c(appLovinAd);
        }
    }

    public void resume() {
        a aVar = this.f5993a;
        if (aVar != null) {
            aVar.G();
        }
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        a aVar = this.f5993a;
        if (aVar != null) {
            aVar.a(appLovinAdClickListener);
        }
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        a aVar = this.f5993a;
        if (aVar != null) {
            aVar.a(appLovinAdDisplayListener);
        }
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        a aVar = this.f5993a;
        if (aVar != null) {
            aVar.a(appLovinAdLoadListener);
        }
    }

    public void setAdViewEventListener(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        a aVar = this.f5993a;
        if (aVar != null) {
            aVar.a(appLovinAdViewEventListener);
        }
    }

    public void setExtraInfo(String str, Object obj) {
        if (str != null) {
            a aVar = this.f5993a;
            if (aVar != null) {
                aVar.a(str, obj);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public String toString() {
        return "AppLovinAdView{zoneId='" + getZoneId() + "\", size=" + getSize() + '}';
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context);
        a(appLovinAdSize, str, (AppLovinSdk) null, context, (AttributeSet) null);
    }

    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinSdk, appLovinAdSize, (String) null, context);
    }

    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context.getApplicationContext());
        a(appLovinAdSize, str, appLovinSdk, context, (AttributeSet) null);
    }

    private void a(AttributeSet attributeSet, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin Ad");
        textView.setGravity(17);
        addView(textView, displayMetrics.widthPixels, (int) TypedValue.applyDimension(1, 50.0f, displayMetrics));
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a((AppLovinAdSize) null, (String) null, (AppLovinSdk) null, context, attributeSet);
    }
}
