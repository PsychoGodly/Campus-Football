package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.sdk.k;
import com.applovin.impl.vc;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import org.json.JSONObject;

public abstract class wc extends Activity implements vc.a {

    /* renamed from: a  reason: collision with root package name */
    protected k f13056a;

    /* renamed from: b  reason: collision with root package name */
    protected vc f13057b;

    /* renamed from: c  reason: collision with root package name */
    protected xc f13058c = new xc((JSONObject) null);

    /* renamed from: d  reason: collision with root package name */
    private MaxAdapterListener f13059d;

    /* access modifiers changed from: protected */
    public void a(View view, String str) {
        if (view == null) {
            a(str);
            return;
        }
        ((ViewGroup) findViewById(16908290)).addView(view);
        this.f13057b.bringToFront();
        MaxAdapterListener maxAdapterListener = this.f13059d;
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayed();
        } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
            ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayed();
        } else {
            throw new IllegalStateException("Failed to fire display callback (" + this.f13059d + "): neither interstitial nor app open ad");
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z10 = true;
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        viewGroup.setBackgroundColor(this.f13058c.a());
        k kVar = this.f13056a;
        if (kVar != null) {
            z10 = ((Boolean) kVar.a(oj.I2)).booleanValue();
        }
        r.a(z10, (Activity) this);
        vc vcVar = new vc(this.f13058c, this);
        this.f13057b = vcVar;
        vcVar.setListener(this);
        this.f13057b.setVisibility(4);
        viewGroup.addView(this.f13057b);
        ar.a((View) this.f13057b, this.f13058c.b());
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        MaxAdapterListener maxAdapterListener = this.f13059d;
        if (maxAdapterListener != null) {
            if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
                ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdHidden();
            } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdHidden();
            } else {
                throw new IllegalStateException("Failed to fire hidden callback (" + this.f13059d + "): neither interstitial nor app open ad");
            }
        }
        super.onDestroy();
    }

    private void a(String str) {
        MaxAdapterError maxAdapterError = new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Null hybrid ad view (" + str + ")");
        MaxAdapterListener maxAdapterListener = this.f13059d;
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(maxAdapterError);
        } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
            ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(maxAdapterError);
        } else {
            throw new IllegalStateException("Failed to fire display failed callback (" + this.f13059d + "): neither interstitial nor app open ad");
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void a(xc xcVar, k kVar, MaxAdapterListener maxAdapterListener) {
        this.f13056a = kVar;
        this.f13058c = xcVar;
        this.f13059d = maxAdapterListener;
    }

    public void a(vc vcVar) {
        if (!isFinishing()) {
            finish();
        }
    }
}
