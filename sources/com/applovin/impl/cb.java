package com.applovin.impl;

import com.applovin.impl.ya;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public abstract class cb implements Map, Serializable {

    /* renamed from: d  reason: collision with root package name */
    static final Map.Entry[] f6953d = new Map.Entry[0];

    /* renamed from: a  reason: collision with root package name */
    private transient eb f6954a;

    /* renamed from: b  reason: collision with root package name */
    private transient eb f6955b;

    /* renamed from: c  reason: collision with root package name */
    private transient ya f6956c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        Comparator f6957a;

        /* renamed from: b  reason: collision with root package name */
        Object[] f6958b;

        /* renamed from: c  reason: collision with root package name */
        int f6959c;

        /* renamed from: d  reason: collision with root package name */
        boolean f6960d;

        public a() {
            this(4);
        }

        public cb a() {
            b();
            this.f6960d = true;
            return ji.a(this.f6959c, this.f6958b);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int i10;
            if (this.f6957a != null) {
                if (this.f6960d) {
                    this.f6958b = Arrays.copyOf(this.f6958b, this.f6959c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f6959c];
                int i11 = 0;
                while (true) {
                    i10 = this.f6959c;
                    if (i11 >= i10) {
                        break;
                    }
                    Object[] objArr = this.f6958b;
                    int i12 = i11 * 2;
                    entryArr[i11] = new AbstractMap.SimpleImmutableEntry(objArr[i12], objArr[i12 + 1]);
                    i11++;
                }
                Arrays.sort(entryArr, 0, i10, tg.a(this.f6957a).a(qc.c()));
                for (int i13 = 0; i13 < this.f6959c; i13++) {
                    int i14 = i13 * 2;
                    this.f6958b[i14] = entryArr[i13].getKey();
                    this.f6958b[i14 + 1] = entryArr[i13].getValue();
                }
            }
        }

        a(int i10) {
            this.f6958b = new Object[(i10 * 2)];
            this.f6959c = 0;
            this.f6960d = false;
        }

        private void a(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f6958b;
            if (i11 > objArr.length) {
                this.f6958b = Arrays.copyOf(objArr, ya.b.a(objArr.length, i11));
                this.f6960d = false;
            }
        }

        public a a(Object obj, Object obj2) {
            a(this.f6959c + 1);
            n3.a(obj, obj2);
            Object[] objArr = this.f6958b;
            int i10 = this.f6959c;
            int i11 = i10 * 2;
            objArr[i11] = obj;
            objArr[i11 + 1] = obj2;
            this.f6959c = i10 + 1;
            return this;
        }

        public a a(Map.Entry entry) {
            return a(entry.getKey(), entry.getValue());
        }

        public a a(Iterable iterable) {
            if (iterable instanceof Collection) {
                a(this.f6959c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a((Map.Entry) it.next());
            }
            return this;
        }
    }

    cb() {
    }

    public static cb a(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.a(iterable);
        return aVar.a();
    }

    public static cb h() {
        return ji.f8765i;
    }

    /* access modifiers changed from: package-private */
    public abstract eb b();

    /* access modifiers changed from: package-private */
    public abstract eb c();

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    public abstract ya d();

    /* renamed from: e */
    public eb entrySet() {
        eb ebVar = this.f6954a;
        if (ebVar != null) {
            return ebVar;
        }
        eb b10 = b();
        this.f6954a = b10;
        return b10;
    }

    public boolean equals(Object obj) {
        return qc.a((Map) this, obj);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean f();

    /* renamed from: g */
    public eb keySet() {
        eb ebVar = this.f6955b;
        if (ebVar != null) {
            return ebVar;
        }
        eb c10 = c();
        this.f6955b = c10;
        return c10;
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public int hashCode() {
        return nj.a((Set) entrySet());
    }

    /* renamed from: i */
    public ya values() {
        ya yaVar = this.f6956c;
        if (yaVar != null) {
            return yaVar;
        }
        ya d10 = d();
        this.f6956c = d10;
        return d10;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return qc.a((Map) this);
    }

    public static cb a(Map map) {
        if ((map instanceof cb) && !(map instanceof SortedMap)) {
            cb cbVar = (cb) map;
            if (!cbVar.f()) {
                return cbVar;
            }
        }
        return a((Iterable) map.entrySet());
    }

    public static a a() {
        return new a();
    }
}
