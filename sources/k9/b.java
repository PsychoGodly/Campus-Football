package k9;

import z8.a;

/* compiled from: AI01320xDecoder */
final class b extends f {
    b(a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    public void h(StringBuilder sb2, int i10) {
        if (i10 < 10000) {
            sb2.append("(3202)");
        } else {
            sb2.append("(3203)");
        }
    }

    /* access modifiers changed from: protected */
    public int i(int i10) {
        return i10 < 10000 ? i10 : i10 - 10000;
    }
}
