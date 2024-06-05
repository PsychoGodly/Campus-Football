package r8;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: JsonReader */
public class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final Reader f30065a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f30066b = false;

    /* renamed from: c  reason: collision with root package name */
    private final char[] f30067c = new char[1024];

    /* renamed from: d  reason: collision with root package name */
    private int f30068d = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f30069f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f30070g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f30071h = 0;

    /* renamed from: i  reason: collision with root package name */
    int f30072i = 0;

    /* renamed from: j  reason: collision with root package name */
    private long f30073j;

    /* renamed from: k  reason: collision with root package name */
    private int f30074k;

    /* renamed from: l  reason: collision with root package name */
    private String f30075l;

    /* renamed from: m  reason: collision with root package name */
    private int[] f30076m;

    /* renamed from: n  reason: collision with root package name */
    private int f30077n;

    /* renamed from: o  reason: collision with root package name */
    private String[] f30078o;

    /* renamed from: p  reason: collision with root package name */
    private int[] f30079p;

    /* renamed from: r8.a$a  reason: collision with other inner class name */
    /* compiled from: JsonReader */
    class C0333a extends q8.a {
        C0333a() {
        }
    }

    static {
        q8.a.f29708a = new C0333a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f30076m = iArr;
        this.f30077n = 0;
        this.f30077n = 0 + 1;
        iArr[0] = 6;
        this.f30078o = new String[32];
        this.f30079p = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f30065a = reader;
    }

    private boolean B(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f30067c;
        int i13 = this.f30071h;
        int i14 = this.f30068d;
        this.f30071h = i13 - i14;
        int i15 = this.f30069f;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f30069f = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f30069f = 0;
        }
        this.f30068d = 0;
        do {
            Reader reader = this.f30065a;
            int i17 = this.f30069f;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f30069f + read;
            this.f30069f = i11;
            if (this.f30070g == 0 && (i12 = this.f30071h) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f30068d++;
                this.f30071h = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    private int C0() throws IOException {
        char c10;
        char[] cArr = this.f30067c;
        int i10 = this.f30068d;
        int i11 = this.f30069f;
        int i12 = 0;
        int i13 = 0;
        char c11 = 0;
        boolean z10 = true;
        long j10 = 0;
        boolean z11 = false;
        while (true) {
            if (i10 + i13 == i11) {
                if (i13 == cArr.length) {
                    return i12;
                }
                if (!B(i13 + 1)) {
                    break;
                }
                i10 = this.f30068d;
                i11 = this.f30069f;
            }
            c10 = cArr[i10 + i13];
            if (c10 == '+') {
                i12 = 0;
                if (c11 != 5) {
                    return 0;
                }
            } else if (c10 == 'E' || c10 == 'e') {
                i12 = 0;
                if (c11 != 2 && c11 != 4) {
                    return 0;
                }
                c11 = 5;
                i13++;
            } else {
                if (c10 == '-') {
                    i12 = 0;
                    if (c11 == 0) {
                        c11 = 1;
                        z11 = true;
                    } else if (c11 != 5) {
                        return 0;
                    }
                } else if (c10 == '.') {
                    i12 = 0;
                    if (c11 != 2) {
                        return 0;
                    }
                    c11 = 3;
                } else if (c10 >= '0' && c10 <= '9') {
                    if (c11 == 1 || c11 == 0) {
                        j10 = (long) (-(c10 - '0'));
                        i12 = 0;
                        c11 = 2;
                    } else {
                        if (c11 == 2) {
                            if (j10 == 0) {
                                return 0;
                            }
                            long j11 = (10 * j10) - ((long) (c10 - '0'));
                            int i14 = (j10 > -922337203685477580L ? 1 : (j10 == -922337203685477580L ? 0 : -1));
                            z10 &= i14 > 0 || (i14 == 0 && j11 < j10);
                            j10 = j11;
                        } else if (c11 == 3) {
                            i12 = 0;
                            c11 = 4;
                        } else if (c11 == 5 || c11 == 6) {
                            i12 = 0;
                            c11 = 7;
                        }
                        i12 = 0;
                    }
                }
                i13++;
            }
            c11 = 6;
            i13++;
        }
        if (R(c10)) {
            return 0;
        }
        if (c11 == 2 && z10 && ((j10 != Long.MIN_VALUE || z11) && (j10 != 0 || !z11))) {
            if (!z11) {
                j10 = -j10;
            }
            this.f30073j = j10;
            this.f30068d += i13;
            this.f30072i = 15;
            return 15;
        } else if (c11 != 2 && c11 != 4 && c11 != 7) {
            return 0;
        } else {
            this.f30074k = i13;
            this.f30072i = 16;
            return 16;
        }
    }

    private void E0(int i10) {
        int i11 = this.f30077n;
        int[] iArr = this.f30076m;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f30076m = Arrays.copyOf(iArr, i12);
            this.f30079p = Arrays.copyOf(this.f30079p, i12);
            this.f30078o = (String[]) Arrays.copyOf(this.f30078o, i12);
        }
        int[] iArr2 = this.f30076m;
        int i13 = this.f30077n;
        this.f30077n = i13 + 1;
        iArr2[i13] = i10;
    }

    private char G0() throws IOException {
        int i10;
        int i11;
        if (this.f30068d != this.f30069f || B(1)) {
            char[] cArr = this.f30067c;
            int i12 = this.f30068d;
            int i13 = i12 + 1;
            this.f30068d = i13;
            char c10 = cArr[i12];
            if (c10 == 10) {
                this.f30070g++;
                this.f30071h = i13;
            } else if (!(c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\')) {
                if (c10 == 'b') {
                    return 8;
                }
                if (c10 == 'f') {
                    return 12;
                }
                if (c10 == 'n') {
                    return 10;
                }
                if (c10 == 'r') {
                    return 13;
                }
                if (c10 == 't') {
                    return 9;
                }
                if (c10 != 'u') {
                    throw Y0("Invalid escape sequence");
                } else if (i13 + 4 <= this.f30069f || B(4)) {
                    char c11 = 0;
                    int i14 = this.f30068d;
                    int i15 = i14 + 4;
                    while (i14 < i15) {
                        char c12 = this.f30067c[i14];
                        char c13 = (char) (c11 << 4);
                        if (c12 < '0' || c12 > '9') {
                            if (c12 >= 'a' && c12 <= 'f') {
                                i10 = c12 - 'a';
                            } else if (c12 < 'A' || c12 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f30067c, this.f30068d, 4));
                            } else {
                                i10 = c12 - 'A';
                            }
                            i11 = i10 + 10;
                        } else {
                            i11 = c12 - '0';
                        }
                        c11 = (char) (c13 + i11);
                        i14++;
                    }
                    this.f30068d += 4;
                    return c11;
                } else {
                    throw Y0("Unterminated escape sequence");
                }
            }
            return c10;
        }
        throw Y0("Unterminated escape sequence");
    }

    private String J(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f30077n;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f30076m[i10];
            if (i12 == 1 || i12 == 2) {
                int i13 = this.f30079p[i10];
                if (z10 && i13 > 0 && i10 == i11 - 1) {
                    i13--;
                }
                sb2.append('[');
                sb2.append(i13);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String[] strArr = this.f30078o;
                if (strArr[i10] != null) {
                    sb2.append(strArr[i10]);
                }
            }
            i10++;
        }
    }

    private boolean Q0(String str) throws IOException {
        int length = str.length();
        while (true) {
            int i10 = 0;
            if (this.f30068d + length > this.f30069f && !B(length)) {
                return false;
            }
            char[] cArr = this.f30067c;
            int i11 = this.f30068d;
            if (cArr[i11] == 10) {
                this.f30070g++;
                this.f30071h = i11 + 1;
            } else {
                while (i10 < length) {
                    if (this.f30067c[this.f30068d + i10] == str.charAt(i10)) {
                        i10++;
                    }
                }
                return true;
            }
            this.f30068d++;
        }
    }

    private boolean R(char c10) throws IOException {
        if (c10 == 9 || c10 == 10 || c10 == 12 || c10 == 13 || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (!(c10 == '/' || c10 == '=')) {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        j();
        return false;
    }

    private void X0() throws IOException {
        char c10;
        do {
            if (this.f30068d < this.f30069f || B(1)) {
                char[] cArr = this.f30067c;
                int i10 = this.f30068d;
                int i11 = i10 + 1;
                this.f30068d = i11;
                c10 = cArr[i10];
                if (c10 == 10) {
                    this.f30070g++;
                    this.f30071h = i11;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != 13);
    }

    private IOException Y0(String str) throws IOException {
        throw new c(str + Z());
    }

    private int i0(boolean z10) throws IOException {
        char[] cArr = this.f30067c;
        int i10 = this.f30068d;
        int i11 = this.f30069f;
        while (true) {
            if (i10 == i11) {
                this.f30068d = i10;
                if (B(1)) {
                    i10 = this.f30068d;
                    i11 = this.f30069f;
                } else if (!z10) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + Z());
                }
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == 10) {
                this.f30070g++;
                this.f30071h = i12;
            } else if (!(c10 == ' ' || c10 == 13 || c10 == 9)) {
                if (c10 == '/') {
                    this.f30068d = i12;
                    if (i12 == i11) {
                        this.f30068d = i12 - 1;
                        boolean B = B(2);
                        this.f30068d++;
                        if (!B) {
                            return c10;
                        }
                    }
                    j();
                    int i13 = this.f30068d;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f30068d = i13 + 1;
                        if (Q0("*/")) {
                            i10 = this.f30068d + 2;
                            i11 = this.f30069f;
                        } else {
                            throw Y0("Unterminated comment");
                        }
                    } else if (c11 != '/') {
                        return c10;
                    } else {
                        this.f30068d = i13 + 1;
                        X0();
                        i10 = this.f30068d;
                        i11 = this.f30069f;
                    }
                } else if (c10 == '#') {
                    this.f30068d = i12;
                    j();
                    X0();
                    i10 = this.f30068d;
                    i11 = this.f30069f;
                } else {
                    this.f30068d = i12;
                    return c10;
                }
            }
            i10 = i12;
        }
    }

    private void j() throws IOException {
        if (!this.f30066b) {
            throw Y0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void n() throws IOException {
        i0(true);
        int i10 = this.f30068d - 1;
        this.f30068d = i10;
        if (i10 + 5 <= this.f30069f || B(5)) {
            int i11 = this.f30068d;
            char[] cArr = this.f30067c;
            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == 10) {
                this.f30068d = i11 + 5;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r1 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r1.append(r0, r3, r2 - r3);
        r9.f30068d = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String n0(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f30067c
            r1 = 0
        L_0x0003:
            int r2 = r9.f30068d
            int r3 = r9.f30069f
        L_0x0007:
            r4 = r3
            r3 = r2
        L_0x0009:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L_0x005c
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L_0x0028
            r9.f30068d = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x0020
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L_0x0020:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x0028:
            r8 = 92
            if (r2 != r8) goto L_0x004f
            r9.f30068d = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x0040
            int r1 = r7 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L_0x0040:
            r1.append(r0, r3, r7)
            char r2 = r9.G0()
            r1.append(r2)
            int r2 = r9.f30068d
            int r3 = r9.f30069f
            goto L_0x0007
        L_0x004f:
            r5 = 10
            if (r2 != r5) goto L_0x005a
            int r2 = r9.f30070g
            int r2 = r2 + r6
            r9.f30070g = r2
            r9.f30071h = r7
        L_0x005a:
            r2 = r7
            goto L_0x0009
        L_0x005c:
            if (r1 != 0) goto L_0x006c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L_0x006c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f30068d = r2
            boolean r2 = r9.B(r6)
            if (r2 == 0) goto L_0x007a
            goto L_0x0003
        L_0x007a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.Y0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: r8.a.n0(char):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        j();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String v0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r6.f30068d
            int r4 = r3 + r2
            int r5 = r6.f30069f
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f30067c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.j()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f30067c
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.B(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f30067c
            int r4 = r6.f30068d
            r1.append(r3, r4, r2)
            int r3 = r6.f30068d
            int r3 = r3 + r2
            r6.f30068d = r3
            r2 = 1
            boolean r2 = r6.B(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f30067c
            int r3 = r6.f30068d
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f30067c
            int r3 = r6.f30068d
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f30068d
            int r2 = r2 + r0
            r6.f30068d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r8.a.v0():java.lang.String");
    }

    private int y0() throws IOException {
        String str;
        String str2;
        int i10;
        char c10 = this.f30067c[this.f30068d];
        if (c10 == 't' || c10 == 'T') {
            i10 = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c10 == 'f' || c10 == 'F') {
            i10 = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c10 != 'n' && c10 != 'N') {
            return 0;
        } else {
            i10 = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f30068d + i11 >= this.f30069f && !B(i11 + 1)) {
                return 0;
            }
            char c11 = this.f30067c[this.f30068d + i11];
            if (c11 != str2.charAt(i11) && c11 != str.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f30068d + length < this.f30069f || B(length + 1)) && R(this.f30067c[this.f30068d + length])) {
            return 0;
        }
        this.f30068d += length;
        this.f30072i = i10;
        return i10;
    }

    public void A() throws IOException {
        int i10 = this.f30072i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 2) {
            int i11 = this.f30077n - 1;
            this.f30077n = i11;
            this.f30078o[i11] = null;
            int[] iArr = this.f30079p;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f30072i = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + w0() + Z());
    }

    public boolean L() throws IOException {
        int i10 = this.f30072i;
        if (i10 == 0) {
            i10 = q();
        }
        return (i10 == 2 || i10 == 4 || i10 == 17) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public String Z() {
        return " at line " + (this.f30070g + 1) + " column " + ((this.f30068d - this.f30071h) + 1) + " path " + o0();
    }

    public void close() throws IOException {
        this.f30072i = 0;
        this.f30076m[0] = 8;
        this.f30077n = 1;
        this.f30065a.close();
    }

    public boolean e0() throws IOException {
        int i10 = this.f30072i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 5) {
            this.f30072i = 0;
            int[] iArr = this.f30079p;
            int i11 = this.f30077n - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f30072i = 0;
            int[] iArr2 = this.f30079p;
            int i12 = this.f30077n - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + w0() + Z());
        }
    }

    public double g0() throws IOException {
        int i10 = this.f30072i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 15) {
            this.f30072i = 0;
            int[] iArr = this.f30079p;
            int i11 = this.f30077n - 1;
            iArr[i11] = iArr[i11] + 1;
            return (double) this.f30073j;
        }
        if (i10 == 16) {
            this.f30075l = new String(this.f30067c, this.f30068d, this.f30074k);
            this.f30068d += this.f30074k;
        } else if (i10 == 8 || i10 == 9) {
            this.f30075l = n0(i10 == 8 ? '\'' : '\"');
        } else if (i10 == 10) {
            this.f30075l = v0();
        } else if (i10 != 11) {
            throw new IllegalStateException("Expected a double but was " + w0() + Z());
        }
        this.f30072i = 11;
        double parseDouble = Double.parseDouble(this.f30075l);
        if (this.f30066b || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f30075l = null;
            this.f30072i = 0;
            int[] iArr2 = this.f30079p;
            int i12 = this.f30077n - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        }
        throw new c("JSON forbids NaN and infinities: " + parseDouble + Z());
    }

    public void h() throws IOException {
        int i10 = this.f30072i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 3) {
            E0(1);
            this.f30079p[this.f30077n - 1] = 0;
            this.f30072i = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + w0() + Z());
    }

    public String h0() throws IOException {
        String str;
        int i10 = this.f30072i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 14) {
            str = v0();
        } else if (i10 == 12) {
            str = n0('\'');
        } else if (i10 == 13) {
            str = n0('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + w0() + Z());
        }
        this.f30072i = 0;
        this.f30078o[this.f30077n - 1] = str;
        return str;
    }

    public void i() throws IOException {
        int i10 = this.f30072i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 1) {
            E0(3);
            this.f30072i = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + w0() + Z());
    }

    public void l0() throws IOException {
        int i10 = this.f30072i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 7) {
            this.f30072i = 0;
            int[] iArr = this.f30079p;
            int i11 = this.f30077n - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + w0() + Z());
    }

    public String o0() {
        return J(false);
    }

    /* access modifiers changed from: package-private */
    public int q() throws IOException {
        int i02;
        int[] iArr = this.f30076m;
        int i10 = this.f30077n;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int i03 = i0(true);
            if (i03 != 44) {
                if (i03 == 59) {
                    j();
                } else if (i03 == 93) {
                    this.f30072i = 4;
                    return 4;
                } else {
                    throw Y0("Unterminated array");
                }
            }
        } else if (i11 == 3 || i11 == 5) {
            iArr[i10 - 1] = 4;
            if (i11 == 5 && (i02 = i0(true)) != 44) {
                if (i02 == 59) {
                    j();
                } else if (i02 == 125) {
                    this.f30072i = 2;
                    return 2;
                } else {
                    throw Y0("Unterminated object");
                }
            }
            int i04 = i0(true);
            if (i04 == 34) {
                this.f30072i = 13;
                return 13;
            } else if (i04 == 39) {
                j();
                this.f30072i = 12;
                return 12;
            } else if (i04 != 125) {
                j();
                this.f30068d--;
                if (R((char) i04)) {
                    this.f30072i = 14;
                    return 14;
                }
                throw Y0("Expected name");
            } else if (i11 != 5) {
                this.f30072i = 2;
                return 2;
            } else {
                throw Y0("Expected name");
            }
        } else if (i11 == 4) {
            iArr[i10 - 1] = 5;
            int i05 = i0(true);
            if (i05 != 58) {
                if (i05 == 61) {
                    j();
                    if (this.f30068d < this.f30069f || B(1)) {
                        char[] cArr = this.f30067c;
                        int i12 = this.f30068d;
                        if (cArr[i12] == '>') {
                            this.f30068d = i12 + 1;
                        }
                    }
                } else {
                    throw Y0("Expected ':'");
                }
            }
        } else if (i11 == 6) {
            if (this.f30066b) {
                n();
            }
            this.f30076m[this.f30077n - 1] = 7;
        } else if (i11 == 7) {
            if (i0(false) == -1) {
                this.f30072i = 17;
                return 17;
            }
            j();
            this.f30068d--;
        } else if (i11 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int i06 = i0(true);
        if (i06 == 34) {
            this.f30072i = 9;
            return 9;
        } else if (i06 != 39) {
            if (!(i06 == 44 || i06 == 59)) {
                if (i06 == 91) {
                    this.f30072i = 3;
                    return 3;
                } else if (i06 != 93) {
                    if (i06 != 123) {
                        this.f30068d--;
                        int y02 = y0();
                        if (y02 != 0) {
                            return y02;
                        }
                        int C0 = C0();
                        if (C0 != 0) {
                            return C0;
                        }
                        if (R(this.f30067c[this.f30068d])) {
                            j();
                            this.f30072i = 10;
                            return 10;
                        }
                        throw Y0("Expected value");
                    }
                    this.f30072i = 1;
                    return 1;
                } else if (i11 == 1) {
                    this.f30072i = 4;
                    return 4;
                }
            }
            if (i11 == 1 || i11 == 2) {
                j();
                this.f30068d--;
                this.f30072i = 7;
                return 7;
            }
            throw Y0("Unexpected value");
        } else {
            j();
            this.f30072i = 8;
            return 8;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + Z();
    }

    public void u() throws IOException {
        int i10 = this.f30072i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 4) {
            int i11 = this.f30077n - 1;
            this.f30077n = i11;
            int[] iArr = this.f30079p;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f30072i = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + w0() + Z());
    }

    public String u0() throws IOException {
        String str;
        int i10 = this.f30072i;
        if (i10 == 0) {
            i10 = q();
        }
        if (i10 == 10) {
            str = v0();
        } else if (i10 == 8) {
            str = n0('\'');
        } else if (i10 == 9) {
            str = n0('\"');
        } else if (i10 == 11) {
            str = this.f30075l;
            this.f30075l = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f30073j);
        } else if (i10 == 16) {
            str = new String(this.f30067c, this.f30068d, this.f30074k);
            this.f30068d += this.f30074k;
        } else {
            throw new IllegalStateException("Expected a string but was " + w0() + Z());
        }
        this.f30072i = 0;
        int[] iArr = this.f30079p;
        int i11 = this.f30077n - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public b w0() throws IOException {
        int i10 = this.f30072i;
        if (i10 == 0) {
            i10 = q();
        }
        switch (i10) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }
}
