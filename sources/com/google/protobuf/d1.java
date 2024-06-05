package com.google.protobuf;

import com.google.protobuf.i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: NioByteString */
final class d1 extends i.C0284i {

    /* renamed from: f  reason: collision with root package name */
    private final ByteBuffer f26993f;

    d1(ByteBuffer byteBuffer) {
        d0.b(byteBuffer, "buffer");
        this.f26993f = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private ByteBuffer U(int i10, int i11) {
        if (i10 < this.f26993f.position() || i11 > this.f26993f.limit() || i10 > i11) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}));
        }
        ByteBuffer slice = this.f26993f.slice();
        slice.position(i10 - this.f26993f.position());
        slice.limit(i11 - this.f26993f.position());
        return slice;
    }

    public boolean A() {
        return a2.r(this.f26993f);
    }

    public j D() {
        return j.i(this.f26993f, true);
    }

    /* access modifiers changed from: protected */
    public int E(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f26993f.get(i13);
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public int F(int i10, int i11, int i12) {
        return a2.u(i10, this.f26993f, i11, i12 + i11);
    }

    public i I(int i10, int i11) {
        try {
            return new d1(U(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public String M(Charset charset) {
        int i10;
        int i11;
        byte[] bArr;
        if (this.f26993f.hasArray()) {
            bArr = this.f26993f.array();
            i11 = this.f26993f.arrayOffset() + this.f26993f.position();
            i10 = this.f26993f.remaining();
        } else {
            bArr = J();
            i11 = 0;
            i10 = bArr.length;
        }
        return new String(bArr, i11, i10, charset);
    }

    /* access modifiers changed from: package-private */
    public void S(h hVar) throws IOException {
        hVar.a(this.f26993f.slice());
    }

    /* access modifiers changed from: package-private */
    public boolean T(i iVar, int i10, int i11) {
        return I(0, i11).equals(iVar.I(i10, i11 + i10));
    }

    public ByteBuffer c() {
        return this.f26993f.asReadOnlyBuffer();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (size() != iVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof d1) {
            return this.f26993f.equals(((d1) obj).f26993f);
        }
        if (obj instanceof m1) {
            return obj.equals(this);
        }
        return this.f26993f.equals(iVar.c());
    }

    public byte f(int i10) {
        try {
            return this.f26993f.get(i10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    public int size() {
        return this.f26993f.remaining();
    }

    /* access modifiers changed from: protected */
    public void v(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer slice = this.f26993f.slice();
        slice.position(i10);
        slice.get(bArr, i11, i12);
    }

    public byte y(int i10) {
        return f(i10);
    }
}
