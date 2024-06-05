package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
class zzfwa implements zzfvy {
    private final zzgcu zza;
    private final Class zzb;

    public zzfwa(zzgcu zzgcu, Class cls) {
        if (zzgcu.zzl().contains(cls) || Void.class.equals(cls)) {
            this.zza = zzgcu;
            this.zzb = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{zzgcu.toString(), cls.getName()}));
    }

    private final zzfvz zzg() {
        return new zzfvz(this.zza.zza());
    }

    private final Object zzh(zzgrw zzgrw) throws GeneralSecurityException {
        if (!Void.class.equals(this.zzb)) {
            this.zza.zze(zzgrw);
            return this.zza.zzk(zzgrw, this.zzb);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public final zzgky zza(zzgpe zzgpe) throws GeneralSecurityException {
        try {
            zzgrw zza2 = zzg().zza(zzgpe);
            zzgkv zza3 = zzgky.zza();
            zza3.zzb(this.zza.zzd());
            zza3.zzc(zza2.zzau());
            zza3.zza(this.zza.zzb());
            return (zzgky) zza3.zzal();
        } catch (zzgqy e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    public final zzgrw zzb(zzgpe zzgpe) throws GeneralSecurityException {
        try {
            return zzg().zza(zzgpe);
        } catch (zzgqy e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zza().zzg().getName()), e10);
        }
    }

    public final Class zzc() {
        return this.zzb;
    }

    public final Object zzd(zzgpe zzgpe) throws GeneralSecurityException {
        try {
            return zzh(this.zza.zzc(zzgpe));
        } catch (zzgqy e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zzj().getName()), e10);
        }
    }

    public final Object zze(zzgrw zzgrw) throws GeneralSecurityException {
        String name = this.zza.zzj().getName();
        if (this.zza.zzj().isInstance(zzgrw)) {
            return zzh(zzgrw);
        }
        throw new GeneralSecurityException("Expected proto of type ".concat(name));
    }

    public final String zzf() {
        return this.zza.zzd();
    }
}
