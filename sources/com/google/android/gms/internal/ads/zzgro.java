package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgro implements zzgsq {
    private static final zzgru zza = new zzgrm();
    private final zzgru zzb;

    public zzgro() {
        zzgru zzgru;
        zzgru[] zzgruArr = new zzgru[2];
        zzgruArr[0] = zzgqh.zza();
        try {
            zzgru = (zzgru) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzgru = zza;
        }
        zzgruArr[1] = zzgru;
        zzgrn zzgrn = new zzgrn(zzgruArr);
        zzgqw.zzf(zzgrn, "messageInfoFactory");
        this.zzb = zzgrn;
    }

    private static boolean zzb(zzgrt zzgrt) {
        return zzgrt.zzc() == 1;
    }

    public final zzgsp zza(Class cls) {
        Class<zzgqm> cls2 = zzgqm.class;
        zzgsr.zzG(cls);
        zzgrt zzb2 = this.zzb.zzb(cls);
        if (zzb2.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return zzgsa.zzc(zzgsr.zzB(), zzgqb.zzb(), zzb2.zza());
            }
            return zzgsa.zzc(zzgsr.zzz(), zzgqb.zza(), zzb2.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (zzb(zzb2)) {
                return zzgrz.zzl(cls, zzb2, zzgsc.zzb(), zzgrk.zze(), zzgsr.zzB(), zzgqb.zzb(), zzgrs.zzb());
            }
            return zzgrz.zzl(cls, zzb2, zzgsc.zzb(), zzgrk.zze(), zzgsr.zzB(), (zzgpz) null, zzgrs.zzb());
        } else if (zzb(zzb2)) {
            return zzgrz.zzl(cls, zzb2, zzgsc.zza(), zzgrk.zzd(), zzgsr.zzz(), zzgqb.zza(), zzgrs.zza());
        } else {
            return zzgrz.zzl(cls, zzb2, zzgsc.zza(), zzgrk.zzd(), zzgsr.zzA(), (zzgpz) null, zzgrs.zza());
        }
    }
}
