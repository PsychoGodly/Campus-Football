package com.applovin.impl;

import java.util.List;
import java.util.Map;

public class v0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f12647a;

    /* renamed from: b  reason: collision with root package name */
    private final List f12648b;

    public v0(Map map, List list) {
        this.f12647a = map;
        this.f12648b = list;
    }

    /* access modifiers changed from: protected */
    public boolean a(Object obj) {
        return obj instanceof v0;
    }

    public List b() {
        return this.f12648b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (!v0Var.a(this)) {
            return false;
        }
        Map a10 = a();
        Map a11 = v0Var.a();
        if (a10 != null ? !a10.equals(a11) : a11 != null) {
            return false;
        }
        List b10 = b();
        List b11 = v0Var.b();
        return b10 != null ? b10.equals(b11) : b11 == null;
    }

    public int hashCode() {
        Map a10 = a();
        int i10 = 43;
        int hashCode = a10 == null ? 43 : a10.hashCode();
        List b10 = b();
        int i11 = (hashCode + 59) * 59;
        if (b10 != null) {
            i10 = b10.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + ")";
    }

    public Map a() {
        return this.f12647a;
    }
}
