package com.google.android.recaptcha.internal;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzdx extends zzea {
    final char[] zza = new char[512];

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzdx(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            com.google.android.recaptcha.internal.zzdw r4 = new com.google.android.recaptcha.internal.zzdw
            java.lang.String r5 = "0123456789ABCDEF"
            char[] r5 = r5.toCharArray()
            java.lang.String r0 = "base16()"
            r4.<init>(r0, r5)
            r5 = 0
            r3.<init>(r4, r5)
            r5 = 512(0x200, float:7.175E-43)
            char[] r5 = new char[r5]
            r3.zza = r5
            char[] r5 = r4.zzf
            int r5 = r5.length
            r0 = 0
            r1 = 16
            if (r5 != r1) goto L_0x0023
            r5 = 1
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            com.google.android.recaptcha.internal.zzdi.zza(r5)
        L_0x0027:
            r5 = 256(0x100, float:3.59E-43)
            if (r0 >= r5) goto L_0x0044
            char[] r5 = r3.zza
            int r1 = r0 >>> 4
            char r1 = r4.zza(r1)
            r5[r0] = r1
            char[] r5 = r3.zza
            r1 = r0 | 256(0x100, float:3.59E-43)
            r2 = r0 & 15
            char r2 = r4.zza(r2)
            r5[r1] = r2
            int r0 = r0 + 1
            goto L_0x0027
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdx.<init>(java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzdz {
        Objects.requireNonNull(bArr);
        if (charSequence.length() % 2 != 1) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                bArr[i11] = (byte) ((this.zzb.zzb(charSequence.charAt(i10)) << 4) | this.zzb.zzb(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }
        int length = charSequence.length();
        throw new zzdz("Invalid input length " + length);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzdi.zzd(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            byte b10 = bArr[i12] & 255;
            appendable.append(this.zza[b10]);
            appendable.append(this.zza[b10 | Ascii.NUL]);
        }
    }
}
