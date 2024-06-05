package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaio  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzaio {
    static final zzaio zza = new zzaio(true);
    private static volatile boolean zzb = false;
    private static boolean zzc = true;
    private final Map<zzair, zzajc.zzd<?, ?>> zzd;

    zzaio() {
        this.zzd = new HashMap();
    }

    public static zzaio zza() {
        return zza;
    }

    public final <ContainingType extends zzakn> zzajc.zzd<ContainingType, ?> zza(ContainingType containingtype, int i10) {
        return this.zzd.get(new zzair(containingtype, i10));
    }

    private zzaio(boolean z10) {
        this.zzd = Collections.emptyMap();
    }
}
