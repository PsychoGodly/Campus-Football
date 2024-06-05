package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzdm implements zzdo {
    private zzdr zza;

    public static void zza(zzdr zzdr, zzdr zzdr2) {
        zzdm zzdm = (zzdm) zzdr;
        if (zzdm.zza == null) {
            zzdm.zza = zzdr2;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object zzb() {
        zzdr zzdr = this.zza;
        if (zzdr != null) {
            return zzdr.zzb();
        }
        throw new IllegalStateException();
    }
}
