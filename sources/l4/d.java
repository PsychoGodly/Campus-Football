package l4;

import k4.a0;

/* compiled from: DolbyVisionConfig */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f19910a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19911b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19912c;

    private d(int i10, int i11, String str) {
        this.f19910a = i10;
        this.f19911b = i11;
        this.f19912c = str;
    }

    public static d a(a0 a0Var) {
        String str;
        a0Var.U(2);
        int G = a0Var.G();
        int i10 = G >> 1;
        int G2 = ((a0Var.G() >> 3) & 31) | ((G & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else if (i10 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(str2);
        sb2.append(i10);
        if (G2 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(G2);
        return new d(i10, G2, sb2.toString());
    }
}
