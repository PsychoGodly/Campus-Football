package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdw implements Handler.Callback {
    public final /* synthetic */ zzeb zza;

    public /* synthetic */ zzdw(zzeb zzeb) {
        this.zza = zzeb;
    }

    public final boolean handleMessage(Message message) {
        zzeb.zzg(this.zza, message);
        return true;
    }
}
