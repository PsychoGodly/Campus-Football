package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzdtf extends Exception {
    private final int zza;

    public zzdtf(int i10) {
        this.zza = i10;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdtf(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public zzdtf(int i10, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
