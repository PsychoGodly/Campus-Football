package com.applovin.mediation.hybridAds;

import android.os.Bundle;
import android.view.View;
import com.applovin.impl.sdk.k;
import com.applovin.impl.wc;
import com.applovin.impl.xc;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;

public class MaxHybridMRecAdActivity extends wc {

    /* renamed from: f  reason: collision with root package name */
    private View f14008f;

    public void a(xc xcVar, View view, k kVar, MaxAdapterListener maxAdapterListener) {
        super.a(xcVar, kVar, maxAdapterListener);
        this.f14008f = view;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(this.f14008f, "MaxHybridMRecAdActivity");
    }
}
