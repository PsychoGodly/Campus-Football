package com.startapp;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.c;

/* compiled from: Sta */
public class c4 implements AdEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f15694a;

    public c4(c cVar) {
        this.f15694a = cVar;
    }

    public void onFailedToReceiveAd(Ad ad2) {
    }

    public void onReceiveAd(Ad ad2) {
        if (this.f15694a.f16920e.showAd()) {
            c cVar = this.f15694a;
            cVar.getClass();
            cVar.f16918c = System.currentTimeMillis();
            cVar.f16919d = 0;
        }
    }
}
