package com.google.protobuf;

import com.google.protobuf.d0;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: MapFieldLite */
public final class p0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private static final p0<?, ?> f27170b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f27171a = true;

    static {
        p0<?, ?> p0Var = new p0<>();
        f27170b = p0Var;
        p0Var.k();
    }

    private p0() {
    }

    static <K, V> int a(Map<K, V> map) {
        int i10 = 0;
        for (Map.Entry next : map.entrySet()) {
            i10 += b(next.getValue()) ^ b(next.getKey());
        }
        return i10;
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return d0.d((byte[]) obj);
        }
        if (!(obj instanceof d0.c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private static void d(Map<?, ?> map) {
        for (Object next : map.keySet()) {
            d0.a(next);
            d0.a(map.get(next));
        }
    }

    public static <K, V> p0<K, V> e() {
        return f27170b;
    }

    private void f() {
        if (!j()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean g(Object obj, Object obj2) {
        if (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) {
            return obj.equals(obj2);
        }
        return Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> boolean i(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = g(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.p0.i(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        f();
        super.clear();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && i(this, (Map) obj);
    }

    public int hashCode() {
        return a(this);
    }

    public boolean j() {
        return this.f27171a;
    }

    public void k() {
        this.f27171a = false;
    }

    public void l(p0<K, V> p0Var) {
        f();
        if (!p0Var.isEmpty()) {
            putAll(p0Var);
        }
    }

    public p0<K, V> m() {
        return isEmpty() ? new p0<>() : new p0<>(this);
    }

    public V put(K k10, V v10) {
        f();
        d0.a(k10);
        d0.a(v10);
        return super.put(k10, v10);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        f();
        d(map);
        super.putAll(map);
    }

    public V remove(Object obj) {
        f();
        return super.remove(obj);
    }

    private p0(Map<K, V> map) {
        super(map);
    }
}
