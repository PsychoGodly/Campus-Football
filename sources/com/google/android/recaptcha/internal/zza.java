package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import fe.l;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.n;
import pe.x0;
import sd.w;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zza extends n implements l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ x0 zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zza(TaskCompletionSource taskCompletionSource, x0 x0Var) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = x0Var;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable B = this.zzb.B();
            if (B == null) {
                this.zza.setResult(this.zzb.n());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception exc = B instanceof Exception ? (Exception) B : null;
                if (exc == null) {
                    exc = new RuntimeExecutionException(B);
                }
                taskCompletionSource.setException(exc);
            }
        }
        return w.f38141a;
    }
}
