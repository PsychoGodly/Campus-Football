package dd;

import java.util.IdentityHashMap;
import java.util.Map;
import r6.k;

/* compiled from: Attributes */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final IdentityHashMap<c<?>, Object> f32107b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f32108c;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final IdentityHashMap<c<?>, Object> f32109a;

    /* compiled from: Attributes */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private a f32110a;

        /* renamed from: b  reason: collision with root package name */
        private IdentityHashMap<c<?>, Object> f32111b;

        private IdentityHashMap<c<?>, Object> b(int i10) {
            if (this.f32111b == null) {
                this.f32111b = new IdentityHashMap<>(i10);
            }
            return this.f32111b;
        }

        public a a() {
            if (this.f32111b != null) {
                for (Map.Entry entry : this.f32110a.f32109a.entrySet()) {
                    if (!this.f32111b.containsKey(entry.getKey())) {
                        this.f32111b.put((c) entry.getKey(), entry.getValue());
                    }
                }
                this.f32110a = new a(this.f32111b);
                this.f32111b = null;
            }
            return this.f32110a;
        }

        public <T> b c(c<T> cVar) {
            if (this.f32110a.f32109a.containsKey(cVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f32110a.f32109a);
                identityHashMap.remove(cVar);
                this.f32110a = new a(identityHashMap);
            }
            IdentityHashMap<c<?>, Object> identityHashMap2 = this.f32111b;
            if (identityHashMap2 != null) {
                identityHashMap2.remove(cVar);
            }
            return this;
        }

        public <T> b d(c<T> cVar, T t10) {
            b(1).put(cVar, t10);
            return this;
        }

        private b(a aVar) {
            this.f32110a = aVar;
        }
    }

    /* compiled from: Attributes */
    public static final class c<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f32112a;

        private c(String str) {
            this.f32112a = str;
        }

        public static <T> c<T> a(String str) {
            return new c<>(str);
        }

        public String toString() {
            return this.f32112a;
        }
    }

    static {
        IdentityHashMap<c<?>, Object> identityHashMap = new IdentityHashMap<>();
        f32107b = identityHashMap;
        f32108c = new a(identityHashMap);
    }

    public static b c() {
        return new b();
    }

    public <T> T b(c<T> cVar) {
        return this.f32109a.get(cVar);
    }

    public b d() {
        return new b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r7 == 0) goto L_0x005a
            java.lang.Class<dd.a> r2 = dd.a.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L_0x0010
            goto L_0x005a
        L_0x0010:
            dd.a r7 = (dd.a) r7
            java.util.IdentityHashMap<dd.a$c<?>, java.lang.Object> r2 = r6.f32109a
            int r2 = r2.size()
            java.util.IdentityHashMap<dd.a$c<?>, java.lang.Object> r3 = r7.f32109a
            int r3 = r3.size()
            if (r2 == r3) goto L_0x0021
            return r1
        L_0x0021:
            java.util.IdentityHashMap<dd.a$c<?>, java.lang.Object> r2 = r6.f32109a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x002b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.util.IdentityHashMap<dd.a$c<?>, java.lang.Object> r4 = r7.f32109a
            java.lang.Object r5 = r3.getKey()
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L_0x0044
            return r1
        L_0x0044:
            java.lang.Object r4 = r3.getValue()
            java.util.IdentityHashMap<dd.a$c<?>, java.lang.Object> r5 = r7.f32109a
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r5.get(r3)
            boolean r3 = r6.k.a(r4, r3)
            if (r3 != 0) goto L_0x002b
            return r1
        L_0x0059:
            return r0
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i10 = 0;
        for (Map.Entry next : this.f32109a.entrySet()) {
            i10 += k.b(next.getKey(), next.getValue());
        }
        return i10;
    }

    public String toString() {
        return this.f32109a.toString();
    }

    private a(IdentityHashMap<c<?>, Object> identityHashMap) {
        this.f32109a = identityHashMap;
    }
}
