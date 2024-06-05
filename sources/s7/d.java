package s7;

import com.google.protobuf.i;
import u7.q;

/* compiled from: IndexByteEncoder */
public class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final g f30296a = new g();

    /* renamed from: b  reason: collision with root package name */
    private final a f30297b = new a();

    /* renamed from: c  reason: collision with root package name */
    private final b f30298c = new b();

    /* compiled from: IndexByteEncoder */
    class a extends b {
        a() {
        }

        public void a(i iVar) {
            d.this.f30296a.h(iVar);
        }

        public void b(double d10) {
            d.this.f30296a.j(d10);
        }

        public void c() {
            d.this.f30296a.n();
        }

        public void d(long j10) {
            d.this.f30296a.r(j10);
        }

        public void e(String str) {
            d.this.f30296a.v(str);
        }
    }

    /* compiled from: IndexByteEncoder */
    class b extends b {
        b() {
        }

        public void a(i iVar) {
            d.this.f30296a.i(iVar);
        }

        public void b(double d10) {
            d.this.f30296a.k(d10);
        }

        public void c() {
            d.this.f30296a.o();
        }

        public void d(long j10) {
            d.this.f30296a.s(j10);
        }

        public void e(String str) {
            d.this.f30296a.w(str);
        }
    }

    public b b(q.c.a aVar) {
        if (aVar.equals(q.c.a.DESCENDING)) {
            return this.f30298c;
        }
        return this.f30297b;
    }

    public byte[] c() {
        return this.f30296a.a();
    }

    public void d(byte[] bArr) {
        this.f30296a.c(bArr);
    }
}
