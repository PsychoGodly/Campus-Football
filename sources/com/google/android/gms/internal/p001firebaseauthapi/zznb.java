package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzakn;
import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zznb<KeyProtoT extends zzakn> {
    private final Class<KeyProtoT> zza;
    private final Map<Class<?>, zzoh<?, KeyProtoT>> zzb;
    private final Class<?> zzc;

    @SafeVarargs
    protected zznb(Class<KeyProtoT> cls, zzoh<?, KeyProtoT>... zzohArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        int length = zzohArr.length;
        int i10 = 0;
        while (i10 < length) {
            zzoh<?, KeyProtoT> zzoh = zzohArr[i10];
            if (!hashMap.containsKey(zzoh.zza())) {
                hashMap.put(zzoh.zza(), zzoh);
                i10++;
            } else {
                String canonicalName = zzoh.zza().getCanonicalName();
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + canonicalName);
            }
        }
        if (zzohArr.length > 0) {
            this.zzc = zzohArr[0].zza();
        } else {
            this.zzc = Void.class;
        }
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public abstract KeyProtoT zza(zzahp zzahp) throws zzaji;

    public final <P> P zza(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        zzoh zzoh = this.zzb.get(cls);
        if (zzoh != null) {
            return zzoh.zza(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    public abstract void zza(KeyProtoT keyprotot) throws GeneralSecurityException;

    public abstract zzif.zza zzb();

    public zzne<?, KeyProtoT> zzc() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzuy.zza zzd();

    public abstract String zze();

    public final Class<?> zzf() {
        return this.zzc;
    }

    public final Class<KeyProtoT> zzg() {
        return this.zza;
    }

    public final Set<Class<?>> zzh() {
        return this.zzb.keySet();
    }
}
