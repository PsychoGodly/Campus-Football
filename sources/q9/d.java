package q9;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Map;
import v8.e;
import v8.f;
import z8.c;
import z8.l;

/* compiled from: DecodedBitStreamParser */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f29724a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ea A[LOOP:0: B:1:0x001d->B:59:0x00ea, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static z8.e a(byte[] r17, q9.j r18, q9.f r19, java.util.Map<v8.e, ?> r20) throws v8.f {
        /*
            r0 = r18
            z8.c r7 = new z8.c
            r8 = r17
            r7.<init>(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r1 = 50
            r9.<init>(r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 1
            r10.<init>(r11)
            r1 = 0
            r2 = -1
            r13 = 0
            r14 = -1
            r15 = -1
            r16 = 0
        L_0x001d:
            int r1 = r7.a()     // Catch:{ IllegalArgumentException -> 0x00ed }
            r2 = 4
            if (r1 >= r2) goto L_0x0028
            q9.h r1 = q9.h.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00ed }
        L_0x0026:
            r6 = r1
            goto L_0x0031
        L_0x0028:
            int r1 = r7.d(r2)     // Catch:{ IllegalArgumentException -> 0x00ed }
            q9.h r1 = q9.h.a(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x0026
        L_0x0031:
            q9.h r5 = q9.h.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 == r5) goto L_0x00c5
            q9.h r1 = q9.h.FNC1_FIRST_POSITION     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 == r1) goto L_0x00c1
            q9.h r1 = q9.h.FNC1_SECOND_POSITION     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x003f
            goto L_0x00c1
        L_0x003f:
            q9.h r1 = q9.h.STRUCTURED_APPEND     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x005e
            int r1 = r7.a()     // Catch:{ IllegalArgumentException -> 0x00ed }
            r2 = 16
            if (r1 < r2) goto L_0x0059
            r1 = 8
            int r2 = r7.d(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
            int r1 = r7.d(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
            r15 = r1
            r14 = r2
            goto L_0x00c5
        L_0x0059:
            v8.f r0 = v8.f.a()     // Catch:{ IllegalArgumentException -> 0x00ed }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ed }
        L_0x005e:
            q9.h r1 = q9.h.ECI     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x0073
            int r1 = g(r7)     // Catch:{ IllegalArgumentException -> 0x00ed }
            z8.d r16 = z8.d.a(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r16 == 0) goto L_0x006e
            goto L_0x00c5
        L_0x006e:
            v8.f r0 = v8.f.a()     // Catch:{ IllegalArgumentException -> 0x00ed }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ed }
        L_0x0073:
            q9.h r1 = q9.h.HANZI     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x0089
            int r1 = r7.d(r2)     // Catch:{ IllegalArgumentException -> 0x00ed }
            int r2 = r6.c(r0)     // Catch:{ IllegalArgumentException -> 0x00ed }
            int r2 = r7.d(r2)     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r1 != r11) goto L_0x00c5
            d(r7, r9, r2)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x00c5
        L_0x0089:
            int r1 = r6.c(r0)     // Catch:{ IllegalArgumentException -> 0x00ed }
            int r3 = r7.d(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
            q9.h r1 = q9.h.NUMERIC     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x0099
            f(r7, r9, r3)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x00c5
        L_0x0099:
            q9.h r1 = q9.h.ALPHANUMERIC     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x00a1
            b(r7, r9, r3, r13)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x00c5
        L_0x00a1:
            q9.h r1 = q9.h.BYTE     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x00b2
            r1 = r7
            r2 = r9
            r4 = r16
            r11 = r5
            r5 = r10
            r12 = r6
            r6 = r20
            c(r1, r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x00c7
        L_0x00b2:
            r11 = r5
            r12 = r6
            q9.h r1 = q9.h.KANJI     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r12 != r1) goto L_0x00bc
            e(r7, r9, r3)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x00c7
        L_0x00bc:
            v8.f r0 = v8.f.a()     // Catch:{ IllegalArgumentException -> 0x00ed }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ed }
        L_0x00c1:
            r11 = r5
            r12 = r6
            r13 = 1
            goto L_0x00c7
        L_0x00c5:
            r11 = r5
            r12 = r6
        L_0x00c7:
            if (r12 != r11) goto L_0x00ea
            z8.e r7 = new z8.e
            java.lang.String r2 = r9.toString()
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x00d7
            r3 = 0
            goto L_0x00d8
        L_0x00d7:
            r3 = r10
        L_0x00d8:
            if (r19 != 0) goto L_0x00dc
            r4 = 0
            goto L_0x00e1
        L_0x00dc:
            java.lang.String r0 = r19.toString()
            r4 = r0
        L_0x00e1:
            r0 = r7
            r1 = r17
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x00ea:
            r11 = 1
            goto L_0x001d
        L_0x00ed:
            v8.f r0 = v8.f.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.d.a(byte[], q9.j, q9.f, java.util.Map):z8.e");
    }

    private static void b(c cVar, StringBuilder sb2, int i10, boolean z10) throws f {
        while (i10 > 1) {
            if (cVar.a() >= 11) {
                int d10 = cVar.d(11);
                sb2.append(h(d10 / 45));
                sb2.append(h(d10 % 45));
                i10 -= 2;
            } else {
                throw f.a();
            }
        }
        if (i10 == 1) {
            if (cVar.a() >= 6) {
                sb2.append(h(cVar.d(6)));
            } else {
                throw f.a();
            }
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i11 = length + 1;
                        if (sb2.charAt(i11) == '%') {
                            sb2.deleteCharAt(i11);
                        }
                    }
                    sb2.setCharAt(length, 29);
                }
            }
        }
    }

    private static void c(c cVar, StringBuilder sb2, int i10, z8.d dVar, Collection<byte[]> collection, Map<e, ?> map) throws f {
        String str;
        if ((i10 << 3) <= cVar.a()) {
            byte[] bArr = new byte[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                bArr[i11] = (byte) cVar.d(8);
            }
            if (dVar == null) {
                str = l.a(bArr, map);
            } else {
                str = dVar.name();
            }
            try {
                sb2.append(new String(bArr, str));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw f.a();
            }
        } else {
            throw f.a();
        }
    }

    private static void d(c cVar, StringBuilder sb2, int i10) throws f {
        if (i10 * 13 <= cVar.a()) {
            byte[] bArr = new byte[(i10 * 2)];
            int i11 = 0;
            while (i10 > 0) {
                int d10 = cVar.d(13);
                int i12 = (d10 % 96) | ((d10 / 96) << 8);
                int i13 = i12 + (i12 < 959 ? 41377 : 42657);
                bArr[i11] = (byte) (i13 >> 8);
                bArr[i11 + 1] = (byte) i13;
                i11 += 2;
                i10--;
            }
            try {
                sb2.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw f.a();
            }
        } else {
            throw f.a();
        }
    }

    private static void e(c cVar, StringBuilder sb2, int i10) throws f {
        if (i10 * 13 <= cVar.a()) {
            byte[] bArr = new byte[(i10 * 2)];
            int i11 = 0;
            while (i10 > 0) {
                int d10 = cVar.d(13);
                int i12 = (d10 % 192) | ((d10 / 192) << 8);
                int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
                bArr[i11] = (byte) (i13 >> 8);
                bArr[i11 + 1] = (byte) i13;
                i11 += 2;
                i10--;
            }
            try {
                sb2.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw f.a();
            }
        } else {
            throw f.a();
        }
    }

    private static void f(c cVar, StringBuilder sb2, int i10) throws f {
        while (i10 >= 3) {
            if (cVar.a() >= 10) {
                int d10 = cVar.d(10);
                if (d10 < 1000) {
                    sb2.append(h(d10 / 100));
                    sb2.append(h((d10 / 10) % 10));
                    sb2.append(h(d10 % 10));
                    i10 -= 3;
                } else {
                    throw f.a();
                }
            } else {
                throw f.a();
            }
        }
        if (i10 == 2) {
            if (cVar.a() >= 7) {
                int d11 = cVar.d(7);
                if (d11 < 100) {
                    sb2.append(h(d11 / 10));
                    sb2.append(h(d11 % 10));
                    return;
                }
                throw f.a();
            }
            throw f.a();
        } else if (i10 != 1) {
        } else {
            if (cVar.a() >= 4) {
                int d12 = cVar.d(4);
                if (d12 < 10) {
                    sb2.append(h(d12));
                    return;
                }
                throw f.a();
            }
            throw f.a();
        }
    }

    private static int g(c cVar) throws f {
        int d10 = cVar.d(8);
        if ((d10 & 128) == 0) {
            return d10 & 127;
        }
        if ((d10 & 192) == 128) {
            return cVar.d(8) | ((d10 & 63) << 8);
        }
        if ((d10 & 224) == 192) {
            return cVar.d(16) | ((d10 & 31) << 16);
        }
        throw f.a();
    }

    private static char h(int i10) throws f {
        char[] cArr = f29724a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw f.a();
    }
}
