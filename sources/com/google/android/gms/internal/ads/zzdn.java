package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdn {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {MaxReward.DEFAULT_LABEL, "A", "B", "C"};

    public static String zza(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
    }

    public static String zzb(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = new Object[5];
        objArr[0] = zzc[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        objArr[3] = Character.valueOf(true != z10 ? 'L' : 'H');
        objArr[4] = Integer.valueOf(i13);
        StringBuilder sb2 = new StringBuilder(zzew.zzI("hvc1.%s%d.%X.%c%d", objArr));
        int i14 = 6;
        while (i14 > 0) {
            int i15 = i14 - 1;
            if (iArr[i15] != 0) {
                break;
            }
            i14 = i15;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            sb2.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i16])}));
        }
        return sb2.toString();
    }

    public static byte[] zzc(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[(i11 + 4)];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        return bArr2;
    }
}
