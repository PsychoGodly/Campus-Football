package n7;

import java.io.OutputStream;

/* compiled from: LengthCountingOutputStream */
final class b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private long f29418a = 0;

    b() {
    }

    /* access modifiers changed from: package-private */
    public long h() {
        return this.f29418a;
    }

    public void write(int i10) {
        this.f29418a++;
    }

    public void write(byte[] bArr) {
        this.f29418a += (long) bArr.length;
    }

    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f29418a += (long) i11;
    }
}
