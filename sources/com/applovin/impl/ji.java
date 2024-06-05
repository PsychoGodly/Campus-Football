package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.Map;

final class ji extends cb {

    /* renamed from: i  reason: collision with root package name */
    static final cb f8765i = new ji((int[]) null, new Object[0], 0);

    /* renamed from: f  reason: collision with root package name */
    private final transient int[] f8766f;

    /* renamed from: g  reason: collision with root package name */
    final transient Object[] f8767g;

    /* renamed from: h  reason: collision with root package name */
    private final transient int f8768h;

    static class a extends eb {

        /* renamed from: c  reason: collision with root package name */
        private final transient cb f8769c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final transient Object[] f8770d;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final transient int f8771f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final transient int f8772g;

        /* renamed from: com.applovin.impl.ji$a$a  reason: collision with other inner class name */
        class C0122a extends ab {
            C0122a() {
            }

            /* renamed from: b */
            public Map.Entry get(int i10) {
                Preconditions.checkElementIndex(i10, a.this.f8772g);
                int i11 = i10 * 2;
                return new AbstractMap.SimpleImmutableEntry(a.this.f8770d[a.this.f8771f + i11], a.this.f8770d[i11 + (a.this.f8771f ^ 1)]);
            }

            public boolean e() {
                return true;
            }

            public int size() {
                return a.this.f8772g;
            }
        }

        a(cb cbVar, Object[] objArr, int i10, int i11) {
            this.f8769c = cbVar;
            this.f8770d = objArr;
            this.f8771f = i10;
            this.f8772g = i11;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f8769c.get(key))) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return true;
        }

        /* access modifiers changed from: package-private */
        public ab f() {
            return new C0122a();
        }

        public qp iterator() {
            return a().iterator();
        }

        public int size() {
            return this.f8772g;
        }

        /* access modifiers changed from: package-private */
        public int a(Object[] objArr, int i10) {
            return a().a(objArr, i10);
        }
    }

    static final class b extends eb {

        /* renamed from: c  reason: collision with root package name */
        private final transient cb f8774c;

        /* renamed from: d  reason: collision with root package name */
        private final transient ab f8775d;

        b(cb cbVar, ab abVar) {
            this.f8774c = cbVar;
            this.f8775d = abVar;
        }

        public ab a() {
            return this.f8775d;
        }

        public boolean contains(Object obj) {
            return this.f8774c.get(obj) != null;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return true;
        }

        public qp iterator() {
            return a().iterator();
        }

        public int size() {
            return this.f8774c.size();
        }

        /* access modifiers changed from: package-private */
        public int a(Object[] objArr, int i10) {
            return a().a(objArr, i10);
        }
    }

    static final class c extends ab {

        /* renamed from: c  reason: collision with root package name */
        private final transient Object[] f8776c;

        /* renamed from: d  reason: collision with root package name */
        private final transient int f8777d;

        /* renamed from: f  reason: collision with root package name */
        private final transient int f8778f;

        c(Object[] objArr, int i10, int i11) {
            this.f8776c = objArr;
            this.f8777d = i10;
            this.f8778f = i11;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return true;
        }

        public Object get(int i10) {
            Preconditions.checkElementIndex(i10, this.f8778f);
            return this.f8776c[(i10 * 2) + this.f8777d];
        }

        public int size() {
            return this.f8778f;
        }
    }

    private ji(int[] iArr, Object[] objArr, int i10) {
        this.f8766f = iArr;
        this.f8767g = objArr;
        this.f8768h = i10;
    }

    static ji a(int i10, Object[] objArr) {
        if (i10 == 0) {
            return (ji) f8765i;
        }
        if (i10 == 1) {
            n3.a(objArr[0], objArr[1]);
            return new ji((int[]) null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i10, objArr.length >> 1);
        return new ji(a(objArr, i10, eb.a(i10), 0), objArr, i10);
    }

    /* access modifiers changed from: package-private */
    public eb b() {
        return new a(this, this.f8767g, 0, this.f8768h);
    }

    /* access modifiers changed from: package-private */
    public eb c() {
        return new b(this, new c(this.f8767g, 0, this.f8768h));
    }

    /* access modifiers changed from: package-private */
    public ya d() {
        return new c(this.f8767g, 1, this.f8768h);
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return false;
    }

    public Object get(Object obj) {
        return a(this.f8766f, this.f8767g, this.f8768h, 0, obj);
    }

    public int size() {
        return this.f8768h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int[] a(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto L_0x000e
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            com.applovin.impl.n3.a((java.lang.Object) r11, (java.lang.Object) r10)
            r10 = 0
            return r10
        L_0x000e:
            int r1 = r12 + -1
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L_0x0017:
            if (r3 >= r11) goto L_0x0077
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            com.applovin.impl.n3.a((java.lang.Object) r6, (java.lang.Object) r4)
            int r7 = r6.hashCode()
            int r7 = com.applovin.impl.ia.a((int) r7)
        L_0x002f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L_0x0039
            r12[r7] = r5
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0039:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x0044
            int r7 = r7 + 1
            goto L_0x002f
        L_0x0044:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Multiple entries with same key: "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r1 = " and "
            r12.append(r1)
            r1 = r10[r8]
            r12.append(r1)
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x0077:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ji.a(java.lang.Object[], int, int, int):int[]");
    }

    static Object a(int[] iArr, Object[] objArr, int i10, int i11, Object obj) {
        if (obj == null) {
            return null;
        }
        if (i10 == 1) {
            if (objArr[i11].equals(obj)) {
                return objArr[i11 ^ 1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int a10 = ia.a(obj.hashCode());
            while (true) {
                int i12 = a10 & length;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    return null;
                }
                if (objArr[i13].equals(obj)) {
                    return objArr[i13 ^ 1];
                }
                a10 = i12 + 1;
            }
        }
    }
}
