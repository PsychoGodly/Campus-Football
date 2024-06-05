package hd;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import hd.b;
import hd.f;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import lf.e;
import lf.f;
import lf.s;
import lf.t;

/* compiled from: Http2 */
public final class g implements j {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f33033a = Logger.getLogger(b.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final f f33034b = f.h("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* compiled from: Http2 */
    static final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        private final e f33035a;

        /* renamed from: b  reason: collision with root package name */
        int f33036b;

        /* renamed from: c  reason: collision with root package name */
        byte f33037c;

        /* renamed from: d  reason: collision with root package name */
        int f33038d;

        /* renamed from: f  reason: collision with root package name */
        int f33039f;

        /* renamed from: g  reason: collision with root package name */
        short f33040g;

        public a(e eVar) {
            this.f33035a = eVar;
        }

        private void h() throws IOException {
            int i10 = this.f33038d;
            int f10 = g.m(this.f33035a);
            this.f33039f = f10;
            this.f33036b = f10;
            byte readByte = (byte) (this.f33035a.readByte() & 255);
            this.f33037c = (byte) (this.f33035a.readByte() & 255);
            if (g.f33033a.isLoggable(Level.FINE)) {
                g.f33033a.fine(b.b(true, this.f33038d, this.f33036b, readByte, this.f33037c));
            }
            int readInt = this.f33035a.readInt() & a.e.API_PRIORITY_OTHER;
            this.f33038d = readInt;
            if (readByte != 9) {
                throw g.k("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            } else if (readInt != i10) {
                throw g.k("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        public long P(lf.c cVar, long j10) throws IOException {
            while (true) {
                int i10 = this.f33039f;
                if (i10 == 0) {
                    this.f33035a.skip((long) this.f33040g);
                    this.f33040g = 0;
                    if ((this.f33037c & 4) != 0) {
                        return -1;
                    }
                    h();
                } else {
                    long P = this.f33035a.P(cVar, Math.min(j10, (long) i10));
                    if (P == -1) {
                        return -1;
                    }
                    this.f33039f -= (int) P;
                    return P;
                }
            }
        }

        public void close() throws IOException {
        }

        public t e() {
            return this.f33035a.e();
        }
    }

    /* compiled from: Http2 */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private static final String[] f33041a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b  reason: collision with root package name */
        private static final String[] f33042b = new String[64];

        /* renamed from: c  reason: collision with root package name */
        private static final String[] f33043c = new String[256];

        static {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String[] strArr = f33043c;
                if (i11 >= strArr.length) {
                    break;
                }
                strArr[i11] = String.format("%8s", new Object[]{Integer.toBinaryString(i11)}).replace(' ', '0');
                i11++;
            }
            String[] strArr2 = f33042b;
            strArr2[0] = MaxReward.DEFAULT_LABEL;
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i12 = 0; i12 < 1; i12++) {
                int i13 = iArr[i12];
                String[] strArr3 = f33042b;
                strArr3[i13 | 8] = strArr3[i13] + "|PADDED";
            }
            String[] strArr4 = f33042b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i14 = 0; i14 < 3; i14++) {
                int i15 = iArr2[i14];
                for (int i16 = 0; i16 < 1; i16++) {
                    int i17 = iArr[i16];
                    String[] strArr5 = f33042b;
                    int i18 = i17 | i15;
                    strArr5[i18] = strArr5[i17] + '|' + strArr5[i15];
                    strArr5[i18 | 8] = strArr5[i17] + '|' + strArr5[i15] + "|PADDED";
                }
            }
            while (true) {
                String[] strArr6 = f33042b;
                if (i10 < strArr6.length) {
                    if (strArr6[i10] == null) {
                        strArr6[i10] = f33043c[i10];
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }

        b() {
        }

        static String a(byte b10, byte b11) {
            if (b11 == 0) {
                return MaxReward.DEFAULT_LABEL;
            }
            if (!(b10 == 2 || b10 == 3)) {
                if (b10 == 4 || b10 == 6) {
                    if (b11 == 1) {
                        return "ACK";
                    }
                    return f33043c[b11];
                } else if (!(b10 == 7 || b10 == 8)) {
                    String[] strArr = f33042b;
                    String str = b11 < strArr.length ? strArr[b11] : f33043c[b11];
                    if (b10 != 5 || (b11 & 4) == 0) {
                        return (b10 != 0 || (b11 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f33043c[b11];
        }

        static String b(boolean z10, int i10, int i11, byte b10, byte b11) {
            String[] strArr = f33041a;
            String format = b10 < strArr.length ? strArr[b10] : String.format("0x%02x", new Object[]{Byte.valueOf(b10)});
            String a10 = a(b10, b11);
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            objArr[0] = z10 ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = Integer.valueOf(i11);
            objArr[3] = format;
            objArr[4] = a10;
            return String.format(locale, "%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* compiled from: Http2 */
    static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final e f33044a;

        /* renamed from: b  reason: collision with root package name */
        private final a f33045b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f33046c;

        /* renamed from: d  reason: collision with root package name */
        final f.a f33047d;

        c(e eVar, int i10, boolean z10) {
            this.f33044a = eVar;
            this.f33046c = z10;
            a aVar = new a(eVar);
            this.f33045b = aVar;
            this.f33047d = new f.a(i10, aVar);
        }

        private void A(b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i10 != 5) {
                throw g.k("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i10));
            } else if (i11 != 0) {
                u(aVar, i11);
            } else {
                throw g.k("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
        }

        private void B(b.a aVar, int i10, byte b10, int i11) throws IOException {
            short s10 = 0;
            if (i11 != 0) {
                if ((b10 & 8) != 0) {
                    s10 = (short) (this.f33044a.readByte() & 255);
                }
                aVar.i(i11, this.f33044a.readInt() & a.e.API_PRIORITY_OTHER, j(g.l(i10 - 4, b10, s10), s10, b10, i11));
                return;
            }
            throw g.k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }

        private void J(b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i10 != 4) {
                throw g.k("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i10));
            } else if (i11 != 0) {
                int readInt = this.f33044a.readInt();
                a a10 = a.a(readInt);
                if (a10 != null) {
                    aVar.g(i11, a10);
                } else {
                    throw g.k("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
                }
            } else {
                throw g.k("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
        }

        private void L(b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i11 != 0) {
                throw g.k("TYPE_SETTINGS streamId != 0", new Object[0]);
            } else if ((b10 & 1) != 0) {
                if (i10 == 0) {
                    aVar.d();
                    return;
                }
                throw g.k("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            } else if (i10 % 6 == 0) {
                i iVar = new i();
                for (int i12 = 0; i12 < i10; i12 += 6) {
                    short readShort = this.f33044a.readShort();
                    int readInt = this.f33044a.readInt();
                    switch (readShort) {
                        case 1:
                        case 6:
                            break;
                        case 2:
                            if (!(readInt == 0 || readInt == 1)) {
                                throw g.k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            }
                        case 3:
                            readShort = 4;
                            break;
                        case 4:
                            readShort = 7;
                            if (readInt < 0) {
                                throw g.k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            }
                            break;
                        case 5:
                            if (readInt < 16384 || readInt > 16777215) {
                                throw g.k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                            }
                    }
                    iVar.e(readShort, 0, readInt);
                }
                aVar.l(false, iVar);
                if (iVar.b() >= 0) {
                    this.f33047d.g(iVar.b());
                }
            } else {
                throw g.k("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i10));
            }
        }

        private void R(b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i10 == 4) {
                long readInt = ((long) this.f33044a.readInt()) & 2147483647L;
                if (readInt != 0) {
                    aVar.a(i11, readInt);
                    return;
                }
                throw g.k("windowSizeIncrement was 0", new Object[0]);
            }
            throw g.k("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i10));
        }

        private void h(b.a aVar, int i10, byte b10, int i11) throws IOException {
            boolean z10 = true;
            short s10 = 0;
            boolean z11 = (b10 & 1) != 0;
            if ((b10 & 32) == 0) {
                z10 = false;
            }
            if (!z10) {
                if ((b10 & 8) != 0) {
                    s10 = (short) (this.f33044a.readByte() & 255);
                }
                aVar.c(z11, i11, this.f33044a, g.l(i10, b10, s10));
                this.f33044a.skip((long) s10);
                return;
            }
            throw g.k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }

        private void i(b.a aVar, int i10, byte b10, int i11) throws IOException {
            if (i10 < 8) {
                throw g.k("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i10));
            } else if (i11 == 0) {
                int readInt = this.f33044a.readInt();
                int readInt2 = this.f33044a.readInt();
                int i12 = i10 - 8;
                a a10 = a.a(readInt2);
                if (a10 != null) {
                    lf.f fVar = lf.f.f36255f;
                    if (i12 > 0) {
                        fVar = this.f33044a.r((long) i12);
                    }
                    aVar.k(readInt, a10, fVar);
                    return;
                }
                throw g.k("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            } else {
                throw g.k("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
        }

        private List<d> j(int i10, short s10, byte b10, int i11) throws IOException {
            a aVar = this.f33045b;
            aVar.f33039f = i10;
            aVar.f33036b = i10;
            aVar.f33040g = s10;
            aVar.f33037c = b10;
            aVar.f33038d = i11;
            this.f33047d.l();
            return this.f33047d.e();
        }

        private void n(b.a aVar, int i10, byte b10, int i11) throws IOException {
            short s10 = 0;
            if (i11 != 0) {
                boolean z10 = (b10 & 1) != 0;
                if ((b10 & 8) != 0) {
                    s10 = (short) (this.f33044a.readByte() & 255);
                }
                if ((b10 & 32) != 0) {
                    u(aVar, i11);
                    i10 -= 5;
                }
                aVar.j(false, z10, i11, -1, j(g.l(i10, b10, s10), s10, b10, i11), e.HTTP_20_HEADERS);
                return;
            }
            throw g.k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }

        private void q(b.a aVar, int i10, byte b10, int i11) throws IOException {
            boolean z10 = false;
            if (i10 != 8) {
                throw g.k("TYPE_PING length != 8: %s", Integer.valueOf(i10));
            } else if (i11 == 0) {
                int readInt = this.f33044a.readInt();
                int readInt2 = this.f33044a.readInt();
                if ((b10 & 1) != 0) {
                    z10 = true;
                }
                aVar.b(z10, readInt, readInt2);
            } else {
                throw g.k("TYPE_PING streamId != 0", new Object[0]);
            }
        }

        private void u(b.a aVar, int i10) throws IOException {
            int readInt = this.f33044a.readInt();
            aVar.h(i10, readInt & a.e.API_PRIORITY_OTHER, (this.f33044a.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        public boolean S0(b.a aVar) throws IOException {
            try {
                this.f33044a.O0(9);
                int f10 = g.m(this.f33044a);
                if (f10 < 0 || f10 > 16384) {
                    throw g.k("FRAME_SIZE_ERROR: %s", Integer.valueOf(f10));
                }
                byte readByte = (byte) (this.f33044a.readByte() & 255);
                byte readByte2 = (byte) (this.f33044a.readByte() & 255);
                int readInt = this.f33044a.readInt() & a.e.API_PRIORITY_OTHER;
                if (g.f33033a.isLoggable(Level.FINE)) {
                    g.f33033a.fine(b.b(true, readInt, f10, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        h(aVar, f10, readByte2, readInt);
                        break;
                    case 1:
                        n(aVar, f10, readByte2, readInt);
                        break;
                    case 2:
                        A(aVar, f10, readByte2, readInt);
                        break;
                    case 3:
                        J(aVar, f10, readByte2, readInt);
                        break;
                    case 4:
                        L(aVar, f10, readByte2, readInt);
                        break;
                    case 5:
                        B(aVar, f10, readByte2, readInt);
                        break;
                    case 6:
                        q(aVar, f10, readByte2, readInt);
                        break;
                    case 7:
                        i(aVar, f10, readByte2, readInt);
                        break;
                    case 8:
                        R(aVar, f10, readByte2, readInt);
                        break;
                    default:
                        this.f33044a.skip((long) f10);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        public void close() throws IOException {
            this.f33044a.close();
        }
    }

    /* compiled from: Http2 */
    static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        private final lf.d f33048a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f33049b;

        /* renamed from: c  reason: collision with root package name */
        private final lf.c f33050c;

        /* renamed from: d  reason: collision with root package name */
        private final f.b f33051d;

        /* renamed from: f  reason: collision with root package name */
        private int f33052f = 16384;

        /* renamed from: g  reason: collision with root package name */
        private boolean f33053g;

        d(lf.d dVar, boolean z10) {
            this.f33048a = dVar;
            this.f33049b = z10;
            lf.c cVar = new lf.c();
            this.f33050c = cVar;
            this.f33051d = new f.b(cVar);
        }

        private void n(int i10, long j10) throws IOException {
            while (j10 > 0) {
                int min = (int) Math.min((long) this.f33052f, j10);
                long j11 = (long) min;
                j10 -= j11;
                i(i10, min, (byte) 9, j10 == 0 ? (byte) 4 : 0);
                this.f33048a.V0(this.f33050c, j11);
            }
        }

        public synchronized void H() throws IOException {
            if (this.f33053g) {
                throw new IOException("closed");
            } else if (this.f33049b) {
                if (g.f33033a.isLoggable(Level.FINE)) {
                    g.f33033a.fine(String.format(">> CONNECTION %s", new Object[]{g.f33034b.j()}));
                }
                this.f33048a.t0(g.f33034b.t());
                this.f33048a.flush();
            }
        }

        public synchronized void H0(boolean z10, int i10, lf.c cVar, int i11) throws IOException {
            if (!this.f33053g) {
                byte b10 = 0;
                if (z10) {
                    b10 = (byte) 1;
                }
                h(i10, b10, cVar, i11);
            } else {
                throw new IOException("closed");
            }
        }

        public int L0() {
            return this.f33052f;
        }

        public synchronized void M0(int i10, a aVar, byte[] bArr) throws IOException {
            if (this.f33053g) {
                throw new IOException("closed");
            } else if (aVar.f32994a != -1) {
                i(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f33048a.y(i10);
                this.f33048a.y(aVar.f32994a);
                if (bArr.length > 0) {
                    this.f33048a.t0(bArr);
                }
                this.f33048a.flush();
            } else {
                throw g.j("errorCode.httpCode == -1", new Object[0]);
            }
        }

        public synchronized void N0(boolean z10, boolean z11, int i10, int i11, List<d> list) throws IOException {
            if (!z11) {
                try {
                    if (!this.f33053g) {
                        j(z10, i10, list);
                    } else {
                        throw new IOException("closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }

        public synchronized void W(i iVar) throws IOException {
            if (!this.f33053g) {
                this.f33052f = iVar.c(this.f33052f);
                i(0, 0, (byte) 4, (byte) 1);
                this.f33048a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void W0(i iVar) throws IOException {
            if (!this.f33053g) {
                int i10 = 0;
                i(0, iVar.f() * 6, (byte) 4, (byte) 0);
                while (i10 < 10) {
                    if (iVar.d(i10)) {
                        this.f33048a.v(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                        this.f33048a.y(iVar.a(i10));
                    }
                    i10++;
                }
                this.f33048a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void a(int i10, long j10) throws IOException {
            if (this.f33053g) {
                throw new IOException("closed");
            } else if (j10 == 0 || j10 > 2147483647L) {
                throw g.j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
            } else {
                i(i10, 4, (byte) 8, (byte) 0);
                this.f33048a.y((int) j10);
                this.f33048a.flush();
            }
        }

        public synchronized void b(boolean z10, int i10, int i11) throws IOException {
            if (!this.f33053g) {
                i(0, 8, (byte) 6, z10 ? (byte) 1 : 0);
                this.f33048a.y(i10);
                this.f33048a.y(i11);
                this.f33048a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void close() throws IOException {
            this.f33053g = true;
            this.f33048a.close();
        }

        public synchronized void flush() throws IOException {
            if (!this.f33053g) {
                this.f33048a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void g(int i10, a aVar) throws IOException {
            if (this.f33053g) {
                throw new IOException("closed");
            } else if (aVar.f32994a != -1) {
                i(i10, 4, (byte) 3, (byte) 0);
                this.f33048a.y(aVar.f32994a);
                this.f33048a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        /* access modifiers changed from: package-private */
        public void h(int i10, byte b10, lf.c cVar, int i11) throws IOException {
            i(i10, i11, (byte) 0, b10);
            if (i11 > 0) {
                this.f33048a.V0(cVar, (long) i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void i(int i10, int i11, byte b10, byte b11) throws IOException {
            if (g.f33033a.isLoggable(Level.FINE)) {
                g.f33033a.fine(b.b(false, i10, i11, b10, b11));
            }
            int i12 = this.f33052f;
            if (i11 > i12) {
                throw g.j("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
            } else if ((Integer.MIN_VALUE & i10) == 0) {
                g.n(this.f33048a, i11);
                this.f33048a.G(b10 & 255);
                this.f33048a.G(b11 & 255);
                this.f33048a.y(i10 & a.e.API_PRIORITY_OTHER);
            } else {
                throw g.j("reserved bit set: %s", Integer.valueOf(i10));
            }
        }

        /* access modifiers changed from: package-private */
        public void j(boolean z10, int i10, List<d> list) throws IOException {
            if (!this.f33053g) {
                this.f33051d.e(list);
                long v02 = this.f33050c.v0();
                int min = (int) Math.min((long) this.f33052f, v02);
                long j10 = (long) min;
                int i11 = (v02 > j10 ? 1 : (v02 == j10 ? 0 : -1));
                byte b10 = i11 == 0 ? (byte) 4 : 0;
                if (z10) {
                    b10 = (byte) (b10 | 1);
                }
                i(i10, min, (byte) 1, b10);
                this.f33048a.V0(this.f33050c, j10);
                if (i11 > 0) {
                    n(i10, v02 - j10);
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: private */
    public static IllegalArgumentException j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    /* access modifiers changed from: private */
    public static IOException k(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    /* access modifiers changed from: private */
    public static int l(int i10, byte b10, short s10) throws IOException {
        if ((b10 & 8) != 0) {
            i10--;
        }
        if (s10 <= i10) {
            return (short) (i10 - s10);
        }
        throw k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i10));
    }

    /* access modifiers changed from: private */
    public static int m(e eVar) throws IOException {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << Ascii.DLE) | ((eVar.readByte() & 255) << 8);
    }

    /* access modifiers changed from: private */
    public static void n(lf.d dVar, int i10) throws IOException {
        dVar.G((i10 >>> 16) & 255);
        dVar.G((i10 >>> 8) & 255);
        dVar.G(i10 & 255);
    }

    public c a(lf.d dVar, boolean z10) {
        return new d(dVar, z10);
    }

    public b b(e eVar, boolean z10) {
        return new c(eVar, 4096, z10);
    }
}
