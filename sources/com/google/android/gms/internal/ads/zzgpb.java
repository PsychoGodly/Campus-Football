package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgpb extends OutputStream {
    private static final byte[] zza = new byte[0];
    private final int zzb = 128;
    private final ArrayList zzc = new ArrayList();
    private int zzd;
    private byte[] zze = new byte[128];
    private int zzf;

    zzgpb(int i10) {
    }

    private final void zzd(int i10) {
        this.zzc.add(new zzgpa(this.zze));
        int length = this.zzd + this.zze.length;
        this.zzd = length;
        this.zze = new byte[Math.max(this.zzb, Math.max(i10, length >>> 1))];
        this.zzf = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zza())});
    }

    public final synchronized void write(int i10) {
        if (this.zzf == this.zze.length) {
            zzd(1);
        }
        byte[] bArr = this.zze;
        int i11 = this.zzf;
        this.zzf = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    public final synchronized int zza() {
        return this.zzd + this.zzf;
    }

    public final synchronized zzgpe zzb() {
        int i10 = this.zzf;
        byte[] bArr = this.zze;
        if (i10 >= bArr.length) {
            this.zzc.add(new zzgpa(this.zze));
            this.zze = zza;
        } else if (i10 > 0) {
            this.zzc.add(new zzgpa(Arrays.copyOf(bArr, i10)));
        }
        this.zzd += this.zzf;
        this.zzf = 0;
        return zzgpe.zzu(this.zzc);
    }

    public final synchronized void zzc() {
        this.zzc.clear();
        this.zzd = 0;
        this.zzf = 0;
    }

    public final synchronized void write(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.zze;
        int length = bArr2.length;
        int i12 = this.zzf;
        int i13 = length - i12;
        if (i11 <= i13) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.zzf += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i13);
        int i14 = i11 - i13;
        zzd(i14);
        System.arraycopy(bArr, i10 + i13, this.zze, 0, i14);
        this.zzf = i14;
    }
}
