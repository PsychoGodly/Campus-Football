package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class s4 implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    private final Object f11292a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map f11293b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Set f11294c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private List f11295d = Collections.emptyList();

    public void a(Object obj) {
        synchronized (this.f11292a) {
            ArrayList arrayList = new ArrayList(this.f11295d);
            arrayList.add(obj);
            this.f11295d = Collections.unmodifiableList(arrayList);
            Integer num = (Integer) this.f11293b.get(obj);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f11294c);
                hashSet.add(obj);
                this.f11294c = Collections.unmodifiableSet(hashSet);
            }
            Map map = this.f11293b;
            int i10 = 1;
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            map.put(obj, Integer.valueOf(i10));
        }
    }

    public int b(Object obj) {
        int intValue;
        synchronized (this.f11292a) {
            intValue = this.f11293b.containsKey(obj) ? ((Integer) this.f11293b.get(obj)).intValue() : 0;
        }
        return intValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f11292a
            monitor-enter(r0)
            java.util.Map r1 = r4.f11293b     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x000f:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x004c }
            java.util.List r3 = r4.f11295d     // Catch:{ all -> 0x004c }
            r2.<init>(r3)     // Catch:{ all -> 0x004c }
            r2.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x004c }
            r4.f11295d = r2     // Catch:{ all -> 0x004c }
            int r2 = r1.intValue()     // Catch:{ all -> 0x004c }
            r3 = 1
            if (r2 != r3) goto L_0x003c
            java.util.Map r1 = r4.f11293b     // Catch:{ all -> 0x004c }
            r1.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x004c }
            java.util.Set r2 = r4.f11294c     // Catch:{ all -> 0x004c }
            r1.<init>(r2)     // Catch:{ all -> 0x004c }
            r1.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r1)     // Catch:{ all -> 0x004c }
            r4.f11294c = r5     // Catch:{ all -> 0x004c }
            goto L_0x004a
        L_0x003c:
            java.util.Map r2 = r4.f11293b     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            int r1 = r1 - r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x004c }
            r2.put(r5, r1)     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x004c:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.s4.c(java.lang.Object):void");
    }

    public Iterator iterator() {
        Iterator it;
        synchronized (this.f11292a) {
            it = this.f11295d.iterator();
        }
        return it;
    }

    public Set a() {
        Set set;
        synchronized (this.f11292a) {
            set = this.f11294c;
        }
        return set;
    }
}
