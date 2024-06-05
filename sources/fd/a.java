package fd;

import fd.b;
import hd.i;
import io.grpc.internal.d2;
import java.io.IOException;
import java.net.Socket;
import lf.r;
import lf.t;
import r6.o;

/* compiled from: AsyncSink */
final class a implements r {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Object f32590a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final lf.c f32591b = new lf.c();

    /* renamed from: c  reason: collision with root package name */
    private final d2 f32592c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final b.a f32593d;

    /* renamed from: f  reason: collision with root package name */
    private final int f32594f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f32595g = false;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f32596h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f32597i = false;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public r f32598j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public Socket f32599k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f32600l;

    /* renamed from: m  reason: collision with root package name */
    private int f32601m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f32602n;

    /* renamed from: fd.a$a  reason: collision with other inner class name */
    /* compiled from: AsyncSink */
    class C0368a extends e {

        /* renamed from: b  reason: collision with root package name */
        final md.b f32603b = md.c.e();

        C0368a() {
            super(a.this, (C0368a) null);
        }

        public void a() throws IOException {
            int n10;
            md.c.f("WriteRunnable.runWrite");
            md.c.d(this.f32603b);
            lf.c cVar = new lf.c();
            try {
                synchronized (a.this.f32590a) {
                    cVar.V0(a.this.f32591b, a.this.f32591b.B());
                    boolean unused = a.this.f32595g = false;
                    n10 = a.this.f32602n;
                }
                a.this.f32598j.V0(cVar, cVar.v0());
                synchronized (a.this.f32590a) {
                    a.q(a.this, n10);
                }
                md.c.h("WriteRunnable.runWrite");
            } catch (Throwable th) {
                md.c.h("WriteRunnable.runWrite");
                throw th;
            }
        }
    }

    /* compiled from: AsyncSink */
    class b extends e {

        /* renamed from: b  reason: collision with root package name */
        final md.b f32605b = md.c.e();

        b() {
            super(a.this, (C0368a) null);
        }

        public void a() throws IOException {
            md.c.f("WriteRunnable.runFlush");
            md.c.d(this.f32605b);
            lf.c cVar = new lf.c();
            try {
                synchronized (a.this.f32590a) {
                    cVar.V0(a.this.f32591b, a.this.f32591b.v0());
                    boolean unused = a.this.f32596h = false;
                }
                a.this.f32598j.V0(cVar, cVar.v0());
                a.this.f32598j.flush();
                md.c.h("WriteRunnable.runFlush");
            } catch (Throwable th) {
                md.c.h("WriteRunnable.runFlush");
                throw th;
            }
        }
    }

    /* compiled from: AsyncSink */
    class c implements Runnable {
        c() {
        }

        public void run() {
            try {
                if (a.this.f32598j != null && a.this.f32591b.v0() > 0) {
                    a.this.f32598j.V0(a.this.f32591b, a.this.f32591b.v0());
                }
            } catch (IOException e10) {
                a.this.f32593d.f(e10);
            }
            a.this.f32591b.close();
            try {
                if (a.this.f32598j != null) {
                    a.this.f32598j.close();
                }
            } catch (IOException e11) {
                a.this.f32593d.f(e11);
            }
            try {
                if (a.this.f32599k != null) {
                    a.this.f32599k.close();
                }
            } catch (IOException e12) {
                a.this.f32593d.f(e12);
            }
        }
    }

    /* compiled from: AsyncSink */
    private class d extends c {
        public d(hd.c cVar) {
            super(cVar);
        }

        public void W(i iVar) throws IOException {
            a.L(a.this);
            super.W(iVar);
        }

        public void b(boolean z10, int i10, int i11) throws IOException {
            if (z10) {
                a.L(a.this);
            }
            super.b(z10, i10, i11);
        }

        public void g(int i10, hd.a aVar) throws IOException {
            a.L(a.this);
            super.g(i10, aVar);
        }
    }

    /* compiled from: AsyncSink */
    private abstract class e implements Runnable {
        private e() {
        }

        public abstract void a() throws IOException;

        public final void run() {
            try {
                if (a.this.f32598j != null) {
                    a();
                    return;
                }
                throw new IOException("Unable to perform write due to unavailable sink.");
            } catch (Exception e10) {
                a.this.f32593d.f(e10);
            }
        }

        /* synthetic */ e(a aVar, C0368a aVar2) {
            this();
        }
    }

    private a(d2 d2Var, b.a aVar, int i10) {
        this.f32592c = (d2) o.p(d2Var, "executor");
        this.f32593d = (b.a) o.p(aVar, "exceptionHandler");
        this.f32594f = i10;
    }

    static /* synthetic */ int L(a aVar) {
        int i10 = aVar.f32601m;
        aVar.f32601m = i10 + 1;
        return i10;
    }

    static a e0(d2 d2Var, b.a aVar, int i10) {
        return new a(d2Var, aVar, i10);
    }

    static /* synthetic */ int q(a aVar, int i10) {
        int i11 = aVar.f32602n - i10;
        aVar.f32602n = i11;
        return i11;
    }

    /* access modifiers changed from: package-private */
    public void R(r rVar, Socket socket) {
        o.v(this.f32598j == null, "AsyncSink's becomeConnected should only be called once.");
        this.f32598j = (r) o.p(rVar, "sink");
        this.f32599k = (Socket) o.p(socket, "socket");
    }

    public void V0(lf.c cVar, long j10) throws IOException {
        o.p(cVar, "source");
        if (!this.f32597i) {
            md.c.f("AsyncSink.write");
            try {
                synchronized (this.f32590a) {
                    this.f32591b.V0(cVar, j10);
                    int i10 = this.f32602n + this.f32601m;
                    this.f32602n = i10;
                    boolean z10 = false;
                    this.f32601m = 0;
                    if (!this.f32600l && i10 > this.f32594f) {
                        this.f32600l = true;
                        z10 = true;
                    } else if (!this.f32595g && !this.f32596h) {
                        if (this.f32591b.B() > 0) {
                            this.f32595g = true;
                        }
                    }
                    if (z10) {
                        this.f32599k.close();
                    } else {
                        this.f32592c.execute(new C0368a());
                        md.c.h("AsyncSink.write");
                        return;
                    }
                }
            } catch (IOException e10) {
                this.f32593d.f(e10);
            } catch (Throwable th) {
                md.c.h("AsyncSink.write");
                throw th;
            }
            md.c.h("AsyncSink.write");
            return;
        }
        throw new IOException("closed");
    }

    /* access modifiers changed from: package-private */
    public hd.c Z(hd.c cVar) {
        return new d(cVar);
    }

    public void close() {
        if (!this.f32597i) {
            this.f32597i = true;
            this.f32592c.execute(new c());
        }
    }

    public t e() {
        return t.f36294d;
    }

    public void flush() throws IOException {
        if (!this.f32597i) {
            md.c.f("AsyncSink.flush");
            try {
                synchronized (this.f32590a) {
                    if (this.f32596h) {
                        md.c.h("AsyncSink.flush");
                        return;
                    }
                    this.f32596h = true;
                    this.f32592c.execute(new b());
                    md.c.h("AsyncSink.flush");
                }
            } catch (Throwable th) {
                md.c.h("AsyncSink.flush");
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }
}
