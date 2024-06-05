package com.google.android.recaptcha.internal;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzdy extends zzea {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzdy(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
        /*
            r1 = this;
            com.google.android.recaptcha.internal.zzdw r0 = new com.google.android.recaptcha.internal.zzdw
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = r0.zzf
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            com.google.android.recaptcha.internal.zzdi.zza(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdy.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    /* access modifiers changed from: package-private */
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzdz {
        Objects.requireNonNull(bArr);
        CharSequence zze = zze(charSequence);
        if (this.zzb.zzc(zze.length())) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < zze.length()) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                int zzb = (this.zzb.zzb(zze.charAt(i10)) << 18) | (this.zzb.zzb(zze.charAt(i12)) << 12);
                bArr[i11] = (byte) (zzb >>> 16);
                int i14 = i12 + 1;
                if (i14 < zze.length()) {
                    int i15 = i14 + 1;
                    int zzb2 = zzb | (this.zzb.zzb(zze.charAt(i14)) << 6);
                    i11 = i13 + 1;
                    bArr[i13] = (byte) ((zzb2 >>> 8) & 255);
                    if (i15 < zze.length()) {
                        bArr[i11] = (byte) ((zzb2 | this.zzb.zzb(zze.charAt(i15))) & 255);
                        i11++;
                        i10 = i15 + 1;
                    } else {
                        i10 = i15;
                    }
                } else {
                    i10 = i14;
                    i11 = i13;
                }
            }
            return i11;
        }
        int length = zze.length();
        throw new zzdz("Invalid input length " + length);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzdi.zzd(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = i12 + 1;
            int i15 = i14 + 1;
            zzdw zzdw = this.zzb;
            byte b10 = ((bArr[i12] & 255) << Ascii.DLE) | ((bArr[i14] & 255) << 8) | (bArr[i15] & 255);
            appendable.append(zzdw.zza(b10 >>> Ascii.DC2));
            appendable.append(this.zzb.zza((b10 >>> Ascii.FF) & 63));
            appendable.append(this.zzb.zza((b10 >>> 6) & 63));
            appendable.append(this.zzb.zza(b10 & 63));
            i12 = i15 + 1;
        }
        if (i12 < i11) {
            zzf(appendable, bArr, i12, i11 - i12);
        }
    }
}
