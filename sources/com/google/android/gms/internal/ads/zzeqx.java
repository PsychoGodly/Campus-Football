package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzeqx implements Callable {
    public final /* synthetic */ zzeqy zza;

    public /* synthetic */ zzeqx(zzeqy zzeqy) {
        this.zza = zzeqy;
    }

    public final Object call() {
        return new zzeqz(new JSONObject());
    }
}
