package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzakn;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzoq<PrimitiveT, KeyProtoT extends zzakn, PublicKeyProtoT extends zzakn> extends zzmo<PrimitiveT, KeyProtoT> implements zzco<PrimitiveT> {
    private final zzop<KeyProtoT, PublicKeyProtoT> zza;
    private final zznb<PublicKeyProtoT> zzb;

    public zzoq(zzop<KeyProtoT, PublicKeyProtoT> zzop, zznb<PublicKeyProtoT> zznb, Class<PrimitiveT> cls) {
        super(zzop, cls);
        this.zza = zzop;
        this.zzb = zznb;
    }

    public final zzuy zzc(zzahp zzahp) throws GeneralSecurityException {
        try {
            KeyProtoT zza2 = this.zza.zza(zzahp);
            this.zza.zza(zza2);
            PublicKeyProtoT zzb2 = this.zza.zzb(zza2);
            this.zzb.zza(zzb2);
            return (zzuy) ((zzajc) zzuy.zza().zza(this.zzb.zze()).zza(zzb2.zzi()).zza(this.zzb.zzd()).zzf());
        } catch (zzaji e10) {
            throw new GeneralSecurityException("expected serialized proto of type ", e10);
        }
    }
}
