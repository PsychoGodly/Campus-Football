package a4;

import java.util.List;
import k4.a0;
import y3.g;
import y3.h;

/* compiled from: DvbDecoder */
public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    private final b f364o;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        a0 a0Var = new a0(list.get(0));
        this.f364o = new b(a0Var.M(), a0Var.M());
    }

    /* access modifiers changed from: protected */
    public h z(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f364o.r();
        }
        return new c(this.f364o.b(bArr, i10));
    }
}
