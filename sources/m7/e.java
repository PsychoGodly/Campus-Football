package m7;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import k7.b;
import k7.c;
import k7.d;
import k7.f;
import k7.g;

/* compiled from: JsonValueObjectEncoderContext */
final class e implements k7.e, g {

    /* renamed from: a  reason: collision with root package name */
    private e f29240a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f29241b = true;

    /* renamed from: c  reason: collision with root package name */
    private final JsonWriter f29242c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, d<?>> f29243d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, f<?>> f29244e;

    /* renamed from: f  reason: collision with root package name */
    private final d<Object> f29245f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f29246g;

    e(Writer writer, Map<Class<?>, d<?>> map, Map<Class<?>, f<?>> map2, d<Object> dVar, boolean z10) {
        this.f29242c = new JsonWriter(writer);
        this.f29243d = map;
        this.f29244e = map2;
        this.f29245f = dVar;
        this.f29246g = z10;
    }

    private boolean o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e r(String str, Object obj) throws IOException, b {
        t();
        this.f29242c.name(str);
        if (obj != null) {
            return h(obj, false);
        }
        this.f29242c.nullValue();
        return this;
    }

    private e s(String str, Object obj) throws IOException, b {
        if (obj == null) {
            return this;
        }
        t();
        this.f29242c.name(str);
        return h(obj, false);
    }

    private void t() throws IOException {
        if (this.f29241b) {
            e eVar = this.f29240a;
            if (eVar != null) {
                eVar.t();
                this.f29240a.f29241b = false;
                this.f29240a = null;
                this.f29242c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    public k7.e a(c cVar, int i10) throws IOException {
        return j(cVar.b(), i10);
    }

    public k7.e b(c cVar, long j10) throws IOException {
        return k(cVar.b(), j10);
    }

    public k7.e e(c cVar, Object obj) throws IOException {
        return l(cVar.b(), obj);
    }

    public e f(int i10) throws IOException {
        t();
        this.f29242c.value((long) i10);
        return this;
    }

    public e g(long j10) throws IOException {
        t();
        this.f29242c.value(j10);
        return this;
    }

    /* access modifiers changed from: package-private */
    public e h(Object obj, boolean z10) throws IOException {
        Class<?> cls;
        int i10 = 0;
        if (z10 && o(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new b(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f29242c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f29242c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return n((byte[]) obj);
            }
            this.f29242c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i10 < length) {
                    this.f29242c.value((long) iArr[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    g(jArr[i10]);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    this.f29242c.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    this.f29242c.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                for (Number h10 : (Number[]) obj) {
                    h(h10, false);
                }
            } else {
                for (Object h11 : (Object[]) obj) {
                    h(h11, false);
                }
            }
            this.f29242c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f29242c.beginArray();
            for (Object h12 : (Collection) obj) {
                h(h12, false);
            }
            this.f29242c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f29242c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    l((String) key, entry.getValue());
                } catch (ClassCastException e10) {
                    throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e10);
                }
            }
            this.f29242c.endObject();
            return this;
        } else {
            d dVar = this.f29243d.get(obj.getClass());
            if (dVar != null) {
                return q(dVar, obj, z10);
            }
            f fVar = this.f29244e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return q(this.f29245f, obj, z10);
            } else {
                c(((Enum) obj).name());
                return this;
            }
        }
    }

    /* renamed from: i */
    public e c(String str) throws IOException {
        t();
        this.f29242c.value(str);
        return this;
    }

    public e j(String str, int i10) throws IOException {
        t();
        this.f29242c.name(str);
        return f(i10);
    }

    public e k(String str, long j10) throws IOException {
        t();
        this.f29242c.name(str);
        return g(j10);
    }

    public e l(String str, Object obj) throws IOException {
        if (this.f29246g) {
            return s(str, obj);
        }
        return r(str, obj);
    }

    /* renamed from: m */
    public e d(boolean z10) throws IOException {
        t();
        this.f29242c.value(z10);
        return this;
    }

    public e n(byte[] bArr) throws IOException {
        t();
        if (bArr == null) {
            this.f29242c.nullValue();
        } else {
            this.f29242c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public void p() throws IOException {
        t();
        this.f29242c.flush();
    }

    /* access modifiers changed from: package-private */
    public e q(d<Object> dVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f29242c.beginObject();
        }
        dVar.a(obj, this);
        if (!z10) {
            this.f29242c.endObject();
        }
        return this;
    }
}
