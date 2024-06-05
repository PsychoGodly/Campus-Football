package com.applovin.impl;

import com.applovin.impl.f;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

abstract class e extends f implements ac {
    protected e(Map map) {
        super(map);
    }

    public Map a() {
        return super.a();
    }

    /* access modifiers changed from: package-private */
    public Collection c(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    /* access modifiers changed from: package-private */
    public Collection a(Object obj, Collection collection) {
        return a(obj, (List) collection, (f.j) null);
    }
}
