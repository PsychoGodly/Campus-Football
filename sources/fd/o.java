package fd;

import io.grpc.internal.p2;
import lf.c;

/* compiled from: OkHttpWritableBuffer */
class o implements p2 {

    /* renamed from: a  reason: collision with root package name */
    private final c f32755a;

    /* renamed from: b  reason: collision with root package name */
    private int f32756b;

    /* renamed from: c  reason: collision with root package name */
    private int f32757c;

    o(c cVar, int i10) {
        this.f32755a = cVar;
        this.f32756b = i10;
    }

    /* access modifiers changed from: package-private */
    public c a() {
        return this.f32755a;
    }

    public int d() {
        return this.f32757c;
    }

    public void f(byte[] bArr, int i10, int i11) {
        this.f32755a.f(bArr, i10, i11);
        this.f32756b -= i11;
        this.f32757c += i11;
    }

    public int g() {
        return this.f32756b;
    }

    public void h(byte b10) {
        this.f32755a.G(b10);
        this.f32756b--;
        this.f32757c++;
    }

    public void release() {
    }
}
