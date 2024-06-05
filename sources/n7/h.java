package n7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import k7.d;
import k7.e;
import k7.f;
import l7.b;

/* compiled from: ProtobufEncoder */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, d<?>> f29433a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, f<?>> f29434b;

    /* renamed from: c  reason: collision with root package name */
    private final d<Object> f29435c;

    /* compiled from: ProtobufEncoder */
    public static final class a implements b<a> {

        /* renamed from: d  reason: collision with root package name */
        private static final d<Object> f29436d = g.f36487a;

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class<?>, d<?>> f29437a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<Class<?>, f<?>> f29438b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private d<Object> f29439c = f29436d;

        /* access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, e eVar) throws IOException {
            throw new k7.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f29437a), new HashMap(this.f29438b), this.f29439c);
        }

        public a d(l7.a aVar) {
            aVar.a(this);
            return this;
        }

        /* renamed from: f */
        public <U> a a(Class<U> cls, d<? super U> dVar) {
            this.f29437a.put(cls, dVar);
            this.f29438b.remove(cls);
            return this;
        }
    }

    h(Map<Class<?>, d<?>> map, Map<Class<?>, f<?>> map2, d<Object> dVar) {
        this.f29433a = map;
        this.f29434b = map2;
        this.f29435c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) throws IOException {
        new f(outputStream, this.f29433a, this.f29434b, this.f29435c).q(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
