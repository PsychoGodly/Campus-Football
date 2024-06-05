package k9;

import v8.j;
import z8.a;

/* compiled from: AI013x0x1xDecoder */
final class e extends i {

    /* renamed from: c  reason: collision with root package name */
    private final String f29148c;

    /* renamed from: d  reason: collision with root package name */
    private final String f29149d;

    e(a aVar, String str, String str2) {
        super(aVar);
        this.f29148c = str2;
        this.f29149d = str;
    }

    private void k(StringBuilder sb2, int i10) {
        int f10 = b().f(i10, 16);
        if (f10 != 38400) {
            sb2.append('(');
            sb2.append(this.f29148c);
            sb2.append(')');
            int i11 = f10 % 32;
            int i12 = f10 / 32;
            int i13 = (i12 % 12) + 1;
            int i14 = i12 / 12;
            if (i14 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i14);
            if (i13 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i13);
            if (i11 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i11);
        }
    }

    public String d() throws j {
        if (c().g() == 84) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 8);
            j(sb2, 48, 20);
            k(sb2, 68);
            return sb2.toString();
        }
        throw j.a();
    }

    /* access modifiers changed from: protected */
    public void h(StringBuilder sb2, int i10) {
        sb2.append('(');
        sb2.append(this.f29149d);
        sb2.append(i10 / 100000);
        sb2.append(')');
    }

    /* access modifiers changed from: protected */
    public int i(int i10) {
        return i10 % 100000;
    }
}
