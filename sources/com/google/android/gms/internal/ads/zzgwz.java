package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgwz implements zzgwy, zzgws {
    private static final zzgwz zza = new zzgwz((Object) null);
    private final Object zzb;

    private zzgwz(Object obj) {
        this.zzb = obj;
    }

    public static zzgwy zza(Object obj) {
        zzgxg.zza(obj, "instance cannot be null");
        return new zzgwz(obj);
    }

    public static zzgwy zzc(Object obj) {
        return obj == null ? zza : new zzgwz(obj);
    }

    public final Object zzb() {
        return this.zzb;
    }
}
