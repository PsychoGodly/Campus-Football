package g9;

import com.applovin.exoplayer2.common.base.Ascii;
import java.text.DecimalFormat;
import java.util.List;
import z8.e;

/* compiled from: DecodedBitStreamParser */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f28935a = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ￺\u001c\u001d\u001e￻ ￼\"#$%&'()*+,-./0123456789:￱￲￳￴￸", "`abcdefghijklmnopqrstuvwxyz￺\u001c\u001d\u001e￻{￼}~;<=>?[\\]^_ ,./:@!|￼￵￶￼￰￲￳￴￷", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ￺\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾￷ ￹￳￴￸", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú￺\u001c\u001d\u001e￻ûüýþÿ¡¨«¯°´·¸»¿￷ ￲￹￴￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a￺￼￼\u001b￻\u001c\u001d\u001e\u001f ¢£¤¥¦§©­®¶￷ ￲￳￹￸", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    static e a(byte[] bArr, int i10) {
        String str;
        StringBuilder sb2 = new StringBuilder(144);
        if (i10 == 2 || i10 == 3) {
            if (i10 == 2) {
                str = new DecimalFormat("0000000000".substring(0, g(bArr))).format((long) f(bArr));
            } else {
                str = h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format((long) c(bArr));
            String format2 = decimalFormat.format((long) i(bArr));
            sb2.append(e(bArr, 10, 84));
            if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                sb2.insert(9, str + 29 + format + 29 + format2 + 29);
            } else {
                sb2.insert(0, str + 29 + format + 29 + format2 + 29);
            }
        } else if (i10 == 4) {
            sb2.append(e(bArr, 1, 93));
        } else if (i10 == 5) {
            sb2.append(e(bArr, 1, 77));
        }
        return new e(bArr, sb2.toString(), (List<byte[]>) null, String.valueOf(i10));
    }

    private static int b(int i10, byte[] bArr) {
        int i11 = i10 - 1;
        return ((1 << (5 - (i11 % 6))) & bArr[i11 / 6]) == 0 ? 0 : 1;
    }

    private static int c(byte[] bArr) {
        return d(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38});
    }

    private static int d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 0) {
            int i10 = 0;
            for (int i11 = 0; i11 < bArr2.length; i11++) {
                i10 += b(bArr2[i11], bArr) << ((bArr2.length - i11) - 1);
            }
            return i10;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        r6 = r4;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r7 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        if (r5 != 0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0063, code lost:
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        r3 = r3 + 1;
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0050, code lost:
        r5 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String e(byte[] r12, int r13, int r14) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = -1
            r3 = r13
            r4 = 0
            r5 = -1
            r6 = 0
        L_0x000b:
            int r7 = r13 + r14
            r8 = 1
            if (r3 >= r7) goto L_0x0067
            java.lang.String[] r7 = f28935a
            r7 = r7[r4]
            byte r9 = r12[r3]
            char r7 = r7.charAt(r9)
            switch(r7) {
                case 65520: goto L_0x0058;
                case 65521: goto L_0x0058;
                case 65522: goto L_0x0058;
                case 65523: goto L_0x0058;
                case 65524: goto L_0x0058;
                case 65525: goto L_0x0054;
                case 65526: goto L_0x0052;
                case 65527: goto L_0x004f;
                case 65528: goto L_0x004d;
                case 65529: goto L_0x0050;
                case 65530: goto L_0x001d;
                case 65531: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0.append(r7)
            goto L_0x005f
        L_0x0021:
            int r3 = r3 + 1
            byte r7 = r12[r3]
            int r7 = r7 << 24
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 18
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 12
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r9 = r9 << 6
            int r7 = r7 + r9
            int r3 = r3 + r8
            byte r9 = r12[r3]
            int r7 = r7 + r9
            java.text.DecimalFormat r9 = new java.text.DecimalFormat
            java.lang.String r10 = "000000000"
            r9.<init>(r10)
            long r10 = (long) r7
            java.lang.String r7 = r9.format(r10)
            r0.append(r7)
            goto L_0x005f
        L_0x004d:
            r4 = 1
            goto L_0x0050
        L_0x004f:
            r4 = 0
        L_0x0050:
            r5 = -1
            goto L_0x005f
        L_0x0052:
            r5 = 3
            goto L_0x0055
        L_0x0054:
            r5 = 2
        L_0x0055:
            r6 = r4
            r4 = 0
            goto L_0x005f
        L_0x0058:
            r5 = 65520(0xfff0, float:9.1813E-41)
            int r7 = r7 - r5
            r6 = r4
            r4 = r7
            r5 = 1
        L_0x005f:
            int r7 = r5 + -1
            if (r5 != 0) goto L_0x0064
            r4 = r6
        L_0x0064:
            int r3 = r3 + r8
            r5 = r7
            goto L_0x000b
        L_0x0067:
            int r12 = r0.length()
            if (r12 <= 0) goto L_0x0084
            int r12 = r0.length()
            int r12 = r12 - r8
            char r12 = r0.charAt(r12)
            r13 = 65532(0xfffc, float:9.183E-41)
            if (r12 != r13) goto L_0x0084
            int r12 = r0.length()
            int r12 = r12 - r8
            r0.setLength(r12)
            goto L_0x0067
        L_0x0084:
            java.lang.String r12 = r0.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.b.e(byte[], int, int):java.lang.String");
    }

    private static int f(byte[] bArr) {
        return d(bArr, new byte[]{33, 34, 35, 36, Ascii.EM, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 7, 8, 9, 10, Ascii.VT, Ascii.FF, 1, 2});
    }

    private static int g(byte[] bArr) {
        return d(bArr, new byte[]{39, 40, 41, 42, Ascii.US, 32});
    }

    private static String h(byte[] bArr) {
        String[] strArr = f28935a;
        return String.valueOf(new char[]{strArr[0].charAt(d(bArr, new byte[]{39, 40, 41, 42, Ascii.US, 32})), strArr[0].charAt(d(bArr, new byte[]{33, 34, 35, 36, Ascii.EM, Ascii.SUB})), strArr[0].charAt(d(bArr, new byte[]{Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, 19, Ascii.DC4})), strArr[0].charAt(d(bArr, new byte[]{Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.CR, Ascii.SO})), strArr[0].charAt(d(bArr, new byte[]{Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 7, 8})), strArr[0].charAt(d(bArr, new byte[]{9, 10, Ascii.VT, Ascii.FF, 1, 2}))});
    }

    private static int i(byte[] bArr) {
        return d(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}
