package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzgr extends zzgl {
    public final zzgo zza = new zzgo();
    public ByteBuffer zzb;
    public boolean zzc;
    public long zzd;
    public ByteBuffer zze;
    private final int zzf;

    static {
        zzbh.zzb("media3.decoder");
    }

    public zzgr(int i10, int i11) {
        this.zzf = i10;
    }

    private final ByteBuffer zzl(int i10) {
        int i11;
        int i12 = this.zzf;
        if (i12 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i12 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer == null) {
            i11 = 0;
        } else {
            i11 = byteBuffer.capacity();
        }
        throw new zzgq(i11, i10);
    }

    public void zzb() {
        super.zzb();
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.zze;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.zzc = false;
    }

    public final void zzi(int i10) {
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer == null) {
            this.zzb = zzl(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (capacity >= i11) {
            this.zzb = byteBuffer;
            return;
        }
        ByteBuffer zzl = zzl(i11);
        zzl.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            zzl.put(byteBuffer);
        }
        this.zzb = zzl;
    }

    public final void zzj() {
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.zze;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean zzk() {
        return zzd(1073741824);
    }
}
