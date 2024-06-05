package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
class zzea extends zzeb {
    final zzdw zzb;
    final Character zzc;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzea(com.google.android.recaptcha.internal.zzdw r4, java.lang.Character r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.zzb = r4
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L_0x0017
            r5.charValue()
            r2 = 61
            boolean r4 = r4.zzd(r2)
            if (r4 != 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r4 = 0
            goto L_0x0018
        L_0x0017:
            r4 = 1
        L_0x0018:
            if (r4 == 0) goto L_0x001d
            r3.zzc = r5
            return
        L_0x001d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.String r5 = "Padding character %s was already in alphabet"
            java.lang.String r5 = com.google.android.recaptcha.internal.zzdl.zza(r5, r1)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzea.<init>(com.google.android.recaptcha.internal.zzdw, java.lang.Character):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzea) {
            zzea zzea = (zzea) obj;
            if (this.zzb.equals(zzea.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzea.zzc;
                if (ch == ch2) {
                    return true;
                }
                if (ch == null || !ch.equals(ch2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.zzb.hashCode();
        Character ch = this.zzc;
        if (ch == null) {
            i10 = 0;
        } else {
            i10 = ch.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public int zza(byte[] bArr, CharSequence charSequence) throws zzdz {
        zzdw zzdw;
        Objects.requireNonNull(bArr);
        CharSequence zze = zze(charSequence);
        if (this.zzb.zzc(zze.length())) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < zze.length()) {
                long j10 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    zzdw = this.zzb;
                    if (i12 >= zzdw.zzc) {
                        break;
                    }
                    j10 <<= zzdw.zzb;
                    if (i10 + i12 < zze.length()) {
                        j10 |= (long) this.zzb.zzb(zze.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = zzdw.zzd;
                int i15 = i14 * 8;
                int i16 = i13 * zzdw.zzb;
                int i17 = (i14 - 1) * 8;
                while (i17 >= i15 - i16) {
                    bArr[i11] = (byte) ((int) ((j10 >>> i17) & 255));
                    i17 -= 8;
                    i11++;
                }
                i10 += this.zzb.zzc;
            }
            return i11;
        }
        throw new zzdz("Invalid input length " + zze.length());
    }

    /* access modifiers changed from: package-private */
    public void zzb(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzdi.zzd(0, i11, bArr.length);
        while (i12 < i11) {
            zzf(appendable, bArr, i12, Math.min(this.zzb.zzd, i11 - i12));
            i12 += this.zzb.zzd;
        }
    }

    /* access modifiers changed from: package-private */
    public final int zzc(int i10) {
        return (int) (((((long) this.zzb.zzb) * ((long) i10)) + 7) / 8);
    }

    /* access modifiers changed from: package-private */
    public final int zzd(int i10) {
        zzdw zzdw = this.zzb;
        return zzdw.zzc * zzed.zza(i10, zzdw.zzd, RoundingMode.CEILING);
    }

    /* access modifiers changed from: package-private */
    public final CharSequence zze(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Character ch = this.zzc;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0 || charSequence.charAt(length) != '=') {
            }
            length--;
            break;
        } while (charSequence.charAt(length) != '=');
        return charSequence.subSequence(0, length + 1);
    }

    /* access modifiers changed from: package-private */
    public final void zzf(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzdi.zzd(i10, i10 + i11, bArr.length);
        int i12 = 0;
        zzdi.zza(i11 <= this.zzb.zzd);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
        }
        int i14 = ((i11 + 1) * 8) - this.zzb.zzb;
        while (i12 < i11 * 8) {
            zzdw zzdw = this.zzb;
            appendable.append(zzdw.zza(zzdw.zza & ((int) (j10 >>> (i14 - i12)))));
            i12 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i12 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i12 += this.zzb.zzb;
            }
        }
    }

    zzea(String str, String str2, Character ch) {
        this(new zzdw(str, str2.toCharArray()), ch);
    }
}
