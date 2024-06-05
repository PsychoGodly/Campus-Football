package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgto extends zzgtp {
    zzgto(Unsafe unsafe) {
        super(unsafe);
    }

    public final byte zza(long j10) {
        return Memory.peekByte(j10);
    }

    public final double zzb(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    public final float zzc(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    public final void zzd(long j10, byte[] bArr, long j11, long j12) {
        Memory.peekByteArray(j10, bArr, (int) j11, (int) j12);
    }

    public final void zze(Object obj, long j10, boolean z10) {
        if (zzgtq.zzb) {
            zzgtq.zzG(obj, j10, r3 ? (byte) 1 : 0);
        } else {
            zzgtq.zzH(obj, j10, r3 ? (byte) 1 : 0);
        }
    }

    public final void zzf(Object obj, long j10, byte b10) {
        if (zzgtq.zzb) {
            zzgtq.zzG(obj, j10, b10);
        } else {
            zzgtq.zzH(obj, j10, b10);
        }
    }

    public final void zzg(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    public final void zzh(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    public final boolean zzi(Object obj, long j10) {
        if (zzgtq.zzb) {
            return zzgtq.zzw(obj, j10);
        }
        return zzgtq.zzx(obj, j10);
    }
}
