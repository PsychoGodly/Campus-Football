package com.ryanheise.audioservice;

import android.util.Log;
import lc.k;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.d f15587a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Exception f15588b;

    public /* synthetic */ g(k.d dVar, Exception exc) {
        this.f15587a = dVar;
        this.f15588b = exc;
    }

    public final void run() {
        this.f15587a.error("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(this.f15588b));
    }
}
