package t6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import r6.o;

/* compiled from: ByteStreams */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final OutputStream f30357a = new a();

    /* compiled from: ByteStreams */
    class a extends OutputStream {
        a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        public void write(int i10) {
        }

        public void write(byte[] bArr) {
            o.o(bArr);
        }

        public void write(byte[] bArr, int i10, int i11) {
            o.o(bArr);
            o.t(i10, i11 + i10, bArr.length);
        }
    }

    private static byte[] a(Queue<byte[]> queue, int i10) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i10) {
            return remove;
        }
        int length = i10 - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i10);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i10 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        o.o(inputStream);
        o.o(outputStream);
        byte[] c10 = c();
        long j10 = 0;
        while (true) {
            int read = inputStream.read(c10);
            if (read == -1) {
                return j10;
            }
            outputStream.write(c10, 0, read);
            j10 += (long) read;
        }
    }

    static byte[] c() {
        return new byte[8192];
    }

    public static byte[] d(InputStream inputStream) throws IOException {
        o.o(inputStream);
        return e(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] e(InputStream inputStream, Queue<byte[]> queue, int i10) throws IOException {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i10) * 2));
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i11 = 0;
            while (i11 < min2) {
                int read = inputStream.read(bArr, i11, min2 - i11);
                if (read == -1) {
                    return a(queue, i10);
                }
                i11 += read;
                i10 += read;
            }
            min = u6.b.e(min, min < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
