package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgfo extends zzgcu {
    private static final zzgdr zza = zzgdr.zzb(zzgfl.zza, zzgfk.class, zzgfd.class);

    public zzgfo() {
        super(zzgjz.class, new zzgfm(zzfws.class));
    }

    public static void zzh(boolean z10) throws GeneralSecurityException {
        zzfxf.zzo(new zzgfo(), true);
        zzgfz.zza();
        zzgde.zza().zze(zza);
    }

    public static final void zzm(zzgjz zzgjz) throws GeneralSecurityException {
        zzgog.zzb(zzgjz.zza(), 0);
        if (zzgjz.zzh().zzd() >= 16) {
            zzo(zzgjz.zzg());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    static /* bridge */ /* synthetic */ zzgcs zzn(int i10, int i11, int i12, int i13) {
        zzgkb zzc = zzgkc.zzc();
        zzgke zzc2 = zzgkf.zzc();
        zzc2.zzb(i12);
        zzc2.zza(i11);
        zzc.zzb((zzgkf) zzc2.zzal());
        zzc.zza(i10);
        return new zzgcs((zzgkc) zzc.zzal(), i13);
    }

    /* access modifiers changed from: private */
    public static void zzo(zzgkf zzgkf) throws GeneralSecurityException {
        if (zzgkf.zza() >= 10) {
            int zzg = zzgkf.zzg() - 2;
            if (zzg != 1) {
                if (zzg != 2) {
                    if (zzg != 3) {
                        if (zzg != 4) {
                            if (zzg != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (zzgkf.zza() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (zzgkf.zza() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (zzgkf.zza() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (zzgkf.zza() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (zzgkf.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final zzgct zza() {
        return new zzgfn(this, zzgkc.class);
    }

    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    public final /* synthetic */ zzgrw zzc(zzgpe zzgpe) throws zzgqy {
        return zzgjz.zzf(zzgpe, zzgpy.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrw) throws GeneralSecurityException {
        zzm((zzgjz) zzgrw);
    }

    public final int zzf() {
        return 2;
    }
}
