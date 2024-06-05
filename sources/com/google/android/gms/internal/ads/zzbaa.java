package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzbaa implements Callable {
    public static final /* synthetic */ zzbaa zza = new zzbaa();

    private /* synthetic */ zzbaa() {
    }

    public final Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
