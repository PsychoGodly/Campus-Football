package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzoy {
    /* access modifiers changed from: private */
    public final Map<zzpc, zzmx<?, ?>> zza;
    /* access modifiers changed from: private */
    public final Map<zzpa, zzmu<?>> zzb;
    /* access modifiers changed from: private */
    public final Map<zzpc, zznz<?, ?>> zzc;
    /* access modifiers changed from: private */
    public final Map<zzpa, zznv<?>> zzd;

    private zzoy(zzox zzox) {
        this.zza = new HashMap(zzox.zza);
        this.zzb = new HashMap(zzox.zzb);
        this.zzc = new HashMap(zzox.zzc);
        this.zzd = new HashMap(zzox.zzd);
    }

    public final <SerializationT extends zzov> zzbt zza(SerializationT serializationt, zzcs zzcs) throws GeneralSecurityException {
        zzpa zzpa = new zzpa(serializationt.getClass(), serializationt.zzb());
        if (this.zzb.containsKey(zzpa)) {
            return this.zzb.get(zzpa).zza(serializationt, zzcs);
        }
        String valueOf = String.valueOf(zzpa);
        throw new GeneralSecurityException("No Key Parser for requested key type " + valueOf + " available");
    }

    public final <SerializationT extends zzov> boolean zzb(SerializationT serializationt) {
        return this.zzb.containsKey(new zzpa(serializationt.getClass(), serializationt.zzb()));
    }

    public final <SerializationT extends zzov> boolean zzc(SerializationT serializationt) {
        return this.zzd.containsKey(new zzpa(serializationt.getClass(), serializationt.zzb()));
    }

    public final <SerializationT extends zzov> zzch zza(SerializationT serializationt) throws GeneralSecurityException {
        zzpa zzpa = new zzpa(serializationt.getClass(), serializationt.zzb());
        if (this.zzd.containsKey(zzpa)) {
            return this.zzd.get(zzpa).zza(serializationt);
        }
        String valueOf = String.valueOf(zzpa);
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + valueOf + " available");
    }

    public final <ParametersT extends zzch, SerializationT extends zzov> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        zzpc zzpc = new zzpc(parameterst.getClass(), cls);
        if (this.zzc.containsKey(zzpc)) {
            return this.zzc.get(zzpc).zza(parameterst);
        }
        String valueOf = String.valueOf(zzpc);
        throw new GeneralSecurityException("No Key Format serializer for " + valueOf + " available");
    }
}
