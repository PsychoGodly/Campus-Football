package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;

/* compiled from: Sta */
public class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f15906a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Ad f15907b;

    public i(AdDisplayListener adDisplayListener, Ad ad2, Context context) {
        this.f15906a = adDisplayListener;
        this.f15907b = ad2;
    }

    public void run() {
        try {
            this.f15906a.adClicked(this.f15907b);
        } catch (Throwable th) {
            j9.a((Object) this.f15906a, th);
        }
    }
}
