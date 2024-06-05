package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* compiled from: Sta */
public class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f15828a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Ad f15829b;

    public g(AdDisplayListener adDisplayListener, Ad ad2, Context context) {
        this.f15828a = adDisplayListener;
        this.f15829b = ad2;
    }

    public void run() {
        try {
            this.f15828a.adHidden(this.f15829b);
        } catch (Throwable th) {
            j9.a((Object) this.f15828a, th);
        }
    }
}
