package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final /* synthetic */ class zzcr implements ThreadFactory {
    public final /* synthetic */ zzcs zza;
    public final /* synthetic */ String zzb = "Google consent worker";

    public /* synthetic */ zzcr(zzcs zzcs, String str) {
        this.zza = zzcs;
    }

    public final Thread newThread(Runnable runnable) {
        return this.zza.zza(this.zzb, runnable);
    }
}
