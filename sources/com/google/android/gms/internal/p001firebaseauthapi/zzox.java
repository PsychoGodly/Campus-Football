package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzox  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzox {
    /* access modifiers changed from: private */
    public final Map<zzpc, zzmx<?, ?>> zza;
    /* access modifiers changed from: private */
    public final Map<zzpa, zzmu<?>> zzb;
    /* access modifiers changed from: private */
    public final Map<zzpc, zznz<?, ?>> zzc;
    /* access modifiers changed from: private */
    public final Map<zzpa, zznv<?>> zzd;

    public zzox() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final <SerializationT extends zzov> zzox zza(zzmu<SerializationT> zzmu) throws GeneralSecurityException {
        zzpa zzpa = new zzpa(zzmu.zzb(), zzmu.zza());
        if (this.zzb.containsKey(zzpa)) {
            zzmu zzmu2 = this.zzb.get(zzpa);
            if (!zzmu2.equals(zzmu) || !zzmu.equals(zzmu2)) {
                String valueOf = String.valueOf(zzpa);
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + valueOf);
            }
        } else {
            this.zzb.put(zzpa, zzmu);
        }
        return this;
    }

    public zzox(zzoy zzoy) {
        this.zza = new HashMap(zzoy.zza);
        this.zzb = new HashMap(zzoy.zzb);
        this.zzc = new HashMap(zzoy.zzc);
        this.zzd = new HashMap(zzoy.zzd);
    }

    public final <KeyT extends zzbt, SerializationT extends zzov> zzox zza(zzmx<KeyT, SerializationT> zzmx) throws GeneralSecurityException {
        zzpc zzpc = new zzpc(zzmx.zza(), zzmx.zzb());
        if (this.zza.containsKey(zzpc)) {
            zzmx zzmx2 = this.zza.get(zzpc);
            if (!zzmx2.equals(zzmx) || !zzmx.equals(zzmx2)) {
                String valueOf = String.valueOf(zzpc);
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + valueOf);
            }
        } else {
            this.zza.put(zzpc, zzmx);
        }
        return this;
    }

    public final <SerializationT extends zzov> zzox zza(zznv<SerializationT> zznv) throws GeneralSecurityException {
        zzpa zzpa = new zzpa(zznv.zzb(), zznv.zza());
        if (this.zzd.containsKey(zzpa)) {
            zznv zznv2 = this.zzd.get(zzpa);
            if (!zznv2.equals(zznv) || !zznv.equals(zznv2)) {
                String valueOf = String.valueOf(zzpa);
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + valueOf);
            }
        } else {
            this.zzd.put(zzpa, zznv);
        }
        return this;
    }

    public final <ParametersT extends zzch, SerializationT extends zzov> zzox zza(zznz<ParametersT, SerializationT> zznz) throws GeneralSecurityException {
        zzpc zzpc = new zzpc(zznz.zza(), zznz.zzb());
        if (this.zzc.containsKey(zzpc)) {
            zznz zznz2 = this.zzc.get(zzpc);
            if (!zznz2.equals(zznz) || !zznz.equals(zznz2)) {
                String valueOf = String.valueOf(zzpc);
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + valueOf);
            }
        } else {
            this.zzc.put(zzpc, zznz);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final zzoy zza() {
        return new zzoy(this);
    }
}
