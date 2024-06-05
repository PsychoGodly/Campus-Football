package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdvj implements zzftq {
    public static final /* synthetic */ zzdvj zza = new zzdvj();

    private /* synthetic */ zzdvj() {
    }

    public final zzfut zza(Object obj) {
        ExecutionException executionException = (ExecutionException) obj;
        Throwable cause = executionException.getCause();
        Throwable th = executionException;
        if (cause != null) {
            th = executionException.getCause();
        }
        return zzfuj.zzg(th);
    }
}
