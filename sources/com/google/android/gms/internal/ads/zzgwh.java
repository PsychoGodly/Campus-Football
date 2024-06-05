package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzgwh extends zzgwf {
    private int zza;

    protected zzgwh(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzama.zzc(byteBuffer.get());
        zzama.zzd(byteBuffer);
        byteBuffer.get();
        return 4;
    }
}
