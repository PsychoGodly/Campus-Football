package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;

public class kq {

    /* renamed from: a  reason: collision with root package name */
    private String f9087a;

    /* renamed from: b  reason: collision with root package name */
    private String f9088b;

    private kq() {
    }

    public static kq a(fs fsVar, kq kqVar, k kVar) {
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (kVar != null) {
            if (kqVar == null) {
                try {
                    kqVar = new kq();
                } catch (Throwable th) {
                    kVar.L();
                    if (t.a()) {
                        kVar.L().a("VastSystemInfo", "Error occurred while initializing", th);
                    }
                    kVar.B().a("VastSystemInfo", th);
                    return null;
                }
            }
            if (!StringUtils.isValidString(kqVar.f9087a)) {
                String d10 = fsVar.d();
                if (StringUtils.isValidString(d10)) {
                    kqVar.f9087a = d10;
                }
            }
            if (!StringUtils.isValidString(kqVar.f9088b)) {
                String str = (String) fsVar.a().get("version");
                if (StringUtils.isValidString(str)) {
                    kqVar.f9088b = str;
                }
            }
            return kqVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq)) {
            return false;
        }
        kq kqVar = (kq) obj;
        String str = this.f9087a;
        if (str == null ? kqVar.f9087a != null : !str.equals(kqVar.f9087a)) {
            return false;
        }
        String str2 = this.f9088b;
        String str3 = kqVar.f9088b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9087a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9088b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.f9087a + '\'' + ", version='" + this.f9088b + '\'' + '}';
    }
}
