package io.grpc.internal;

import dd.j1;
import dd.l;
import dd.n;
import dd.q0;
import dd.w;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import r6.o;

/* compiled from: MessageFramer */
public class m1 implements p0 {

    /* renamed from: a  reason: collision with root package name */
    private final d f35179a;

    /* renamed from: b  reason: collision with root package name */
    private int f35180b = -1;

    /* renamed from: c  reason: collision with root package name */
    private p2 f35181c;

    /* renamed from: d  reason: collision with root package name */
    private n f35182d = l.b.f32286a;

    /* renamed from: e  reason: collision with root package name */
    private boolean f35183e = true;

    /* renamed from: f  reason: collision with root package name */
    private final c f35184f = new c();

    /* renamed from: g  reason: collision with root package name */
    private final ByteBuffer f35185g = ByteBuffer.allocate(5);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final q2 f35186h;

    /* renamed from: i  reason: collision with root package name */
    private final i2 f35187i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f35188j;

    /* renamed from: k  reason: collision with root package name */
    private int f35189k;

    /* renamed from: l  reason: collision with root package name */
    private int f35190l = -1;

    /* renamed from: m  reason: collision with root package name */
    private long f35191m;

    /* compiled from: MessageFramer */
    private class c extends OutputStream {
        private c() {
        }

        public void write(int i10) {
            write(new byte[]{(byte) i10}, 0, 1);
        }

        public void write(byte[] bArr, int i10, int i11) {
            m1.this.o(bArr, i10, i11);
        }
    }

    /* compiled from: MessageFramer */
    public interface d {
        void e(p2 p2Var, boolean z10, boolean z11, int i10);
    }

    public m1(d dVar, q2 q2Var, i2 i2Var) {
        this.f35179a = (d) o.p(dVar, "sink");
        this.f35186h = (q2) o.p(q2Var, "bufferAllocator");
        this.f35187i = (i2) o.p(i2Var, "statsTraceCtx");
    }

    private void f(boolean z10, boolean z11) {
        p2 p2Var = this.f35181c;
        this.f35181c = null;
        this.f35179a.e(p2Var, z10, z11, this.f35189k);
        this.f35189k = 0;
    }

    private int g(InputStream inputStream) throws IOException {
        if ((inputStream instanceof q0) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    private void h() {
        p2 p2Var = this.f35181c;
        if (p2Var != null) {
            p2Var.release();
            this.f35181c = null;
        }
    }

    private void k() {
        if (b()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    private void l(b bVar, boolean z10) {
        int h10 = bVar.d();
        this.f35185g.clear();
        this.f35185g.put(z10 ? (byte) 1 : 0).putInt(h10);
        p2 a10 = this.f35186h.a(5);
        a10.f(this.f35185g.array(), 0, this.f35185g.position());
        if (h10 == 0) {
            this.f35181c = a10;
            return;
        }
        this.f35179a.e(a10, false, false, this.f35189k - 1);
        this.f35189k = 1;
        List i10 = bVar.f35192a;
        for (int i11 = 0; i11 < i10.size() - 1; i11++) {
            this.f35179a.e((p2) i10.get(i11), false, false, 0);
        }
        this.f35181c = (p2) i10.get(i10.size() - 1);
        this.f35191m = (long) h10;
    }

    /* JADX INFO: finally extract failed */
    private int m(InputStream inputStream, int i10) throws IOException {
        b bVar = new b();
        OutputStream c10 = this.f35182d.c(bVar);
        try {
            int p10 = p(inputStream, c10);
            c10.close();
            int i11 = this.f35180b;
            if (i11 < 0 || p10 <= i11) {
                l(bVar, true);
                return p10;
            }
            throw j1.f32242o.q(String.format(Locale.US, "message too large %d > %d", new Object[]{Integer.valueOf(p10), Integer.valueOf(this.f35180b)})).d();
        } catch (Throwable th) {
            c10.close();
            throw th;
        }
    }

    private int n(InputStream inputStream, int i10) throws IOException {
        int i11 = this.f35180b;
        if (i11 < 0 || i10 <= i11) {
            this.f35185g.clear();
            this.f35185g.put((byte) 0).putInt(i10);
            if (this.f35181c == null) {
                this.f35181c = this.f35186h.a(this.f35185g.position() + i10);
            }
            o(this.f35185g.array(), 0, this.f35185g.position());
            return p(inputStream, this.f35184f);
        }
        throw j1.f32242o.q(String.format(Locale.US, "message too large %d > %d", new Object[]{Integer.valueOf(i10), Integer.valueOf(this.f35180b)})).d();
    }

    /* access modifiers changed from: private */
    public void o(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            p2 p2Var = this.f35181c;
            if (p2Var != null && p2Var.g() == 0) {
                f(false, false);
            }
            if (this.f35181c == null) {
                this.f35181c = this.f35186h.a(i11);
            }
            int min = Math.min(i11, this.f35181c.g());
            this.f35181c.f(bArr, i10, min);
            i10 += min;
            i11 -= min;
        }
    }

    private static int p(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof w) {
            return ((w) inputStream).h(outputStream);
        }
        long b10 = t6.b.b(inputStream, outputStream);
        o.j(b10 <= 2147483647L, "Message size overflow: %s", b10);
        return (int) b10;
    }

    private int q(InputStream inputStream, int i10) throws IOException {
        if (i10 != -1) {
            this.f35191m = (long) i10;
            return n(inputStream, i10);
        }
        b bVar = new b();
        int p10 = p(inputStream, bVar);
        int i11 = this.f35180b;
        if (i11 < 0 || p10 <= i11) {
            l(bVar, false);
            return p10;
        }
        throw j1.f32242o.q(String.format(Locale.US, "message too large %d > %d", new Object[]{Integer.valueOf(p10), Integer.valueOf(this.f35180b)})).d();
    }

    public boolean b() {
        return this.f35188j;
    }

    public void c(InputStream inputStream) {
        int i10;
        k();
        this.f35189k++;
        int i11 = this.f35190l + 1;
        this.f35190l = i11;
        this.f35191m = 0;
        this.f35187i.i(i11);
        boolean z10 = this.f35183e && this.f35182d != l.b.f32286a;
        try {
            int g10 = g(inputStream);
            if (g10 == 0 || !z10) {
                i10 = q(inputStream, g10);
            } else {
                i10 = m(inputStream, g10);
            }
            if (g10 == -1 || i10 == g10) {
                long j10 = (long) i10;
                this.f35187i.k(j10);
                this.f35187i.l(this.f35191m);
                this.f35187i.j(this.f35190l, this.f35191m, j10);
                return;
            }
            throw j1.f32247t.q(String.format("Message length inaccurate %s != %s", new Object[]{Integer.valueOf(i10), Integer.valueOf(g10)})).d();
        } catch (IOException e10) {
            throw j1.f32247t.q("Failed to frame message").p(e10).d();
        } catch (RuntimeException e11) {
            throw j1.f32247t.q("Failed to frame message").p(e11).d();
        }
    }

    public void close() {
        if (!b()) {
            this.f35188j = true;
            p2 p2Var = this.f35181c;
            if (p2Var != null && p2Var.d() == 0) {
                h();
            }
            f(true, true);
        }
    }

    public void flush() {
        p2 p2Var = this.f35181c;
        if (p2Var != null && p2Var.d() > 0) {
            f(false, true);
        }
    }

    /* renamed from: i */
    public m1 a(n nVar) {
        this.f35182d = (n) o.p(nVar, "Can't pass an empty compressor");
        return this;
    }

    public void j(int i10) {
        o.v(this.f35180b == -1, "max size already set");
        this.f35180b = i10;
    }

    /* compiled from: MessageFramer */
    private final class b extends OutputStream {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List<p2> f35192a;

        /* renamed from: b  reason: collision with root package name */
        private p2 f35193b;

        private b() {
            this.f35192a = new ArrayList();
        }

        /* access modifiers changed from: private */
        public int d() {
            int i10 = 0;
            for (p2 d10 : this.f35192a) {
                i10 += d10.d();
            }
            return i10;
        }

        public void write(int i10) throws IOException {
            p2 p2Var = this.f35193b;
            if (p2Var == null || p2Var.g() <= 0) {
                write(new byte[]{(byte) i10}, 0, 1);
                return;
            }
            this.f35193b.h((byte) i10);
        }

        public void write(byte[] bArr, int i10, int i11) {
            if (this.f35193b == null) {
                p2 a10 = m1.this.f35186h.a(i11);
                this.f35193b = a10;
                this.f35192a.add(a10);
            }
            while (i11 > 0) {
                int min = Math.min(i11, this.f35193b.g());
                if (min == 0) {
                    p2 a11 = m1.this.f35186h.a(Math.max(i11, this.f35193b.d() * 2));
                    this.f35193b = a11;
                    this.f35192a.add(a11);
                } else {
                    this.f35193b.f(bArr, i10, min);
                    i10 += min;
                    i11 -= min;
                }
            }
        }
    }
}
