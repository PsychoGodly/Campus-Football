package id;

import com.unity3d.services.core.network.model.HttpRequest;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Locale;
import lf.c;

/* compiled from: HttpUrl */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    private static final char[] f33321e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    private final String f33322a;

    /* renamed from: b  reason: collision with root package name */
    private final String f33323b;

    /* renamed from: c  reason: collision with root package name */
    private final int f33324c;

    /* renamed from: d  reason: collision with root package name */
    private final String f33325d;

    /* compiled from: HttpUrl */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        String f33326a;

        /* renamed from: b  reason: collision with root package name */
        String f33327b;

        /* renamed from: c  reason: collision with root package name */
        int f33328c = -1;

        private static String b(String str, int i10, int i11) {
            String d10 = a.d(str, i10, i11, false);
            if (!d10.startsWith("[") || !d10.endsWith("]")) {
                return f(d10);
            }
            InetAddress e10 = e(d10, 1, d10.length() - 1);
            if (e10 == null) {
                return null;
            }
            byte[] address = e10.getAddress();
            if (address.length == 16) {
                return i(address);
            }
            throw new AssertionError();
        }

        private static boolean c(String str) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                    return true;
                }
            }
            return false;
        }

        private static boolean d(String str, int i10, int i11, byte[] bArr, int i12) {
            int i13 = i12;
            while (i10 < i11) {
                if (i13 == bArr.length) {
                    return false;
                }
                if (i13 != i12) {
                    if (str.charAt(i10) != '.') {
                        return false;
                    }
                    i10++;
                }
                int i14 = i10;
                int i15 = 0;
                while (i14 < i11) {
                    char charAt = str.charAt(i14);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    } else if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + charAt) - 48) > 255) {
                        return false;
                    } else {
                        i14++;
                    }
                }
                if (i14 - i10 == 0) {
                    return false;
                }
                bArr[i13] = (byte) i15;
                i13++;
                i10 = i14;
            }
            if (i13 != i12 + 4) {
                return false;
            }
            return true;
        }

        private static InetAddress e(String str, int i10, int i11) {
            byte[] bArr = new byte[16];
            int i12 = 0;
            int i13 = -1;
            int i14 = -1;
            while (true) {
                if (i10 >= i11) {
                    break;
                } else if (i12 == 16) {
                    return null;
                } else {
                    int i15 = i10 + 2;
                    if (i15 > i11 || !str.regionMatches(i10, "::", 0, 2)) {
                        if (i12 != 0) {
                            if (str.regionMatches(i10, ":", 0, 1)) {
                                i10++;
                            } else if (!str.regionMatches(i10, ".", 0, 1) || !d(str, i14, i11, bArr, i12 - 2)) {
                                return null;
                            } else {
                                i12 += 2;
                            }
                        }
                        i14 = i10;
                    } else if (i13 != -1) {
                        return null;
                    } else {
                        i12 += 2;
                        i13 = i12;
                        if (i15 == i11) {
                            break;
                        }
                        i14 = i15;
                    }
                    i10 = i14;
                    int i16 = 0;
                    while (i10 < i11) {
                        int a10 = a.a(str.charAt(i10));
                        if (a10 == -1) {
                            break;
                        }
                        i16 = (i16 << 4) + a10;
                        i10++;
                    }
                    int i17 = i10 - i14;
                    if (i17 == 0 || i17 > 4) {
                        return null;
                    }
                    int i18 = i12 + 1;
                    bArr[i12] = (byte) ((i16 >>> 8) & 255);
                    i12 = i18 + 1;
                    bArr[i18] = (byte) (i16 & 255);
                }
            }
            if (i12 != 16) {
                if (i13 == -1) {
                    return null;
                }
                int i19 = i12 - i13;
                System.arraycopy(bArr, i13, bArr, 16 - i19, i19);
                Arrays.fill(bArr, i13, (16 - i12) + i13, (byte) 0);
            }
            try {
                return InetAddress.getByAddress(bArr);
            } catch (UnknownHostException unused) {
                throw new AssertionError();
            }
        }

        private static String f(String str) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty() && !c(lowerCase)) {
                    return lowerCase;
                }
                return null;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private static String i(byte[] bArr) {
            int i10 = 0;
            int i11 = -1;
            int i12 = 0;
            int i13 = 0;
            while (i12 < bArr.length) {
                int i14 = i12;
                while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                    i14 += 2;
                }
                int i15 = i14 - i12;
                if (i15 > i13) {
                    i11 = i12;
                    i13 = i15;
                }
                i12 = i14 + 2;
            }
            c cVar = new c();
            while (i10 < bArr.length) {
                if (i10 == i11) {
                    cVar.G(58);
                    i10 += i13;
                    if (i10 == 16) {
                        cVar.G(58);
                    }
                } else {
                    if (i10 > 0) {
                        cVar.G(58);
                    }
                    cVar.b0((long) (((bArr[i10] & 255) << 8) | (bArr[i10 + 1] & 255)));
                    i10 += 2;
                }
            }
            return cVar.l0();
        }

        public a a() {
            if (this.f33326a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f33327b != null) {
                return new a(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        public int g() {
            int i10 = this.f33328c;
            return i10 != -1 ? i10 : a.b(this.f33326a);
        }

        public b h(String str) {
            if (str != null) {
                String b10 = b(str, 0, str.length());
                if (b10 != null) {
                    this.f33327b = b10;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new IllegalArgumentException("host == null");
        }

        public b j(int i10) {
            if (i10 <= 0 || i10 > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i10);
            }
            this.f33328c = i10;
            return this;
        }

        public b k(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.f33326a = "http";
                } else if (str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                    this.f33326a = HttpRequest.DEFAULT_SCHEME;
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                return this;
            }
            throw new IllegalArgumentException("scheme == null");
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f33326a);
            sb2.append("://");
            if (this.f33327b.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.f33327b);
                sb2.append(']');
            } else {
                sb2.append(this.f33327b);
            }
            int g10 = g();
            if (g10 != a.b(this.f33326a)) {
                sb2.append(':');
                sb2.append(g10);
            }
            return sb2.toString();
        }
    }

    static int a(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static int b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
    }

    static String d(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '%' || (charAt == '+' && z10)) {
                c cVar = new c();
                cVar.e1(str, i10, i12);
                e(cVar, str, i12, i11, z10);
                return cVar.l0();
            }
        }
        return str.substring(i10, i11);
    }

    static void e(c cVar, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt == 37 && (i12 = i10 + 2) < i11) {
                int a10 = a(str.charAt(i10 + 1));
                int a11 = a(str.charAt(i12));
                if (!(a10 == -1 || a11 == -1)) {
                    cVar.G((a10 << 4) + a11);
                    i10 = i12;
                    i10 += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z10) {
                cVar.G(32);
                i10 += Character.charCount(codePointAt);
            }
            cVar.f1(codePointAt);
            i10 += Character.charCount(codePointAt);
        }
    }

    public String c() {
        return this.f33323b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f33325d.equals(this.f33325d);
    }

    public int f() {
        return this.f33324c;
    }

    public int hashCode() {
        return this.f33325d.hashCode();
    }

    public String toString() {
        return this.f33325d;
    }

    private a(b bVar) {
        this.f33322a = bVar.f33326a;
        this.f33323b = bVar.f33327b;
        this.f33324c = bVar.g();
        this.f33325d = bVar.toString();
    }
}
