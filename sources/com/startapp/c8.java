package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.StartAppSDKInternal;

/* compiled from: Sta */
public class c8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f15702a;

    public c8(Context context) {
        this.f15702a = context;
    }

    public void run() {
        synchronized (StartAppSDKInternal.D) {
            StartAppSDKInternal.a(this.f15702a);
        }
    }
}
