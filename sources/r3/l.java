package r3;

import j4.o;
import j4.p;
import java.io.IOException;
import java.util.Arrays;
import k4.n0;
import n2.r1;

/* compiled from: DataChunk */
public abstract class l extends f {

    /* renamed from: j  reason: collision with root package name */
    private byte[] f22172j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f22173k;

    public l(j4.l lVar, p pVar, int i10, r1 r1Var, int i11, Object obj, byte[] bArr) {
        super(lVar, pVar, i10, r1Var, i11, obj, -9223372036854775807L, -9223372036854775807L);
        l lVar2;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = n0.f19743f;
            lVar2 = this;
        } else {
            lVar2 = this;
            bArr2 = bArr;
        }
        lVar2.f22172j = bArr2;
    }

    private void i(int i10) {
        byte[] bArr = this.f22172j;
        if (bArr.length < i10 + 16384) {
            this.f22172j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    public final void a() throws IOException {
        try {
            this.f22135i.f(this.f22128b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f22173k) {
                i(i11);
                i10 = this.f22135i.read(this.f22172j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f22173k) {
                g(this.f22172j, i11);
            }
        } finally {
            o.a(this.f22135i);
        }
    }

    public final void c() {
        this.f22173k = true;
    }

    /* access modifiers changed from: protected */
    public abstract void g(byte[] bArr, int i10) throws IOException;

    public byte[] h() {
        return this.f22172j;
    }
}
