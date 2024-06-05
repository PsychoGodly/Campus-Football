package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzhq implements zzim {
    private static final zzhw zza = new zzho();
    private final zzhw zzb;

    public zzhq() {
        zzhw zzhw;
        zzhw[] zzhwArr = new zzhw[2];
        zzhwArr[0] = zzgh.zza();
        try {
            zzhw = (zzhw) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzhw = zza;
        }
        zzhwArr[1] = zzhw;
        zzhp zzhp = new zzhp(zzhwArr);
        byte[] bArr = zzgw.zzd;
        this.zzb = zzhp;
    }

    private static boolean zzb(zzhv zzhv) {
        return zzhv.zzc() == 1;
    }

    public final zzil zza(Class cls) {
        Class<zzgo> cls2 = zzgo.class;
        zzin.zzF(cls);
        zzhv zzb2 = this.zzb.zzb(cls);
        if (zzb2.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return zzic.zzc(zzin.zzA(), zzgc.zzb(), zzb2.zza());
            }
            return zzic.zzc(zzin.zzy(), zzgc.zza(), zzb2.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (zzb(zzb2)) {
                return zzib.zzm(cls, zzb2, zzif.zzb(), zzhm.zze(), zzin.zzA(), zzgc.zzb(), zzhu.zzb());
            }
            return zzib.zzm(cls, zzb2, zzif.zzb(), zzhm.zze(), zzin.zzA(), (zzga) null, zzhu.zzb());
        } else if (zzb(zzb2)) {
            return zzib.zzm(cls, zzb2, zzif.zza(), zzhm.zzd(), zzin.zzy(), zzgc.zza(), zzhu.zza());
        } else {
            return zzib.zzm(cls, zzb2, zzif.zza(), zzhm.zzd(), zzin.zzz(), (zzga) null, zzhu.zza());
        }
    }
}
