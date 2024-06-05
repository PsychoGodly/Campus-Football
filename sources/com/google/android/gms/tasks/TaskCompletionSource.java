package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public class TaskCompletionSource<TResult> {
    /* access modifiers changed from: private */
    public final zzw zza = new zzw();

    public TaskCompletionSource() {
    }

    public TaskCompletionSource(CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new zzs(this));
    }

    public Task<TResult> getTask() {
        return this.zza;
    }

    public void setException(Exception exc) {
        this.zza.zza(exc);
    }

    public void setResult(TResult tresult) {
        this.zza.zzb(tresult);
    }

    public boolean trySetException(Exception exc) {
        return this.zza.zzd(exc);
    }

    public boolean trySetResult(TResult tresult) {
        return this.zza.zze(tresult);
    }
}
