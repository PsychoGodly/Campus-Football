package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbyp {
    public static final ThreadPoolExecutor zza = new ThreadPoolExecutor(2, a.e.API_PRIORITY_OTHER, 10, TimeUnit.SECONDS, new SynchronousQueue(), new zzbyo("ClientDefault"));
    public static final ExecutorService zzb = Executors.newSingleThreadExecutor(new zzbyo("ClientSingle"));
}
