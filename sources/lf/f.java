package lf;

import com.applovin.exoplayer2.common.base.Ascii;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: ByteString */
public class f implements Serializable, Comparable<f> {

    /* renamed from: d  reason: collision with root package name */
    static final char[] f36254d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: f  reason: collision with root package name */
    public static final f f36255f = k(new byte[0]);

    /* renamed from: a  reason: collision with root package name */
    final byte[] f36256a;

    /* renamed from: b  reason: collision with root package name */
    transient int f36257b;

    /* renamed from: c  reason: collision with root package name */
    transient String f36258c;

    f(byte[] bArr) {
        this.f36256a = bArr;
    }

    static int c(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            if (i12 == i10) {
                return i11;
            }
            int codePointAt = str.codePointAt(i11);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i12++;
            i11 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    public static f e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((f(str.charAt(i11)) << 4) + f(str.charAt(i11 + 1)));
            }
            return k(bArr);
        } else {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
    }

    private static int f(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    private f g(String str) {
        try {
            return k(MessageDigest.getInstance(str).digest(this.f36256a));
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public static f h(String str) {
        if (str != null) {
            f fVar = new f(str.getBytes(u.f36298a));
            fVar.f36258c = str;
            return fVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static f k(byte... bArr) {
        if (bArr != null) {
            return new f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String a() {
        return b.a(this.f36256a);
    }

    /* renamed from: d */
    public int compareTo(f fVar) {
        int p10 = p();
        int p11 = fVar.p();
        int min = Math.min(p10, p11);
        int i10 = 0;
        while (i10 < min) {
            byte i11 = i(i10) & 255;
            byte i12 = fVar.i(i10) & 255;
            if (i11 == i12) {
                i10++;
            } else if (i11 < i12) {
                return -1;
            } else {
                return 1;
            }
        }
        if (p10 == p11) {
            return 0;
        }
        if (p10 < p11) {
            return -1;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int p10 = fVar.p();
            byte[] bArr = this.f36256a;
            if (p10 != bArr.length || !fVar.m(0, bArr, 0, bArr.length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f36257b;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.f36256a);
        this.f36257b = hashCode;
        return hashCode;
    }

    public byte i(int i10) {
        return this.f36256a[i10];
    }

    public String j() {
        byte[] bArr = this.f36256a;
        char[] cArr = new char[(bArr.length * 2)];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f36254d;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & Ascii.SI];
        }
        return new String(cArr);
    }

    public boolean l(int i10, f fVar, int i11, int i12) {
        return fVar.m(i11, this.f36256a, i10, i12);
    }

    public boolean m(int i10, byte[] bArr, int i11, int i12) {
        if (i10 >= 0) {
            byte[] bArr2 = this.f36256a;
            return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && u.a(bArr2, i10, bArr, i11, i12);
        }
    }

    public f n() {
        return g(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    public f o() {
        return g("SHA-256");
    }

    public int p() {
        return this.f36256a.length;
    }

    public final boolean q(f fVar) {
        return l(0, fVar, 0, fVar.p());
    }

    public f r(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.f36256a;
            if (i11 <= bArr.length) {
                int i12 = i11 - i10;
                if (i12 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i10 == 0 && i11 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i12];
                    System.arraycopy(bArr, i10, bArr2, 0, i12);
                    return new f(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.f36256a.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public f s() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f36256a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 < 65 || b10 > 90) {
                i10++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArr2.length; i11++) {
                    byte b11 = bArr2[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArr2[i11] = (byte) (b11 + 32);
                    }
                }
                return new f(bArr2);
            }
        }
    }

    public byte[] t() {
        return (byte[]) this.f36256a.clone();
    }

    public String toString() {
        if (this.f36256a.length == 0) {
            return "[size=0]";
        }
        String u10 = u();
        int c10 = c(u10, 64);
        if (c10 != -1) {
            String replace = u10.substring(0, c10).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (c10 < u10.length()) {
                return "[size=" + this.f36256a.length + " text=" + replace + "…]";
            }
            return "[text=" + replace + "]";
        } else if (this.f36256a.length <= 64) {
            return "[hex=" + j() + "]";
        } else {
            return "[size=" + this.f36256a.length + " hex=" + r(0, 64).j() + "…]";
        }
    }

    public String u() {
        String str = this.f36258c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f36256a, u.f36298a);
        this.f36258c = str2;
        return str2;
    }

    /* access modifiers changed from: package-private */
    public void v(c cVar) {
        byte[] bArr = this.f36256a;
        cVar.f(bArr, 0, bArr.length);
    }
}
