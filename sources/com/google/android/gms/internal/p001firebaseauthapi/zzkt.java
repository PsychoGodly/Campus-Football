package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzkt {
    public static final zzvb zza;
    private static final byte[] zzb;
    private static final zzvb zzc;
    private static final zzvb zzd;

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zzty zzty = zzty.NIST_P256;
        zzub zzub = zzub.SHA256;
        zztk zztk = zztk.UNCOMPRESSED;
        zzvb zzvb = zzcy.zza;
        zzvs zzvs = zzvs.TINK;
        zzub zzub2 = zzub;
        zzvb zzvb2 = zzvb;
        byte[] bArr2 = bArr;
        zza = zza(zzty, zzub2, zztk, zzvb2, zzvs, bArr2);
        zzc = zza(zzty, zzub2, zztk.COMPRESSED, zzvb2, zzvs.RAW, bArr2);
        zzd = zza(zzty, zzub2, zztk, zzcy.zzb, zzvs, bArr2);
    }

    @Deprecated
    private static zzvb zza(zzty zzty, zzub zzub, zztk zztk, zzvb zzvb, zzvs zzvs, byte[] bArr) {
        return (zzvb) ((zzajc) zzvb.zza().zza(new zzji().zze()).zza(zzvs).zza(((zztn) ((zzajc) zztn.zza().zza((zztq) ((zzajc) zztq.zzc().zza((zztv) ((zzajc) zztv.zza().zza(zzty).zza(zzub).zza(zzahp.zza(bArr)).zzf())).zza((zztm) ((zzajc) zztm.zza().zza(zzvb).zzf())).zza(zztk).zzf())).zzf())).zzi()).zzf());
    }
}
