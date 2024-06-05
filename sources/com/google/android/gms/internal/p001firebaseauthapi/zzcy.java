package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzvb;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzcy {
    public static final zzvb zza = zza(16);
    public static final zzvb zzb;
    private static final zzvb zzc = zza(32);
    private static final zzvb zzd = zza(16, 16);
    private static final zzvb zze = zza(32, 16);
    private static final zzvb zzf;
    private static final zzvb zzg;
    private static final zzvb zzh;

    static {
        zzub zzub = zzub.SHA256;
        zzb = zza(16, 16, 32, 16, zzub);
        zzf = zza(32, 16, 32, 32, zzub);
        zzvb.zza zza2 = zzvb.zza().zza(new zzfu().zze());
        zzvs zzvs = zzvs.TINK;
        zzg = (zzvb) ((zzajc) zza2.zza(zzvs).zzf());
        zzh = (zzvb) ((zzajc) zzvb.zza().zza(new zzhj().zze()).zza(zzvs).zzf());
    }

    private static zzvb zza(int i10, int i11, int i12, int i13, zzub zzub) {
        return (zzvb) ((zzajc) zzvb.zza().zza(((zzsf) ((zzajc) zzsf.zza().zza((zzsj) ((zzajc) zzsj.zzb().zza((zzsm) ((zzajc) zzsm.zzb().zza(16).zzf())).zza(i10).zzf())).zza((zzug) ((zzajc) zzug.zzc().zza((zzuh) ((zzajc) zzuh.zzc().zza(zzub).zza(i13).zzf())).zza(32).zzf())).zzf())).zzi()).zza(new zzdi().zze()).zza(zzvs.TINK).zzf());
    }

    private static zzvb zza(int i10, int i11) {
        return (zzvb) ((zzajc) zzvb.zza().zza(((zzsq) ((zzajc) zzsq.zzb().zza(i10).zza((zzsr) ((zzajc) zzsr.zzb().zza(16).zzf())).zzf())).zzi()).zza(new zzdz().zze()).zza(zzvs.TINK).zzf());
    }

    private static zzvb zza(int i10) {
        return (zzvb) ((zzajc) zzvb.zza().zza(((zzsv) ((zzajc) zzsv.zzc().zza(i10).zzf())).zzi()).zza(new zzeo().zze()).zza(zzvs.TINK).zzf());
    }
}
