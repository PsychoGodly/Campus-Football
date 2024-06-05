package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzpn extends zzdf {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    zzpn() {
    }

    private static void zzo(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (floatToIntBits == zzd) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    public final void zze(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.zzb.zzd;
        if (i11 == 536870912) {
            byteBuffer2 = zzj((i10 / 3) * 4);
            while (position < limit) {
                zzo(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << Ascii.DLE) | ((byteBuffer.get(position + 2) & 255) << Ascii.CAN), byteBuffer2);
                position += 3;
            }
        } else if (i11 == 805306368) {
            byteBuffer2 = zzj(i10);
            while (position < limit) {
                zzo((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << Ascii.DLE) | ((byteBuffer.get(position + 3) & 255) << Ascii.CAN), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    public final zzdc zzi(zzdc zzdc) throws zzdd {
        int i10 = zzdc.zzd;
        if (zzew.zzV(i10)) {
            return i10 != 4 ? new zzdc(zzdc.zzb, zzdc.zzc, 4) : zzdc.zza;
        }
        throw new zzdd(zzdc);
    }
}
