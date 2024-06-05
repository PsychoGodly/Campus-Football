package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.internal.ads.zzfkr;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class o1 extends zzfkr {
    public o1(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e10) {
            t.q().zzu(e10, "AdMobHandler.handleMessage");
        }
    }

    /* access modifiers changed from: protected */
    public final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th) {
            t.r();
            b2.i(t.q().zzc(), th);
            throw th;
        }
    }
}
