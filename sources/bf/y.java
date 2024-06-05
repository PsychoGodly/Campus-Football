package bf;

import cf.c;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import lf.d;

/* compiled from: RequestBody */
public abstract class y {

    /* compiled from: RequestBody */
    class a extends y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f31921a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31922b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ byte[] f31923c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f31924d;

        a(t tVar, int i10, byte[] bArr, int i11) {
            this.f31921a = tVar;
            this.f31922b = i10;
            this.f31923c = bArr;
            this.f31924d = i11;
        }

        public long a() {
            return (long) this.f31922b;
        }

        public t b() {
            return this.f31921a;
        }

        public void f(d dVar) throws IOException {
            dVar.f(this.f31923c, this.f31924d, this.f31922b);
        }
    }

    public static y c(t tVar, String str) {
        Charset charset = c.f31992j;
        if (tVar != null) {
            Charset a10 = tVar.a();
            if (a10 == null) {
                tVar = t.d(tVar + "; charset=utf-8");
            } else {
                charset = a10;
            }
        }
        return d(tVar, str.getBytes(charset));
    }

    public static y d(t tVar, byte[] bArr) {
        return e(tVar, bArr, 0, bArr.length);
    }

    public static y e(t tVar, byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr, "content == null");
        c.f((long) bArr.length, (long) i10, (long) i11);
        return new a(tVar, i11, bArr, i10);
    }

    public abstract long a() throws IOException;

    public abstract t b();

    public abstract void f(d dVar) throws IOException;
}
