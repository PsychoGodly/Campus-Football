package ce;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.m;

/* compiled from: IOStreams.kt */
public final class a {
    public static final long a(InputStream inputStream, OutputStream outputStream, int i10) {
        m.e(inputStream, "<this>");
        m.e(outputStream, "out");
        byte[] bArr = new byte[i10];
        int read = inputStream.read(bArr);
        long j10 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j10 += (long) read;
            read = inputStream.read(bArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(inputStream, outputStream, i10);
    }
}
