package h9;

import v8.f;
import v8.j;
import z8.a;

/* compiled from: UPCEReader */
public final class q extends p {

    /* renamed from: j  reason: collision with root package name */
    static final int[] f28990j = {56, 52, 50, 49, 44, 38, 35, 42, 41, 37};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f28991k = {1, 1, 1, 1, 1, 1};

    /* renamed from: l  reason: collision with root package name */
    private static final int[][] f28992l = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i  reason: collision with root package name */
    private final int[] f28993i = new int[4];

    public static String q(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c10 = cArr[5];
        switch (c10) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c10);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c10);
                break;
        }
        sb2.append(str.charAt(7));
        return sb2.toString();
    }

    private static void r(StringBuilder sb2, int i10) throws j {
        for (int i11 = 0; i11 <= 1; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                if (i10 == f28992l[i11][i12]) {
                    sb2.insert(0, (char) (i11 + 48));
                    sb2.append((char) (i12 + 48));
                    return;
                }
            }
        }
        throw j.a();
    }

    /* access modifiers changed from: protected */
    public boolean g(String str) throws f {
        return super.g(q(str));
    }

    /* access modifiers changed from: protected */
    public int[] j(a aVar, int i10) throws j {
        return p.m(aVar, i10, true, f28991k);
    }

    /* access modifiers changed from: protected */
    public int k(a aVar, int[] iArr, StringBuilder sb2) throws j {
        int[] iArr2 = this.f28993i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int g10 = aVar.g();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 6 && i10 < g10; i12++) {
            int i13 = p.i(aVar, iArr2, i10, p.f28986h);
            sb2.append((char) ((i13 % 10) + 48));
            for (int i14 : iArr2) {
                i10 += i14;
            }
            if (i13 >= 10) {
                i11 |= 1 << (5 - i12);
            }
        }
        r(sb2, i11);
        return i10;
    }

    /* access modifiers changed from: package-private */
    public v8.a p() {
        return v8.a.UPC_E;
    }
}
