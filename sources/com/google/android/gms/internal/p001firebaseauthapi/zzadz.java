package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import k5.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzadz extends zzacd {
    private final String zza;
    private final /* synthetic */ zzadu zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzadz(zzadu zzadu, zzacd zzacd, String str) {
        super(zzacd);
        this.zzb = zzadu;
        this.zza = str;
    }

    public final void zza(Status status) {
        a zza2 = zzadu.zza;
        String a10 = d.a(status.w());
        String x10 = status.x();
        zza2.c("SMS verification code request failed: " + a10 + " " + x10, new Object[0]);
        zzaeb zzaeb = (zzaeb) this.zzb.zzd.get(this.zza);
        if (zzaeb != null) {
            for (zzacd zza3 : zzaeb.zzb) {
                zza3.zza(status);
            }
            this.zzb.zzc(this.zza);
        }
    }

    public final void zzb(String str) {
        zzadu.zza.a("onCodeSent", new Object[0]);
        zzaeb zzaeb = (zzaeb) this.zzb.zzd.get(this.zza);
        if (zzaeb != null) {
            for (zzacd zzb2 : zzaeb.zzb) {
                zzb2.zzb(str);
            }
            zzaeb.zzg = true;
            zzaeb.zzd = str;
            if (zzaeb.zza <= 0) {
                this.zzb.zzb(this.zza);
            } else if (!zzaeb.zzc) {
                this.zzb.zze(this.zza);
            } else if (!zzag.zzc(zzaeb.zze)) {
                zzadu.zza(this.zzb, this.zza);
            }
        }
    }
}
