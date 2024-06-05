package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;

public class iq {

    /* renamed from: a  reason: collision with root package name */
    private final String f8587a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8588b;

    private iq(String str, String str2) {
        this.f8587a = str;
        this.f8588b = str2;
    }

    public static iq a(fs fsVar, k kVar) {
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (kVar != null) {
            try {
                return new iq((String) fsVar.a().get("apiFramework"), fsVar.d());
            } catch (Throwable th) {
                kVar.L();
                if (t.a()) {
                    kVar.L().a("VastJavaScriptResource", "Error occurred while initializing", th);
                }
                kVar.B().a("VastJavaScriptResource", th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    public String b() {
        return this.f8588b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        iq iqVar = (iq) obj;
        String str = this.f8587a;
        if (str == null ? iqVar.f8587a != null : !str.equals(iqVar.f8587a)) {
            return false;
        }
        String str2 = this.f8588b;
        String str3 = iqVar.f8588b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8587a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f8588b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "VastJavaScriptResource{apiFramework='" + this.f8587a + '\'' + ", javascriptResourceUrl='" + this.f8588b + '\'' + '}';
    }

    public String a() {
        return this.f8587a;
    }
}
