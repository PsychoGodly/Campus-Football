package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzs  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
final class zzs extends zzg {
    private final /* synthetic */ TaskCompletionSource zza;

    zzs(zzn zzn, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zza(Status status, boolean z10) {
        t.b(status, Boolean.valueOf(z10), this.zza);
    }
}
