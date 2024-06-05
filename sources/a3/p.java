package a3;

import k4.a;
import k4.r;
import s2.e0;

/* compiled from: TrackEncryptionBox */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f333a;

    /* renamed from: b  reason: collision with root package name */
    public final String f334b;

    /* renamed from: c  reason: collision with root package name */
    public final e0.a f335c;

    /* renamed from: d  reason: collision with root package name */
    public final int f336d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f337e;

    public p(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        boolean z11 = true;
        a.a((bArr2 != null ? false : z11) ^ (i10 == 0));
        this.f333a = z10;
        this.f334b = str;
        this.f336d = i10;
        this.f337e = bArr2;
        this.f335c = new e0.a(a(str), bArr, i11, i12);
    }

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                r.i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}
