package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzgi extends zzne<zzvr, zzvo> {
    private final /* synthetic */ zzgg zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgi(zzgg zzgg, Class cls) {
        super(cls);
        this.zza = zzgg;
    }

    public final /* synthetic */ zzakn zza(zzakn zzakn) throws GeneralSecurityException {
        return (zzvo) ((zzajc) zzvo.zzb().zza((zzvr) zzakn).zza(0).zzf());
    }

    public final /* synthetic */ void zzb(zzakn zzakn) throws GeneralSecurityException {
        zzvr zzvr = (zzvr) zzakn;
        if (!zzgh.zza(zzvr.zza().zzf())) {
            String zzf = zzvr.zza().zzf();
            throw new GeneralSecurityException("Unsupported DEK key type: " + zzf + ". Only Tink AEAD key types are supported.");
        } else if (zzvr.zze().isEmpty() || !zzvr.zzf()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zzvr.zza(zzahp, zzaio.zza());
    }
}
