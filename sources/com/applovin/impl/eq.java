package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class eq {

    /* renamed from: a  reason: collision with root package name */
    private int f7499a;

    /* renamed from: b  reason: collision with root package name */
    private int f7500b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f7501c;

    /* renamed from: d  reason: collision with root package name */
    private jq f7502d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f7503e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Map f7504f = new HashMap();

    private eq() {
    }

    public static eq a(fs fsVar, eq eqVar, fq fqVar, k kVar) {
        fs c10;
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (kVar != null) {
            if (eqVar == null) {
                try {
                    eqVar = new eq();
                } catch (Throwable th) {
                    kVar.L();
                    if (t.a()) {
                        kVar.L().a("VastCompanionAd", "Error occurred while initializing", th);
                    }
                    kVar.B().a("VastCompanionAd", th);
                    return null;
                }
            }
            if (eqVar.f7499a == 0 && eqVar.f7500b == 0) {
                int parseInt = StringUtils.parseInt((String) fsVar.a().get("width"));
                int parseInt2 = StringUtils.parseInt((String) fsVar.a().get("height"));
                if (parseInt > 0 && parseInt2 > 0) {
                    eqVar.f7499a = parseInt;
                    eqVar.f7500b = parseInt2;
                }
            }
            eqVar.f7502d = jq.a(fsVar, eqVar.f7502d, kVar);
            if (eqVar.f7501c == null && (c10 = fsVar.c("CompanionClickThrough")) != null) {
                String d10 = c10.d();
                if (StringUtils.isValidString(d10)) {
                    eqVar.f7501c = Uri.parse(d10);
                }
            }
            nq.a(fsVar.a("CompanionClickTracking"), eqVar.f7503e, fqVar, kVar);
            nq.a(fsVar, eqVar.f7504f, fqVar, kVar);
            return eqVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    public Uri b() {
        return this.f7501c;
    }

    public Map c() {
        return this.f7504f;
    }

    public jq d() {
        return this.f7502d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq)) {
            return false;
        }
        eq eqVar = (eq) obj;
        if (this.f7499a != eqVar.f7499a || this.f7500b != eqVar.f7500b) {
            return false;
        }
        Uri uri = this.f7501c;
        if (uri == null ? eqVar.f7501c != null : !uri.equals(eqVar.f7501c)) {
            return false;
        }
        jq jqVar = this.f7502d;
        if (jqVar == null ? eqVar.f7502d != null : !jqVar.equals(eqVar.f7502d)) {
            return false;
        }
        Set set = this.f7503e;
        if (set == null ? eqVar.f7503e != null : !set.equals(eqVar.f7503e)) {
            return false;
        }
        Map map = this.f7504f;
        Map map2 = eqVar.f7504f;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = ((this.f7499a * 31) + this.f7500b) * 31;
        Uri uri = this.f7501c;
        int i11 = 0;
        int hashCode = (i10 + (uri != null ? uri.hashCode() : 0)) * 31;
        jq jqVar = this.f7502d;
        int hashCode2 = (hashCode + (jqVar != null ? jqVar.hashCode() : 0)) * 31;
        Set set = this.f7503e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f7504f;
        if (map != null) {
            i11 = map.hashCode();
        }
        return hashCode3 + i11;
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f7499a + ", height=" + this.f7500b + ", destinationUri=" + this.f7501c + ", nonVideoResource=" + this.f7502d + ", clickTrackers=" + this.f7503e + ", eventTrackers=" + this.f7504f + '}';
    }

    public Set a() {
        return this.f7503e;
    }
}
