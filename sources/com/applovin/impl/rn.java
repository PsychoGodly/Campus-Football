package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sn;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class rn implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f11206a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f11207b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f11208c;

    /* renamed from: d  reason: collision with root package name */
    private Integer f11209d;

    /* renamed from: e  reason: collision with root package name */
    private Integer f11210e;

    /* renamed from: f  reason: collision with root package name */
    private String f11211f;

    /* renamed from: g  reason: collision with root package name */
    private String f11212g;

    /* renamed from: h  reason: collision with root package name */
    private String f11213h;

    /* renamed from: i  reason: collision with root package name */
    private String f11214i;

    /* renamed from: j  reason: collision with root package name */
    private String f11215j;

    /* renamed from: k  reason: collision with root package name */
    private final List f11216k = new ArrayList();

    public rn(k kVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(k.k());
        this.f11207b = defaultSharedPreferences;
        this.f11206a = kVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f11208c = a(qj.f11012p.a());
        this.f11209d = a(qj.f11013q.a());
        this.f11210e = h();
        this.f11211f = (String) sj.a(qj.f11015s, (Object) null, defaultSharedPreferences, false);
        this.f11212g = (String) sj.a(qj.f11016t, (Object) null, defaultSharedPreferences, false);
        this.f11213h = (String) sj.a(qj.f11017u, (Object) null, defaultSharedPreferences, false);
        this.f11214i = (String) sj.a(qj.f11019w, (Object) null, defaultSharedPreferences, false);
        this.f11215j = (String) sj.a(qj.f11021y, (Object) null, defaultSharedPreferences, false);
        c(this.f11212g);
    }

    private void a() {
        this.f11208c = null;
        this.f11210e = null;
        this.f11211f = null;
        this.f11212g = null;
        this.f11213h = null;
        for (sn a10 : this.f11216k) {
            a10.a((Boolean) null);
        }
    }

    private Integer h() {
        String a10 = qj.f11014r.a();
        if (this.f11207b.contains(a10)) {
            Integer num = (Integer) sj.a(a10, (Object) null, Integer.class, this.f11207b, false);
            if (num == null) {
                Long l10 = (Long) sj.a(a10, (Object) null, Long.class, this.f11207b, false);
                if (l10 == null) {
                    Boolean bool = (Boolean) sj.a(a10, (Object) null, Boolean.class, this.f11207b, false);
                    if (bool != null) {
                        return Integer.valueOf(bool.booleanValue() ? 1 : 0);
                    }
                    String str = (String) sj.a(a10, (Object) null, String.class, this.f11207b, false);
                    if (str != null) {
                        if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(str) || "true".equals(str)) {
                            return 1;
                        }
                        if ("0".equals(str) || "false".equals(str)) {
                            return 0;
                        }
                        this.f11206a.L();
                        if (t.a()) {
                            t L = this.f11206a.L();
                            L.b("TcfManager", "String value (" + str + ") for " + a10 + " is invalid - setting GDPR Applies to null");
                        }
                        return null;
                    }
                } else if (l10.longValue() == 1 || l10.longValue() == 0) {
                    return Integer.valueOf(l10.intValue());
                } else {
                    this.f11206a.L();
                    if (t.a()) {
                        t L2 = this.f11206a.L();
                        L2.b("TcfManager", "Long value (" + l10 + ") for " + a10 + " is invalid - setting GDPR Applies to null");
                    }
                    return null;
                }
            } else if (num.intValue() == 1 || num.intValue() == 0) {
                return num;
            } else {
                this.f11206a.L();
                if (t.a()) {
                    t L3 = this.f11206a.L();
                    L3.b("TcfManager", "Integer value (" + num + ") for " + a10 + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
        }
        return null;
    }

    public boolean b() {
        return un.a(this.f11212g);
    }

    public String c() {
        return this.f11212g;
    }

    public String d() {
        return pn.a(this.f11208c);
    }

    public Integer e() {
        return this.f11208c;
    }

    public Integer f() {
        return this.f11209d;
    }

    public Integer g() {
        return this.f11210e;
    }

    public List i() {
        return this.f11216k;
    }

    public String j() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.f11208c) + a("CMP SDK Version", this.f11209d) + a(qj.f11014r.a(), this.f11210e) + a(qj.f11015s.a(), this.f11211f) + a(qj.f11016t.a(), this.f11212g);
    }

    public String k() {
        return this.f11211f;
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Class<String> cls = String.class;
        if (str == null) {
            this.f11206a.L();
            if (t.a()) {
                this.f11206a.L().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
        } else if (str.equals(qj.f11012p.a())) {
            this.f11208c = a(str);
            this.f11206a.L();
            if (t.a()) {
                t L = this.f11206a.L();
                L.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11208c);
            }
            this.f11206a.P0();
        } else if (str.equals(qj.f11013q.a())) {
            this.f11209d = a(str);
            this.f11206a.L();
            if (t.a()) {
                t L2 = this.f11206a.L();
                L2.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11209d);
            }
        } else if (str.equals(qj.f11014r.a())) {
            this.f11210e = h();
            this.f11206a.L();
            if (t.a()) {
                t L3 = this.f11206a.L();
                L3.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11210e);
            }
        } else if (str.equals(qj.f11015s.a())) {
            this.f11211f = (String) sj.a(str, (Object) null, (Class) cls, sharedPreferences);
            this.f11206a.L();
            if (t.a()) {
                t L4 = this.f11206a.L();
                L4.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11211f);
            }
            this.f11206a.P0();
        } else if (str.equals(qj.f11016t.a())) {
            this.f11212g = (String) sj.a(str, (Object) null, (Class) cls, sharedPreferences);
            this.f11206a.L();
            if (t.a()) {
                t L5 = this.f11206a.L();
                L5.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11212g);
            }
            c(this.f11212g);
            b(this.f11212g);
        } else if (str.equals(qj.f11017u.a())) {
            this.f11213h = (String) sj.a(str, (Object) null, (Class) cls, sharedPreferences);
            this.f11206a.L();
            if (t.a()) {
                t L6 = this.f11206a.L();
                L6.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11213h);
            }
            d(this.f11213h);
        } else if (str.equals(qj.f11018v.a())) {
            String str2 = (String) sj.a(str, (Object) null, (Class) cls, sharedPreferences);
            this.f11206a.L();
            if (t.a()) {
                t L7 = this.f11206a.L();
                L7.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str2);
            }
        } else if (str.equals(qj.f11019w.a())) {
            this.f11214i = (String) sj.a(str, (Object) null, (Class) cls, sharedPreferences);
            this.f11206a.L();
            if (t.a()) {
                t L8 = this.f11206a.L();
                L8.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11214i);
            }
        } else if (str.equals(qj.f11020x.a())) {
            String str3 = (String) sj.a(str, (Object) null, (Class) cls, sharedPreferences);
            this.f11206a.L();
            if (t.a()) {
                t L9 = this.f11206a.L();
                L9.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str3);
            }
        } else if (str.equals(qj.f11021y.a())) {
            this.f11215j = (String) sj.a(str, (Object) null, (Class) cls, sharedPreferences);
            this.f11206a.L();
            if (t.a()) {
                t L10 = this.f11206a.L();
                L10.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f11215j);
            }
        } else if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) sj.a(str, (Object) null, (Class) cls, sharedPreferences);
            this.f11206a.L();
            if (t.a()) {
                t L11 = this.f11206a.L();
                L11.a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str4);
            }
        }
    }

    public Boolean b(int i10) {
        String str = this.f11214i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(un.a(str, i10 - 1));
    }

    public Boolean c(int i10) {
        String str = this.f11215j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(un.a(str, i10 - 1));
    }

    public Boolean d(int i10) {
        String str = this.f11213h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(un.a(str, i10 - 1));
    }

    private void b(String str) {
        for (sn snVar : this.f11216k) {
            if (snVar.f() == sn.a.ATP_NETWORK && snVar.d() != null) {
                snVar.a(un.a(snVar.d().intValue(), str));
            }
        }
    }

    private void c(String str) {
        this.f11206a.L();
        if (t.a()) {
            t L = this.f11206a.L();
            L.a("TcfManager", "Attempting to update consent from Additional Consent string: " + str);
        }
        Boolean a10 = un.a(1301, str);
        if (a10 != null) {
            if (a10.booleanValue()) {
                this.f11206a.L();
                if (t.a()) {
                    this.f11206a.L().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                y3.b(true, k.k());
            } else {
                this.f11206a.L();
                if (t.a()) {
                    this.f11206a.L().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                y3.b(false, k.k());
            }
            this.f11206a.P0();
            return;
        }
        this.f11206a.L();
        if (t.a()) {
            this.f11206a.L().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void d(String str) {
        if (str != null) {
            for (sn snVar : this.f11216k) {
                if (snVar.f() == sn.a.TCF_VENDOR && snVar.d() != null) {
                    snVar.a(Boolean.valueOf(un.a(str, snVar.d().intValue() - 1)));
                }
            }
            return;
        }
        for (sn a10 : this.f11216k) {
            a10.a((Boolean) null);
        }
    }

    public Boolean a(int i10) {
        return un.a(i10, this.f11212g);
    }

    private String a(String str, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n");
        sb2.append(str);
        sb2.append(" - ");
        sb2.append(obj != null ? obj.toString() : "No value set");
        return sb2.toString();
    }

    private Integer a(String str) {
        if (this.f11207b.contains(str)) {
            Integer num = (Integer) sj.a(str, (Object) null, Integer.class, this.f11207b, false);
            if (num != null) {
                return num;
            }
            Long l10 = (Long) sj.a(str, (Object) null, Long.class, this.f11207b, false);
            if (l10 != null && l10.longValue() >= -2147483648L && l10.longValue() <= 2147483647L) {
                return Integer.valueOf(l10.intValue());
            }
            String str2 = (String) sj.a(str, (Object) null, String.class, this.f11207b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f11206a.L();
                if (t.a()) {
                    t L = this.f11206a.L();
                    L.b("TcfManager", "String value (" + str2 + ") for " + str + " is not numeric - storing value as null");
                }
            }
        }
        return null;
    }

    public void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f11216k.add(((fe) it.next()).t());
        }
        d(this.f11213h);
        b(this.f11212g);
    }
}
