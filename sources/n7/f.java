package n7;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import k7.b;
import k7.c;
import k7.d;
import k7.e;

/* compiled from: ProtobufDataEncoderContext */
final class f implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Charset f29423f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    private static final c f29424g = c.a("key").b(a.b().c(1).a()).a();

    /* renamed from: h  reason: collision with root package name */
    private static final c f29425h = c.a("value").b(a.b().c(2).a()).a();

    /* renamed from: i  reason: collision with root package name */
    private static final d<Map.Entry<Object, Object>> f29426i = e.f36486a;

    /* renamed from: a  reason: collision with root package name */
    private OutputStream f29427a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, d<?>> f29428b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, k7.f<?>> f29429c;

    /* renamed from: d  reason: collision with root package name */
    private final d<Object> f29430d;

    /* renamed from: e  reason: collision with root package name */
    private final i f29431e = new i(this);

    /* compiled from: ProtobufDataEncoderContext */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29432a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                n7.d$a[] r0 = n7.d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29432a = r0
                n7.d$a r1 = n7.d.a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29432a     // Catch:{ NoSuchFieldError -> 0x001d }
                n7.d$a r1 = n7.d.a.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29432a     // Catch:{ NoSuchFieldError -> 0x0028 }
                n7.d$a r1 = n7.d.a.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n7.f.a.<clinit>():void");
        }
    }

    f(OutputStream outputStream, Map<Class<?>, d<?>> map, Map<Class<?>, k7.f<?>> map2, d<Object> dVar) {
        this.f29427a = outputStream;
        this.f29428b = map;
        this.f29429c = map2;
        this.f29430d = dVar;
    }

    private static ByteBuffer m(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long n(d<T> dVar, T t10) throws IOException {
        OutputStream outputStream;
        b bVar = new b();
        try {
            outputStream = this.f29427a;
            this.f29427a = bVar;
            dVar.a(t10, this);
            this.f29427a = outputStream;
            long h10 = bVar.h();
            bVar.close();
            return h10;
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private <T> f o(d<T> dVar, c cVar, T t10, boolean z10) throws IOException {
        long n10 = n(dVar, t10);
        if (z10 && n10 == 0) {
            return this;
        }
        u((s(cVar) << 3) | 2);
        v(n10);
        dVar.a(t10, this);
        return this;
    }

    private <T> f p(k7.f<T> fVar, c cVar, T t10, boolean z10) throws IOException {
        this.f29431e.b(cVar, z10);
        fVar.a(t10, this.f29431e);
        return this;
    }

    private static d r(c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new b("Field has no @Protobuf config");
    }

    private static int s(c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new b("Field has no @Protobuf config");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void t(Map.Entry entry, e eVar) throws IOException {
        eVar.e(f29424g, entry.getKey());
        eVar.e(f29425h, entry.getValue());
    }

    private void u(int i10) throws IOException {
        while (((long) (i10 & -128)) != 0) {
            this.f29427a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f29427a.write(i10 & 127);
    }

    private void v(long j10) throws IOException {
        while ((-128 & j10) != 0) {
            this.f29427a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f29427a.write(((int) j10) & 127);
    }

    /* access modifiers changed from: package-private */
    public e d(c cVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        u((s(cVar) << 3) | 1);
        this.f29427a.write(m(8).putDouble(d10).array());
        return this;
    }

    public e e(c cVar, Object obj) throws IOException {
        return g(cVar, obj, true);
    }

    /* access modifiers changed from: package-private */
    public e f(c cVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        u((s(cVar) << 3) | 5);
        this.f29427a.write(m(4).putFloat(f10).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    public e g(c cVar, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            u((s(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f29423f);
            u(bytes.length);
            this.f29427a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object g10 : (Collection) obj) {
                g(cVar, g10, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry o10 : ((Map) obj).entrySet()) {
                o(f29426i, cVar, o10, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return d(cVar, ((Double) obj).doubleValue(), z10);
        } else {
            if (obj instanceof Float) {
                return f(cVar, ((Float) obj).floatValue(), z10);
            }
            if (obj instanceof Number) {
                return k(cVar, ((Number) obj).longValue(), z10);
            }
            if (obj instanceof Boolean) {
                return l(cVar, ((Boolean) obj).booleanValue(), z10);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z10 && bArr.length == 0) {
                    return this;
                }
                u((s(cVar) << 3) | 2);
                u(bArr.length);
                this.f29427a.write(bArr);
                return this;
            }
            d dVar = this.f29428b.get(obj.getClass());
            if (dVar != null) {
                return o(dVar, cVar, obj, z10);
            }
            k7.f fVar = this.f29429c.get(obj.getClass());
            if (fVar != null) {
                return p(fVar, cVar, obj, z10);
            }
            if (obj instanceof c) {
                return a(cVar, ((c) obj).I());
            }
            if (obj instanceof Enum) {
                return a(cVar, ((Enum) obj).ordinal());
            }
            return o(this.f29430d, cVar, obj, z10);
        }
    }

    /* renamed from: h */
    public f a(c cVar, int i10) throws IOException {
        return i(cVar, i10, true);
    }

    /* access modifiers changed from: package-private */
    public f i(c cVar, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return this;
        }
        d r10 = r(cVar);
        int i11 = a.f29432a[r10.intEncoding().ordinal()];
        if (i11 == 1) {
            u(r10.tag() << 3);
            u(i10);
        } else if (i11 == 2) {
            u(r10.tag() << 3);
            u((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            u((r10.tag() << 3) | 5);
            this.f29427a.write(m(4).putInt(i10).array());
        }
        return this;
    }

    /* renamed from: j */
    public f b(c cVar, long j10) throws IOException {
        return k(cVar, j10, true);
    }

    /* access modifiers changed from: package-private */
    public f k(c cVar, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return this;
        }
        d r10 = r(cVar);
        int i10 = a.f29432a[r10.intEncoding().ordinal()];
        if (i10 == 1) {
            u(r10.tag() << 3);
            v(j10);
        } else if (i10 == 2) {
            u(r10.tag() << 3);
            v((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            u((r10.tag() << 3) | 1);
            this.f29427a.write(m(8).putLong(j10).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public f l(c cVar, boolean z10, boolean z11) throws IOException {
        return i(cVar, z10 ? 1 : 0, z11);
    }

    /* access modifiers changed from: package-private */
    public f q(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        d dVar = this.f29428b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new b("No encoder for " + obj.getClass());
    }
}
