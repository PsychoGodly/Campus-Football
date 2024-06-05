package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzfho implements Continuation {
    public final /* synthetic */ zzamh zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzfho(zzamh zzamh, int i10) {
        this.zza = zzamh;
        this.zzb = i10;
    }

    public final Object then(Task task) {
        zzamh zzamh = this.zza;
        int i10 = this.zzb;
        int i11 = zzfhp.zza;
        if (!task.isSuccessful()) {
            return Boolean.FALSE;
        }
        zzfjq zza2 = ((zzfjr) task.getResult()).zza(((zzaml) zzamh.zzal()).zzax());
        zza2.zza(i10);
        zza2.zzc();
        return Boolean.TRUE;
    }
}
