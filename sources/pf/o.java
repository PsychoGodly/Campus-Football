package pf;

import android.media.MediaDataSource;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.jvm.internal.m;

/* compiled from: ByteDataSource.kt */
public final class o extends MediaDataSource {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f37464a;

    public o(byte[] bArr) {
        m.e(bArr, JsonStorageKeyNames.DATA_KEY);
        this.f37464a = bArr;
    }

    private final int h(int i10, long j10) {
        long j11 = (long) i10;
        long j12 = j10 + j11;
        byte[] bArr = this.f37464a;
        if (j12 > ((long) bArr.length)) {
            j11 -= j12 - ((long) bArr.length);
        }
        return (int) j11;
    }

    public synchronized void close() {
    }

    public synchronized long getSize() {
        return (long) this.f37464a.length;
    }

    public synchronized int readAt(long j10, byte[] bArr, int i10, int i11) {
        m.e(bArr, "buffer");
        if (j10 >= ((long) this.f37464a.length)) {
            return -1;
        }
        int h10 = h(i11, j10);
        System.arraycopy(this.f37464a, (int) j10, bArr, i10, h10);
        return h10;
    }
}
