package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzn {
    public static final zzm zza = new zzm((h) null);
    private final long zzb = System.currentTimeMillis();
    private final zzdk zzc = zzdk.zzb();

    public final long zza(TimeUnit timeUnit) {
        return this.zzc.zza(timeUnit);
    }

    public final long zzb() {
        return this.zzb;
    }
}
