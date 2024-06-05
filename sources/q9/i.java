package q9;

import v8.p;

/* compiled from: QRCodeDecoderMetaData */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f29749a;

    i(boolean z10) {
        this.f29749a = z10;
    }

    public void a(p[] pVarArr) {
        if (this.f29749a && pVarArr != null && pVarArr.length >= 3) {
            p pVar = pVarArr[0];
            pVarArr[0] = pVarArr[2];
            pVarArr[2] = pVar;
        }
    }
}
