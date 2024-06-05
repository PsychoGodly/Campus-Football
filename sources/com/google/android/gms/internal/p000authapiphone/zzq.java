package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzq  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
final class zzq extends g.a {
    private final /* synthetic */ TaskCompletionSource zza;

    zzq(zzn zzn, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onResult(Status status) {
        if (status.w() == 6) {
            this.zza.trySetException(b.a(status));
        } else {
            t.a(status, this.zza);
        }
    }
}
