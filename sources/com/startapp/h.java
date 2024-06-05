package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* compiled from: Sta */
public class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f15880a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Ad f15881b;

    public h(AdDisplayListener adDisplayListener, Ad ad2, Context context) {
        this.f15880a = adDisplayListener;
        this.f15881b = ad2;
    }

    public void run() {
        try {
            this.f15880a.adDisplayed(this.f15881b);
        } catch (Throwable th) {
            j9.a((Object) this.f15880a, th);
        }
    }
}
