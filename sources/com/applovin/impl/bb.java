package com.applovin.impl;

import com.applovin.impl.cb;
import com.applovin.impl.db;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

public class bb extends db implements ac {

    public static final class a extends db.b {
        /* renamed from: b */
        public a a(Object obj, Iterable iterable) {
            super.a(obj, iterable);
            return this;
        }

        public bb c() {
            return (bb) super.a();
        }

        public a b(Object obj, Object... objArr) {
            super.a(obj, objArr);
            return this;
        }
    }

    bb(cb cbVar, int i10) {
        super(cbVar, i10);
    }

    static bb a(Collection collection, Comparator comparator) {
        ab abVar;
        if (collection.isEmpty()) {
            return l();
        }
        cb.a aVar = new cb.a(collection.size());
        int i10 = 0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                abVar = ab.a(collection2);
            } else {
                abVar = ab.a(comparator, (Iterable) collection2);
            }
            if (!abVar.isEmpty()) {
                aVar.a(key, abVar);
                i10 += abVar.size();
            }
        }
        return new bb(aVar.a(), i10);
    }

    public static a k() {
        return new a();
    }

    public static bb l() {
        return p7.f10592g;
    }

    public ab b(Object obj) {
        ab abVar = (ab) this.f7217d.get(obj);
        return abVar == null ? ab.h() : abVar;
    }
}
