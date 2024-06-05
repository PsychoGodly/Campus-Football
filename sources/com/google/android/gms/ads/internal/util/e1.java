package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbza;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class e1 {
    @Deprecated
    public static Object a(Context context, Callable callable) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            zzbza.zzh("Unexpected exception.", th);
            zzbsf.zza(context).zzf(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
