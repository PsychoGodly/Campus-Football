package l4;

import java.util.ArrayList;
import java.util.List;
import k4.a0;
import k4.e;
import k4.w;
import n2.y2;

/* compiled from: AvcConfig */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f19893a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19894b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19895c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19896d;

    /* renamed from: e  reason: collision with root package name */
    public final float f19897e;

    /* renamed from: f  reason: collision with root package name */
    public final String f19898f;

    private a(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f19893a = list;
        this.f19894b = i10;
        this.f19895c = i11;
        this.f19896d = i12;
        this.f19897e = f10;
        this.f19898f = str;
    }

    private static byte[] a(a0 a0Var) {
        int M = a0Var.M();
        int f10 = a0Var.f();
        a0Var.U(M);
        return e.d(a0Var.e(), f10, M);
    }

    public static a b(a0 a0Var) throws y2 {
        String str;
        float f10;
        int i10;
        try {
            a0Var.U(4);
            int G = (a0Var.G() & 3) + 1;
            if (G != 3) {
                ArrayList arrayList = new ArrayList();
                int G2 = a0Var.G() & 31;
                for (int i11 = 0; i11 < G2; i11++) {
                    arrayList.add(a(a0Var));
                }
                int G3 = a0Var.G();
                for (int i12 = 0; i12 < G3; i12++) {
                    arrayList.add(a(a0Var));
                }
                int i13 = -1;
                if (G2 > 0) {
                    w.c l10 = w.l((byte[]) arrayList.get(0), G, ((byte[]) arrayList.get(0)).length);
                    int i14 = l10.f19805f;
                    int i15 = l10.f19806g;
                    float f11 = l10.f19807h;
                    str = e.a(l10.f19800a, l10.f19801b, l10.f19802c);
                    i13 = i14;
                    i10 = i15;
                    f10 = f11;
                } else {
                    str = null;
                    i10 = -1;
                    f10 = 1.0f;
                }
                return new a(arrayList, G, i13, i10, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw y2.a("Error parsing AVC config", e10);
        }
    }
}
