package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class nj {

    class a extends c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Set f9997a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Set f9998b;

        /* renamed from: com.applovin.impl.nj$a$a  reason: collision with other inner class name */
        class C0130a extends d {

            /* renamed from: c  reason: collision with root package name */
            final Iterator f9999c;

            C0130a() {
                this.f9999c = a.this.f9997a.iterator();
            }

            /* access modifiers changed from: protected */
            public Object a() {
                while (this.f9999c.hasNext()) {
                    Object next = this.f9999c.next();
                    if (a.this.f9998b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super((mj) null);
            this.f9997a = set;
            this.f9998b = set2;
        }

        public boolean contains(Object obj) {
            return this.f9997a.contains(obj) && this.f9998b.contains(obj);
        }

        public boolean containsAll(Collection collection) {
            return this.f9997a.containsAll(collection) && this.f9998b.containsAll(collection);
        }

        public boolean isEmpty() {
            return Collections.disjoint(this.f9998b, this.f9997a);
        }

        public int size() {
            int i10 = 0;
            for (Object contains : this.f9997a) {
                if (this.f9998b.contains(contains)) {
                    i10++;
                }
            }
            return i10;
        }

        public qp iterator() {
            return new C0130a();
        }
    }

    static abstract class b extends AbstractSet {
        b() {
        }

        public boolean removeAll(Collection collection) {
            return nj.a((Set) this, collection);
        }

        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) Preconditions.checkNotNull(collection));
        }
    }

    public static abstract class c extends AbstractSet {
        private c() {
        }

        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            throw new UnsupportedOperationException();
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ c(mj mjVar) {
            this();
        }
    }

    static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static Set b() {
        return Collections.newSetFromMap(qc.b());
    }

    static int a(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static c a(Set set, Set set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new a(set, set2);
    }

    static boolean a(Set set, Collection collection) {
        Preconditions.checkNotNull(collection);
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return a(set, collection.iterator());
        }
        return sb.a(set.iterator(), collection);
    }

    static boolean a(Set set, Iterator it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }

    public static HashSet a() {
        return new HashSet();
    }

    public static HashSet a(int i10) {
        return new HashSet(qc.a(i10));
    }
}
