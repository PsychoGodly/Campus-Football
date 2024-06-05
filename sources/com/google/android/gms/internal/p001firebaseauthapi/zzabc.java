package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.d;
import d7.i1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzabc extends zzacx<Void, i1> {
    private final String zzaa;
    private final String zzab;
    private final String zzy;
    private final String zzz;

    public zzabc(String str, String str2, String str3, String str4) {
        super(2);
        q.h(str, "email cannot be null or empty");
        q.h(str2, "password cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
        this.zzaa = str3;
        this.zzab = str4;
    }

    public final String zza() {
        return "reauthenticateWithEmailPassword";
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacg) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacg.zzb(this.zzy, this.zzz, this.zzaa, this.zzab, this.zzb);
    }

    public final void zzb() {
        d zza = zzaai.zza(this.zzc, this.zzk);
        if (this.zzd.c().equalsIgnoreCase(zza.c())) {
            ((i1) this.zze).a(this.zzj, zza);
            zzb(null);
            return;
        }
        zza(new Status(17024));
    }
}
