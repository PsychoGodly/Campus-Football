package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgtf extends RuntimeException {
    public zzgtf(zzgrw zzgrw) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgqy zza() {
        return new zzgqy(getMessage());
    }
}
