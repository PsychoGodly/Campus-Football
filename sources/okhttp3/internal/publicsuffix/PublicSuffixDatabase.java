package okhttp3.internal.publicsuffix;

import cf.c;
import java.io.IOException;
import java.io.InputStream;
import java.net.IDN;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.e;
import lf.j;
import lf.l;

public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f36802e = {42};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f36803f = new String[0];

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f36804g = {"*"};

    /* renamed from: h  reason: collision with root package name */
    private static final PublicSuffixDatabase f36805h = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f36806a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final CountDownLatch f36807b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    private byte[] f36808c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f36809d;

    private static String a(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z10;
        byte b10;
        int i12;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i13 = 0;
        while (i13 < length) {
            int i14 = (i13 + length) / 2;
            while (i14 > -1 && bArr3[i14] != 10) {
                i14--;
            }
            int i15 = i14 + 1;
            int i16 = 1;
            while (true) {
                i11 = i15 + i16;
                if (bArr3[i11] == 10) {
                    break;
                }
                i16++;
            }
            int i17 = i11 - i15;
            int i18 = i10;
            boolean z11 = false;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (z11) {
                    b10 = 46;
                    z10 = false;
                } else {
                    z10 = z11;
                    b10 = bArr4[i18][i19] & 255;
                }
                i12 = b10 - (bArr3[i15 + i20] & 255);
                if (i12 == 0) {
                    i20++;
                    i19++;
                    if (i20 == i17) {
                        break;
                    } else if (bArr4[i18].length != i19) {
                        z11 = z10;
                    } else if (i18 == bArr4.length - 1) {
                        break;
                    } else {
                        i18++;
                        z11 = true;
                        i19 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i12 >= 0) {
                if (i12 <= 0) {
                    int i21 = i17 - i20;
                    int length2 = bArr4[i18].length - i19;
                    while (true) {
                        i18++;
                        if (i18 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i18].length;
                    }
                    if (length2 >= i21) {
                        if (length2 <= i21) {
                            return new String(bArr3, i15, i17, c.f31992j);
                        }
                    }
                }
                i13 = i11 + 1;
            }
            length = i15 - 1;
        }
        return null;
    }

    private String[] b(String[] strArr) {
        String str;
        String str2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        int i10 = 0;
        if (this.f36806a.get() || !this.f36806a.compareAndSet(false, true)) {
            try {
                this.f36807b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            f();
        }
        synchronized (this) {
            if (this.f36808c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            bArr[i11] = strArr[i11].getBytes(c.f31992j);
        }
        int i12 = 0;
        while (true) {
            str = null;
            if (i12 >= length) {
                str2 = null;
                break;
            }
            str2 = a(this.f36808c, bArr, i12);
            if (str2 != null) {
                break;
            }
            i12++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            int i13 = 0;
            while (true) {
                if (i13 >= bArr2.length - 1) {
                    break;
                }
                bArr2[i13] = f36802e;
                str3 = a(this.f36808c, bArr2, i13);
                if (str3 != null) {
                    break;
                }
                i13++;
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i10 >= length - 1) {
                    break;
                }
                String a10 = a(this.f36809d, bArr, i10);
                if (a10 != null) {
                    str = a10;
                    break;
                }
                i10++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        } else if (str2 == null && str3 == null) {
            return f36804g;
        } else {
            if (str2 != null) {
                strArr2 = str2.split("\\.");
            } else {
                strArr2 = f36803f;
            }
            if (str3 != null) {
                strArr3 = str3.split("\\.");
            } else {
                strArr3 = f36803f;
            }
            return strArr2.length > strArr3.length ? strArr2 : strArr3;
        }
    }

    public static PublicSuffixDatabase c() {
        return f36805h;
    }

    private void e() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            e b10 = l.b(new j(l.h(resourceAsStream)));
            try {
                byte[] bArr = new byte[b10.readInt()];
                b10.readFully(bArr);
                byte[] bArr2 = new byte[b10.readInt()];
                b10.readFully(bArr2);
                synchronized (this) {
                    this.f36808c = bArr;
                    this.f36809d = bArr2;
                }
                this.f36807b.countDown();
            } finally {
                c.g(b10);
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.e()     // Catch:{ InterruptedIOException -> 0x0025, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002a
        L_0x0010:
            r1 = move-exception
            if.g r2 = p002if.g.l()     // Catch:{ all -> 0x000e }
            r3 = 5
            java.lang.String r4 = "Failed to read public suffix list"
            r2.s(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0024
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0024:
            return
        L_0x0025:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002a:
            if (r0 == 0) goto L_0x0033
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0033:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.f():void");
    }

    public String d(String str) {
        int i10;
        int i11;
        Objects.requireNonNull(str, "domain == null");
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] b10 = b(split);
        if (split.length == b10.length && b10[0].charAt(0) != '!') {
            return null;
        }
        if (b10[0].charAt(0) == '!') {
            i11 = split.length;
            i10 = b10.length;
        } else {
            i11 = split.length;
            i10 = b10.length + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        String[] split2 = str.split("\\.");
        for (int i12 = i11 - i10; i12 < split2.length; i12++) {
            sb2.append(split2[i12]);
            sb2.append('.');
        }
        sb2.deleteCharAt(sb2.length() - 1);
        return sb2.toString();
    }
}
