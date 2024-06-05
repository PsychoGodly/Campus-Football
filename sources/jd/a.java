package jd;

import com.google.protobuf.f1;
import com.google.protobuf.l;
import com.google.protobuf.v0;
import dd.q0;
import dd.w;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: ProtoInputStream */
final class a extends InputStream implements w, q0 {

    /* renamed from: a  reason: collision with root package name */
    private v0 f35771a;

    /* renamed from: b  reason: collision with root package name */
    private final f1<?> f35772b;

    /* renamed from: c  reason: collision with root package name */
    private ByteArrayInputStream f35773c;

    a(v0 v0Var, f1<?> f1Var) {
        this.f35771a = v0Var;
        this.f35772b = f1Var;
    }

    public int available() {
        v0 v0Var = this.f35771a;
        if (v0Var != null) {
            return v0Var.f();
        }
        ByteArrayInputStream byteArrayInputStream = this.f35773c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    public int h(OutputStream outputStream) throws IOException {
        v0 v0Var = this.f35771a;
        if (v0Var != null) {
            int f10 = v0Var.f();
            this.f35771a.c(outputStream);
            this.f35771a = null;
            return f10;
        }
        ByteArrayInputStream byteArrayInputStream = this.f35773c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int a10 = (int) b.a(byteArrayInputStream, outputStream);
        this.f35773c = null;
        return a10;
    }

    /* access modifiers changed from: package-private */
    public v0 i() {
        v0 v0Var = this.f35771a;
        if (v0Var != null) {
            return v0Var;
        }
        throw new IllegalStateException("message not available");
    }

    /* access modifiers changed from: package-private */
    public f1<?> j() {
        return this.f35772b;
    }

    public int read() {
        if (this.f35771a != null) {
            this.f35773c = new ByteArrayInputStream(this.f35771a.i());
            this.f35771a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f35773c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        v0 v0Var = this.f35771a;
        if (v0Var != null) {
            int f10 = v0Var.f();
            if (f10 == 0) {
                this.f35771a = null;
                this.f35773c = null;
                return -1;
            } else if (i11 >= f10) {
                l h02 = l.h0(bArr, i10, f10);
                this.f35771a.d(h02);
                h02.c0();
                h02.d();
                this.f35771a = null;
                this.f35773c = null;
                return f10;
            } else {
                this.f35773c = new ByteArrayInputStream(this.f35771a.i());
                this.f35771a = null;
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.f35773c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i10, i11);
        }
        return -1;
    }
}
