package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.ya;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class ab extends ya implements List, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final rp f6363b = new b(ii.f8550f, 0);

    public static final class a extends ya.a {
        public a() {
            this(4);
        }

        public ab a() {
            this.f13560c = true;
            return ab.b(this.f13558a, this.f13559b);
        }

        public a b(Object obj) {
            super.a(obj);
            return this;
        }

        a(int i10) {
            super(i10);
        }
    }

    static class b extends c {

        /* renamed from: c  reason: collision with root package name */
        private final ab f6364c;

        b(ab abVar, int i10) {
            super(abVar.size(), i10);
            this.f6364c = abVar;
        }

        /* access modifiers changed from: protected */
        public Object a(int i10) {
            return this.f6364c.get(i10);
        }
    }

    class c extends ab {

        /* renamed from: c  reason: collision with root package name */
        final transient int f6365c;

        /* renamed from: d  reason: collision with root package name */
        final transient int f6366d;

        c(int i10, int i11) {
            this.f6365c = i10;
            this.f6366d = i11;
        }

        /* renamed from: a */
        public ab subList(int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11, this.f6366d);
            ab abVar = ab.this;
            int i12 = this.f6365c;
            return abVar.subList(i10 + i12, i11 + i12);
        }

        /* access modifiers changed from: package-private */
        public Object[] b() {
            return ab.this.b();
        }

        /* access modifiers changed from: package-private */
        public int c() {
            return ab.this.d() + this.f6365c + this.f6366d;
        }

        /* access modifiers changed from: package-private */
        public int d() {
            return ab.this.d() + this.f6365c;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return true;
        }

        public Object get(int i10) {
            Preconditions.checkElementIndex(i10, this.f6366d);
            return ab.this.get(i10 + this.f6365c);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ab.super.iterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ab.super.listIterator();
        }

        public int size() {
            return this.f6366d;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return ab.super.listIterator(i10);
        }
    }

    ab() {
    }

    static ab a(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    static ab b(Object[] objArr, int i10) {
        if (i10 == 0) {
            return h();
        }
        return new ii(objArr, i10);
    }

    public static ab c(Object[] objArr) {
        if (objArr.length == 0) {
            return h();
        }
        return b((Object[]) objArr.clone());
    }

    public static a f() {
        return new a();
    }

    public static ab h() {
        return ii.f8550f;
    }

    public final ab a() {
        return this;
    }

    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj) {
        return dc.a(this, obj);
    }

    /* renamed from: g */
    public rp listIterator() {
        return listIterator(0);
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return dc.b(this, obj);
    }

    public qp iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return dc.d(this, obj);
    }

    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    private static ab b(Object... objArr) {
        return a(cg.a(objArr));
    }

    public static ab a(Collection collection) {
        if (!(collection instanceof ya)) {
            return b(collection.toArray());
        }
        ab a10 = ((ya) collection).a();
        return a10.e() ? a(a10.toArray()) : a10;
    }

    /* access modifiers changed from: package-private */
    public ab b(int i10, int i11) {
        return new c(i10, i11 - i10);
    }

    /* renamed from: a */
    public rp listIterator(int i10) {
        Preconditions.checkPositionIndex(i10, size());
        if (isEmpty()) {
            return f6363b;
        }
        return new b(this, i10);
    }

    public static ab a(Object obj) {
        return b(obj);
    }

    public static ab a(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    public static ab a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return b(obj, obj2, obj3, obj4, obj5);
    }

    public static ab a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return b(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static ab a(Comparator comparator, Iterable iterable) {
        Preconditions.checkNotNull(comparator);
        Object[] c10 = rb.c(iterable);
        cg.a(c10);
        Arrays.sort(c10, comparator);
        return a(c10);
    }

    /* renamed from: a */
    public ab subList(int i10, int i11) {
        Preconditions.checkPositionIndexes(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return h();
        }
        return b(i10, i11);
    }
}
