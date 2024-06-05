package x8;

import b9.c;
import b9.d;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.List;
import v8.f;
import z8.e;

/* compiled from: Decoder */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f31206b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f31207c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f31208d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f31209e = {MaxReward.DEFAULT_LABEL, "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f31210f = {"CTRL_PS", " ", "0", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION, "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a  reason: collision with root package name */
    private w8.a f31211a;

    /* renamed from: x8.a$a  reason: collision with other inner class name */
    /* compiled from: Decoder */
    static /* synthetic */ class C0351a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31212a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                x8.a$b[] r0 = x8.a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31212a = r0
                x8.a$b r1 = x8.a.b.UPPER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31212a     // Catch:{ NoSuchFieldError -> 0x001d }
                x8.a$b r1 = x8.a.b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31212a     // Catch:{ NoSuchFieldError -> 0x0028 }
                x8.a$b r1 = x8.a.b.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31212a     // Catch:{ NoSuchFieldError -> 0x0033 }
                x8.a$b r1 = x8.a.b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31212a     // Catch:{ NoSuchFieldError -> 0x003e }
                x8.a$b r1 = x8.a.b.DIGIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x8.a.C0351a.<clinit>():void");
        }
    }

    /* compiled from: Decoder */
    private enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = h(zArr, i10 << 3);
        }
        return bArr;
    }

    private boolean[] b(boolean[] zArr) throws f {
        b9.a aVar;
        int i10 = 8;
        if (this.f31211a.d() <= 2) {
            i10 = 6;
            aVar = b9.a.f24276j;
        } else if (this.f31211a.d() <= 8) {
            aVar = b9.a.f24280n;
        } else if (this.f31211a.d() <= 22) {
            i10 = 10;
            aVar = b9.a.f24275i;
        } else {
            i10 = 12;
            aVar = b9.a.f24274h;
        }
        int c10 = this.f31211a.c();
        int length = zArr.length / i10;
        if (length >= c10) {
            int length2 = zArr.length % i10;
            int[] iArr = new int[length];
            int i11 = 0;
            while (i11 < length) {
                iArr[i11] = i(zArr, length2, i10);
                i11++;
                length2 += i10;
            }
            try {
                new c(aVar).a(iArr, length - c10);
                int i12 = (1 << i10) - 1;
                int i13 = 0;
                for (int i14 = 0; i14 < c10; i14++) {
                    int i15 = iArr[i14];
                    if (i15 == 0 || i15 == i12) {
                        throw f.a();
                    }
                    if (i15 == 1 || i15 == i12 - 1) {
                        i13++;
                    }
                }
                boolean[] zArr2 = new boolean[((c10 * i10) - i13)];
                int i16 = 0;
                for (int i17 = 0; i17 < c10; i17++) {
                    int i18 = iArr[i17];
                    if (i18 == 1 || i18 == i12 - 1) {
                        Arrays.fill(zArr2, i16, (i16 + i10) - 1, i18 > 1);
                        i16 += i10 - 1;
                    } else {
                        int i19 = i10 - 1;
                        while (i19 >= 0) {
                            int i20 = i16 + 1;
                            zArr2[i16] = ((1 << i19) & i18) != 0;
                            i19--;
                            i16 = i20;
                        }
                    }
                }
                return zArr2;
            } catch (d e10) {
                throw f.b(e10);
            }
        } else {
            throw f.a();
        }
    }

    private boolean[] d(z8.b bVar) {
        z8.b bVar2 = bVar;
        boolean e10 = this.f31211a.e();
        int d10 = this.f31211a.d();
        int i10 = (e10 ? 11 : 14) + (d10 << 2);
        int[] iArr = new int[i10];
        boolean[] zArr = new boolean[j(d10, e10)];
        int i11 = 2;
        if (e10) {
            for (int i12 = 0; i12 < i10; i12++) {
                iArr[i12] = i12;
            }
        } else {
            int i13 = i10 / 2;
            int i14 = ((i10 + 1) + (((i13 - 1) / 15) * 2)) / 2;
            for (int i15 = 0; i15 < i13; i15++) {
                int i16 = (i15 / 15) + i15;
                iArr[(i13 - i15) - 1] = (i14 - i16) - 1;
                iArr[i13 + i15] = i16 + i14 + 1;
            }
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < d10) {
            int i19 = ((d10 - i17) << i11) + (e10 ? 9 : 12);
            int i20 = i17 << 1;
            int i21 = (i10 - 1) - i20;
            int i22 = 0;
            while (i22 < i19) {
                int i23 = i22 << 1;
                int i24 = 0;
                while (i24 < i11) {
                    int i25 = i20 + i24;
                    int i26 = i20 + i22;
                    zArr[i18 + i23 + i24] = bVar2.d(iArr[i25], iArr[i26]);
                    int i27 = iArr[i26];
                    int i28 = i21 - i24;
                    zArr[(i19 * 2) + i18 + i23 + i24] = bVar2.d(i27, iArr[i28]);
                    int i29 = i21 - i22;
                    zArr[(i19 * 4) + i18 + i23 + i24] = bVar2.d(iArr[i28], iArr[i29]);
                    zArr[(i19 * 6) + i18 + i23 + i24] = bVar2.d(iArr[i29], iArr[i25]);
                    i24++;
                    d10 = d10;
                    e10 = e10;
                    i11 = 2;
                }
                boolean z10 = e10;
                int i30 = d10;
                i22++;
                i11 = 2;
            }
            boolean z11 = e10;
            int i31 = d10;
            i18 += i19 << 3;
            i17++;
            i11 = 2;
        }
        return zArr;
    }

    private static String e(b bVar, int i10) {
        int i11 = C0351a.f31212a[bVar.ordinal()];
        if (i11 == 1) {
            return f31206b[i10];
        }
        if (i11 == 2) {
            return f31207c[i10];
        }
        if (i11 == 3) {
            return f31208d[i10];
        }
        if (i11 == 4) {
            return f31209e[i10];
        }
        if (i11 == 5) {
            return f31210f[i10];
        }
        throw new IllegalStateException("Bad table");
    }

    private static String f(boolean[] zArr) {
        int length = zArr.length;
        b bVar = b.UPPER;
        StringBuilder sb2 = new StringBuilder(20);
        b bVar2 = bVar;
        int i10 = 0;
        while (i10 < length) {
            if (bVar == b.BINARY) {
                if (length - i10 < 5) {
                    break;
                }
                int i11 = i(zArr, i10, 5);
                i10 += 5;
                if (i11 == 0) {
                    if (length - i10 < 11) {
                        break;
                    }
                    i11 = i(zArr, i10, 11) + 31;
                    i10 += 11;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= i11) {
                        break;
                    } else if (length - i10 < 8) {
                        i10 = length;
                        break;
                    } else {
                        sb2.append((char) i(zArr, i10, 8));
                        i10 += 8;
                        i12++;
                    }
                }
            } else {
                int i13 = bVar == b.DIGIT ? 4 : 5;
                if (length - i10 < i13) {
                    break;
                }
                int i14 = i(zArr, i10, i13);
                i10 += i13;
                String e10 = e(bVar, i14);
                if (e10.startsWith("CTRL_")) {
                    bVar2 = g(e10.charAt(5));
                    if (e10.charAt(6) != 'L') {
                        b bVar3 = bVar2;
                        bVar2 = bVar;
                        bVar = bVar3;
                    }
                } else {
                    sb2.append(e10);
                }
            }
            bVar = bVar2;
        }
        return sb2.toString();
    }

    private static b g(char c10) {
        if (c10 == 'B') {
            return b.BINARY;
        }
        if (c10 == 'D') {
            return b.DIGIT;
        }
        if (c10 == 'P') {
            return b.PUNCT;
        }
        if (c10 == 'L') {
            return b.LOWER;
        }
        if (c10 != 'M') {
            return b.UPPER;
        }
        return b.MIXED;
    }

    private static byte h(boolean[] zArr, int i10) {
        int i11;
        int length = zArr.length - i10;
        if (length >= 8) {
            i11 = i(zArr, i10, 8);
        } else {
            i11 = i(zArr, i10, length) << (8 - length);
        }
        return (byte) i11;
    }

    private static int i(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 <<= 1;
            if (zArr[i13]) {
                i12 |= 1;
            }
        }
        return i12;
    }

    private static int j(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 << 4)) * i10;
    }

    public e c(w8.a aVar) throws f {
        this.f31211a = aVar;
        boolean[] b10 = b(d(aVar.a()));
        e eVar = new e(a(b10), f(b10), (List<byte[]>) null, (String) null);
        eVar.l(b10.length);
        return eVar;
    }
}
