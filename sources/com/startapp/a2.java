package com.startapp;

import android.content.Context;
import com.startapp.j9;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* compiled from: Sta */
public class a2 implements j9.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f15598a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AdEventListener f15599b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ InterstitialAd f15600c;

    public a2(Context context, AdEventListener adEventListener, InterstitialAd interstitialAd) {
        this.f15598a = context;
        this.f15599b = adEventListener;
        this.f15600c = interstitialAd;
    }

    public void a(boolean z10, long j10, long j11, boolean z11) {
        k.b(this.f15598a, this.f15599b, this.f15600c, true);
    }

    public void a(int i10, String str) {
        k.b(this.f15598a, this.f15599b, this.f15600c, true);
    }
}
