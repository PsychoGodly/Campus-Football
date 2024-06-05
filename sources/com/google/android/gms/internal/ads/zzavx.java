package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzavx extends PushbackInputStream {
    final /* synthetic */ zzavy zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzavx(zzavy zzavy, InputStream inputStream, int i10) {
        super(inputStream, 1);
        this.zza = zzavy;
    }

    public final synchronized void close() throws IOException {
        zzawa.zze(this.zza.zzc);
        super.close();
    }
}
