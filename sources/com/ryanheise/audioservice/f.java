package com.ryanheise.audioservice;

import android.util.Log;
import lc.k;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.d f15585a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Exception f15586b;

    public /* synthetic */ f(k.d dVar, Exception exc) {
        this.f15585a = dVar;
        this.f15586b = exc;
    }

    public final void run() {
        this.f15585a.error("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(this.f15586b));
    }
}
