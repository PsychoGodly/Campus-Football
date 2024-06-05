package m5;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class k {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        return c(inputStream, outputStream, false, 1024);
    }

    @Deprecated
    public static long c(InputStream inputStream, OutputStream outputStream, boolean z10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        long j10 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i10);
                if (read == -1) {
                    break;
                }
                j10 += (long) read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z10) {
                    a(inputStream);
                    a(outputStream);
                }
                throw th;
            }
        }
        if (z10) {
            a(inputStream);
            a(outputStream);
        }
        return j10;
    }

    @Deprecated
    public static byte[] d(InputStream inputStream, boolean z10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c(inputStream, byteArrayOutputStream, z10, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
