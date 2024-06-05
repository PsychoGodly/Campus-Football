package com.google.protobuf;

import com.google.protobuf.d0;
import java.util.Collections;
import java.util.List;

/* compiled from: ListFieldSchema */
abstract class l0 {

    /* renamed from: a  reason: collision with root package name */
    private static final l0 f27136a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final l0 f27137b = new c();

    /* compiled from: ListFieldSchema */
    private static final class b extends l0 {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?> f27138c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j10) {
            return (List) z1.G(obj, j10);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.protobuf.j0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.protobuf.j0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.protobuf.j0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static <L> java.util.List<L> g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof com.google.protobuf.k0
                if (r1 == 0) goto L_0x0014
                com.google.protobuf.j0 r0 = new com.google.protobuf.j0
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof com.google.protobuf.g1
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof com.google.protobuf.d0.j
                if (r1 == 0) goto L_0x0024
                com.google.protobuf.d0$j r0 = (com.google.protobuf.d0.j) r0
                com.google.protobuf.d0$j r6 = r0.d(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                com.google.protobuf.z1.V(r3, r4, r0)
                goto L_0x007f
            L_0x002d:
                java.lang.Class<?> r1 = f27138c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                com.google.protobuf.z1.V(r3, r4, r1)
            L_0x0049:
                r0 = r1
                goto L_0x007f
            L_0x004b:
                boolean r1 = r0 instanceof com.google.protobuf.y1
                if (r1 == 0) goto L_0x0062
                com.google.protobuf.j0 r1 = new com.google.protobuf.j0
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                com.google.protobuf.y1 r0 = (com.google.protobuf.y1) r0
                r1.addAll(r0)
                com.google.protobuf.z1.V(r3, r4, r1)
                goto L_0x0049
            L_0x0062:
                boolean r1 = r0 instanceof com.google.protobuf.g1
                if (r1 == 0) goto L_0x007f
                boolean r1 = r0 instanceof com.google.protobuf.d0.j
                if (r1 == 0) goto L_0x007f
                r1 = r0
                com.google.protobuf.d0$j r1 = (com.google.protobuf.d0.j) r1
                boolean r2 = r1.t()
                if (r2 != 0) goto L_0x007f
                int r0 = r0.size()
                int r0 = r0 + r6
                com.google.protobuf.d0$j r0 = r1.d(r0)
                com.google.protobuf.z1.V(r3, r4, r0)
            L_0x007f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l0.b.g(java.lang.Object, long, int):java.util.List");
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j10) {
            Object obj2;
            List list = (List) z1.G(obj, j10);
            if (list instanceof k0) {
                obj2 = ((k0) list).r();
            } else if (!f27138c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof g1) || !(list instanceof d0.j)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    d0.j jVar = (d0.j) list;
                    if (jVar.t()) {
                        jVar.i();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            z1.V(obj, j10, obj2);
        }

        /* access modifiers changed from: package-private */
        public <E> void d(Object obj, Object obj2, long j10) {
            List f10 = f(obj2, j10);
            List g10 = g(obj, j10, f10.size());
            int size = g10.size();
            int size2 = f10.size();
            if (size > 0 && size2 > 0) {
                g10.addAll(f10);
            }
            if (size > 0) {
                f10 = g10;
            }
            z1.V(obj, j10, f10);
        }

        /* access modifiers changed from: package-private */
        public <L> List<L> e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    /* compiled from: ListFieldSchema */
    private static final class c extends l0 {
        private c() {
            super();
        }

        static <E> d0.j<E> f(Object obj, long j10) {
            return (d0.j) z1.G(obj, j10);
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j10) {
            f(obj, j10).i();
        }

        /* access modifiers changed from: package-private */
        public <E> void d(Object obj, Object obj2, long j10) {
            d0.j f10 = f(obj, j10);
            d0.j f11 = f(obj2, j10);
            int size = f10.size();
            int size2 = f11.size();
            if (size > 0 && size2 > 0) {
                if (!f10.t()) {
                    f10 = f10.d(size2 + size);
                }
                f10.addAll(f11);
            }
            if (size > 0) {
                f11 = f10;
            }
            z1.V(obj, j10, f11);
        }

        /* access modifiers changed from: package-private */
        public <L> List<L> e(Object obj, long j10) {
            d0.j f10 = f(obj, j10);
            if (f10.t()) {
                return f10;
            }
            int size = f10.size();
            d0.j d10 = f10.d(size == 0 ? 10 : size * 2);
            z1.V(obj, j10, d10);
            return d10;
        }
    }

    static l0 a() {
        return f27136a;
    }

    static l0 b() {
        return f27137b;
    }

    /* access modifiers changed from: package-private */
    public abstract void c(Object obj, long j10);

    /* access modifiers changed from: package-private */
    public abstract <L> void d(Object obj, Object obj2, long j10);

    /* access modifiers changed from: package-private */
    public abstract <L> List<L> e(Object obj, long j10);

    private l0() {
    }
}
