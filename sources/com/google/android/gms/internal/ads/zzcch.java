package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcch extends zzalx {
    static final zzcch zzb = new zzcch();

    zzcch() {
    }

    public final zzamb zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzamd();
        }
        if ("mvhd".equals(str)) {
            return new zzame();
        }
        return new zzamf(str);
    }
}
