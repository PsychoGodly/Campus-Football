package io.grpc.internal;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import r6.o;

/* compiled from: GzipInflatingBuffer */
class s0 implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final u f35353a = new u();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final CRC32 f35354b = new CRC32();

    /* renamed from: c  reason: collision with root package name */
    private final b f35355c = new b(this, (a) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f35356d = new byte[512];
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f35357f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f35358g;

    /* renamed from: h  reason: collision with root package name */
    private Inflater f35359h;

    /* renamed from: i  reason: collision with root package name */
    private c f35360i = c.HEADER;

    /* renamed from: j  reason: collision with root package name */
    private boolean f35361j = false;

    /* renamed from: k  reason: collision with root package name */
    private int f35362k;

    /* renamed from: l  reason: collision with root package name */
    private int f35363l;

    /* renamed from: m  reason: collision with root package name */
    private long f35364m;

    /* renamed from: n  reason: collision with root package name */
    private int f35365n = 0;

    /* renamed from: o  reason: collision with root package name */
    private int f35366o = 0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f35367p = true;

    /* compiled from: GzipInflatingBuffer */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f35368a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.grpc.internal.s0$c[] r0 = io.grpc.internal.s0.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35368a = r0
                io.grpc.internal.s0$c r1 = io.grpc.internal.s0.c.HEADER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35368a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.grpc.internal.s0$c r1 = io.grpc.internal.s0.c.HEADER_EXTRA_LEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35368a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.grpc.internal.s0$c r1 = io.grpc.internal.s0.c.HEADER_EXTRA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35368a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.grpc.internal.s0$c r1 = io.grpc.internal.s0.c.HEADER_NAME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35368a     // Catch:{ NoSuchFieldError -> 0x003e }
                io.grpc.internal.s0$c r1 = io.grpc.internal.s0.c.HEADER_COMMENT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35368a     // Catch:{ NoSuchFieldError -> 0x0049 }
                io.grpc.internal.s0$c r1 = io.grpc.internal.s0.c.HEADER_CRC     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35368a     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.grpc.internal.s0$c r1 = io.grpc.internal.s0.c.INITIALIZE_INFLATER     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f35368a     // Catch:{ NoSuchFieldError -> 0x0060 }
                io.grpc.internal.s0$c r1 = io.grpc.internal.s0.c.INFLATING     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f35368a     // Catch:{ NoSuchFieldError -> 0x006c }
                io.grpc.internal.s0$c r1 = io.grpc.internal.s0.c.INFLATER_NEEDS_INPUT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f35368a     // Catch:{ NoSuchFieldError -> 0x0078 }
                io.grpc.internal.s0$c r1 = io.grpc.internal.s0.c.TRAILER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.s0.a.<clinit>():void");
        }
    }

    /* compiled from: GzipInflatingBuffer */
    private class b {
        private b() {
        }

        /* access modifiers changed from: private */
        public boolean g() {
            while (k() > 0) {
                if (h() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        public int h() {
            int i10;
            if (s0.this.f35358g - s0.this.f35357f > 0) {
                i10 = s0.this.f35356d[s0.this.f35357f] & 255;
                s0.j(s0.this, 1);
            } else {
                i10 = s0.this.f35353a.readUnsignedByte();
            }
            s0.this.f35354b.update(i10);
            s0.A(s0.this, 1);
            return i10;
        }

        /* access modifiers changed from: private */
        public long i() {
            return ((long) j()) | (((long) j()) << 16);
        }

        /* access modifiers changed from: private */
        public int j() {
            return h() | (h() << 8);
        }

        /* access modifiers changed from: private */
        public int k() {
            return (s0.this.f35358g - s0.this.f35357f) + s0.this.f35353a.d();
        }

        /* access modifiers changed from: private */
        public void l(int i10) {
            int i11;
            int h10 = s0.this.f35358g - s0.this.f35357f;
            if (h10 > 0) {
                int min = Math.min(h10, i10);
                s0.this.f35354b.update(s0.this.f35356d, s0.this.f35357f, min);
                s0.j(s0.this, min);
                i11 = i10 - min;
            } else {
                i11 = i10;
            }
            if (i11 > 0) {
                byte[] bArr = new byte[512];
                int i12 = 0;
                while (i12 < i11) {
                    int min2 = Math.min(i11 - i12, 512);
                    s0.this.f35353a.Y(bArr, 0, min2);
                    s0.this.f35354b.update(bArr, 0, min2);
                    i12 += min2;
                }
            }
            s0.A(s0.this, i10);
        }

        /* synthetic */ b(s0 s0Var, a aVar) {
            this();
        }
    }

    /* compiled from: GzipInflatingBuffer */
    private enum c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    s0() {
    }

    static /* synthetic */ int A(s0 s0Var, int i10) {
        int i11 = s0Var.f35365n + i10;
        s0Var.f35365n = i11;
        return i11;
    }

    private boolean C0() throws ZipException {
        if (this.f35359h != null && this.f35355c.k() <= 18) {
            this.f35359h.end();
            this.f35359h = null;
        }
        if (this.f35355c.k() < 8) {
            return false;
        }
        if (this.f35354b.getValue() == this.f35355c.i() && this.f35364m == this.f35355c.i()) {
            this.f35354b.reset();
            this.f35360i = c.HEADER;
            return true;
        }
        throw new ZipException("Corrupt GZIP trailer");
    }

    private boolean J() {
        o.v(this.f35359h != null, "inflater is null");
        o.v(this.f35357f == this.f35358g, "inflaterInput has unconsumed bytes");
        int min = Math.min(this.f35353a.d(), 512);
        if (min == 0) {
            return false;
        }
        this.f35357f = 0;
        this.f35358g = min;
        this.f35353a.Y(this.f35356d, 0, min);
        this.f35359h.setInput(this.f35356d, this.f35357f, min);
        this.f35360i = c.INFLATING;
        return true;
    }

    private int e0(byte[] bArr, int i10, int i11) throws DataFormatException, ZipException {
        o.v(this.f35359h != null, "inflater is null");
        try {
            int totalIn = this.f35359h.getTotalIn();
            int inflate = this.f35359h.inflate(bArr, i10, i11);
            int totalIn2 = this.f35359h.getTotalIn() - totalIn;
            this.f35365n += totalIn2;
            this.f35366o += totalIn2;
            this.f35357f += totalIn2;
            this.f35354b.update(bArr, i10, inflate);
            if (this.f35359h.finished()) {
                this.f35364m = this.f35359h.getBytesWritten() & 4294967295L;
                this.f35360i = c.TRAILER;
            } else if (this.f35359h.needsInput()) {
                this.f35360i = c.INFLATER_NEEDS_INPUT;
            }
            return inflate;
        } catch (DataFormatException e10) {
            throw new DataFormatException("Inflater data format exception: " + e10.getMessage());
        }
    }

    private boolean h0() {
        Inflater inflater = this.f35359h;
        if (inflater == null) {
            this.f35359h = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f35354b.reset();
        int i10 = this.f35358g;
        int i11 = this.f35357f;
        int i12 = i10 - i11;
        if (i12 > 0) {
            this.f35359h.setInput(this.f35356d, i11, i12);
            this.f35360i = c.INFLATING;
        } else {
            this.f35360i = c.INFLATER_NEEDS_INPUT;
        }
        return true;
    }

    static /* synthetic */ int j(s0 s0Var, int i10) {
        int i11 = s0Var.f35357f + i10;
        s0Var.f35357f = i11;
        return i11;
    }

    private boolean l0() throws ZipException {
        if (this.f35355c.k() < 10) {
            return false;
        }
        if (this.f35355c.j() != 35615) {
            throw new ZipException("Not in GZIP format");
        } else if (this.f35355c.h() == 8) {
            this.f35362k = this.f35355c.h();
            this.f35355c.l(6);
            this.f35360i = c.HEADER_EXTRA_LEN;
            return true;
        } else {
            throw new ZipException("Unsupported compression method");
        }
    }

    private boolean n0() {
        if ((this.f35362k & 16) != 16) {
            this.f35360i = c.HEADER_CRC;
            return true;
        } else if (!this.f35355c.g()) {
            return false;
        } else {
            this.f35360i = c.HEADER_CRC;
            return true;
        }
    }

    private boolean u0() throws ZipException {
        if ((this.f35362k & 2) != 2) {
            this.f35360i = c.INITIALIZE_INFLATER;
            return true;
        } else if (this.f35355c.k() < 2) {
            return false;
        } else {
            if ((65535 & ((int) this.f35354b.getValue())) == this.f35355c.j()) {
                this.f35360i = c.INITIALIZE_INFLATER;
                return true;
            }
            throw new ZipException("Corrupt GZIP header");
        }
    }

    private boolean v0() {
        int d10 = this.f35355c.k();
        int i10 = this.f35363l;
        if (d10 < i10) {
            return false;
        }
        this.f35355c.l(i10);
        this.f35360i = c.HEADER_NAME;
        return true;
    }

    private boolean w0() {
        if ((this.f35362k & 4) != 4) {
            this.f35360i = c.HEADER_NAME;
            return true;
        } else if (this.f35355c.k() < 2) {
            return false;
        } else {
            this.f35363l = this.f35355c.j();
            this.f35360i = c.HEADER_EXTRA;
            return true;
        }
    }

    private boolean y0() {
        if ((this.f35362k & 8) != 8) {
            this.f35360i = c.HEADER_COMMENT;
            return true;
        } else if (!this.f35355c.g()) {
            return false;
        } else {
            this.f35360i = c.HEADER_COMMENT;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void B(v1 v1Var) {
        o.v(!this.f35361j, "GzipInflatingBuffer is closed");
        this.f35353a.i(v1Var);
        this.f35367p = false;
    }

    /* access modifiers changed from: package-private */
    public int L() {
        int i10 = this.f35365n;
        this.f35365n = 0;
        return i10;
    }

    /* access modifiers changed from: package-private */
    public int R() {
        int i10 = this.f35366o;
        this.f35366o = 0;
        return i10;
    }

    /* access modifiers changed from: package-private */
    public boolean Z() {
        o.v(!this.f35361j, "GzipInflatingBuffer is closed");
        if (this.f35355c.k() == 0 && this.f35360i == c.HEADER) {
            return false;
        }
        return true;
    }

    public void close() {
        if (!this.f35361j) {
            this.f35361j = true;
            this.f35353a.close();
            Inflater inflater = this.f35359h;
            if (inflater != null) {
                inflater.end();
                this.f35359h = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int g0(byte[] bArr, int i10, int i11) throws DataFormatException, ZipException {
        boolean z10 = true;
        o.v(!this.f35361j, "GzipInflatingBuffer is closed");
        boolean z11 = true;
        int i12 = 0;
        while (z11) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                switch (a.f35368a[this.f35360i.ordinal()]) {
                    case 1:
                        z11 = l0();
                        break;
                    case 2:
                        z11 = w0();
                        break;
                    case 3:
                        z11 = v0();
                        break;
                    case 4:
                        z11 = y0();
                        break;
                    case 5:
                        z11 = n0();
                        break;
                    case 6:
                        z11 = u0();
                        break;
                    case 7:
                        z11 = h0();
                        break;
                    case 8:
                        i12 += e0(bArr, i10 + i12, i13);
                        if (this.f35360i != c.TRAILER) {
                            z11 = true;
                            break;
                        } else {
                            z11 = C0();
                            break;
                        }
                    case 9:
                        z11 = J();
                        break;
                    case 10:
                        z11 = C0();
                        break;
                    default:
                        throw new AssertionError("Invalid state: " + this.f35360i);
                }
            } else {
                if (z11 && (this.f35360i != c.HEADER || this.f35355c.k() >= 10)) {
                    z10 = false;
                }
                this.f35367p = z10;
                return i12;
            }
        }
        z10 = false;
        this.f35367p = z10;
        return i12;
    }

    /* access modifiers changed from: package-private */
    public boolean i0() {
        o.v(!this.f35361j, "GzipInflatingBuffer is closed");
        return this.f35367p;
    }
}
