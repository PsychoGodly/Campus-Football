package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class y6 {

    /* renamed from: c  reason: collision with root package name */
    public static final y6 f25289c = new y6((Boolean) null, (Boolean) null, 100);

    /* renamed from: a  reason: collision with root package name */
    private final EnumMap<a, Boolean> f25290a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25291b;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");
        

        /* renamed from: a  reason: collision with root package name */
        public final String f25297a;

        private a(String str) {
            this.f25297a = str;
        }
    }

    private y6(EnumMap<a, Boolean> enumMap, int i10) {
        EnumMap<a, Boolean> enumMap2 = new EnumMap<>(a.class);
        this.f25290a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f25291b = i10;
    }

    static char a(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    public static y6 c(Bundle bundle, int i10) {
        if (bundle == null) {
            return new y6((Boolean) null, (Boolean) null, i10);
        }
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : x6.STORAGE.f25242a) {
            enumMap.put(aVar, q(bundle.getString(aVar.f25297a)));
        }
        return new y6(enumMap, i10);
    }

    public static y6 e(String str) {
        return f(str, 100);
    }

    public static y6 f(String str, int i10) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str != null) {
            a[] a10 = x6.STORAGE.a();
            for (int i11 = 0; i11 < a10.length; i11++) {
                a aVar = a10[i11];
                int i12 = i11 + 2;
                if (i12 < str.length()) {
                    enumMap.put(aVar, g(str.charAt(i12)));
                }
            }
        }
        return new y6(enumMap, i10);
    }

    static Boolean g(char c10) {
        if (c10 == '0') {
            return Boolean.FALSE;
        }
        if (c10 != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    static String h(int i10) {
        return i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API";
    }

    public static String i(Bundle bundle) {
        String string;
        for (a aVar : x6.STORAGE.f25242a) {
            if (bundle.containsKey(aVar.f25297a) && (string = bundle.getString(aVar.f25297a)) != null && q(string) == null) {
                return string;
            }
        }
        return null;
    }

    static String j(boolean z10) {
        return z10 ? "granted" : "denied";
    }

    public static boolean k(int i10, int i11) {
        return i10 <= i11;
    }

    private static int n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    static Boolean q(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final int b() {
        return this.f25291b;
    }

    public final y6 d(y6 y6Var) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : x6.STORAGE.f25242a) {
            Boolean bool = this.f25290a.get(aVar);
            Boolean bool2 = y6Var.f25290a.get(aVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put(aVar, bool);
        }
        return new y6(enumMap, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        for (a aVar : x6.STORAGE.f25242a) {
            if (n(this.f25290a.get(aVar)) != n(y6Var.f25290a.get(aVar))) {
                return false;
            }
        }
        if (this.f25291b == y6Var.f25291b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f25291b * 17;
        for (Boolean n10 : this.f25290a.values()) {
            i10 = (i10 * 31) + n(n10);
        }
        return i10;
    }

    public final boolean l(a aVar) {
        Boolean bool = this.f25290a.get(aVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean m(y6 y6Var, a... aVarArr) {
        for (a aVar : aVarArr) {
            if (!y6Var.l(aVar) && l(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        for (Map.Entry next : this.f25290a.entrySet()) {
            Boolean bool = (Boolean) next.getValue();
            if (bool != null) {
                bundle.putString(((a) next.getKey()).f25297a, j(bool.booleanValue()));
            }
        }
        return bundle;
    }

    public final y6 p(y6 y6Var) {
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : x6.STORAGE.f25242a) {
            Boolean bool = this.f25290a.get(aVar);
            if (bool == null) {
                bool = y6Var.f25290a.get(aVar);
            }
            enumMap.put(aVar, bool);
        }
        return new y6(enumMap, this.f25291b);
    }

    public final boolean r(y6 y6Var, a... aVarArr) {
        for (a aVar : aVarArr) {
            Boolean bool = this.f25290a.get(aVar);
            Boolean bool2 = y6Var.f25290a.get(aVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final Boolean s() {
        return this.f25290a.get(a.AD_STORAGE);
    }

    public final boolean t(y6 y6Var) {
        return r(y6Var, (a[]) this.f25290a.keySet().toArray(new a[0]));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(h(this.f25291b));
        for (a aVar : x6.STORAGE.f25242a) {
            sb2.append(",");
            sb2.append(aVar.f25297a);
            sb2.append("=");
            Boolean bool = this.f25290a.get(aVar);
            if (bool == null) {
                sb2.append("uninitialized");
            } else {
                sb2.append(bool.booleanValue() ? "granted" : "denied");
            }
        }
        return sb2.toString();
    }

    public final Boolean u() {
        return this.f25290a.get(a.ANALYTICS_STORAGE);
    }

    public final String v() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (a aVar : x6.STORAGE.a()) {
            sb2.append(a(this.f25290a.get(aVar)));
        }
        return sb2.toString();
    }

    public final String w() {
        char c10;
        StringBuilder sb2 = new StringBuilder("G2");
        for (a aVar : x6.STORAGE.a()) {
            Boolean bool = this.f25290a.get(aVar);
            if (bool == null) {
                c10 = 'g';
            } else {
                c10 = bool.booleanValue() ? 'G' : 'D';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final boolean x() {
        return l(a.AD_STORAGE);
    }

    public final boolean y() {
        return l(a.ANALYTICS_STORAGE);
    }

    public final boolean z() {
        for (Boolean bool : this.f25290a.values()) {
            if (bool != null) {
                return true;
            }
        }
        return false;
    }

    public y6(Boolean bool, Boolean bool2, int i10) {
        EnumMap<a, Boolean> enumMap = new EnumMap<>(a.class);
        this.f25290a = enumMap;
        enumMap.put(a.AD_STORAGE, bool);
        enumMap.put(a.ANALYTICS_STORAGE, bool2);
        this.f25291b = i10;
    }
}
