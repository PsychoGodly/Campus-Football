package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbyl {
    private BigInteger zza = BigInteger.ONE;
    private String zzb = "0";

    public final synchronized String zza() {
        String bigInteger;
        bigInteger = this.zza.toString();
        this.zza = this.zza.add(BigInteger.ONE);
        this.zzb = bigInteger;
        return bigInteger;
    }

    public final synchronized String zzb() {
        return this.zzb;
    }
}
