package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzon extends zzdf {
    private int[] zzd;
    private int[] zze;

    zzon() {
    }

    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i10 : iArr) {
                zzj.putShort(byteBuffer.getShort(i10 + i10 + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    public final zzdc zzi(zzdc zzdc) throws zzdd {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzdc.zza;
        }
        if (zzdc.zzd == 2) {
            boolean z10 = zzdc.zzc != iArr.length;
            int i10 = 0;
            while (true) {
                int length = iArr.length;
                if (i10 >= length) {
                    return z10 ? new zzdc(zzdc.zzb, length, 2) : zzdc.zza;
                }
                int i11 = iArr[i10];
                if (i11 < zzdc.zzc) {
                    z10 |= i11 != i10;
                    i10++;
                } else {
                    throw new zzdd(zzdc);
                }
            }
        } else {
            throw new zzdd(zzdc);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzk() {
        this.zze = this.zzd;
    }

    /* access modifiers changed from: protected */
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
