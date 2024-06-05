package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzos  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzos implements zzov {
    private final String zza;
    private final zzxt zzb;
    private final zzahp zzc;
    private final zzuy.zza zzd;
    private final zzvs zze;
    private final Integer zzf;

    private zzos(String str, zzahp zzahp, zzuy.zza zza2, zzvs zzvs, Integer num) {
        this.zza = str;
        this.zzb = zzpf.zzb(str);
        this.zzc = zzahp;
        this.zzd = zza2;
        this.zze = zzvs;
        this.zzf = num;
    }

    public static zzos zza(String str, zzahp zzahp, zzuy.zza zza2, zzvs zzvs, Integer num) throws GeneralSecurityException {
        if (zzvs == zzvs.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzos(str, zzahp, zza2, zzvs, num);
    }

    public final zzxt zzb() {
        return this.zzb;
    }

    public final zzvs zzc() {
        return this.zze;
    }

    public final zzahp zzd() {
        return this.zzc;
    }

    public final Integer zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zza;
    }

    public final zzuy.zza zza() {
        return this.zzd;
    }
}
