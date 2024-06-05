package io.grpc.internal;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import dd.j1;
import dd.l;
import dd.u;
import io.grpc.internal.k2;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;
import r6.o;

/* compiled from: MessageDeframer */
public class l1 implements Closeable, y {

    /* renamed from: a  reason: collision with root package name */
    private b f35142a;

    /* renamed from: b  reason: collision with root package name */
    private int f35143b;

    /* renamed from: c  reason: collision with root package name */
    private final i2 f35144c;

    /* renamed from: d  reason: collision with root package name */
    private final o2 f35145d;

    /* renamed from: f  reason: collision with root package name */
    private u f35146f;

    /* renamed from: g  reason: collision with root package name */
    private s0 f35147g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f35148h;

    /* renamed from: i  reason: collision with root package name */
    private int f35149i;

    /* renamed from: j  reason: collision with root package name */
    private e f35150j = e.HEADER;

    /* renamed from: k  reason: collision with root package name */
    private int f35151k = 5;

    /* renamed from: l  reason: collision with root package name */
    private boolean f35152l;

    /* renamed from: m  reason: collision with root package name */
    private u f35153m;

    /* renamed from: n  reason: collision with root package name */
    private u f35154n = new u();

    /* renamed from: o  reason: collision with root package name */
    private long f35155o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f35156p = false;

    /* renamed from: q  reason: collision with root package name */
    private int f35157q = -1;

    /* renamed from: r  reason: collision with root package name */
    private int f35158r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f35159s = false;

    /* renamed from: t  reason: collision with root package name */
    private volatile boolean f35160t = false;

    /* compiled from: MessageDeframer */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f35161a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.grpc.internal.l1$e[] r0 = io.grpc.internal.l1.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35161a = r0
                io.grpc.internal.l1$e r1 = io.grpc.internal.l1.e.HEADER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35161a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.grpc.internal.l1$e r1 = io.grpc.internal.l1.e.BODY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.l1.a.<clinit>():void");
        }
    }

    /* compiled from: MessageDeframer */
    public interface b {
        void a(k2.a aVar);

        void c(boolean z10);

        void d(int i10);

        void e(Throwable th);
    }

    /* compiled from: MessageDeframer */
    private static class c implements k2.a {

        /* renamed from: a  reason: collision with root package name */
        private InputStream f35162a;

        /* synthetic */ c(InputStream inputStream, a aVar) {
            this(inputStream);
        }

        public InputStream next() {
            InputStream inputStream = this.f35162a;
            this.f35162a = null;
            return inputStream;
        }

        private c(InputStream inputStream) {
            this.f35162a = inputStream;
        }
    }

    /* compiled from: MessageDeframer */
    private enum e {
        HEADER,
        BODY
    }

    public l1(b bVar, u uVar, int i10, i2 i2Var, o2 o2Var) {
        this.f35142a = (b) o.p(bVar, "sink");
        this.f35146f = (u) o.p(uVar, "decompressor");
        this.f35143b = i10;
        this.f35144c = (i2) o.p(i2Var, "statsTraceCtx");
        this.f35145d = (o2) o.p(o2Var, "transportTracer");
    }

    private InputStream A() {
        u uVar = this.f35146f;
        if (uVar != l.b.f32286a) {
            try {
                return new d(uVar.b(w1.c(this.f35153m, true)), this.f35143b, this.f35144c);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } else {
            throw j1.f32247t.q("Can't decode compressed gRPC message as compression not configured").d();
        }
    }

    private InputStream B() {
        this.f35144c.f((long) this.f35153m.d());
        return w1.c(this.f35153m, true);
    }

    private boolean L() {
        return J() || this.f35159s;
    }

    private boolean R() {
        s0 s0Var = this.f35147g;
        if (s0Var != null) {
            return s0Var.i0();
        }
        return this.f35154n.d() == 0;
    }

    private void Z() {
        this.f35144c.e(this.f35157q, (long) this.f35158r, -1);
        this.f35158r = 0;
        InputStream A = this.f35152l ? A() : B();
        this.f35153m = null;
        this.f35142a.a(new c(A, (a) null));
        this.f35150j = e.HEADER;
        this.f35151k = 5;
    }

    private void e0() {
        int readUnsignedByte = this.f35153m.readUnsignedByte();
        if ((readUnsignedByte & 254) == 0) {
            this.f35152l = (readUnsignedByte & 1) != 0;
            int readInt = this.f35153m.readInt();
            this.f35151k = readInt;
            if (readInt < 0 || readInt > this.f35143b) {
                throw j1.f32242o.q(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", new Object[]{Integer.valueOf(this.f35143b), Integer.valueOf(this.f35151k)})).d();
            }
            int i10 = this.f35157q + 1;
            this.f35157q = i10;
            this.f35144c.d(i10);
            this.f35145d.d();
            this.f35150j = e.BODY;
            return;
        }
        throw j1.f32247t.q("gRPC frame header malformed: reserved bits not zero").d();
    }

    private boolean g0() {
        int i10;
        int i11 = 0;
        try {
            if (this.f35153m == null) {
                this.f35153m = new u();
            }
            int i12 = 0;
            i10 = 0;
            while (true) {
                try {
                    int d10 = this.f35151k - this.f35153m.d();
                    if (d10 <= 0) {
                        if (i12 > 0) {
                            this.f35142a.d(i12);
                            if (this.f35150j == e.BODY) {
                                if (this.f35147g != null) {
                                    this.f35144c.g((long) i10);
                                    this.f35158r += i10;
                                } else {
                                    this.f35144c.g((long) i12);
                                    this.f35158r += i12;
                                }
                            }
                        }
                        return true;
                    } else if (this.f35147g != null) {
                        byte[] bArr = this.f35148h;
                        if (bArr == null || this.f35149i == bArr.length) {
                            this.f35148h = new byte[Math.min(d10, 2097152)];
                            this.f35149i = 0;
                        }
                        int g02 = this.f35147g.g0(this.f35148h, this.f35149i, Math.min(d10, this.f35148h.length - this.f35149i));
                        i12 += this.f35147g.L();
                        i10 += this.f35147g.R();
                        if (g02 == 0) {
                            if (i12 > 0) {
                                this.f35142a.d(i12);
                                if (this.f35150j == e.BODY) {
                                    if (this.f35147g != null) {
                                        this.f35144c.g((long) i10);
                                        this.f35158r += i10;
                                    } else {
                                        this.f35144c.g((long) i12);
                                        this.f35158r += i12;
                                    }
                                }
                            }
                            return false;
                        }
                        this.f35153m.i(w1.f(this.f35148h, this.f35149i, g02));
                        this.f35149i += g02;
                    } else if (this.f35154n.d() == 0) {
                        if (i12 > 0) {
                            this.f35142a.d(i12);
                            if (this.f35150j == e.BODY) {
                                if (this.f35147g != null) {
                                    this.f35144c.g((long) i10);
                                    this.f35158r += i10;
                                } else {
                                    this.f35144c.g((long) i12);
                                    this.f35158r += i12;
                                }
                            }
                        }
                        return false;
                    } else {
                        int min = Math.min(d10, this.f35154n.d());
                        i12 += min;
                        this.f35153m.i(this.f35154n.z(min));
                    }
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                } catch (DataFormatException e11) {
                    throw new RuntimeException(e11);
                } catch (Throwable th) {
                    int i13 = i12;
                    th = th;
                    i11 = i13;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            i10 = 0;
            if (i11 > 0) {
                this.f35142a.d(i11);
                if (this.f35150j == e.BODY) {
                    if (this.f35147g != null) {
                        this.f35144c.g((long) i10);
                        this.f35158r += i10;
                    } else {
                        this.f35144c.g((long) i11);
                        this.f35158r += i11;
                    }
                }
            }
            throw th;
        }
    }

    private void u() {
        if (!this.f35156p) {
            this.f35156p = true;
            while (!this.f35160t && this.f35155o > 0 && g0()) {
                try {
                    int i10 = a.f35161a[this.f35150j.ordinal()];
                    if (i10 == 1) {
                        e0();
                    } else if (i10 == 2) {
                        Z();
                        this.f35155o--;
                    } else {
                        throw new AssertionError("Invalid state: " + this.f35150j);
                    }
                } finally {
                    this.f35156p = false;
                }
            }
            if (this.f35160t) {
                close();
                return;
            }
            if (this.f35159s && R()) {
                close();
            }
            this.f35156p = false;
        }
    }

    public boolean J() {
        return this.f35154n == null && this.f35147g == null;
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        if (!J()) {
            u uVar = this.f35153m;
            boolean z10 = true;
            boolean z11 = uVar != null && uVar.d() > 0;
            try {
                s0 s0Var = this.f35147g;
                if (s0Var != null) {
                    if (!z11) {
                        if (!s0Var.Z()) {
                            z10 = false;
                        }
                    }
                    this.f35147g.close();
                    z11 = z10;
                }
                u uVar2 = this.f35154n;
                if (uVar2 != null) {
                    uVar2.close();
                }
                u uVar3 = this.f35153m;
                if (uVar3 != null) {
                    uVar3.close();
                }
                this.f35147g = null;
                this.f35154n = null;
                this.f35153m = null;
                this.f35142a.c(z11);
            } catch (Throwable th) {
                this.f35147g = null;
                this.f35154n = null;
                this.f35153m = null;
                throw th;
            }
        }
    }

    public void h(int i10) {
        o.e(i10 > 0, "numMessages must be > 0");
        if (!J()) {
            this.f35155o += (long) i10;
            u();
        }
    }

    public void h0(s0 s0Var) {
        boolean z10 = true;
        o.v(this.f35146f == l.b.f32286a, "per-message decompressor already set");
        if (this.f35147g != null) {
            z10 = false;
        }
        o.v(z10, "full stream decompressor already set");
        this.f35147g = (s0) o.p(s0Var, "Can't pass a null full stream decompressor");
        this.f35154n = null;
    }

    public void i(int i10) {
        this.f35143b = i10;
    }

    /* access modifiers changed from: package-private */
    public void i0(b bVar) {
        this.f35142a = bVar;
    }

    public void j(u uVar) {
        o.v(this.f35147g == null, "Already set full stream decompressor");
        this.f35146f = (u) o.p(uVar, "Can't pass an empty decompressor");
    }

    /* access modifiers changed from: package-private */
    public void l0() {
        this.f35160t = true;
    }

    public void n() {
        if (!J()) {
            if (R()) {
                close();
            } else {
                this.f35159s = true;
            }
        }
    }

    public void q(v1 v1Var) {
        o.p(v1Var, JsonStorageKeyNames.DATA_KEY);
        boolean z10 = true;
        try {
            if (!L()) {
                s0 s0Var = this.f35147g;
                if (s0Var != null) {
                    s0Var.B(v1Var);
                } else {
                    this.f35154n.i(v1Var);
                }
                z10 = false;
                u();
            }
        } finally {
            if (z10) {
                v1Var.close();
            }
        }
    }

    /* compiled from: MessageDeframer */
    static final class d extends FilterInputStream {

        /* renamed from: a  reason: collision with root package name */
        private final int f35163a;

        /* renamed from: b  reason: collision with root package name */
        private final i2 f35164b;

        /* renamed from: c  reason: collision with root package name */
        private long f35165c;

        /* renamed from: d  reason: collision with root package name */
        private long f35166d;

        /* renamed from: f  reason: collision with root package name */
        private long f35167f = -1;

        d(InputStream inputStream, int i10, i2 i2Var) {
            super(inputStream);
            this.f35163a = i10;
            this.f35164b = i2Var;
        }

        private void h() {
            long j10 = this.f35166d;
            long j11 = this.f35165c;
            if (j10 > j11) {
                this.f35164b.f(j10 - j11);
                this.f35165c = this.f35166d;
            }
        }

        private void i() {
            if (this.f35166d > ((long) this.f35163a)) {
                j1 j1Var = j1.f32242o;
                throw j1Var.q("Decompressed gRPC message exceeds maximum size " + this.f35163a).d();
            }
        }

        public synchronized void mark(int i10) {
            this.in.mark(i10);
            this.f35167f = this.f35166d;
        }

        public int read() throws IOException {
            int read = this.in.read();
            if (read != -1) {
                this.f35166d++;
            }
            i();
            h();
            return read;
        }

        public synchronized void reset() throws IOException {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f35167f != -1) {
                this.in.reset();
                this.f35166d = this.f35167f;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public long skip(long j10) throws IOException {
            long skip = this.in.skip(j10);
            this.f35166d += skip;
            i();
            h();
            return skip;
        }

        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int read = this.in.read(bArr, i10, i11);
            if (read != -1) {
                this.f35166d += (long) read;
            }
            i();
            h();
            return read;
        }
    }
}
