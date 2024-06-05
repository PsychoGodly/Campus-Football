package m7;

import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import k7.e;
import k7.f;
import k7.g;

/* compiled from: JsonDataEncoderBuilder */
public final class d implements l7.b<d> {

    /* renamed from: e  reason: collision with root package name */
    private static final k7.d<Object> f29230e = a.f36300a;

    /* renamed from: f  reason: collision with root package name */
    private static final f<String> f29231f = c.f36302a;

    /* renamed from: g  reason: collision with root package name */
    private static final f<Boolean> f29232g = b.f36301a;

    /* renamed from: h  reason: collision with root package name */
    private static final b f29233h = new b((a) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, k7.d<?>> f29234a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, f<?>> f29235b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public k7.d<Object> f29236c = f29230e;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f29237d = false;

    /* compiled from: JsonDataEncoderBuilder */
    class a implements k7.a {
        a() {
        }

        public void a(Object obj, Writer writer) throws IOException {
            e eVar = new e(writer, d.this.f29234a, d.this.f29235b, d.this.f29236c, d.this.f29237d);
            eVar.h(obj, false);
            eVar.p();
        }
    }

    /* compiled from: JsonDataEncoderBuilder */
    private static final class b implements f<Date> {

        /* renamed from: a  reason: collision with root package name */
        private static final DateFormat f29239a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f29239a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* renamed from: b */
        public void a(Date date, g gVar) throws IOException {
            gVar.c(f29239a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        p(String.class, f29231f);
        p(Boolean.class, f29232g);
        p(Date.class, f29233h);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, e eVar) throws IOException {
        throw new k7.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public k7.a i() {
        return new a();
    }

    public d j(l7.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z10) {
        this.f29237d = z10;
        return this;
    }

    /* renamed from: o */
    public <T> d a(Class<T> cls, k7.d<? super T> dVar) {
        this.f29234a.put(cls, dVar);
        this.f29235b.remove(cls);
        return this;
    }

    public <T> d p(Class<T> cls, f<? super T> fVar) {
        this.f29235b.put(cls, fVar);
        this.f29234a.remove(cls);
        return this;
    }
}
