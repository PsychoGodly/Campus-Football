package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgrn implements zzgru {
    private final zzgru[] zza;

    zzgrn(zzgru... zzgruArr) {
        this.zza = zzgruArr;
    }

    public final zzgrt zzb(Class cls) {
        zzgru[] zzgruArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzgru zzgru = zzgruArr[i10];
            if (zzgru.zzc(cls)) {
                return zzgru.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean zzc(Class cls) {
        zzgru[] zzgruArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzgruArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
