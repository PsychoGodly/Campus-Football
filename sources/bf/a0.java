package bf;

import cf.c;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import lf.e;

/* compiled from: ResponseBody */
public abstract class a0 implements Closeable {

    /* compiled from: ResponseBody */
    class a extends a0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f31650a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f31651b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f31652c;

        a(t tVar, long j10, e eVar) {
            this.f31650a = tVar;
            this.f31651b = j10;
            this.f31652c = eVar;
        }

        public long i() {
            return this.f31651b;
        }

        public t j() {
            return this.f31650a;
        }

        public e u() {
            return this.f31652c;
        }
    }

    private Charset h() {
        t j10 = j();
        return j10 != null ? j10.b(c.f31992j) : c.f31992j;
    }

    public static a0 n(t tVar, long j10, e eVar) {
        Objects.requireNonNull(eVar, "source == null");
        return new a(tVar, j10, eVar);
    }

    public static a0 q(t tVar, byte[] bArr) {
        return n(tVar, (long) bArr.length, new lf.c().t0(bArr));
    }

    public final String A() throws IOException {
        e u10 = u();
        try {
            return u10.X(c.c(u10, h()));
        } finally {
            c.g(u10);
        }
    }

    public void close() {
        c.g(u());
    }

    public abstract long i();

    public abstract t j();

    public abstract e u();
}
