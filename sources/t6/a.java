package t6;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import r6.k;
import r6.o;

/* compiled from: BaseEncoding */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final a f30341a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b  reason: collision with root package name */
    private static final a f30342b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c  reason: collision with root package name */
    private static final a f30343c = new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d  reason: collision with root package name */
    private static final a f30344d = new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e  reason: collision with root package name */
    private static final a f30345e = new b("base16()", "0123456789ABCDEF");

    /* renamed from: t6.a$a  reason: collision with other inner class name */
    /* compiled from: BaseEncoding */
    private static final class C0341a {

        /* renamed from: a  reason: collision with root package name */
        private final String f30346a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final char[] f30347b;

        /* renamed from: c  reason: collision with root package name */
        final int f30348c;

        /* renamed from: d  reason: collision with root package name */
        final int f30349d;

        /* renamed from: e  reason: collision with root package name */
        final int f30350e;

        /* renamed from: f  reason: collision with root package name */
        final int f30351f;

        /* renamed from: g  reason: collision with root package name */
        private final byte[] f30352g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean[] f30353h;

        C0341a(String str, char[] cArr) {
            this.f30346a = (String) o.o(str);
            this.f30347b = (char[]) o.o(cArr);
            try {
                int d10 = u6.b.d(cArr.length, RoundingMode.UNNECESSARY);
                this.f30349d = d10;
                int min = Math.min(8, Integer.lowestOneBit(d10));
                try {
                    this.f30350e = 8 / min;
                    this.f30351f = d10 / min;
                    this.f30348c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i10 = 0; i10 < cArr.length; i10++) {
                        char c10 = cArr[i10];
                        o.f(c10 < 128, "Non-ASCII character: %s", c10);
                        o.f(bArr[c10] == -1, "Duplicate character: %s", c10);
                        bArr[c10] = (byte) i10;
                    }
                    this.f30352g = bArr;
                    boolean[] zArr = new boolean[this.f30350e];
                    for (int i11 = 0; i11 < this.f30351f; i11++) {
                        zArr[u6.b.a(i11 * 8, this.f30349d, RoundingMode.CEILING)] = true;
                    }
                    this.f30353h = zArr;
                } catch (ArithmeticException e10) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e10);
                }
            } catch (ArithmeticException e11) {
                int length = cArr.length;
                StringBuilder sb2 = new StringBuilder(35);
                sb2.append("Illegal alphabet length ");
                sb2.append(length);
                throw new IllegalArgumentException(sb2.toString(), e11);
            }
        }

        /* access modifiers changed from: package-private */
        public int b(char c10) throws d {
            if (c10 > 127) {
                String valueOf = String.valueOf(Integer.toHexString(c10));
                throw new d(valueOf.length() != 0 ? "Unrecognized character: 0x".concat(valueOf) : new String("Unrecognized character: 0x"));
            }
            byte b10 = this.f30352g[c10];
            if (b10 != -1) {
                return b10;
            }
            if (c10 <= ' ' || c10 == 127) {
                String valueOf2 = String.valueOf(Integer.toHexString(c10));
                throw new d(valueOf2.length() != 0 ? "Unrecognized character: 0x".concat(valueOf2) : new String("Unrecognized character: 0x"));
            }
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Unrecognized character: ");
            sb2.append(c10);
            throw new d(sb2.toString());
        }

        /* access modifiers changed from: package-private */
        public char c(int i10) {
            return this.f30347b[i10];
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i10) {
            return this.f30353h[i10 % this.f30350e];
        }

        public boolean e(char c10) {
            byte[] bArr = this.f30352g;
            return c10 < bArr.length && bArr[c10] != -1;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0341a) {
                return Arrays.equals(this.f30347b, ((C0341a) obj).f30347b);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f30347b);
        }

        public String toString() {
            return this.f30346a;
        }
    }

    /* compiled from: BaseEncoding */
    static final class b extends e {

        /* renamed from: h  reason: collision with root package name */
        final char[] f30354h;

        b(String str, String str2) {
            this(new C0341a(str, str2.toCharArray()));
        }

        /* access modifiers changed from: package-private */
        public int d(byte[] bArr, CharSequence charSequence) throws d {
            o.o(bArr);
            if (charSequence.length() % 2 != 1) {
                int i10 = 0;
                int i11 = 0;
                while (i10 < charSequence.length()) {
                    bArr[i11] = (byte) ((this.f30355f.b(charSequence.charAt(i10)) << 4) | this.f30355f.b(charSequence.charAt(i10 + 1)));
                    i10 += 2;
                    i11++;
                }
                return i11;
            }
            int length = charSequence.length();
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Invalid input length ");
            sb2.append(length);
            throw new d(sb2.toString());
        }

        /* access modifiers changed from: package-private */
        public void g(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            o.o(appendable);
            o.t(i10, i10 + i11, bArr.length);
            for (int i12 = 0; i12 < i11; i12++) {
                byte b10 = bArr[i10 + i12] & 255;
                appendable.append(this.f30354h[b10]);
                appendable.append(this.f30354h[b10 | Ascii.NUL]);
            }
        }

        /* access modifiers changed from: package-private */
        public a n(C0341a aVar, Character ch) {
            return new b(aVar);
        }

        private b(C0341a aVar) {
            super(aVar, (Character) null);
            this.f30354h = new char[512];
            o.d(aVar.f30347b.length == 16);
            for (int i10 = 0; i10 < 256; i10++) {
                this.f30354h[i10] = aVar.c(i10 >>> 4);
                this.f30354h[i10 | 256] = aVar.c(i10 & 15);
            }
        }
    }

    /* compiled from: BaseEncoding */
    static final class c extends e {
        c(String str, String str2, Character ch) {
            this(new C0341a(str, str2.toCharArray()), ch);
        }

        /* access modifiers changed from: package-private */
        public int d(byte[] bArr, CharSequence charSequence) throws d {
            o.o(bArr);
            CharSequence l10 = l(charSequence);
            if (this.f30355f.d(l10.length())) {
                int i10 = 0;
                int i11 = 0;
                while (i10 < l10.length()) {
                    int i12 = i10 + 1;
                    int i13 = i12 + 1;
                    int b10 = (this.f30355f.b(l10.charAt(i10)) << 18) | (this.f30355f.b(l10.charAt(i12)) << 12);
                    int i14 = i11 + 1;
                    bArr[i11] = (byte) (b10 >>> 16);
                    if (i13 < l10.length()) {
                        int i15 = i13 + 1;
                        int b11 = b10 | (this.f30355f.b(l10.charAt(i13)) << 6);
                        i11 = i14 + 1;
                        bArr[i14] = (byte) ((b11 >>> 8) & 255);
                        if (i15 < l10.length()) {
                            i13 = i15 + 1;
                            i14 = i11 + 1;
                            bArr[i11] = (byte) ((b11 | this.f30355f.b(l10.charAt(i15))) & 255);
                        } else {
                            i10 = i15;
                        }
                    }
                    i11 = i14;
                    i10 = i13;
                }
                return i11;
            }
            int length = l10.length();
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Invalid input length ");
            sb2.append(length);
            throw new d(sb2.toString());
        }

        /* access modifiers changed from: package-private */
        public void g(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            o.o(appendable);
            int i12 = i10 + i11;
            o.t(i10, i12, bArr.length);
            while (i11 >= 3) {
                int i13 = i10 + 1;
                int i14 = i13 + 1;
                byte b10 = ((bArr[i10] & 255) << Ascii.DLE) | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                appendable.append(this.f30355f.c(b10 >>> Ascii.DC2));
                appendable.append(this.f30355f.c((b10 >>> Ascii.FF) & 63));
                appendable.append(this.f30355f.c((b10 >>> 6) & 63));
                appendable.append(this.f30355f.c(b10 & 63));
                i11 -= 3;
                i10 = i14 + 1;
            }
            if (i10 < i12) {
                m(appendable, bArr, i10, i12 - i10);
            }
        }

        /* access modifiers changed from: package-private */
        public a n(C0341a aVar, Character ch) {
            return new c(aVar, ch);
        }

        private c(C0341a aVar, Character ch) {
            super(aVar, ch);
            o.d(aVar.f30347b.length == 64);
        }
    }

    /* compiled from: BaseEncoding */
    public static final class d extends IOException {
        d(String str) {
            super(str);
        }
    }

    /* compiled from: BaseEncoding */
    static class e extends a {

        /* renamed from: f  reason: collision with root package name */
        final C0341a f30355f;

        /* renamed from: g  reason: collision with root package name */
        final Character f30356g;

        e(String str, String str2, Character ch) {
            this(new C0341a(str, str2.toCharArray()), ch);
        }

        /* access modifiers changed from: package-private */
        public int d(byte[] bArr, CharSequence charSequence) throws d {
            C0341a aVar;
            o.o(bArr);
            CharSequence l10 = l(charSequence);
            if (this.f30355f.d(l10.length())) {
                int i10 = 0;
                int i11 = 0;
                while (i10 < l10.length()) {
                    long j10 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        aVar = this.f30355f;
                        if (i12 >= aVar.f30350e) {
                            break;
                        }
                        j10 <<= aVar.f30349d;
                        if (i10 + i12 < l10.length()) {
                            j10 |= (long) this.f30355f.b(l10.charAt(i13 + i10));
                            i13++;
                        }
                        i12++;
                    }
                    int i14 = aVar.f30351f;
                    int i15 = (i14 * 8) - (i13 * aVar.f30349d);
                    int i16 = (i14 - 1) * 8;
                    while (i16 >= i15) {
                        bArr[i11] = (byte) ((int) ((j10 >>> i16) & 255));
                        i16 -= 8;
                        i11++;
                    }
                    i10 += this.f30355f.f30350e;
                }
                return i11;
            }
            int length = l10.length();
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Invalid input length ");
            sb2.append(length);
            throw new d(sb2.toString());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!this.f30355f.equals(eVar.f30355f) || !k.a(this.f30356g, eVar.f30356g)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void g(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            o.o(appendable);
            o.t(i10, i10 + i11, bArr.length);
            int i12 = 0;
            while (i12 < i11) {
                m(appendable, bArr, i10 + i12, Math.min(this.f30355f.f30351f, i11 - i12));
                i12 += this.f30355f.f30351f;
            }
        }

        public int hashCode() {
            return this.f30355f.hashCode() ^ k.b(this.f30356g);
        }

        /* access modifiers changed from: package-private */
        public int i(int i10) {
            return (int) (((((long) this.f30355f.f30349d) * ((long) i10)) + 7) / 8);
        }

        /* access modifiers changed from: package-private */
        public int j(int i10) {
            C0341a aVar = this.f30355f;
            return aVar.f30350e * u6.b.a(i10, aVar.f30351f, RoundingMode.CEILING);
        }

        public a k() {
            return this.f30356g == null ? this : n(this.f30355f, (Character) null);
        }

        /* access modifiers changed from: package-private */
        public CharSequence l(CharSequence charSequence) {
            o.o(charSequence);
            Character ch = this.f30356g;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        /* access modifiers changed from: package-private */
        public void m(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            o.o(appendable);
            o.t(i10, i10 + i11, bArr.length);
            int i12 = 0;
            o.d(i11 <= this.f30355f.f30351f);
            long j10 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
            }
            int i14 = ((i11 + 1) * 8) - this.f30355f.f30349d;
            while (i12 < i11 * 8) {
                C0341a aVar = this.f30355f;
                appendable.append(aVar.c(((int) (j10 >>> (i14 - i12))) & aVar.f30348c));
                i12 += this.f30355f.f30349d;
            }
            if (this.f30356g != null) {
                while (i12 < this.f30355f.f30351f * 8) {
                    appendable.append(this.f30356g.charValue());
                    i12 += this.f30355f.f30349d;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public a n(C0341a aVar, Character ch) {
            return new e(aVar, ch);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f30355f.toString());
            if (8 % this.f30355f.f30349d != 0) {
                if (this.f30356g == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f30356g);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        e(C0341a aVar, Character ch) {
            this.f30355f = (C0341a) o.o(aVar);
            o.k(ch == null || !aVar.e(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.f30356g = ch;
        }
    }

    a() {
    }

    public static a a() {
        return f30341a;
    }

    private static byte[] h(byte[] bArr, int i10) {
        if (i10 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    public final byte[] b(CharSequence charSequence) {
        try {
            return c(charSequence);
        } catch (d e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final byte[] c(CharSequence charSequence) throws d {
        CharSequence l10 = l(charSequence);
        byte[] bArr = new byte[i(l10.length())];
        return h(bArr, d(bArr, l10));
    }

    /* access modifiers changed from: package-private */
    public abstract int d(byte[] bArr, CharSequence charSequence) throws d;

    public String e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public final String f(byte[] bArr, int i10, int i11) {
        o.t(i10, i10 + i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(j(i11));
        try {
            g(sb2, bArr, i10, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void g(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract int i(int i10);

    /* access modifiers changed from: package-private */
    public abstract int j(int i10);

    public abstract a k();

    /* access modifiers changed from: package-private */
    public abstract CharSequence l(CharSequence charSequence);
}
