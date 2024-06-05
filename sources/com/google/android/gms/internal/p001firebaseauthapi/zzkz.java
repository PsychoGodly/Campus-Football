package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzsi;
import com.google.android.gms.internal.p001firebaseauthapi.zzsu;
import com.google.android.gms.internal.p001firebaseauthapi.zztc;
import com.google.android.gms.internal.p001firebaseauthapi.zzuc;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzkz implements zzwi {
    private final String zza;
    private final int zzb;
    private zzsu zzc;
    private zzse zzd;
    private int zze;
    private zztc zzf;

    zzkz(zzvb zzvb) throws GeneralSecurityException {
        String zzf2 = zzvb.zzf();
        this.zza = zzf2;
        if (zzf2.equals(zzcw.zzb)) {
            try {
                zzsv zza2 = zzsv.zza(zzvb.zze(), zzaio.zza());
                this.zzc = zzsu.zza(zzct.zza(zzvb).zze(), zzaio.zza());
                this.zzb = zza2.zza();
            } catch (zzaji e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e10);
            }
        } else if (zzf2.equals(zzcw.zza)) {
            try {
                zzsf zza3 = zzsf.zza(zzvb.zze(), zzaio.zza());
                this.zzd = zzse.zza(zzct.zza(zzvb).zze(), zzaio.zza());
                this.zze = zza3.zzc().zza();
                this.zzb = this.zze + zza3.zzd().zza();
            } catch (zzaji e11) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
            }
        } else if (zzf2.equals(zziz.zza)) {
            try {
                zztd zza4 = zztd.zza(zzvb.zze(), zzaio.zza());
                this.zzf = zztc.zza(zzct.zza(zzvb).zze(), zzaio.zza());
                this.zzb = zza4.zza();
            } catch (zzaji e12) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e12);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: " + zzf2);
        }
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzly zza(byte[] bArr) throws GeneralSecurityException {
        Class<zzbg> cls = zzbg.class;
        if (bArr.length != this.zzb) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.zza.equals(zzcw.zzb)) {
            return new zzly((zzbg) zzct.zza(this.zza, ((zzsu) ((zzajc) ((zzsu.zza) zzsu.zzb().zza(this.zzc)).zza(zzahp.zza(bArr, 0, this.zzb)).zzf())).zzi(), cls));
        } else {
            if (this.zza.equals(zzcw.zza)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
                return new zzly((zzbg) zzct.zza(this.zza, ((zzse) ((zzajc) zzse.zzb().zza(this.zzd.zza()).zza((zzsi) ((zzajc) ((zzsi.zza) zzsi.zzb().zza(this.zzd.zzd())).zza(zzahp.zza(copyOfRange)).zzf())).zza((zzuc) ((zzajc) ((zzuc.zza) zzuc.zzb().zza(this.zzd.zze())).zza(zzahp.zza(copyOfRange2)).zzf())).zzf())).zzi(), cls));
            } else if (this.zza.equals(zziz.zza)) {
                return new zzly((zzbp) zzct.zza(this.zza, ((zztc) ((zzajc) ((zztc.zza) zztc.zzb().zza(this.zzf)).zza(zzahp.zza(bArr, 0, this.zzb)).zzf())).zzi(), zzbp.class));
            } else {
                throw new GeneralSecurityException("unknown DEM key type");
            }
        }
    }
}
