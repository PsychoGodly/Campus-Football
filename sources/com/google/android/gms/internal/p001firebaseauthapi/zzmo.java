package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzakn;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
class zzmo<PrimitiveT, KeyProtoT extends zzakn> implements zzbs<PrimitiveT> {
    private final zznb<KeyProtoT> zza;
    private final Class<PrimitiveT> zzb;

    public zzmo(zznb<KeyProtoT> zznb, Class<PrimitiveT> cls) {
        if (zznb.zzh().contains(cls) || Void.class.equals(cls)) {
            this.zza = zznb;
            this.zzb = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{zznb.toString(), cls.getName()}));
    }

    public final zzuy zza(zzahp zzahp) throws GeneralSecurityException {
        try {
            return (zzuy) ((zzajc) zzuy.zza().zza(this.zza.zze()).zza(new zzmr(this.zza.zzc()).zza(zzahp).zzi()).zza(this.zza.zzd()).zzf());
        } catch (zzaji e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    public final PrimitiveT zzb(zzahp zzahp) throws GeneralSecurityException {
        try {
            KeyProtoT zza2 = this.zza.zza(zzahp);
            if (!Void.class.equals(this.zzb)) {
                this.zza.zza(zza2);
                return this.zza.zza(zza2, this.zzb);
            }
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        } catch (zzaji e10) {
            String name = this.zza.zzg().getName();
            throw new GeneralSecurityException("Failures parsing proto of type " + name, e10);
        }
    }

    public final String zza() {
        return this.zza.zze();
    }
}
