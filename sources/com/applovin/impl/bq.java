package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxReward;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class bq extends com.applovin.impl.sdk.ad.b {

    /* renamed from: l  reason: collision with root package name */
    private final String f6753l;

    /* renamed from: m  reason: collision with root package name */
    private final String f6754m;

    /* renamed from: n  reason: collision with root package name */
    private final kq f6755n;

    /* renamed from: o  reason: collision with root package name */
    private final long f6756o;

    /* renamed from: p  reason: collision with root package name */
    private final oq f6757p;

    /* renamed from: q  reason: collision with root package name */
    private final eq f6758q;

    /* renamed from: r  reason: collision with root package name */
    private final String f6759r;

    /* renamed from: s  reason: collision with root package name */
    private final dq f6760s;

    /* renamed from: t  reason: collision with root package name */
    private final og f6761t;

    /* renamed from: u  reason: collision with root package name */
    private final Set f6762u;

    /* renamed from: v  reason: collision with root package name */
    private final Set f6763v;

    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f6764a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public JSONObject f6765b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public k f6766c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public long f6767d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f6768e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f6769f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public kq f6770g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public oq f6771h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public eq f6772i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public dq f6773j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public Set f6774k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public Set f6775l;

        public b a(String str) {
            this.f6769f = str;
            return this;
        }

        public b b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f6765b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }

        public b a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f6764a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public b b(Set set) {
            this.f6774k = set;
            return this;
        }

        public b a(dq dqVar) {
            this.f6773j = dqVar;
            return this;
        }

        public b b(String str) {
            this.f6768e = str;
            return this;
        }

        public b a(eq eqVar) {
            this.f6772i = eqVar;
            return this;
        }

        public b a(long j10) {
            this.f6767d = j10;
            return this;
        }

        public b a(Set set) {
            this.f6775l = set;
            return this;
        }

        public b a(k kVar) {
            if (kVar != null) {
                this.f6766c = kVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public b a(kq kqVar) {
            this.f6770g = kqVar;
            return this;
        }

        public b a(oq oqVar) {
            this.f6771h = oqVar;
            return this;
        }

        public bq a() {
            return new bq(this);
        }
    }

    public enum c {
        COMPANION_AD,
        VIDEO
    }

    public enum d {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    private bq(b bVar) {
        super(bVar.f6764a, bVar.f6765b, bVar.f6766c);
        this.f6753l = bVar.f6768e;
        this.f6755n = bVar.f6770g;
        this.f6754m = bVar.f6769f;
        this.f6757p = bVar.f6771h;
        this.f6758q = bVar.f6772i;
        this.f6760s = bVar.f6773j;
        this.f6762u = bVar.f6774k;
        this.f6763v = bVar.f6775l;
        this.f6761t = new og(this);
        Uri s02 = s0();
        if (s02 != null) {
            this.f6759r = s02.toString();
        } else {
            this.f6759r = MaxReward.DEFAULT_LABEL;
        }
        this.f6756o = bVar.f6767d;
    }

    private Set a(c cVar, String[] strArr) {
        eq eqVar;
        oq oqVar;
        if (strArr == null || strArr.length <= 0) {
            return Collections.emptySet();
        }
        Map map = null;
        if (cVar == c.VIDEO && (oqVar = this.f6757p) != null) {
            map = oqVar.d();
        } else if (cVar == c.COMPANION_AD && (eqVar = this.f6758q) != null) {
            map = eqVar.c();
        }
        HashSet hashSet = new HashSet();
        if (map != null && !map.isEmpty()) {
            for (String str : strArr) {
                if (map.containsKey(str)) {
                    hashSet.addAll((Collection) map.get(str));
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private Set f1() {
        eq eqVar = this.f6758q;
        if (eqVar != null) {
            return eqVar.a();
        }
        return Collections.emptySet();
    }

    private String j1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", (String) null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    private Set n1() {
        oq oqVar = this.f6757p;
        if (oqVar != null) {
            return oqVar.a();
        }
        return Collections.emptySet();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List w(ql qlVar) {
        return zp.a(qlVar.a("vimp_urls", new JSONObject()), getClCode(), (Map) null, j1(), Q(), Q0(), this.sdk);
    }

    public List F() {
        List a10;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (List) qlVar.a((n.a) new nv(this));
        }
        synchronized (this.adObjectLock) {
            a10 = zp.a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), (Map) null, j1(), Q(), Q0(), this.sdk);
        }
        return a10;
    }

    public boolean F0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && j() != null;
    }

    public boolean G0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    public void J0() {
    }

    public String P() {
        return this.f6759r;
    }

    public void b(String str) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.b("html_template", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    public dq d1() {
        return this.f6760s;
    }

    public eq e1() {
        return this.f6758q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq) || !super.equals(obj)) {
            return false;
        }
        bq bqVar = (bq) obj;
        String str = this.f6753l;
        if (str == null ? bqVar.f6753l != null : !str.equals(bqVar.f6753l)) {
            return false;
        }
        String str2 = this.f6754m;
        if (str2 == null ? bqVar.f6754m != null : !str2.equals(bqVar.f6754m)) {
            return false;
        }
        kq kqVar = this.f6755n;
        if (kqVar == null ? bqVar.f6755n != null : !kqVar.equals(bqVar.f6755n)) {
            return false;
        }
        oq oqVar = this.f6757p;
        if (oqVar == null ? bqVar.f6757p != null : !oqVar.equals(bqVar.f6757p)) {
            return false;
        }
        eq eqVar = this.f6758q;
        if (eqVar == null ? bqVar.f6758q != null : !eqVar.equals(bqVar.f6758q)) {
            return false;
        }
        dq dqVar = this.f6760s;
        if (dqVar == null ? bqVar.f6760s != null : !dqVar.equals(bqVar.f6760s)) {
            return false;
        }
        Set set = this.f6762u;
        if (set == null ? bqVar.f6762u != null : !set.equals(bqVar.f6762u)) {
            return false;
        }
        Set set2 = this.f6763v;
        Set set3 = bqVar.f6763v;
        if (set2 != null) {
            return set2.equals(set3);
        }
        if (set3 == null) {
            return true;
        }
        return false;
    }

    public String g1() {
        return getStringFromAdObject("html_template", MaxReward.DEFAULT_LABEL);
    }

    public long getCreatedAtMillis() {
        return this.f6756o;
    }

    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    public Uri h1() {
        String stringFromAdObject = getStringFromAdObject("html_template_url", (String) null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean hasVideoUrl() {
        List f10;
        oq oqVar = this.f6757p;
        if (oqVar == null || (f10 = oqVar.f()) == null || f10.size() <= 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f6753l;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6754m;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        kq kqVar = this.f6755n;
        int hashCode4 = (hashCode3 + (kqVar != null ? kqVar.hashCode() : 0)) * 31;
        oq oqVar = this.f6757p;
        int hashCode5 = (hashCode4 + (oqVar != null ? oqVar.hashCode() : 0)) * 31;
        eq eqVar = this.f6758q;
        int hashCode6 = (hashCode5 + (eqVar != null ? eqVar.hashCode() : 0)) * 31;
        dq dqVar = this.f6760s;
        int hashCode7 = (hashCode6 + (dqVar != null ? dqVar.hashCode() : 0)) * 31;
        Set set = this.f6762u;
        int hashCode8 = (hashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set set2 = this.f6763v;
        if (set2 != null) {
            i10 = set2.hashCode();
        }
        return hashCode8 + i10;
    }

    public c i1() {
        if ("companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad"))) {
            return c.COMPANION_AD;
        }
        return c.VIDEO;
    }

    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f6760s != null;
    }

    public Uri j() {
        oq oqVar = this.f6757p;
        if (oqVar != null) {
            return oqVar.b();
        }
        return null;
    }

    public Uri j0() {
        return j();
    }

    public hq k1() {
        oq oqVar = this.f6757p;
        if (oqVar != null) {
            return oqVar.e();
        }
        return null;
    }

    public long l1() {
        return getLongFromAdObject("real_close_delay", 0);
    }

    public kq m1() {
        return this.f6755n;
    }

    public oq o1() {
        return this.f6757p;
    }

    public pq p1() {
        Long f10 = c4.f(this.sdk);
        return this.f6757p.a(f10 != null ? f10.longValue() : 0);
    }

    public boolean q1() {
        return k1() != null;
    }

    public boolean r1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    public Uri s0() {
        pq p12 = p1();
        if (p12 != null) {
            return p12.d();
        }
        return null;
    }

    public void s1() {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            qlVar.c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    public boolean t1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public String toString() {
        return "VastAd{title='" + this.f6753l + '\'' + ", adDescription='" + this.f6754m + '\'' + ", systemInfo=" + this.f6755n + ", videoCreative=" + this.f6757p + ", companionAd=" + this.f6758q + ", adVerifications=" + this.f6760s + ", impressionTrackers=" + this.f6762u + ", errorTrackers=" + this.f6763v + '}';
    }

    public boolean u1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public boolean v1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public boolean w1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    public boolean x1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    public og getAdEventTracker() {
        return this.f6761t;
    }

    public Set a(d dVar, String str) {
        return a(dVar, new String[]{str});
    }

    public Set a(d dVar, String[] strArr) {
        this.sdk.L();
        if (t.a()) {
            t L = this.sdk.L();
            L.a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.f6762u;
        }
        if (dVar == d.VIDEO_CLICK) {
            return n1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return f1();
        }
        if (dVar == d.VIDEO) {
            return a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return k1().a();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return k1().e();
        }
        if (dVar == d.ERROR) {
            return this.f6763v;
        }
        this.sdk.L();
        if (t.a()) {
            t L2 = this.sdk.L();
            L2.b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.emptySet();
    }
}
