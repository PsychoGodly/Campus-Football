package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzgwq {
    public static zzgwq zzb(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzgwl(cls.getSimpleName());
        }
        return new zzgwn(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
