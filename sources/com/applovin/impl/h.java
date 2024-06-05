package com.applovin.impl;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class h implements pf {

    /* renamed from: a  reason: collision with root package name */
    private transient Set f8157a;

    /* renamed from: b  reason: collision with root package name */
    private transient Collection f8158b;

    /* renamed from: c  reason: collision with root package name */
    private transient Map f8159c;

    class a extends AbstractCollection {
        a() {
        }

        public void clear() {
            h.this.clear();
        }

        public boolean contains(Object obj) {
            return h.this.a(obj);
        }

        public Iterator iterator() {
            return h.this.f();
        }

        public int size() {
            return h.this.size();
        }
    }

    h() {
    }

    public Map a() {
        Map map = this.f8159c;
        if (map != null) {
            return map;
        }
        Map b10 = b();
        this.f8159c = b10;
        return b10;
    }

    /* access modifiers changed from: package-private */
    public abstract Map b();

    /* access modifiers changed from: package-private */
    public abstract Set c();

    /* access modifiers changed from: package-private */
    public abstract Collection d();

    public Set e() {
        Set set = this.f8157a;
        if (set != null) {
            return set;
        }
        Set c10 = c();
        this.f8157a = c10;
        return c10;
    }

    public boolean equals(Object obj) {
        return sf.a((pf) this, obj);
    }

    /* access modifiers changed from: package-private */
    public abstract Iterator f();

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }

    public Collection values() {
        Collection collection = this.f8158b;
        if (collection != null) {
            return collection;
        }
        Collection d10 = d();
        this.f8158b = d10;
        return d10;
    }

    public boolean a(Object obj) {
        for (Collection contains : a().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
