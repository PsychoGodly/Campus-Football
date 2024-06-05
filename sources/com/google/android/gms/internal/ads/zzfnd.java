package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class zzfnd extends zzfnc {
    private final char zza;

    zzfnd(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CharMatcher.is('");
        int i10 = this.zza;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append("')");
        return sb2.toString();
    }

    public final boolean zzb(char c10) {
        return c10 == this.zza;
    }
}
