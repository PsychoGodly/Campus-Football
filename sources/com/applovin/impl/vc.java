package com.applovin.impl;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.impl.adview.i;
import com.applovin.sdk.AppLovinSdkUtils;

public class vc extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private a f12721a;

    interface a {
        void a(vc vcVar);
    }

    public vc(xc xcVar, Context context) {
        super(context);
        setOnClickListener(this);
        i iVar = new i(context);
        int dpToPx = AppLovinSdkUtils.dpToPx(context, xcVar.e());
        iVar.setLayoutParams(new FrameLayout.LayoutParams(dpToPx, dpToPx, 17));
        iVar.a(dpToPx);
        addView(iVar);
        int dpToPx2 = AppLovinSdkUtils.dpToPx(context, xcVar.e() + (xcVar.c() * 2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx2, dpToPx2, 8388661);
        int dpToPx3 = AppLovinSdkUtils.dpToPx(context, xcVar.f());
        int dpToPx4 = AppLovinSdkUtils.dpToPx(context, xcVar.d());
        layoutParams.setMargins(dpToPx4, dpToPx3, dpToPx4, 0);
        setLayoutParams(layoutParams);
    }

    public void onClick(View view) {
        this.f12721a.a(this);
    }

    public void setListener(a aVar) {
        this.f12721a = aVar;
    }
}
