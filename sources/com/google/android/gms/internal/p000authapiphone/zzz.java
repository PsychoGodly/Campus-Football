package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzz  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
final class zzz extends zzk {
    private final /* synthetic */ TaskCompletionSource zza;

    zzz(zzu zzu, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zza(Status status) {
        t.a(status, this.zza);
    }
}
