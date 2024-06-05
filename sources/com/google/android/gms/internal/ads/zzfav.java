package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfav implements zzfat {
    private final String zza;

    public zzfav(String str) {
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfav)) {
            return false;
        }
        return this.zza.equals(((zzfav) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
