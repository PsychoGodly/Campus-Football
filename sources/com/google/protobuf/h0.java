package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField */
public class h0 extends i0 {

    /* renamed from: f  reason: collision with root package name */
    private final v0 f27033f;

    /* compiled from: LazyField */
    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a  reason: collision with root package name */
        private Map.Entry<K, h0> f27034a;

        public h0 a() {
            return this.f27034a.getValue();
        }

        public K getKey() {
            return this.f27034a.getKey();
        }

        public Object getValue() {
            h0 value = this.f27034a.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof v0) {
                return this.f27034a.getValue().d((v0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, h0> entry) {
            this.f27034a = entry;
        }
    }

    /* compiled from: LazyField */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f27035a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f27035a = it;
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f27035a.next();
            return next.getValue() instanceof h0 ? new b(next) : next;
        }

        public boolean hasNext() {
            return this.f27035a.hasNext();
        }

        public void remove() {
            this.f27035a.remove();
        }
    }

    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public v0 f() {
        return c(this.f27033f);
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
