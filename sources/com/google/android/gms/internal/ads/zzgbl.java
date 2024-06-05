package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgbl implements zzgmy {
    private final String zza;
    private final int zzb;
    private zzgid zzc;
    private zzghf zzd;
    private int zze;
    private zzgip zzf;

    zzgbl(zzgld zzgld) throws GeneralSecurityException {
        String zzg = zzgld.zzg();
        this.zza = zzg;
        if (zzg.equals(zzfxi.zzb)) {
            try {
                zzgig zze2 = zzgig.zze(zzgld.zzf(), zzgpy.zza());
                this.zzc = (zzgid) zzfxf.zzd(zzgld);
                this.zzb = zze2.zza();
            } catch (zzgqy e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e10);
            }
        } else if (zzg.equals(zzfxi.zza)) {
            try {
                zzghi zzd2 = zzghi.zzd(zzgld.zzf(), zzgpy.zza());
                this.zzd = (zzghf) zzfxf.zzd(zzgld);
                this.zze = zzd2.zze().zza();
                this.zzb = this.zze + zzd2.zzf().zza();
            } catch (zzgqy e11) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
            }
        } else if (zzg.equals(zzgax.zza)) {
            try {
                zzgis zze3 = zzgis.zze(zzgld.zzf(), zzgpy.zza());
                this.zzf = (zzgip) zzfxf.zzd(zzgld);
                this.zzb = zze3.zza();
            } catch (zzgqy e12) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e12);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(zzg)));
        }
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzgch zzb(byte[] bArr) throws GeneralSecurityException {
        Class<zzfvo> cls = zzfvo.class;
        if (bArr.length != this.zzb) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.zza.equals(zzfxi.zzb)) {
            zzgic zzc2 = zzgid.zzc();
            zzc2.zzaj(this.zzc);
            zzc2.zza(zzgpe.zzw(bArr, 0, this.zzb));
            return new zzgch((zzfvo) zzfxf.zzi(this.zza, (zzgid) zzc2.zzal(), cls));
        } else if (this.zza.equals(zzfxi.zza)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
            zzghk zzc3 = zzghl.zzc();
            zzc3.zzaj(this.zzd.zzf());
            zzc3.zza(zzgpe.zzv(copyOfRange));
            zzgjy zzc4 = zzgjz.zzc();
            zzc4.zzaj(this.zzd.zzg());
            zzc4.zza(zzgpe.zzv(copyOfRange2));
            zzghe zzc5 = zzghf.zzc();
            zzc5.zzc(this.zzd.zza());
            zzc5.zza((zzghl) zzc3.zzal());
            zzc5.zzb((zzgjz) zzc4.zzal());
            return new zzgch((zzfvo) zzfxf.zzi(this.zza, (zzghf) zzc5.zzal(), cls));
        } else if (this.zza.equals(zzgax.zza)) {
            zzgio zzc6 = zzgip.zzc();
            zzc6.zzaj(this.zzf);
            zzc6.zza(zzgpe.zzw(bArr, 0, this.zzb));
            return new zzgch((zzfvu) zzfxf.zzi(this.zza, (zzgip) zzc6.zzal(), zzfvu.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
