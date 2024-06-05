package dd;

import dd.k;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import r6.i;
import r6.o;

/* compiled from: CallOptions */
public final class c {

    /* renamed from: k  reason: collision with root package name */
    public static final c f32144k;

    /* renamed from: a  reason: collision with root package name */
    private final t f32145a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f32146b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32147c;

    /* renamed from: d  reason: collision with root package name */
    private final b f32148d;

    /* renamed from: e  reason: collision with root package name */
    private final String f32149e;

    /* renamed from: f  reason: collision with root package name */
    private final Object[][] f32150f;

    /* renamed from: g  reason: collision with root package name */
    private final List<k.a> f32151g;

    /* renamed from: h  reason: collision with root package name */
    private final Boolean f32152h;

    /* renamed from: i  reason: collision with root package name */
    private final Integer f32153i;

    /* renamed from: j  reason: collision with root package name */
    private final Integer f32154j;

    /* compiled from: CallOptions */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        t f32155a;

        /* renamed from: b  reason: collision with root package name */
        Executor f32156b;

        /* renamed from: c  reason: collision with root package name */
        String f32157c;

        /* renamed from: d  reason: collision with root package name */
        b f32158d;

        /* renamed from: e  reason: collision with root package name */
        String f32159e;

        /* renamed from: f  reason: collision with root package name */
        Object[][] f32160f;

        /* renamed from: g  reason: collision with root package name */
        List<k.a> f32161g;

        /* renamed from: h  reason: collision with root package name */
        Boolean f32162h;

        /* renamed from: i  reason: collision with root package name */
        Integer f32163i;

        /* renamed from: j  reason: collision with root package name */
        Integer f32164j;

        b() {
        }

        /* access modifiers changed from: private */
        public c b() {
            return new c(this);
        }
    }

    /* renamed from: dd.c$c  reason: collision with other inner class name */
    /* compiled from: CallOptions */
    public static final class C0363c<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f32165a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final T f32166b;

        private C0363c(String str, T t10) {
            this.f32165a = str;
            this.f32166b = t10;
        }

        public static <T> C0363c<T> b(String str) {
            o.p(str, "debugString");
            return new C0363c<>(str, (Object) null);
        }

        public String toString() {
            return this.f32165a;
        }
    }

    static {
        b bVar = new b();
        bVar.f32160f = (Object[][]) Array.newInstance(Object.class, new int[]{0, 2});
        bVar.f32161g = Collections.emptyList();
        f32144k = bVar.b();
    }

    private static b k(c cVar) {
        b bVar = new b();
        bVar.f32155a = cVar.f32145a;
        bVar.f32156b = cVar.f32146b;
        bVar.f32157c = cVar.f32147c;
        bVar.f32158d = cVar.f32148d;
        bVar.f32159e = cVar.f32149e;
        bVar.f32160f = cVar.f32150f;
        bVar.f32161g = cVar.f32151g;
        bVar.f32162h = cVar.f32152h;
        bVar.f32163i = cVar.f32153i;
        bVar.f32164j = cVar.f32154j;
        return bVar;
    }

    public String a() {
        return this.f32147c;
    }

    public String b() {
        return this.f32149e;
    }

    public b c() {
        return this.f32148d;
    }

    public t d() {
        return this.f32145a;
    }

    public Executor e() {
        return this.f32146b;
    }

    public Integer f() {
        return this.f32153i;
    }

    public Integer g() {
        return this.f32154j;
    }

    public <T> T h(C0363c<T> cVar) {
        o.p(cVar, "key");
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f32150f;
            if (i10 >= objArr.length) {
                return cVar.f32166b;
            }
            if (cVar.equals(objArr[i10][0])) {
                return this.f32150f[i10][1];
            }
            i10++;
        }
    }

    public List<k.a> i() {
        return this.f32151g;
    }

    public boolean j() {
        return Boolean.TRUE.equals(this.f32152h);
    }

    public c l(b bVar) {
        b k10 = k(this);
        k10.f32158d = bVar;
        return k10.b();
    }

    public c m(t tVar) {
        b k10 = k(this);
        k10.f32155a = tVar;
        return k10.b();
    }

    public c n(Executor executor) {
        b k10 = k(this);
        k10.f32156b = executor;
        return k10.b();
    }

    public c o(int i10) {
        o.h(i10 >= 0, "invalid maxsize %s", i10);
        b k10 = k(this);
        k10.f32163i = Integer.valueOf(i10);
        return k10.b();
    }

    public c p(int i10) {
        o.h(i10 >= 0, "invalid maxsize %s", i10);
        b k10 = k(this);
        k10.f32164j = Integer.valueOf(i10);
        return k10.b();
    }

    public <T> c q(C0363c<T> cVar, T t10) {
        o.p(cVar, "key");
        o.p(t10, "value");
        b k10 = k(this);
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f32150f;
            if (i10 >= objArr.length) {
                i10 = -1;
                break;
            } else if (cVar.equals(objArr[i10][0])) {
                break;
            } else {
                i10++;
            }
        }
        int length = this.f32150f.length;
        int i11 = i10 == -1 ? 1 : 0;
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = length + i11;
        Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, iArr);
        k10.f32160f = objArr2;
        Object[][] objArr3 = this.f32150f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i10 == -1) {
            k10.f32160f[this.f32150f.length] = new Object[]{cVar, t10};
        } else {
            k10.f32160f[i10] = new Object[]{cVar, t10};
        }
        return k10.b();
    }

    public c r(k.a aVar) {
        ArrayList arrayList = new ArrayList(this.f32151g.size() + 1);
        arrayList.addAll(this.f32151g);
        arrayList.add(aVar);
        b k10 = k(this);
        k10.f32161g = Collections.unmodifiableList(arrayList);
        return k10.b();
    }

    public c s() {
        b k10 = k(this);
        k10.f32162h = Boolean.TRUE;
        return k10.b();
    }

    public c t() {
        b k10 = k(this);
        k10.f32162h = Boolean.FALSE;
        return k10.b();
    }

    public String toString() {
        i.b d10 = i.c(this).d("deadline", this.f32145a).d("authority", this.f32147c).d("callCredentials", this.f32148d);
        Executor executor = this.f32146b;
        return d10.d("executor", executor != null ? executor.getClass() : null).d("compressorName", this.f32149e).d("customOptions", Arrays.deepToString(this.f32150f)).e("waitForReady", j()).d("maxInboundMessageSize", this.f32153i).d("maxOutboundMessageSize", this.f32154j).d("streamTracerFactories", this.f32151g).toString();
    }

    private c(b bVar) {
        this.f32145a = bVar.f32155a;
        this.f32146b = bVar.f32156b;
        this.f32147c = bVar.f32157c;
        this.f32148d = bVar.f32158d;
        this.f32149e = bVar.f32159e;
        this.f32150f = bVar.f32160f;
        this.f32151g = bVar.f32161g;
        this.f32152h = bVar.f32162h;
        this.f32153i = bVar.f32163i;
        this.f32154j = bVar.f32164j;
    }
}
