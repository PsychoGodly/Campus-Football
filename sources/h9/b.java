package h9;

import v8.j;
import z8.a;

/* compiled from: Code128Reader */
public final class b extends k {

    /* renamed from: a  reason: collision with root package name */
    static final int[][] f28949a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    private static int g(a aVar, int[] iArr, int i10) throws j {
        k.e(aVar, i10, iArr);
        float f10 = 0.25f;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[][] iArr2 = f28949a;
            if (i12 >= iArr2.length) {
                break;
            }
            float d10 = k.d(iArr, iArr2[i12], 0.7f);
            if (d10 < f10) {
                i11 = i12;
                f10 = d10;
            }
            i12++;
        }
        if (i11 >= 0) {
            return i11;
        }
        throw j.a();
    }

    private static int[] h(a aVar) throws j {
        int g10 = aVar.g();
        int e10 = aVar.e(0);
        int[] iArr = new int[6];
        int i10 = e10;
        boolean z10 = false;
        int i11 = 0;
        while (e10 < g10) {
            if (aVar.c(e10) ^ z10) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                if (i11 == 5) {
                    float f10 = 0.25f;
                    int i12 = -1;
                    for (int i13 = 103; i13 <= 105; i13++) {
                        float d10 = k.d(iArr, f28949a[i13], 0.7f);
                        if (d10 < f10) {
                            i12 = i13;
                            f10 = d10;
                        }
                    }
                    if (i12 < 0 || !aVar.i(Math.max(0, i10 - ((e10 - i10) / 2)), i10, false)) {
                        i10 += iArr[0] + iArr[1];
                        System.arraycopy(iArr, 2, iArr, 0, 4);
                        iArr[4] = 0;
                        iArr[5] = 0;
                        i11--;
                    } else {
                        return new int[]{i10, e10, i12};
                    }
                } else {
                    i11++;
                }
                iArr[i11] = 1;
                z10 = !z10;
            }
            e10++;
        }
        throw j.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0170, code lost:
        r14 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0177, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x017a, code lost:
        if (r18 == false) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x017c, code lost:
        if (r14 != 'e') goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x017e, code lost:
        r14 = 'd';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0181, code lost:
        r14 = 'e';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0183, code lost:
        r18 = r5;
        r15 = 6;
        r23 = r12;
        r12 = r8;
        r8 = r21;
        r21 = r19;
        r19 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e1, code lost:
        if (r9 != false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fe, code lost:
        r5 = false;
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0123, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0127, code lost:
        if (r9 != false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0129, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x012b, code lost:
        r5 = false;
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012e, code lost:
        r5 = false;
        r14 = 'c';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0138, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013a, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x016c, code lost:
        r14 = 'e';
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v8.n b(int r25, z8.a r26, java.util.Map<v8.e, ?> r27) throws v8.j, v8.f, v8.d {
        /*
            r24 = this;
            r0 = r26
            r1 = r27
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            v8.e r4 = v8.e.ASSUME_GS1
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            int[] r4 = h(r26)
            r5 = 2
            r6 = r4[r5]
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 20
            r7.<init>(r8)
            byte r9 = (byte) r6
            java.lang.Byte r9 = java.lang.Byte.valueOf(r9)
            r7.add(r9)
            switch(r6) {
                case 103: goto L_0x0037;
                case 104: goto L_0x0034;
                case 105: goto L_0x0031;
                default: goto L_0x002c;
            }
        L_0x002c:
            v8.f r0 = v8.f.a()
            throw r0
        L_0x0031:
            r12 = 99
            goto L_0x0039
        L_0x0034:
            r12 = 100
            goto L_0x0039
        L_0x0037:
            r12 = 101(0x65, float:1.42E-43)
        L_0x0039:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r8)
            r8 = r4[r3]
            r14 = r4[r2]
            r15 = 6
            int[] r2 = new int[r15]
            r9 = 0
            r16 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = r12
            r12 = r8
            r8 = r14
            r14 = r23
        L_0x0058:
            if (r16 != 0) goto L_0x0192
            int r12 = g(r0, r2, r8)
            byte r5 = (byte) r12
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            r7.add(r5)
            r5 = 106(0x6a, float:1.49E-43)
            if (r12 == r5) goto L_0x006c
            r17 = 1
        L_0x006c:
            if (r12 == r5) goto L_0x0074
            int r20 = r20 + 1
            int r21 = r20 * r12
            int r6 = r6 + r21
        L_0x0074:
            r21 = r8
            r11 = 0
        L_0x0077:
            if (r11 >= r15) goto L_0x0080
            r22 = r2[r11]
            int r21 = r21 + r22
            int r11 = r11 + 1
            goto L_0x0077
        L_0x0080:
            switch(r12) {
                case 103: goto L_0x008e;
                case 104: goto L_0x008e;
                case 105: goto L_0x008e;
                default: goto L_0x0083;
            }
        L_0x0083:
            r11 = 96
            java.lang.String r15 = "]C1"
            switch(r14) {
                case 99: goto L_0x013e;
                case 100: goto L_0x00eb;
                case 101: goto L_0x0093;
                default: goto L_0x008a;
            }
        L_0x008a:
            r10 = 100
            goto L_0x0177
        L_0x008e:
            v8.f r0 = v8.f.a()
            throw r0
        L_0x0093:
            r10 = 64
            if (r12 >= r10) goto L_0x00a9
            if (r9 != r3) goto L_0x00a0
            int r5 = r12 + 32
            char r5 = (char) r5
            r13.append(r5)
            goto L_0x00fe
        L_0x00a0:
            int r5 = r12 + 32
            int r5 = r5 + 128
            char r5 = (char) r5
            r13.append(r5)
            goto L_0x00fe
        L_0x00a9:
            if (r12 >= r11) goto L_0x00bb
            if (r9 != r3) goto L_0x00b4
            int r5 = r12 + -64
            char r5 = (char) r5
            r13.append(r5)
            goto L_0x00fe
        L_0x00b4:
            int r5 = r12 + 64
            char r5 = (char) r5
            r13.append(r5)
            goto L_0x00fe
        L_0x00bb:
            if (r12 == r5) goto L_0x00bf
            r17 = 0
        L_0x00bf:
            if (r12 == r5) goto L_0x0138
            switch(r12) {
                case 96: goto L_0x013a;
                case 97: goto L_0x013a;
                case 98: goto L_0x00e6;
                case 99: goto L_0x012e;
                case 100: goto L_0x00e4;
                case 101: goto L_0x00da;
                case 102: goto L_0x00c6;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            goto L_0x013a
        L_0x00c6:
            if (r1 == 0) goto L_0x013a
            int r5 = r13.length()
            if (r5 != 0) goto L_0x00d3
            r13.append(r15)
            goto L_0x013a
        L_0x00d3:
            r5 = 29
            r13.append(r5)
            goto L_0x013a
        L_0x00da:
            if (r3 != 0) goto L_0x00df
            if (r9 == 0) goto L_0x00df
            goto L_0x0123
        L_0x00df:
            if (r3 == 0) goto L_0x012b
            if (r9 == 0) goto L_0x012b
            goto L_0x0129
        L_0x00e4:
            r5 = 0
            goto L_0x00e7
        L_0x00e6:
            r5 = 1
        L_0x00e7:
            r10 = 100
            goto L_0x0170
        L_0x00eb:
            if (r12 >= r11) goto L_0x0101
            if (r9 != r3) goto L_0x00f6
            int r5 = r12 + 32
            char r5 = (char) r5
            r13.append(r5)
            goto L_0x00fe
        L_0x00f6:
            int r5 = r12 + 32
            int r5 = r5 + 128
            char r5 = (char) r5
            r13.append(r5)
        L_0x00fe:
            r5 = 0
            r9 = 0
            goto L_0x013b
        L_0x0101:
            if (r12 == r5) goto L_0x0105
            r17 = 0
        L_0x0105:
            if (r12 == r5) goto L_0x0138
            switch(r12) {
                case 96: goto L_0x013a;
                case 97: goto L_0x013a;
                case 98: goto L_0x0134;
                case 99: goto L_0x012e;
                case 100: goto L_0x011f;
                case 101: goto L_0x011d;
                case 102: goto L_0x010b;
                default: goto L_0x010a;
            }
        L_0x010a:
            goto L_0x013a
        L_0x010b:
            if (r1 == 0) goto L_0x013a
            int r5 = r13.length()
            if (r5 != 0) goto L_0x0117
            r13.append(r15)
            goto L_0x013a
        L_0x0117:
            r5 = 29
            r13.append(r5)
            goto L_0x013a
        L_0x011d:
            r5 = 0
            goto L_0x0135
        L_0x011f:
            if (r3 != 0) goto L_0x0125
            if (r9 == 0) goto L_0x0125
        L_0x0123:
            r3 = 1
            goto L_0x00fe
        L_0x0125:
            if (r3 == 0) goto L_0x012b
            if (r9 == 0) goto L_0x012b
        L_0x0129:
            r3 = 0
            goto L_0x00fe
        L_0x012b:
            r5 = 0
            r9 = 1
            goto L_0x013b
        L_0x012e:
            r5 = 0
            r10 = 100
            r14 = 99
            goto L_0x0178
        L_0x0134:
            r5 = 1
        L_0x0135:
            r10 = 100
            goto L_0x016c
        L_0x0138:
            r16 = 1
        L_0x013a:
            r5 = 0
        L_0x013b:
            r10 = 100
            goto L_0x0178
        L_0x013e:
            r10 = 100
            if (r12 >= r10) goto L_0x014f
            r5 = 10
            if (r12 >= r5) goto L_0x014b
            r5 = 48
            r13.append(r5)
        L_0x014b:
            r13.append(r12)
            goto L_0x0177
        L_0x014f:
            if (r12 == r5) goto L_0x0153
            r17 = 0
        L_0x0153:
            if (r12 == r5) goto L_0x0173
            switch(r12) {
                case 100: goto L_0x016f;
                case 101: goto L_0x016b;
                case 102: goto L_0x0159;
                default: goto L_0x0158;
            }
        L_0x0158:
            goto L_0x0177
        L_0x0159:
            if (r1 == 0) goto L_0x0177
            int r5 = r13.length()
            if (r5 != 0) goto L_0x0165
            r13.append(r15)
            goto L_0x0177
        L_0x0165:
            r5 = 29
            r13.append(r5)
            goto L_0x0177
        L_0x016b:
            r5 = 0
        L_0x016c:
            r14 = 101(0x65, float:1.42E-43)
            goto L_0x0178
        L_0x016f:
            r5 = 0
        L_0x0170:
            r14 = 100
            goto L_0x0178
        L_0x0173:
            r5 = 0
            r16 = 1
            goto L_0x0178
        L_0x0177:
            r5 = 0
        L_0x0178:
            r11 = 101(0x65, float:1.42E-43)
            if (r18 == 0) goto L_0x0183
            if (r14 != r11) goto L_0x0181
            r14 = 100
            goto L_0x0183
        L_0x0181:
            r14 = 101(0x65, float:1.42E-43)
        L_0x0183:
            r18 = r5
            r5 = 2
            r15 = 6
            r23 = r12
            r12 = r8
            r8 = r21
            r21 = r19
            r19 = r23
            goto L_0x0058
        L_0x0192:
            int r1 = r8 - r12
            int r2 = r0.f(r8)
            int r3 = r26.g()
            int r5 = r2 - r12
            r8 = 2
            int r5 = r5 / r8
            int r5 = r5 + r2
            int r3 = java.lang.Math.min(r3, r5)
            r5 = 0
            boolean r0 = r0.i(r2, r3, r5)
            if (r0 == 0) goto L_0x0222
            r3 = r21
            int r20 = r20 * r3
            int r6 = r6 - r20
            int r6 = r6 % 103
            if (r6 != r3) goto L_0x021d
            int r0 = r13.length()
            if (r0 == 0) goto L_0x0218
            if (r0 <= 0) goto L_0x01cf
            if (r17 == 0) goto L_0x01cf
            r2 = 99
            if (r14 != r2) goto L_0x01ca
            int r2 = r0 + -2
            r13.delete(r2, r0)
            goto L_0x01cf
        L_0x01ca:
            int r2 = r0 + -1
            r13.delete(r2, r0)
        L_0x01cf:
            r0 = 1
            r2 = r4[r0]
            r0 = 0
            r3 = r4[r0]
            int r2 = r2 + r3
            float r0 = (float) r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r3 = (float) r12
            float r1 = (float) r1
            float r1 = r1 / r2
            float r3 = r3 + r1
            int r1 = r7.size()
            byte[] r2 = new byte[r1]
            r5 = 0
        L_0x01e5:
            if (r5 >= r1) goto L_0x01f6
            java.lang.Object r4 = r7.get(r5)
            java.lang.Byte r4 = (java.lang.Byte) r4
            byte r4 = r4.byteValue()
            r2[r5] = r4
            int r5 = r5 + 1
            goto L_0x01e5
        L_0x01f6:
            v8.n r1 = new v8.n
            java.lang.String r4 = r13.toString()
            r5 = 2
            v8.p[] r5 = new v8.p[r5]
            v8.p r6 = new v8.p
            r7 = r25
            float r7 = (float) r7
            r6.<init>(r0, r7)
            r0 = 0
            r5[r0] = r6
            v8.p r0 = new v8.p
            r0.<init>(r3, r7)
            r3 = 1
            r5[r3] = r0
            v8.a r0 = v8.a.CODE_128
            r1.<init>(r4, r2, r5, r0)
            return r1
        L_0x0218:
            v8.j r0 = v8.j.a()
            throw r0
        L_0x021d:
            v8.d r0 = v8.d.a()
            throw r0
        L_0x0222:
            v8.j r0 = v8.j.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.b.b(int, z8.a, java.util.Map):v8.n");
    }
}
