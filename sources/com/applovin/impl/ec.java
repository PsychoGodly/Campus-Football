package com.applovin.impl;

import java.util.Collections;
import java.util.List;

public class ec implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    private final String f7408a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7409b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7410c;

    /* renamed from: d  reason: collision with root package name */
    private final fe f7411d;

    ec(String str, String str2, boolean z10, fe feVar) {
        this.f7408a = str;
        this.f7409b = str2;
        this.f7410c = z10;
        this.f7411d = feVar;
    }

    /* renamed from: a */
    public int compareTo(ec ecVar) {
        return this.f7409b.compareToIgnoreCase(ecVar.f7409b);
    }

    public List b() {
        List l10 = this.f7411d.l();
        if (l10 == null || l10.isEmpty()) {
            return Collections.singletonList(this.f7408a);
        }
        return l10;
    }

    public String c() {
        return this.f7408a;
    }

    public fe d() {
        return this.f7411d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ec ecVar = (ec) obj;
        String str = this.f7408a;
        if (str == null ? ecVar.f7408a != null : !str.equals(ecVar.f7408a)) {
            return false;
        }
        String str2 = this.f7409b;
        if (str2 == null ? ecVar.f7409b != null : !str2.equals(ecVar.f7409b)) {
            return false;
        }
        if (this.f7410c == ecVar.f7410c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7408a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7409b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode + i10) * 31) + (this.f7410c ? 1 : 0);
    }

    public String a() {
        return this.f7409b;
    }
}
