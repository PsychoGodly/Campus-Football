package fd;

import io.grpc.internal.c;
import io.grpc.internal.v1;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: OkHttpReadableBuffer */
class l extends c {

    /* renamed from: a  reason: collision with root package name */
    private final lf.c f32753a;

    l(lf.c cVar) {
        this.f32753a = cVar;
    }

    private void i() throws EOFException {
    }

    public void B0(OutputStream outputStream, int i10) throws IOException {
        this.f32753a.c1(outputStream, (long) i10);
    }

    public void P0(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    public void Y(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            int read = this.f32753a.read(bArr, i10, i11);
            if (read != -1) {
                i11 -= read;
                i10 += read;
            } else {
                throw new IndexOutOfBoundsException("EOF trying to read " + i11 + " bytes");
            }
        }
    }

    public void close() {
        this.f32753a.i();
    }

    public int d() {
        return (int) this.f32753a.v0();
    }

    public int readUnsignedByte() {
        try {
            i();
            return this.f32753a.readByte() & 255;
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    public void skipBytes(int i10) {
        try {
            this.f32753a.skip((long) i10);
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    public v1 z(int i10) {
        lf.c cVar = new lf.c();
        cVar.V0(this.f32753a, (long) i10);
        return new l(cVar);
    }
}
