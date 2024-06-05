package com.applovin.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class db extends a2 implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    final transient cb f7217d;

    /* renamed from: f  reason: collision with root package name */
    final transient int f7218f;

    class a extends qp {

        /* renamed from: a  reason: collision with root package name */
        Iterator f7219a;

        /* renamed from: b  reason: collision with root package name */
        Iterator f7220b = sb.a();

        a() {
            this.f7219a = db.this.f7217d.values().iterator();
        }

        public boolean hasNext() {
            return this.f7220b.hasNext() || this.f7219a.hasNext();
        }

        public Object next() {
            if (!this.f7220b.hasNext()) {
                this.f7220b = ((ya) this.f7219a.next()).iterator();
            }
            return this.f7220b.next();
        }
    }

    private static final class c extends ya {

        /* renamed from: b  reason: collision with root package name */
        private final transient db f7225b;

        c(db dbVar) {
            this.f7225b = dbVar;
        }

        /* access modifiers changed from: package-private */
        public int a(Object[] objArr, int i10) {
            qp it = this.f7225b.f7217d.values().iterator();
            while (it.hasNext()) {
                i10 = ((ya) it.next()).a(objArr, i10);
            }
            return i10;
        }

        public boolean contains(Object obj) {
            return this.f7225b.a(obj);
        }

        public qp iterator() {
            return this.f7225b.f();
        }

        public int size() {
            return this.f7225b.size();
        }
    }

    db(cb cbVar, int i10) {
        this.f7217d = cbVar;
        this.f7218f = i10;
    }

    /* access modifiers changed from: package-private */
    public Map b() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: package-private */
    public Set c() {
        throw new AssertionError("unreachable");
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: g */
    public cb a() {
        return this.f7217d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public ya d() {
        return new c(this);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public qp f() {
        return new a();
    }

    /* renamed from: j */
    public ya values() {
        return (ya) super.values();
    }

    public boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f7218f;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public boolean a(Object obj) {
        return obj != null && super.a(obj);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        Map f7222a = jh.a();

        /* renamed from: b  reason: collision with root package name */
        Comparator f7223b;

        /* renamed from: c  reason: collision with root package name */
        Comparator f7224c;

        public db a() {
            Collection entrySet = this.f7222a.entrySet();
            Comparator comparator = this.f7223b;
            if (comparator != null) {
                entrySet = tg.a(comparator).b().a((Iterable) entrySet);
            }
            return bb.a(entrySet, this.f7224c);
        }

        /* access modifiers changed from: package-private */
        public Collection b() {
            return new ArrayList();
        }

        public b a(Object obj, Iterable iterable) {
            if (obj != null) {
                Collection collection = (Collection) this.f7222a.get(obj);
                if (collection != null) {
                    for (Object next : iterable) {
                        n3.a(obj, next);
                        collection.add(next);
                    }
                    return this;
                }
                Iterator it = iterable.iterator();
                if (!it.hasNext()) {
                    return this;
                }
                Collection b10 = b();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    n3.a(obj, next2);
                    b10.add(next2);
                }
                this.f7222a.put(obj, b10);
                return this;
            }
            throw new NullPointerException("null key in entry: null=" + rb.d(iterable));
        }

        public b a(Object obj, Object... objArr) {
            return a(obj, (Iterable) Arrays.asList(objArr));
        }
    }
}
