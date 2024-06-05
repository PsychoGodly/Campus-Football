package dd;

import com.applovin.exoplayer2.common.base.Ascii;
import dd.y0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import r6.e;
import r6.i;
import r6.k;
import r6.o;
import r6.x;

/* compiled from: Status */
public final class j1 {

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f32231d = Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final List<j1> f32232e = f();

    /* renamed from: f  reason: collision with root package name */
    public static final j1 f32233f = b.OK.c();

    /* renamed from: g  reason: collision with root package name */
    public static final j1 f32234g = b.CANCELLED.c();

    /* renamed from: h  reason: collision with root package name */
    public static final j1 f32235h = b.UNKNOWN.c();

    /* renamed from: i  reason: collision with root package name */
    public static final j1 f32236i = b.INVALID_ARGUMENT.c();

    /* renamed from: j  reason: collision with root package name */
    public static final j1 f32237j = b.DEADLINE_EXCEEDED.c();

    /* renamed from: k  reason: collision with root package name */
    public static final j1 f32238k = b.NOT_FOUND.c();

    /* renamed from: l  reason: collision with root package name */
    public static final j1 f32239l = b.ALREADY_EXISTS.c();

    /* renamed from: m  reason: collision with root package name */
    public static final j1 f32240m = b.PERMISSION_DENIED.c();

    /* renamed from: n  reason: collision with root package name */
    public static final j1 f32241n = b.UNAUTHENTICATED.c();

    /* renamed from: o  reason: collision with root package name */
    public static final j1 f32242o = b.RESOURCE_EXHAUSTED.c();

    /* renamed from: p  reason: collision with root package name */
    public static final j1 f32243p = b.FAILED_PRECONDITION.c();

    /* renamed from: q  reason: collision with root package name */
    public static final j1 f32244q = b.ABORTED.c();

    /* renamed from: r  reason: collision with root package name */
    public static final j1 f32245r = b.OUT_OF_RANGE.c();

    /* renamed from: s  reason: collision with root package name */
    public static final j1 f32246s = b.UNIMPLEMENTED.c();

    /* renamed from: t  reason: collision with root package name */
    public static final j1 f32247t = b.INTERNAL.c();

    /* renamed from: u  reason: collision with root package name */
    public static final j1 f32248u = b.UNAVAILABLE.c();

    /* renamed from: v  reason: collision with root package name */
    public static final j1 f32249v = b.DATA_LOSS.c();

    /* renamed from: w  reason: collision with root package name */
    static final y0.g<j1> f32250w = y0.g.g("grpc-status", false, new c());

    /* renamed from: x  reason: collision with root package name */
    private static final y0.j<String> f32251x;

    /* renamed from: y  reason: collision with root package name */
    static final y0.g<String> f32252y;

    /* renamed from: a  reason: collision with root package name */
    private final b f32253a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32254b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f32255c;

    /* compiled from: Status */
    public enum b {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f32274a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f32275b;

        private b(int i10) {
            this.f32274a = i10;
            this.f32275b = Integer.toString(i10).getBytes(e.f29801a);
        }

        /* access modifiers changed from: private */
        public byte[] e() {
            return this.f32275b;
        }

        public j1 c() {
            return (j1) j1.f32232e.get(this.f32274a);
        }

        public int d() {
            return this.f32274a;
        }
    }

    /* compiled from: Status */
    private static final class c implements y0.j<j1> {
        private c() {
        }

        /* renamed from: c */
        public j1 b(byte[] bArr) {
            return j1.i(bArr);
        }

        /* renamed from: d */
        public byte[] a(j1 j1Var) {
            return j1Var.m().e();
        }
    }

    /* compiled from: Status */
    private static final class d implements y0.j<String> {

        /* renamed from: a  reason: collision with root package name */
        private static final byte[] f32276a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        private d() {
        }

        private static boolean c(byte b10) {
            return b10 < 32 || b10 >= 126 || b10 == 37;
        }

        private static String e(byte[] bArr) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
            int i10 = 0;
            while (i10 < bArr.length) {
                if (bArr[i10] == 37 && i10 + 2 < bArr.length) {
                    try {
                        allocate.put((byte) Integer.parseInt(new String(bArr, i10 + 1, 2, e.f29801a), 16));
                        i10 += 3;
                    } catch (NumberFormatException unused) {
                    }
                }
                allocate.put(bArr[i10]);
                i10++;
            }
            return new String(allocate.array(), 0, allocate.position(), e.f29803c);
        }

        private static byte[] g(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[(((bArr.length - i10) * 3) + i10)];
            if (i10 != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i10);
            }
            int i11 = i10;
            while (i10 < bArr.length) {
                byte b10 = bArr[i10];
                if (c(b10)) {
                    bArr2[i11] = 37;
                    byte[] bArr3 = f32276a;
                    bArr2[i11 + 1] = bArr3[(b10 >> 4) & 15];
                    bArr2[i11 + 2] = bArr3[b10 & Ascii.SI];
                    i11 += 3;
                } else {
                    bArr2[i11] = b10;
                    i11++;
                }
                i10++;
            }
            return Arrays.copyOf(bArr2, i11);
        }

        /* renamed from: d */
        public String b(byte[] bArr) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                if (b10 < 32 || b10 >= 126 || (b10 == 37 && i10 + 2 < bArr.length)) {
                    return e(bArr);
                }
            }
            return new String(bArr, 0);
        }

        /* renamed from: f */
        public byte[] a(String str) {
            byte[] bytes = str.getBytes(e.f29803c);
            for (int i10 = 0; i10 < bytes.length; i10++) {
                if (c(bytes[i10])) {
                    return g(bytes, i10);
                }
            }
            return bytes;
        }
    }

    static {
        d dVar = new d();
        f32251x = dVar;
        f32252y = y0.g.g("grpc-message", false, dVar);
    }

    private j1(b bVar) {
        this(bVar, (String) null, (Throwable) null);
    }

    private static List<j1> f() {
        TreeMap treeMap = new TreeMap();
        b[] values = b.values();
        int length = values.length;
        int i10 = 0;
        while (i10 < length) {
            b bVar = values[i10];
            j1 j1Var = (j1) treeMap.put(Integer.valueOf(bVar.d()), new j1(bVar));
            if (j1Var == null) {
                i10++;
            } else {
                throw new IllegalStateException("Code value duplication between " + j1Var.m().name() + " & " + bVar.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    static String g(j1 j1Var) {
        if (j1Var.f32254b == null) {
            return j1Var.f32253a.toString();
        }
        return j1Var.f32253a + ": " + j1Var.f32254b;
    }

    public static j1 h(int i10) {
        if (i10 >= 0) {
            List<j1> list = f32232e;
            if (i10 <= list.size()) {
                return list.get(i10);
            }
        }
        j1 j1Var = f32235h;
        return j1Var.q("Unknown code " + i10);
    }

    /* access modifiers changed from: private */
    public static j1 i(byte[] bArr) {
        if (bArr.length == 1 && bArr[0] == 48) {
            return f32233f;
        }
        return j(bArr);
    }

    private static j1 j(byte[] bArr) {
        int length = bArr.length;
        char c10 = 1;
        int i10 = 0;
        if (length != 1) {
            if (length == 2 && bArr[0] >= 48 && bArr[0] <= 57) {
                i10 = 0 + ((bArr[0] - 48) * 10);
            }
            j1 j1Var = f32235h;
            return j1Var.q("Unknown code " + new String(bArr, e.f29801a));
        }
        c10 = 0;
        if (bArr[c10] >= 48 && bArr[c10] <= 57) {
            int i11 = i10 + (bArr[c10] - 48);
            List<j1> list = f32232e;
            if (i11 < list.size()) {
                return list.get(i11);
            }
        }
        j1 j1Var2 = f32235h;
        return j1Var2.q("Unknown code " + new String(bArr, e.f29801a));
    }

    public static j1 k(Throwable th) {
        for (Throwable th2 = (Throwable) o.p(th, "t"); th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof k1) {
                return ((k1) th2).a();
            }
            if (th2 instanceof l1) {
                return ((l1) th2).a();
            }
        }
        return f32235h.p(th);
    }

    public k1 c() {
        return new k1(this);
    }

    public l1 d() {
        return new l1(this);
    }

    public j1 e(String str) {
        if (str == null) {
            return this;
        }
        if (this.f32254b == null) {
            return new j1(this.f32253a, str, this.f32255c);
        }
        b bVar = this.f32253a;
        return new j1(bVar, this.f32254b + "\n" + str, this.f32255c);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Throwable l() {
        return this.f32255c;
    }

    public b m() {
        return this.f32253a;
    }

    public String n() {
        return this.f32254b;
    }

    public boolean o() {
        return b.OK == this.f32253a;
    }

    public j1 p(Throwable th) {
        if (k.a(this.f32255c, th)) {
            return this;
        }
        return new j1(this.f32253a, this.f32254b, th);
    }

    public j1 q(String str) {
        if (k.a(this.f32254b, str)) {
            return this;
        }
        return new j1(this.f32253a, str, this.f32255c);
    }

    public String toString() {
        i.b d10 = i.c(this).d("code", this.f32253a.name()).d("description", this.f32254b);
        Throwable th = this.f32255c;
        Object obj = th;
        if (th != null) {
            obj = x.e(th);
        }
        return d10.d("cause", obj).toString();
    }

    private j1(b bVar, String str, Throwable th) {
        this.f32253a = (b) o.p(bVar, "code");
        this.f32254b = str;
        this.f32255c = th;
    }
}
