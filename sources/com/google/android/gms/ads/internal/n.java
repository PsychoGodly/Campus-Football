package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class n implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s f14693a;

    n(s sVar) {
        this.f14693a = sVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        s sVar = this.f14693a;
        if (sVar.f14736i == null) {
            return false;
        }
        sVar.f14736i.zzd(motionEvent);
        return false;
    }
}
