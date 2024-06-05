package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzfh extends IOException {
    public final int zza;

    public zzfh(int i10) {
        this.zza = i10;
    }

    public zzfh(String str, int i10) {
        super(str);
        this.zza = i10;
    }

    public zzfh(String str, Throwable th, int i10) {
        super(str, th);
        this.zza = i10;
    }

    public zzfh(Throwable th, int i10) {
        super(th);
        this.zza = i10;
    }
}
