package com.google.android.recaptcha.internal;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzdw {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    /* access modifiers changed from: private */
    public final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzdw(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = 0
        L_0x000a:
            int r5 = r11.length
            if (r4 >= r5) goto L_0x002b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L_0x0014
            r7 = 1
            goto L_0x0015
        L_0x0014:
            r7 = 0
        L_0x0015:
            java.lang.String r8 = "Non-ASCII character: %s"
            com.google.android.recaptcha.internal.zzdi.zzc(r7, r8, r5)
            byte r7 = r1[r5]
            if (r7 != r2) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r6 = 0
        L_0x0020:
            java.lang.String r7 = "Duplicate character: %s"
            com.google.android.recaptcha.internal.zzdi.zzc(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto L_0x000a
        L_0x002b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdw.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzdw) {
            zzdw zzdw = (zzdw) obj;
            boolean z10 = zzdw.zzi;
            if (Arrays.equals(this.zzf, zzdw.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    /* access modifiers changed from: package-private */
    public final char zza(int i10) {
        return this.zzf[i10];
    }

    /* access modifiers changed from: package-private */
    public final int zzb(char c10) throws zzdz {
        if (c10 <= 127) {
            byte b10 = this.zzg[c10];
            if (b10 != -1) {
                return b10;
            }
            if (c10 <= ' ' || c10 == 127) {
                throw new zzdz("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
            }
            throw new zzdz("Unrecognized character: " + c10);
        }
        throw new zzdz("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzc(int i10) {
        return this.zzh[i10 % this.zzc];
    }

    public final boolean zzd(char c10) {
        return this.zzg[61] != -1;
    }

    private zzdw(String str, char[] cArr, byte[] bArr, boolean z10) {
        this.zze = str;
        Objects.requireNonNull(cArr);
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb2 = zzed.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = zzb2;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzb2);
            int i10 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i10;
            this.zzd = zzb2 >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.zzd; i11++) {
                zArr[zzed.zza(i11 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = false;
        } catch (ArithmeticException e10) {
            int length2 = cArr.length;
            throw new IllegalArgumentException("Illegal alphabet length " + length2, e10);
        }
    }
}
