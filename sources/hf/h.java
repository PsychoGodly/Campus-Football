package hf;

import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.common.api.a;
import hf.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lf.c;
import lf.e;
import lf.f;
import lf.s;
import lf.t;

/* compiled from: Http2Reader */
final class h implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    static final Logger f33190f = Logger.getLogger(e.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final e f33191a;

    /* renamed from: b  reason: collision with root package name */
    private final a f33192b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f33193c;

    /* renamed from: d  reason: collision with root package name */
    final d.a f33194d;

    /* compiled from: Http2Reader */
    static final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        private final e f33195a;

        /* renamed from: b  reason: collision with root package name */
        int f33196b;

        /* renamed from: c  reason: collision with root package name */
        byte f33197c;

        /* renamed from: d  reason: collision with root package name */
        int f33198d;

        /* renamed from: f  reason: collision with root package name */
        int f33199f;

        /* renamed from: g  reason: collision with root package name */
        short f33200g;

        a(e eVar) {
            this.f33195a = eVar;
        }

        private void h() throws IOException {
            int i10 = this.f33198d;
            int B = h.B(this.f33195a);
            this.f33199f = B;
            this.f33196b = B;
            byte readByte = (byte) (this.f33195a.readByte() & 255);
            this.f33197c = (byte) (this.f33195a.readByte() & 255);
            Logger logger = h.f33190f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.b(true, this.f33198d, this.f33196b, readByte, this.f33197c));
            }
            int readInt = this.f33195a.readInt() & a.e.API_PRIORITY_OTHER;
            this.f33198d = readInt;
            if (readByte != 9) {
                throw e.d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            } else if (readInt != i10) {
                throw e.d("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        public long P(c cVar, long j10) throws IOException {
            while (true) {
                int i10 = this.f33199f;
                if (i10 == 0) {
                    this.f33195a.skip((long) this.f33200g);
                    this.f33200g = 0;
                    if ((this.f33197c & 4) != 0) {
                        return -1;
                    }
                    h();
                } else {
                    long P = this.f33195a.P(cVar, Math.min(j10, (long) i10));
                    if (P == -1) {
                        return -1;
                    }
                    this.f33199f = (int) (((long) this.f33199f) - P);
                    return P;
                }
            }
        }

        public void close() throws IOException {
        }

        public t e() {
            return this.f33195a.e();
        }
    }

    /* compiled from: Http2Reader */
    interface b {
        void a(int i10, long j10);

        void b(boolean z10, int i10, int i11);

        void c(boolean z10, int i10, e eVar, int i11) throws IOException;

        void d();

        void e(int i10, b bVar);

        void f(boolean z10, int i10, int i11, List<c> list);

        void g(int i10, b bVar, f fVar);

        void h(int i10, int i11, int i12, boolean z10);

        void i(int i10, int i11, List<c> list) throws IOException;

        void j(boolean z10, m mVar);
    }

    h(e eVar, boolean z10) {
        this.f33191a = eVar;
        this.f33193c = z10;
        a aVar = new a(eVar);
        this.f33192b = aVar;
        this.f33194d = new d.a(4096, aVar);
    }

    private void A(b bVar, int i10, byte b10, int i11) throws IOException {
        short s10 = 0;
        if (i11 != 0) {
            boolean z10 = (b10 & 1) != 0;
            if ((b10 & 8) != 0) {
                s10 = (short) (this.f33191a.readByte() & 255);
            }
            if ((b10 & 32) != 0) {
                L(bVar, i11);
                i10 -= 5;
            }
            bVar.f(z10, i11, -1, u(h(i10, b10, s10), s10, b10, i11));
            return;
        }
        throw e.d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    static int B(e eVar) throws IOException {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << Ascii.DLE) | ((eVar.readByte() & 255) << 8);
    }

    private void J(b bVar, int i10, byte b10, int i11) throws IOException {
        boolean z10 = false;
        if (i10 != 8) {
            throw e.d("TYPE_PING length != 8: %s", Integer.valueOf(i10));
        } else if (i11 == 0) {
            int readInt = this.f33191a.readInt();
            int readInt2 = this.f33191a.readInt();
            if ((b10 & 1) != 0) {
                z10 = true;
            }
            bVar.b(z10, readInt, readInt2);
        } else {
            throw e.d("TYPE_PING streamId != 0", new Object[0]);
        }
    }

    private void L(b bVar, int i10) throws IOException {
        int readInt = this.f33191a.readInt();
        bVar.h(i10, readInt & a.e.API_PRIORITY_OTHER, (this.f33191a.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    private void R(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 != 5) {
            throw e.d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i10));
        } else if (i11 != 0) {
            L(bVar, i11);
        } else {
            throw e.d("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
    }

    private void Z(b bVar, int i10, byte b10, int i11) throws IOException {
        short s10 = 0;
        if (i11 != 0) {
            if ((b10 & 8) != 0) {
                s10 = (short) (this.f33191a.readByte() & 255);
            }
            bVar.i(i11, this.f33191a.readInt() & a.e.API_PRIORITY_OTHER, u(h(i10 - 4, b10, s10), s10, b10, i11));
            return;
        }
        throw e.d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    private void e0(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 != 4) {
            throw e.d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
        } else if (i11 != 0) {
            int readInt = this.f33191a.readInt();
            b a10 = b.a(readInt);
            if (a10 != null) {
                bVar.e(i11, a10);
            } else {
                throw e.d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
        } else {
            throw e.d("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
    }

    private void g0(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i11 != 0) {
            throw e.d("TYPE_SETTINGS streamId != 0", new Object[0]);
        } else if ((b10 & 1) != 0) {
            if (i10 == 0) {
                bVar.d();
                return;
            }
            throw e.d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
        } else if (i10 % 6 == 0) {
            m mVar = new m();
            for (int i12 = 0; i12 < i10; i12 += 6) {
                short readShort = this.f33191a.readShort() & 65535;
                int readInt = this.f33191a.readInt();
                if (readShort != 2) {
                    if (readShort == 3) {
                        readShort = 4;
                    } else if (readShort == 4) {
                        readShort = 7;
                        if (readInt < 0) {
                            throw e.d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                    } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                        throw e.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                    }
                } else if (!(readInt == 0 || readInt == 1)) {
                    throw e.d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
                mVar.i(readShort, readInt);
            }
            bVar.j(false, mVar);
        } else {
            throw e.d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
        }
    }

    static int h(int i10, byte b10, short s10) throws IOException {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        throw e.d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
    }

    private void h0(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 == 4) {
            long readInt = ((long) this.f33191a.readInt()) & 2147483647L;
            if (readInt != 0) {
                bVar.a(i11, readInt);
            } else {
                throw e.d("windowSizeIncrement was 0", Long.valueOf(readInt));
            }
        } else {
            throw e.d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
        }
    }

    private void n(b bVar, int i10, byte b10, int i11) throws IOException {
        short s10 = 0;
        if (i11 != 0) {
            boolean z10 = true;
            boolean z11 = (b10 & 1) != 0;
            if ((b10 & 32) == 0) {
                z10 = false;
            }
            if (!z10) {
                if ((b10 & 8) != 0) {
                    s10 = (short) (this.f33191a.readByte() & 255);
                }
                bVar.c(z11, i11, this.f33191a, h(i10, b10, s10));
                this.f33191a.skip((long) s10);
                return;
            }
            throw e.d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        throw e.d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    private void q(b bVar, int i10, byte b10, int i11) throws IOException {
        if (i10 < 8) {
            throw e.d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
        } else if (i11 == 0) {
            int readInt = this.f33191a.readInt();
            int readInt2 = this.f33191a.readInt();
            int i12 = i10 - 8;
            b a10 = b.a(readInt2);
            if (a10 != null) {
                f fVar = f.f36255f;
                if (i12 > 0) {
                    fVar = this.f33191a.r((long) i12);
                }
                bVar.g(readInt, a10, fVar);
                return;
            }
            throw e.d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
        } else {
            throw e.d("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
    }

    private List<c> u(int i10, short s10, byte b10, int i11) throws IOException {
        a aVar = this.f33192b;
        aVar.f33199f = i10;
        aVar.f33196b = i10;
        aVar.f33200g = s10;
        aVar.f33197c = b10;
        aVar.f33198d = i11;
        this.f33194d.k();
        return this.f33194d.e();
    }

    public void close() throws IOException {
        this.f33191a.close();
    }

    public boolean i(boolean z10, b bVar) throws IOException {
        try {
            this.f33191a.O0(9);
            int B = B(this.f33191a);
            if (B < 0 || B > 16384) {
                throw e.d("FRAME_SIZE_ERROR: %s", Integer.valueOf(B));
            }
            byte readByte = (byte) (this.f33191a.readByte() & 255);
            if (!z10 || readByte == 4) {
                byte readByte2 = (byte) (this.f33191a.readByte() & 255);
                int readInt = this.f33191a.readInt() & a.e.API_PRIORITY_OTHER;
                Logger logger = f33190f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.b(true, readInt, B, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        n(bVar, B, readByte2, readInt);
                        break;
                    case 1:
                        A(bVar, B, readByte2, readInt);
                        break;
                    case 2:
                        R(bVar, B, readByte2, readInt);
                        break;
                    case 3:
                        e0(bVar, B, readByte2, readInt);
                        break;
                    case 4:
                        g0(bVar, B, readByte2, readInt);
                        break;
                    case 5:
                        Z(bVar, B, readByte2, readInt);
                        break;
                    case 6:
                        J(bVar, B, readByte2, readInt);
                        break;
                    case 7:
                        q(bVar, B, readByte2, readInt);
                        break;
                    case 8:
                        h0(bVar, B, readByte2, readInt);
                        break;
                    default:
                        this.f33191a.skip((long) B);
                        break;
                }
                return true;
            }
            throw e.d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
        } catch (IOException unused) {
            return false;
        }
    }

    public void j(b bVar) throws IOException {
        if (!this.f33193c) {
            e eVar = this.f33191a;
            f fVar = e.f33107a;
            f r10 = eVar.r((long) fVar.p());
            Logger logger = f33190f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(cf.c.r("<< CONNECTION %s", r10.j()));
            }
            if (!fVar.equals(r10)) {
                throw e.d("Expected a connection header but was %s", r10.u());
            }
        } else if (!i(true, bVar)) {
            throw e.d("Required SETTINGS preface not received", new Object[0]);
        }
    }
}
