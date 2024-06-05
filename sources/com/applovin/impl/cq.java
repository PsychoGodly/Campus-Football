package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class cq {

    /* renamed from: a  reason: collision with root package name */
    private final String f7030a;

    /* renamed from: b  reason: collision with root package name */
    private final List f7031b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7032c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f7033d;

    private cq(String str, List list, String str2, Set set) {
        this.f7030a = str;
        this.f7031b = list;
        this.f7032c = str2;
        this.f7033d = set;
    }

    public static cq a(fs fsVar, fq fqVar, k kVar) {
        try {
            String str = (String) fsVar.a().get("vendor");
            fs b10 = fsVar.b("VerificationParameters");
            String d10 = b10 != null ? b10.d() : null;
            List<fs> a10 = fsVar.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(a10.size());
            for (fs a11 : a10) {
                iq a12 = iq.a(a11, kVar);
                if (a12 != null) {
                    arrayList.add(a12);
                }
            }
            HashMap hashMap = new HashMap();
            nq.a(fsVar, (Map) hashMap, fqVar, kVar);
            return new cq(str, arrayList, d10, (Set) hashMap.get("verificationNotExecuted"));
        } catch (Throwable th) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("VastAdVerification", "Error occurred while initializing", th);
            }
            kVar.B().a("VastAdVerification", th);
            return null;
        }
    }

    public List b() {
        return this.f7031b;
    }

    public String c() {
        return this.f7030a;
    }

    public String d() {
        return this.f7032c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cq cqVar = (cq) obj;
        String str = this.f7030a;
        if (str == null ? cqVar.f7030a != null : !str.equals(cqVar.f7030a)) {
            return false;
        }
        List list = this.f7031b;
        if (list == null ? cqVar.f7031b != null : !list.equals(cqVar.f7031b)) {
            return false;
        }
        String str2 = this.f7032c;
        if (str2 == null ? cqVar.f7032c != null : !str2.equals(cqVar.f7032c)) {
            return false;
        }
        Set set = this.f7033d;
        Set set2 = cqVar.f7033d;
        if (set != null) {
            return set.equals(set2);
        }
        if (set2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7030a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f7031b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f7032c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.f7033d;
        if (set != null) {
            i10 = set.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f7030a + '\'' + "javascriptResources='" + this.f7031b + '\'' + "verificationParameters='" + this.f7032c + '\'' + "errorEventTrackers='" + this.f7033d + '\'' + '}';
    }

    public Set a() {
        return this.f7033d;
    }
}
