package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgtt extends zzgts {
    zzgtt() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r13[r14] <= -65) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0083, code lost:
        if (r13[r14] <= -65) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r13[r14] <= -65) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(int r12, byte[] r13, int r14, int r15) {
        /*
            r11 = this;
            r0 = -19
            r1 = -62
            r2 = -16
            r3 = 0
            r4 = -96
            r5 = -32
            r6 = -65
            r7 = -1
            if (r12 == 0) goto L_0x0087
            if (r14 < r15) goto L_0x0013
            return r12
        L_0x0013:
            byte r8 = (byte) r12
            if (r8 >= r5) goto L_0x0022
            if (r8 < r1) goto L_0x0021
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 > r6) goto L_0x0021
        L_0x001e:
            r14 = r12
            goto L_0x0087
        L_0x0021:
            return r7
        L_0x0022:
            if (r8 >= r2) goto L_0x004b
            int r12 = r12 >> 8
            int r12 = ~r12
            byte r12 = (byte) r12
            if (r12 != 0) goto L_0x0039
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r12 >= r15) goto L_0x0034
            r10 = r14
            r14 = r12
            r12 = r10
            goto L_0x0039
        L_0x0034:
            int r12 = com.google.android.gms.internal.ads.zzgtv.zzk(r8, r14)
            return r12
        L_0x0039:
            if (r12 > r6) goto L_0x004a
            if (r8 != r5) goto L_0x003f
            if (r12 < r4) goto L_0x004a
        L_0x003f:
            if (r8 != r0) goto L_0x0043
            if (r12 >= r4) goto L_0x004a
        L_0x0043:
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 > r6) goto L_0x004a
            goto L_0x001e
        L_0x004a:
            return r7
        L_0x004b:
            int r9 = r12 >> 8
            int r9 = ~r9
            byte r9 = (byte) r9
            if (r9 != 0) goto L_0x005f
            int r12 = r14 + 1
            byte r9 = r13[r14]
            if (r12 >= r15) goto L_0x005a
            r14 = r12
            r12 = 0
            goto L_0x0061
        L_0x005a:
            int r12 = com.google.android.gms.internal.ads.zzgtv.zzk(r8, r9)
            return r12
        L_0x005f:
            int r12 = r12 >> 16
        L_0x0061:
            if (r12 != 0) goto L_0x0072
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r12 >= r15) goto L_0x006d
            r10 = r14
            r14 = r12
            r12 = r10
            goto L_0x0072
        L_0x006d:
            int r12 = com.google.android.gms.internal.ads.zzgtv.zzl(r8, r9, r14)
            return r12
        L_0x0072:
            if (r9 > r6) goto L_0x0086
            int r8 = r8 << 28
            int r9 = r9 + 112
            int r8 = r8 + r9
            int r8 = r8 >> 30
            if (r8 != 0) goto L_0x0086
            if (r12 > r6) goto L_0x0086
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 > r6) goto L_0x0086
            goto L_0x001e
        L_0x0086:
            return r7
        L_0x0087:
            if (r14 >= r15) goto L_0x0090
            byte r12 = r13[r14]
            if (r12 < 0) goto L_0x0090
            int r14 = r14 + 1
            goto L_0x0087
        L_0x0090:
            if (r14 < r15) goto L_0x0094
            goto L_0x00f2
        L_0x0094:
            if (r14 < r15) goto L_0x0097
            goto L_0x00f2
        L_0x0097:
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 >= 0) goto L_0x00f3
            if (r14 >= r5) goto L_0x00ad
            if (r12 < r15) goto L_0x00a3
            r3 = r14
            goto L_0x00f2
        L_0x00a3:
            if (r14 < r1) goto L_0x00ab
            int r14 = r12 + 1
            byte r12 = r13[r12]
            if (r12 <= r6) goto L_0x0094
        L_0x00ab:
            r3 = -1
            goto L_0x00f2
        L_0x00ad:
            if (r14 >= r2) goto L_0x00cd
            int r8 = r15 + -1
            if (r12 < r8) goto L_0x00b8
            int r3 = com.google.android.gms.internal.ads.zzgtv.zzc(r13, r12, r15)
            goto L_0x00f2
        L_0x00b8:
            int r8 = r12 + 1
            byte r12 = r13[r12]
            if (r12 > r6) goto L_0x00ab
            if (r14 != r5) goto L_0x00c2
            if (r12 < r4) goto L_0x00ab
        L_0x00c2:
            if (r14 != r0) goto L_0x00c6
            if (r12 >= r4) goto L_0x00ab
        L_0x00c6:
            int r14 = r8 + 1
            byte r12 = r13[r8]
            if (r12 <= r6) goto L_0x0094
            goto L_0x00ab
        L_0x00cd:
            int r8 = r15 + -2
            if (r12 < r8) goto L_0x00d6
            int r3 = com.google.android.gms.internal.ads.zzgtv.zzc(r13, r12, r15)
            goto L_0x00f2
        L_0x00d6:
            int r8 = r12 + 1
            byte r12 = r13[r12]
            if (r12 > r6) goto L_0x00ab
            int r14 = r14 << 28
            int r12 = r12 + 112
            int r14 = r14 + r12
            int r12 = r14 >> 30
            if (r12 != 0) goto L_0x00ab
            int r12 = r8 + 1
            byte r14 = r13[r8]
            if (r14 > r6) goto L_0x00ab
            int r14 = r12 + 1
            byte r12 = r13[r12]
            if (r12 <= r6) goto L_0x0094
            goto L_0x00ab
        L_0x00f2:
            return r3
        L_0x00f3:
            r14 = r12
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgtt.zza(int, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    public final String zzb(byte[] bArr, int i10, int i11) throws zzgqy {
        int i12;
        int length = bArr.length;
        if ((((length - i10) - i11) | i10 | i11) >= 0) {
            int i13 = i10 + i11;
            char[] cArr = new char[i11];
            int i14 = 0;
            while (r12 < i13) {
                byte b10 = bArr[r12];
                if (!zzgtr.zzd(b10)) {
                    break;
                }
                i10 = r12 + 1;
                cArr[i12] = (char) b10;
                i14 = i12 + 1;
            }
            while (r12 < i13) {
                int i15 = r12 + 1;
                byte b11 = bArr[r12];
                if (zzgtr.zzd(b11)) {
                    int i16 = i12 + 1;
                    cArr[i12] = (char) b11;
                    r12 = i15;
                    while (true) {
                        i12 = i16;
                        if (r12 >= i13) {
                            break;
                        }
                        byte b12 = bArr[r12];
                        if (!zzgtr.zzd(b12)) {
                            break;
                        }
                        r12++;
                        i16 = i12 + 1;
                        cArr[i12] = (char) b12;
                    }
                } else if (zzgtr.zzf(b11)) {
                    if (i15 < i13) {
                        zzgtr.zzc(b11, bArr[i15], cArr, i12);
                        r12 = i15 + 1;
                        i12++;
                    } else {
                        throw zzgqy.zzd();
                    }
                } else if (zzgtr.zze(b11)) {
                    if (i15 < i13 - 1) {
                        int i17 = i15 + 1;
                        zzgtr.zzb(b11, bArr[i15], bArr[i17], cArr, i12);
                        r12 = i17 + 1;
                        i12++;
                    } else {
                        throw zzgqy.zzd();
                    }
                } else if (i15 < i13 - 2) {
                    int i18 = i15 + 1;
                    byte b13 = bArr[i15];
                    int i19 = i18 + 1;
                    zzgtr.zza(b11, b13, bArr[i18], bArr[i19], cArr, i12);
                    i12 += 2;
                    r12 = i19 + 1;
                } else {
                    throw zzgqy.zzd();
                }
            }
            return new String(cArr, 0, i12);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)}));
    }
}
