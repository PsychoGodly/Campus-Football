package dd;

import com.unity3d.services.UnityAdsConstants;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
import r6.i;
import r6.o;

/* compiled from: MethodDescriptor */
public final class z0<ReqT, RespT> {

    /* renamed from: a  reason: collision with root package name */
    private final d f32402a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32403b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32404c;

    /* renamed from: d  reason: collision with root package name */
    private final c<ReqT> f32405d;

    /* renamed from: e  reason: collision with root package name */
    private final c<RespT> f32406e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f32407f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f32408g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f32409h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f32410i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicReferenceArray<Object> f32411j;

    /* compiled from: MethodDescriptor */
    public static final class b<ReqT, RespT> {

        /* renamed from: a  reason: collision with root package name */
        private c<ReqT> f32412a;

        /* renamed from: b  reason: collision with root package name */
        private c<RespT> f32413b;

        /* renamed from: c  reason: collision with root package name */
        private d f32414c;

        /* renamed from: d  reason: collision with root package name */
        private String f32415d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f32416e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f32417f;

        /* renamed from: g  reason: collision with root package name */
        private Object f32418g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f32419h;

        public z0<ReqT, RespT> a() {
            return new z0(this.f32414c, this.f32415d, this.f32412a, this.f32413b, this.f32418g, this.f32416e, this.f32417f, this.f32419h);
        }

        public b<ReqT, RespT> b(String str) {
            this.f32415d = str;
            return this;
        }

        public b<ReqT, RespT> c(c<ReqT> cVar) {
            this.f32412a = cVar;
            return this;
        }

        public b<ReqT, RespT> d(c<RespT> cVar) {
            this.f32413b = cVar;
            return this;
        }

        public b<ReqT, RespT> e(boolean z10) {
            this.f32419h = z10;
            return this;
        }

        public b<ReqT, RespT> f(d dVar) {
            this.f32414c = dVar;
            return this;
        }

        private b() {
        }
    }

    /* compiled from: MethodDescriptor */
    public interface c<T> {
        T a(InputStream inputStream);

        InputStream b(T t10);
    }

    /* compiled from: MethodDescriptor */
    public enum d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        public final boolean a() {
            return this == UNARY || this == SERVER_STREAMING;
        }
    }

    public static String a(String str) {
        int lastIndexOf = ((String) o.p(str, "fullMethodName")).lastIndexOf(47);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    public static String b(String str, String str2) {
        return ((String) o.p(str, "fullServiceName")) + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + ((String) o.p(str2, "methodName"));
    }

    public static <ReqT, RespT> b<ReqT, RespT> g() {
        return h((c) null, (c) null);
    }

    public static <ReqT, RespT> b<ReqT, RespT> h(c<ReqT> cVar, c<RespT> cVar2) {
        return new b().c(cVar).d(cVar2);
    }

    public String c() {
        return this.f32403b;
    }

    public String d() {
        return this.f32404c;
    }

    public d e() {
        return this.f32402a;
    }

    public boolean f() {
        return this.f32409h;
    }

    public RespT i(InputStream inputStream) {
        return this.f32406e.a(inputStream);
    }

    public InputStream j(ReqT reqt) {
        return this.f32405d.b(reqt);
    }

    public String toString() {
        return i.c(this).d("fullMethodName", this.f32403b).d("type", this.f32402a).e("idempotent", this.f32408g).e("safe", this.f32409h).e("sampledToLocalTracing", this.f32410i).d("requestMarshaller", this.f32405d).d("responseMarshaller", this.f32406e).d("schemaDescriptor", this.f32407f).m().toString();
    }

    private z0(d dVar, String str, c<ReqT> cVar, c<RespT> cVar2, Object obj, boolean z10, boolean z11, boolean z12) {
        this.f32411j = new AtomicReferenceArray<>(2);
        this.f32402a = (d) o.p(dVar, "type");
        this.f32403b = (String) o.p(str, "fullMethodName");
        this.f32404c = a(str);
        this.f32405d = (c) o.p(cVar, "requestMarshaller");
        this.f32406e = (c) o.p(cVar2, "responseMarshaller");
        this.f32407f = obj;
        this.f32408g = z10;
        this.f32409h = z11;
        this.f32410i = z12;
    }
}
