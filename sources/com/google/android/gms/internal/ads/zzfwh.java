package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfwh {
    private final zzgld zza;

    private zzfwh(zzgld zzgld) {
        this.zza = zzgld;
    }

    public static zzfwh zze(String str, byte[] bArr, int i10) {
        zzglc zza2 = zzgld.zza();
        zza2.zzb(str);
        zza2.zzc(zzgpe.zzv(bArr));
        int i11 = i10 - 1;
        zza2.zza(i11 != 0 ? i11 != 1 ? zzgme.RAW : zzgme.LEGACY : zzgme.TINK);
        return new zzfwh((zzgld) zza2.zzal());
    }

    /* access modifiers changed from: package-private */
    public final zzgld zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zza.zzg();
    }

    public final byte[] zzc() {
        return this.zza.zzf().zzE();
    }

    public final int zzd() {
        zzgme zze = this.zza.zze();
        zzgme zzgme = zzgme.UNKNOWN_PREFIX;
        int ordinal = zze.ordinal();
        int i10 = 1;
        if (ordinal != 1) {
            i10 = 2;
            if (ordinal != 2) {
                i10 = 3;
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i10;
    }
}
