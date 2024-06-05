package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzhp implements zzhw {
    private final zzhw[] zza;

    zzhp(zzhw... zzhwArr) {
        this.zza = zzhwArr;
    }

    public final zzhv zzb(Class cls) {
        zzhw[] zzhwArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzhw zzhw = zzhwArr[i10];
            if (zzhw.zzc(cls)) {
                return zzhw.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean zzc(Class cls) {
        zzhw[] zzhwArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzhwArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
