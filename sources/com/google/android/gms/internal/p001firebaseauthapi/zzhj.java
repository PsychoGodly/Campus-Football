package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzhm;
import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzhj extends zznb<zzvx> {
    private static final zzno<zzhm> zza = zzhi.zza;

    zzhj() {
        super(zzvx.class, new zzhl(zzbg.class));
    }

    public static int zza() {
        return 0;
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zzvx.zza(zzahp, zzaio.zza());
    }

    public final zzif.zza zzb() {
        return zzif.zza.ALGORITHM_NOT_FIPS;
    }

    public final zzne<zzvy, zzvx> zzc() {
        return new zzhk(this, zzvy.class);
    }

    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public static void zza(boolean z10) throws GeneralSecurityException {
        zzct.zza(new zzhj(), true);
        zzho.zza();
        zzns zza2 = zzns.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", zzhm.zza(zzhm.zza.zza));
        hashMap.put("XCHACHA20_POLY1305_RAW", zzhm.zza(zzhm.zza.zzc));
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zznl.zza().zza(zza, zzhm.class);
    }

    public final /* synthetic */ void zza(zzakn zzakn) throws GeneralSecurityException {
        zzvx zzvx = (zzvx) zzakn;
        zzxo.zza(zzvx.zza(), 0);
        if (zzvx.zzd().zzb() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
