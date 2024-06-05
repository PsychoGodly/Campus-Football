package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class zzbao implements zzbda {
    final /* synthetic */ zzbap zza;

    zzbao(zzbap zzbap) {
        this.zza = zzbap;
    }

    public final Boolean zza(String str, boolean z10) {
        try {
            return Boolean.valueOf(this.zza.zze.getBoolean(str, z10));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.zze.getString(str, String.valueOf(z10)));
        }
    }

    public final Double zzb(String str, double d10) {
        try {
            return Double.valueOf((double) this.zza.zze.getFloat(str, (float) d10));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.zze.getString(str, String.valueOf(d10)));
        }
    }

    public final Long zzc(String str, long j10) {
        try {
            return Long.valueOf(this.zza.zze.getLong(str, j10));
        } catch (ClassCastException unused) {
            return Long.valueOf((long) this.zza.zze.getInt(str, (int) j10));
        }
    }

    public final String zzd(String str, String str2) {
        return this.zza.zze.getString(str, str2);
    }
}
