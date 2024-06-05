package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaul extends zzaug {
    private MessageDigest zzb;

    public final byte[] zzb(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i10 = 4;
        if (length == 1) {
            int zza = zzauk.zza(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(zza);
            bArr = allocate.array();
        } else {
            if (length < 5) {
                bArr2 = new byte[(length + length)];
                for (int i11 = 0; i11 < split.length; i11++) {
                    int zza2 = zzauk.zza(split[i11]);
                    char c10 = (zza2 >> 16) ^ ((char) zza2);
                    byte[] bArr3 = {(byte) c10, (byte) (c10 >> 8)};
                    int i12 = i11 + i11;
                    bArr2[i12] = bArr3[0];
                    bArr2[i12 + 1] = bArr3[1];
                }
            } else {
                bArr2 = new byte[length];
                for (int i13 = 0; i13 < split.length; i13++) {
                    int zza3 = zzauk.zza(split[i13]);
                    bArr2[i13] = (byte) ((zza3 >> 24) ^ (((zza3 & 255) ^ ((zza3 >> 8) & 255)) ^ ((zza3 >> 16) & 255)));
                }
            }
            bArr = bArr2;
        }
        this.zzb = zza();
        synchronized (this.zza) {
            MessageDigest messageDigest = this.zzb;
            if (messageDigest == null) {
                byte[] bArr4 = new byte[0];
                return bArr4;
            }
            messageDigest.reset();
            this.zzb.update(bArr);
            byte[] digest = this.zzb.digest();
            int length2 = digest.length;
            if (length2 <= 4) {
                i10 = length2;
            }
            byte[] bArr5 = new byte[i10];
            System.arraycopy(digest, 0, bArr5, 0, i10);
            return bArr5;
        }
    }
}
