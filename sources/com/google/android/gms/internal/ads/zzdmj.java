package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdmj implements View.OnTouchListener {
    public final /* synthetic */ zzdmp zza;

    public /* synthetic */ zzdmj(zzdmp zzdmp) {
        this.zza = zzdmp;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.zza.zzh(view, motionEvent);
        return false;
    }
}
