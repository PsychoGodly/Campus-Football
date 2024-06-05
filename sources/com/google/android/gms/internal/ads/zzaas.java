package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaas {
    public static int zza(ByteBuffer byteBuffer) {
        byte b10 = 0;
        byte b11 = byteBuffer.get(0);
        if (byteBuffer.limit() > 1) {
            b10 = byteBuffer.get(1);
        }
        return (int) ((zzd(b11, b10) * 48000) / 1000000);
    }

    public static long zzb(byte[] bArr) {
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return zzd(b11, b10);
    }

    public static List zzc(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzf(zze((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255)))));
        arrayList.add(zzf(zze(3840)));
        return arrayList;
    }

    private static long zzd(byte b10, byte b11) {
        byte b12 = b10 & 255;
        byte b13 = b12 & 3;
        byte b14 = 2;
        if (b13 == 0) {
            b14 = 1;
        } else if (!(b13 == 1 || b13 == 2)) {
            b14 = b11 & 63;
        }
        int i10 = b12 >> 3;
        int i11 = i10 & 3;
        return ((long) b14) * ((long) (i10 >= 16 ? 2500 << i11 : i10 >= 12 ? 10000 << (i11 & 1) : i11 == 3 ? 60000 : 10000 << i11));
    }

    private static long zze(long j10) {
        return (j10 * 1000000000) / 48000;
    }

    private static byte[] zzf(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }
}
