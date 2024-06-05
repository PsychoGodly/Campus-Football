package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class sb {

    class a extends qp {

        /* renamed from: a  reason: collision with root package name */
        boolean f11340a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f11341b;

        a(Object obj) {
            this.f11341b = obj;
        }

        public boolean hasNext() {
            return !this.f11340a;
        }

        public Object next() {
            if (!this.f11340a) {
                this.f11340a = true;
                return this.f11341b;
            }
            throw new NoSuchElementException();
        }
    }

    private static final class b extends c {

        /* renamed from: f  reason: collision with root package name */
        static final rp f11342f = new b(new Object[0], 0, 0, 0);

        /* renamed from: c  reason: collision with root package name */
        private final Object[] f11343c;

        /* renamed from: d  reason: collision with root package name */
        private final int f11344d;

        b(Object[] objArr, int i10, int i11, int i12) {
            super(i11, i12);
            this.f11343c = objArr;
            this.f11344d = i10;
        }

        /* access modifiers changed from: protected */
        public Object a(int i10) {
            return this.f11343c[this.f11344d + i10];
        }
    }

    private enum c implements Iterator {
        INSTANCE;

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            n3.a(false);
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it);
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }

    public static Object b(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    static Object c(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static String d(Iterator it) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            z10 = false;
            sb2.append(it.next());
        }
        sb2.append(']');
        return sb2.toString();
    }

    static rp b() {
        return b.f11342f;
    }

    static Iterator c() {
        return c.INSTANCE;
    }

    static void a(Iterator it) {
        Preconditions.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.util.Iterator r3, java.util.Iterator r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = com.applovin.exoplayer2.common.base.Objects.equal(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sb.a(java.util.Iterator, java.util.Iterator):boolean");
    }

    public static Object a(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static boolean a(Iterator it, Collection collection) {
        Preconditions.checkNotNull(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    static qp a() {
        return b();
    }

    public static qp a(Object obj) {
        return new a(obj);
    }
}
