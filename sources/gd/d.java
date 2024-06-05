package gd;

import com.applovin.mediation.MaxReward;
import javax.security.auth.x500.X500Principal;

/* compiled from: DistinguishedNameParser */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f32882a;

    /* renamed from: b  reason: collision with root package name */
    private final int f32883b;

    /* renamed from: c  reason: collision with root package name */
    private int f32884c;

    /* renamed from: d  reason: collision with root package name */
    private int f32885d;

    /* renamed from: e  reason: collision with root package name */
    private int f32886e;

    /* renamed from: f  reason: collision with root package name */
    private int f32887f;

    /* renamed from: g  reason: collision with root package name */
    private char[] f32888g;

    public d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f32882a = name;
        this.f32883b = name.length();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0095, code lost:
        r1 = r8.f32888g;
        r2 = r8.f32885d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        return new java.lang.String(r1, r2, r8.f32887f - r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a() {
        /*
            r8 = this;
            int r0 = r8.f32884c
            r8.f32885d = r0
            r8.f32886e = r0
        L_0x0006:
            int r0 = r8.f32884c
            int r1 = r8.f32883b
            if (r0 < r1) goto L_0x0019
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f32888g
            int r2 = r8.f32885d
            int r3 = r8.f32886e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0019:
            char[] r1 = r8.f32888g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L_0x005e
            if (r2 == r5) goto L_0x0053
            r5 = 92
            if (r2 == r5) goto L_0x0040
            if (r2 == r4) goto L_0x0053
            if (r2 == r3) goto L_0x0053
            int r2 = r8.f32886e
            int r3 = r2 + 1
            r8.f32886e = r3
            char r3 = r1[r0]
            r1[r2] = r3
            int r0 = r0 + 1
            r8.f32884c = r0
            goto L_0x0006
        L_0x0040:
            int r0 = r8.f32886e
            int r2 = r0 + 1
            r8.f32886e = r2
            char r2 = r8.d()
            r1[r0] = r2
            int r0 = r8.f32884c
            int r0 = r0 + 1
            r8.f32884c = r0
            goto L_0x0006
        L_0x0053:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f32885d
            int r3 = r8.f32886e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x005e:
            int r2 = r8.f32886e
            r8.f32887f = r2
            int r0 = r0 + 1
            r8.f32884c = r0
            int r0 = r2 + 1
            r8.f32886e = r0
            r1[r2] = r6
        L_0x006c:
            int r0 = r8.f32884c
            int r1 = r8.f32883b
            if (r0 >= r1) goto L_0x0085
            char[] r2 = r8.f32888g
            char r7 = r2[r0]
            if (r7 != r6) goto L_0x0085
            int r1 = r8.f32886e
            int r7 = r1 + 1
            r8.f32886e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f32884c = r0
            goto L_0x006c
        L_0x0085:
            if (r0 == r1) goto L_0x0095
            char[] r1 = r8.f32888g
            char r2 = r1[r0]
            if (r2 == r3) goto L_0x0095
            char r2 = r1[r0]
            if (r2 == r4) goto L_0x0095
            char r0 = r1[r0]
            if (r0 != r5) goto L_0x0006
        L_0x0095:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f32888g
            int r2 = r8.f32885d
            int r3 = r8.f32887f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.d.a():java.lang.String");
    }

    private int c(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        if (i13 < this.f32883b) {
            char[] cArr = this.f32888g;
            char c10 = cArr[i10];
            if (c10 >= '0' && c10 <= '9') {
                i11 = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i11 = c10 - 'W';
            } else if (c10 < 'A' || c10 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f32882a);
            } else {
                i11 = c10 - '7';
            }
            char c11 = cArr[i13];
            if (c11 >= '0' && c11 <= '9') {
                i12 = c11 - '0';
            } else if (c11 >= 'a' && c11 <= 'f') {
                i12 = c11 - 'W';
            } else if (c11 < 'A' || c11 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f32882a);
            } else {
                i12 = c11 - '7';
            }
            return (i11 << 4) + i12;
        }
        throw new IllegalStateException("Malformed DN: " + this.f32882a);
    }

    private char d() {
        int i10 = this.f32884c + 1;
        this.f32884c = i10;
        if (i10 != this.f32883b) {
            char[] cArr = this.f32888g;
            char c10 = cArr[i10];
            if (!(c10 == ' ' || c10 == '%' || c10 == '\\' || c10 == '_' || c10 == '\"' || c10 == '#')) {
                switch (c10) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c10) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return e();
                        }
                }
            }
            return cArr[i10];
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f32882a);
    }

    private char e() {
        int i10;
        int i11;
        int c10 = c(this.f32884c);
        this.f32884c++;
        if (c10 < 128) {
            return (char) c10;
        }
        if (c10 < 192 || c10 > 247) {
            return '?';
        }
        if (c10 <= 223) {
            i11 = c10 & 31;
            i10 = 1;
        } else if (c10 <= 239) {
            i10 = 2;
            i11 = c10 & 15;
        } else {
            i10 = 3;
            i11 = c10 & 7;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = this.f32884c + 1;
            this.f32884c = i13;
            if (i13 == this.f32883b || this.f32888g[i13] != '\\') {
                return '?';
            }
            int i14 = i13 + 1;
            this.f32884c = i14;
            int c11 = c(i14);
            this.f32884c++;
            if ((c11 & 192) != 128) {
                return '?';
            }
            i11 = (i11 << 6) + (c11 & 63);
        }
        return (char) i11;
    }

    private String f() {
        int i10;
        int i11 = this.f32884c;
        if (i11 + 4 < this.f32883b) {
            this.f32885d = i11;
            this.f32884c = i11 + 1;
            while (true) {
                i10 = this.f32884c;
                if (i10 == this.f32883b) {
                    break;
                }
                char[] cArr = this.f32888g;
                if (cArr[i10] == '+' || cArr[i10] == ',' || cArr[i10] == ';') {
                    break;
                } else if (cArr[i10] == ' ') {
                    this.f32886e = i10;
                    this.f32884c = i10 + 1;
                    while (true) {
                        int i12 = this.f32884c;
                        if (i12 >= this.f32883b || this.f32888g[i12] != ' ') {
                            break;
                        }
                        this.f32884c = i12 + 1;
                    }
                } else {
                    if (cArr[i10] >= 'A' && cArr[i10] <= 'F') {
                        cArr[i10] = (char) (cArr[i10] + ' ');
                    }
                    this.f32884c = i10 + 1;
                }
            }
            this.f32886e = i10;
            int i13 = this.f32886e;
            int i14 = this.f32885d;
            int i15 = i13 - i14;
            if (i15 < 5 || (i15 & 1) == 0) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f32882a);
            }
            int i16 = i15 / 2;
            byte[] bArr = new byte[i16];
            int i17 = i14 + 1;
            for (int i18 = 0; i18 < i16; i18++) {
                bArr[i18] = (byte) c(i17);
                i17 += 2;
            }
            return new String(this.f32888g, this.f32885d, i15);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f32882a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String g() {
        /*
            r7 = this;
        L_0x0000:
            int r0 = r7.f32884c
            int r1 = r7.f32883b
            r2 = 32
            if (r0 >= r1) goto L_0x0013
            char[] r3 = r7.f32888g
            char r3 = r3[r0]
            if (r3 != r2) goto L_0x0013
            int r0 = r0 + 1
            r7.f32884c = r0
            goto L_0x0000
        L_0x0013:
            if (r0 != r1) goto L_0x0017
            r0 = 0
            return r0
        L_0x0017:
            r7.f32885d = r0
            int r0 = r0 + 1
            r7.f32884c = r0
        L_0x001d:
            int r0 = r7.f32884c
            int r1 = r7.f32883b
            r3 = 61
            if (r0 >= r1) goto L_0x0034
            char[] r4 = r7.f32888g
            char r5 = r4[r0]
            if (r5 == r3) goto L_0x0034
            char r4 = r4[r0]
            if (r4 == r2) goto L_0x0034
            int r0 = r0 + 1
            r7.f32884c = r0
            goto L_0x001d
        L_0x0034:
            java.lang.String r4 = "Unexpected end of DN: "
            if (r0 >= r1) goto L_0x00d9
            r7.f32886e = r0
            char[] r1 = r7.f32888g
            char r0 = r1[r0]
            if (r0 != r2) goto L_0x0075
        L_0x0040:
            int r0 = r7.f32884c
            int r1 = r7.f32883b
            if (r0 >= r1) goto L_0x0055
            char[] r5 = r7.f32888g
            char r6 = r5[r0]
            if (r6 == r3) goto L_0x0055
            char r5 = r5[r0]
            if (r5 != r2) goto L_0x0055
            int r0 = r0 + 1
            r7.f32884c = r0
            goto L_0x0040
        L_0x0055:
            char[] r5 = r7.f32888g
            char r5 = r5[r0]
            if (r5 != r3) goto L_0x005e
            if (r0 == r1) goto L_0x005e
            goto L_0x0075
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r7.f32882a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0075:
            int r0 = r7.f32884c
            int r0 = r0 + 1
            r7.f32884c = r0
        L_0x007b:
            int r0 = r7.f32884c
            int r1 = r7.f32883b
            if (r0 >= r1) goto L_0x008c
            char[] r1 = r7.f32888g
            char r1 = r1[r0]
            if (r1 != r2) goto L_0x008c
            int r0 = r0 + 1
            r7.f32884c = r0
            goto L_0x007b
        L_0x008c:
            int r0 = r7.f32886e
            int r1 = r7.f32885d
            int r2 = r0 - r1
            r3 = 4
            if (r2 <= r3) goto L_0x00ce
            char[] r2 = r7.f32888g
            int r4 = r1 + 3
            char r4 = r2[r4]
            r5 = 46
            if (r4 != r5) goto L_0x00ce
            char r4 = r2[r1]
            r5 = 79
            if (r4 == r5) goto L_0x00ab
            char r4 = r2[r1]
            r5 = 111(0x6f, float:1.56E-43)
            if (r4 != r5) goto L_0x00ce
        L_0x00ab:
            int r4 = r1 + 1
            char r4 = r2[r4]
            r5 = 73
            if (r4 == r5) goto L_0x00bb
            int r4 = r1 + 1
            char r4 = r2[r4]
            r5 = 105(0x69, float:1.47E-43)
            if (r4 != r5) goto L_0x00ce
        L_0x00bb:
            int r4 = r1 + 2
            char r4 = r2[r4]
            r5 = 68
            if (r4 == r5) goto L_0x00cb
            int r4 = r1 + 2
            char r2 = r2[r4]
            r4 = 100
            if (r2 != r4) goto L_0x00ce
        L_0x00cb:
            int r1 = r1 + r3
            r7.f32885d = r1
        L_0x00ce:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r7.f32888g
            int r3 = r7.f32885d
            int r0 = r0 - r3
            r1.<init>(r2, r3, r0)
            return r1
        L_0x00d9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = r7.f32882a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.d.g():java.lang.String");
    }

    private String h() {
        int i10 = this.f32884c + 1;
        this.f32884c = i10;
        this.f32885d = i10;
        this.f32886e = i10;
        while (true) {
            int i11 = this.f32884c;
            if (i11 != this.f32883b) {
                char[] cArr = this.f32888g;
                if (cArr[i11] == '\"') {
                    this.f32884c = i11 + 1;
                    while (true) {
                        int i12 = this.f32884c;
                        if (i12 >= this.f32883b || this.f32888g[i12] != ' ') {
                            char[] cArr2 = this.f32888g;
                            int i13 = this.f32885d;
                        } else {
                            this.f32884c = i12 + 1;
                        }
                    }
                    char[] cArr22 = this.f32888g;
                    int i132 = this.f32885d;
                    return new String(cArr22, i132, this.f32886e - i132);
                }
                if (cArr[i11] == '\\') {
                    cArr[this.f32886e] = d();
                } else {
                    cArr[this.f32886e] = cArr[i11];
                }
                this.f32884c++;
                this.f32886e++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.f32882a);
            }
        }
    }

    public String b(String str) {
        String str2;
        this.f32884c = 0;
        this.f32885d = 0;
        this.f32886e = 0;
        this.f32887f = 0;
        this.f32888g = this.f32882a.toCharArray();
        String g10 = g();
        if (g10 == null) {
            return null;
        }
        do {
            int i10 = this.f32884c;
            if (i10 == this.f32883b) {
                return null;
            }
            char c10 = this.f32888g[i10];
            if (c10 == '\"') {
                str2 = h();
            } else if (c10 != '#') {
                str2 = (c10 == '+' || c10 == ',' || c10 == ';') ? MaxReward.DEFAULT_LABEL : a();
            } else {
                str2 = f();
            }
            if (str.equalsIgnoreCase(g10)) {
                return str2;
            }
            int i11 = this.f32884c;
            if (i11 >= this.f32883b) {
                return null;
            }
            char[] cArr = this.f32888g;
            if (cArr[i11] == ',' || cArr[i11] == ';' || cArr[i11] == '+') {
                this.f32884c = i11 + 1;
                g10 = g();
            } else {
                throw new IllegalStateException("Malformed DN: " + this.f32882a);
            }
        } while (g10 != null);
        throw new IllegalStateException("Malformed DN: " + this.f32882a);
    }
}
