package l4;

import java.util.Collections;
import java.util.List;
import k4.a0;
import k4.e;
import k4.w;
import n2.y2;

/* compiled from: HevcConfig */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f19927a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19928b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19929c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19930d;

    /* renamed from: e  reason: collision with root package name */
    public final float f19931e;

    /* renamed from: f  reason: collision with root package name */
    public final int f19932f;

    /* renamed from: g  reason: collision with root package name */
    public final int f19933g;

    /* renamed from: h  reason: collision with root package name */
    public final int f19934h;

    /* renamed from: i  reason: collision with root package name */
    public final String f19935i;

    private f(List<byte[]> list, int i10, int i11, int i12, float f10, String str, int i13, int i14, int i15) {
        this.f19927a = list;
        this.f19928b = i10;
        this.f19929c = i11;
        this.f19930d = i12;
        this.f19931e = f10;
        this.f19935i = str;
        this.f19932f = i13;
        this.f19933g = i14;
        this.f19934h = i15;
    }

    public static f a(a0 a0Var) throws y2 {
        int i10;
        int i11;
        a0 a0Var2 = a0Var;
        try {
            a0Var2.U(21);
            int G = a0Var.G() & 3;
            int G2 = a0Var.G();
            int f10 = a0Var.f();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < G2; i14++) {
                a0Var2.U(1);
                int M = a0Var.M();
                for (int i15 = 0; i15 < M; i15++) {
                    int M2 = a0Var.M();
                    i13 += M2 + 4;
                    a0Var2.U(M2);
                }
            }
            a0Var2.T(f10);
            byte[] bArr = new byte[i13];
            String str = null;
            int i16 = 0;
            int i17 = 0;
            int i18 = -1;
            int i19 = -1;
            float f11 = 1.0f;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            while (i16 < G2) {
                int G3 = a0Var.G() & 63;
                int M3 = a0Var.M();
                int i23 = 0;
                while (i23 < M3) {
                    int M4 = a0Var.M();
                    byte[] bArr2 = w.f19780a;
                    int i24 = G2;
                    System.arraycopy(bArr2, i12, bArr, i17, bArr2.length);
                    int length = i17 + bArr2.length;
                    System.arraycopy(a0Var.e(), a0Var.f(), bArr, length, M4);
                    if (G3 == 33 && i23 == 0) {
                        w.a h10 = w.h(bArr, length, length + M4);
                        int i25 = h10.f19791h;
                        i19 = h10.f19792i;
                        int i26 = h10.f19794k;
                        int i27 = h10.f19795l;
                        int i28 = h10.f19796m;
                        float f12 = h10.f19793j;
                        i11 = G3;
                        i10 = M3;
                        i18 = i25;
                        i22 = i28;
                        str = e.c(h10.f19784a, h10.f19785b, h10.f19786c, h10.f19787d, h10.f19788e, h10.f19789f);
                        i21 = i27;
                        f11 = f12;
                        i20 = i26;
                    } else {
                        i11 = G3;
                        i10 = M3;
                    }
                    i17 = length + M4;
                    a0Var2.U(M4);
                    i23++;
                    G2 = i24;
                    G3 = i11;
                    M3 = i10;
                    i12 = 0;
                }
                int i29 = G2;
                i16++;
                i12 = 0;
            }
            return new f(i13 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), G + 1, i18, i19, f11, str, i20, i21, i22);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw y2.a("Error parsing HEVC config", e10);
        }
    }
}
