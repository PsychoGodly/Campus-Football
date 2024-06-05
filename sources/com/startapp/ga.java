package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;

/* compiled from: Sta */
public class ga extends j4 {

    /* renamed from: h  reason: collision with root package name */
    public Runnable f15866h = null;

    /* renamed from: i  reason: collision with root package name */
    public Runnable f15867i = null;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f15868j = null;

    public ga(Context context, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4, Runnable runnable5, TrackingParams trackingParams, boolean z10) {
        super(context, runnable, runnable2, trackingParams);
        this.f15866h = runnable3;
        this.f15867i = runnable4;
        this.f15868j = runnable5;
        this.f15968b = z10;
    }

    @JavascriptInterface
    public void replayVideo() {
        if (this.f15866h != null) {
            new Handler(Looper.getMainLooper()).post(this.f15866h);
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        if (this.f15867i != null) {
            new Handler(Looper.getMainLooper()).post(this.f15867i);
        }
    }

    @JavascriptInterface
    public void toggleSound() {
        if (this.f15868j != null) {
            new Handler(Looper.getMainLooper()).post(this.f15868j);
        }
    }
}
