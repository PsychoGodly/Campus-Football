package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzm  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
final /* synthetic */ class zzm implements p {
    private final zzn zza;

    zzm(zzn zzn) {
        this.zza = zzn;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzj) ((zzv) obj).getService()).zza((g) new zzq(this.zza, (TaskCompletionSource) obj2));
    }
}
