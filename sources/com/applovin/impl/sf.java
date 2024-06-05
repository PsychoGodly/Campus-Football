package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class sf {

    private static class a extends e {

        /* renamed from: g  reason: collision with root package name */
        transient Supplier f12110g;

        a(Map map, Supplier supplier) {
            super(map);
            this.f12110g = (Supplier) Preconditions.checkNotNull(supplier);
        }

        /* access modifiers changed from: package-private */
        public Map b() {
            return h();
        }

        /* access modifiers changed from: package-private */
        public Set c() {
            return i();
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public List g() {
            return (List) this.f12110g.get();
        }
    }

    static boolean a(pf pfVar, Object obj) {
        if (obj == pfVar) {
            return true;
        }
        if (obj instanceof pf) {
            return pfVar.a().equals(((pf) obj).a());
        }
        return false;
    }

    public static ac a(Map map, Supplier supplier) {
        return new a(map, supplier);
    }
}
