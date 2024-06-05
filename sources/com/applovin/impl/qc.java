package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.nj;
import com.google.android.gms.common.api.a;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class qc {

    class a extends zo {
        a(Iterator it) {
            super(it);
        }

        /* access modifiers changed from: package-private */
        public Object a(Map.Entry entry) {
            return entry.getValue();
        }
    }

    private enum b implements Function {
        KEY {
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        },
        VALUE {
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        };
    }

    static abstract class c extends nj.b {
        c() {
        }

        /* access modifiers changed from: package-private */
        public abstract Map a();

        public void clear() {
            a().clear();
        }

        public abstract boolean contains(Object obj);

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return nj.a((Set) this, collection.iterator());
            }
        }

        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a10 = nj.a(collection.size());
                for (Object next : collection) {
                    if (contains(next)) {
                        a10.add(((Map.Entry) next).getKey());
                    }
                }
                return a().keySet().retainAll(a10);
            }
        }

        public int size() {
            return a().size();
        }
    }

    static class d extends nj.b {

        /* renamed from: a  reason: collision with root package name */
        final Map f10908a;

        d(Map map) {
            this.f10908a = (Map) Preconditions.checkNotNull(map);
        }

        /* access modifiers changed from: package-private */
        public Map a() {
            return this.f10908a;
        }

        public boolean contains(Object obj) {
            return a().containsKey(obj);
        }

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public int size() {
            return a().size();
        }
    }

    static class e extends AbstractCollection {

        /* renamed from: a  reason: collision with root package name */
        final Map f10909a;

        e(Map map) {
            this.f10909a = (Map) Preconditions.checkNotNull(map);
        }

        /* access modifiers changed from: package-private */
        public final Map a() {
            return this.f10909a;
        }

        public void clear() {
            a().clear();
        }

        public boolean contains(Object obj) {
            return a().containsValue(obj);
        }

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public Iterator iterator() {
            return qc.a(a().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : a().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a10 = nj.a();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a10.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(a10);
            }
        }

        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a10 = nj.a();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a10.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(a10);
            }
        }

        public int size() {
            return a().size();
        }
    }

    static abstract class f extends AbstractMap {

        /* renamed from: a  reason: collision with root package name */
        private transient Set f10910a;

        /* renamed from: b  reason: collision with root package name */
        private transient Collection f10911b;

        f() {
        }

        /* access modifiers changed from: package-private */
        public abstract Set a();

        /* access modifiers changed from: package-private */
        public Collection b() {
            return new e(this);
        }

        public Set entrySet() {
            Set set = this.f10910a;
            if (set != null) {
                return set;
            }
            Set a10 = a();
            this.f10910a = a10;
            return a10;
        }

        public Collection values() {
            Collection collection = this.f10911b;
            if (collection != null) {
                return collection;
            }
            Collection b10 = b();
            this.f10911b = b10;
            return b10;
        }
    }

    static int a(int i10) {
        if (i10 >= 3) {
            return i10 < 1073741824 ? (int) ((((float) i10) / 0.75f) + 1.0f) : a.e.API_PRIORITY_OTHER;
        }
        n3.a(i10, "expectedSize");
        return i10 + 1;
    }

    static boolean b(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static Object c(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static Object d(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static IdentityHashMap b() {
        return new IdentityHashMap();
    }

    static Function c() {
        return b.VALUE;
    }

    static String a(Map map) {
        StringBuilder a10 = o3.a(map.size());
        a10.append('{');
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z10) {
                a10.append(", ");
            }
            z10 = false;
            a10.append(entry.getKey());
            a10.append('=');
            a10.append(entry.getValue());
        }
        a10.append('}');
        return a10.toString();
    }

    static Function a() {
        return b.KEY;
    }

    static Iterator a(Iterator it) {
        return new a(it);
    }

    public static Map.Entry a(Object obj, Object obj2) {
        return new za(obj, obj2);
    }
}
