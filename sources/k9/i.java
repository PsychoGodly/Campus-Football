package k9;

import z8.a;

/* compiled from: AI01weightDecoder */
abstract class i extends h {
    i(a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    public abstract void h(StringBuilder sb2, int i10);

    /* access modifiers changed from: protected */
    public abstract int i(int i10);

    /* access modifiers changed from: package-private */
    public final void j(StringBuilder sb2, int i10, int i11) {
        int f10 = b().f(i10, i11);
        h(sb2, f10);
        int i12 = i(f10);
        int i13 = 100000;
        for (int i14 = 0; i14 < 5; i14++) {
            if (i12 / i13 == 0) {
                sb2.append('0');
            }
            i13 /= 10;
        }
        sb2.append(i12);
    }
}
