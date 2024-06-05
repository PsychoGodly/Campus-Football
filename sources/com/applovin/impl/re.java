package com.applovin.impl;

import java.util.HashSet;
import java.util.Set;

public class re {

    /* renamed from: b  reason: collision with root package name */
    private static final Set f11177b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public static final re f11178c = a("ar");

    /* renamed from: d  reason: collision with root package name */
    public static final re f11179d = a("ttdasi_ms");

    /* renamed from: a  reason: collision with root package name */
    private String f11180a;

    public interface a {
        Object a(Object obj);
    }

    private re(String str) {
        this.f11180a = str;
    }

    /* access modifiers changed from: protected */
    public boolean a(Object obj) {
        return obj instanceof re;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof re)) {
            return false;
        }
        re reVar = (re) obj;
        if (!reVar.a((Object) this)) {
            return false;
        }
        String a10 = a();
        String a11 = reVar.a();
        return a10 != null ? a10.equals(a11) : a11 == null;
    }

    public int hashCode() {
        String a10 = a();
        return (a10 == null ? 43 : a10.hashCode()) + 59;
    }

    public String toString() {
        return this.f11180a;
    }

    public String a() {
        return this.f11180a;
    }

    private static re a(String str) {
        Set set = f11177b;
        if (!set.contains(str)) {
            set.add(str);
            return new re(str);
        }
        throw new IllegalArgumentException("Key has already been used: " + str);
    }
}
