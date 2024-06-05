package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MetadataListReader */
class l {

    /* compiled from: MetadataListReader */
    private static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f3401a;

        a(ByteBuffer byteBuffer) {
            this.f3401a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public void a(int i10) throws IOException {
            ByteBuffer byteBuffer = this.f3401a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        public long c() {
            return (long) this.f3401a.position();
        }

        public int d() throws IOException {
            return this.f3401a.getInt();
        }

        public long e() throws IOException {
            return l.c(this.f3401a.getInt());
        }

        public int readUnsignedShort() throws IOException {
            return l.d(this.f3401a.getShort());
        }
    }

    /* compiled from: MetadataListReader */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final long f3402a;

        /* renamed from: b  reason: collision with root package name */
        private final long f3403b;

        b(long j10, long j11) {
            this.f3402a = j10;
            this.f3403b = j11;
        }

        /* access modifiers changed from: package-private */
        public long a() {
            return this.f3402a;
        }
    }

    /* compiled from: MetadataListReader */
    private interface c {
        void a(int i10) throws IOException;

        long c();

        int d() throws IOException;

        long e() throws IOException;

        int readUnsignedShort() throws IOException;
    }

    private static b a(c cVar) throws IOException {
        long j10;
        cVar.a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            cVar.a(6);
            int i10 = 0;
            while (true) {
                if (i10 >= readUnsignedShort) {
                    j10 = -1;
                    break;
                }
                int d10 = cVar.d();
                cVar.a(4);
                j10 = cVar.e();
                cVar.a(4);
                if (1835365473 == d10) {
                    break;
                }
                i10++;
            }
            if (j10 != -1) {
                cVar.a((int) (j10 - cVar.c()));
                cVar.a(12);
                long e10 = cVar.e();
                for (int i11 = 0; ((long) i11) < e10; i11++) {
                    int d11 = cVar.d();
                    long e11 = cVar.e();
                    long e12 = cVar.e();
                    if (1164798569 == d11 || 1701669481 == d11) {
                        return new b(e11 + j10, e12);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    static j0.b b(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return j0.b.h(duplicate);
    }

    static long c(int i10) {
        return ((long) i10) & 4294967295L;
    }

    static int d(short s10) {
        return s10 & 65535;
    }
}
