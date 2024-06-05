package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import java.util.ArrayList;
import java.util.List;

public class dq {

    /* renamed from: a  reason: collision with root package name */
    private final List f7319a;

    private dq(List list) {
        this.f7319a = list;
    }

    public static dq a(fs fsVar, dq dqVar, fq fqVar, k kVar) {
        List list;
        if (dqVar != null) {
            try {
                list = dqVar.a();
            } catch (Throwable th) {
                kVar.L();
                if (t.a()) {
                    kVar.L().a("VastAdVerifications", "Error occurred while initializing", th);
                }
                kVar.B().a("VastAdVerifications", th);
                return null;
            }
        } else {
            list = new ArrayList();
        }
        for (fs a10 : fsVar.a("Verification")) {
            cq a11 = cq.a(a10, fqVar, kVar);
            if (a11 != null) {
                list.add(a11);
            }
        }
        return new dq(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq)) {
            return false;
        }
        return this.f7319a.equals(((dq) obj).f7319a);
    }

    public int hashCode() {
        return this.f7319a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f7319a + '\'' + '}';
    }

    public List a() {
        return this.f7319a;
    }
}
