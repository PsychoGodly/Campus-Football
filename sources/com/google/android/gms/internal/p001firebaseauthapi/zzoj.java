package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzoj {
    /* access modifiers changed from: private */
    public final Map<zzol, zzod<?, ?>> zza;
    /* access modifiers changed from: private */
    public final Map<Class<?>, zzcp<?, ?>> zzb;

    private zzoj() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final <KeyT extends zzbt, PrimitiveT> zzoj zza(zzod<KeyT, PrimitiveT> zzod) throws GeneralSecurityException {
        Objects.requireNonNull(zzod, "primitive constructor must be non-null");
        zzol zzol = new zzol(zzod.zza(), zzod.zzb());
        if (this.zza.containsKey(zzol)) {
            zzod zzod2 = this.zza.get(zzol);
            if (!zzod2.equals(zzod) || !zzod.equals(zzod2)) {
                String valueOf = String.valueOf(zzol);
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + valueOf);
            }
        } else {
            this.zza.put(zzol, zzod);
        }
        return this;
    }

    private zzoj(zzok zzok) {
        this.zza = new HashMap(zzok.zza);
        this.zzb = new HashMap(zzok.zzb);
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> zzoj zza(zzcp<InputPrimitiveT, WrapperPrimitiveT> zzcp) throws GeneralSecurityException {
        Objects.requireNonNull(zzcp, "wrapper must be non-null");
        Class<WrapperPrimitiveT> zzb2 = zzcp.zzb();
        if (this.zzb.containsKey(zzb2)) {
            zzcp zzcp2 = this.zzb.get(zzb2);
            if (!zzcp2.equals(zzcp) || !zzcp.equals(zzcp2)) {
                String valueOf = String.valueOf(zzb2);
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + valueOf);
            }
        } else {
            this.zzb.put(zzb2, zzcp);
        }
        return this;
    }

    public final zzok zza() {
        return new zzok(this);
    }
}
