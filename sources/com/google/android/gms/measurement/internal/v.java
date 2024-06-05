package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.y6;
import java.util.EnumMap;
import java.util.Map;
import r5.d;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class v {

    /* renamed from: f  reason: collision with root package name */
    public static final v f25107f = new v((Boolean) null, 100);

    /* renamed from: a  reason: collision with root package name */
    private final int f25108a;

    /* renamed from: b  reason: collision with root package name */
    private final String f25109b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f25110c;

    /* renamed from: d  reason: collision with root package name */
    private final String f25111d;

    /* renamed from: e  reason: collision with root package name */
    private final EnumMap<y6.a, Boolean> f25112e;

    v(Boolean bool, int i10) {
        this(bool, i10, (Boolean) null, (String) null);
    }

    public static v b(Bundle bundle, int i10) {
        Boolean bool = null;
        if (bundle == null) {
            return new v((Boolean) null, i10);
        }
        EnumMap enumMap = new EnumMap(y6.a.class);
        for (y6.a aVar : x6.DMA.a()) {
            enumMap.put(aVar, y6.q(bundle.getString(aVar.f25297a)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new v((EnumMap<y6.a, Boolean>) enumMap, i10, bool, bundle.getString("cps_display_str"));
    }

    public static v c(String str) {
        if (str == null || str.length() <= 0) {
            return f25107f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(y6.a.class);
        y6.a[] a10 = x6.DMA.a();
        int length = a10.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            enumMap.put(a10[i11], y6.g(split[i10].charAt(0)));
            i11++;
            i10++;
        }
        return new v((EnumMap<y6.a, Boolean>) enumMap, parseInt);
    }

    public static Boolean d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return y6.q(bundle.getString("ad_personalization"));
    }

    private final String k() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25108a);
        for (y6.a aVar : x6.DMA.a()) {
            sb2.append(":");
            sb2.append(y6.a(this.f25112e.get(aVar)));
        }
        return sb2.toString();
    }

    public final int a() {
        return this.f25108a;
    }

    public final Bundle e() {
        Bundle bundle = new Bundle();
        for (Map.Entry next : this.f25112e.entrySet()) {
            Boolean bool = (Boolean) next.getValue();
            if (bool != null) {
                bundle.putString(((y6.a) next.getKey()).f25297a, y6.j(bool.booleanValue()));
            }
        }
        Boolean bool2 = this.f25110c;
        if (bool2 != null) {
            bundle.putString("is_dma_region", bool2.toString());
        }
        String str = this.f25111d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f25109b.equalsIgnoreCase(vVar.f25109b) && d.a(this.f25110c, vVar.f25110c)) {
            return d.a(this.f25111d, vVar.f25111d);
        }
        return false;
    }

    public final Boolean f() {
        return this.f25112e.get(y6.a.AD_USER_DATA);
    }

    public final Boolean g() {
        return this.f25110c;
    }

    public final String h() {
        return this.f25111d;
    }

    public final int hashCode() {
        int i10;
        int i11;
        Boolean bool = this.f25110c;
        if (bool == null) {
            i10 = 3;
        } else {
            i10 = bool == Boolean.TRUE ? 7 : 13;
        }
        String str = this.f25111d;
        if (str == null) {
            i11 = 17;
        } else {
            i11 = str.hashCode();
        }
        return this.f25109b.hashCode() + (i10 * 29) + (i11 * 137);
    }

    public final String i() {
        return this.f25109b;
    }

    public final boolean j() {
        for (Boolean bool : this.f25112e.values()) {
            if (bool != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(y6.h(this.f25108a));
        for (y6.a aVar : x6.DMA.a()) {
            sb2.append(",");
            sb2.append(aVar.f25297a);
            sb2.append("=");
            Boolean bool = this.f25112e.get(aVar);
            if (bool == null) {
                sb2.append("uninitialized");
            } else {
                sb2.append(bool.booleanValue() ? "granted" : "denied");
            }
        }
        if (this.f25110c != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(this.f25110c);
        }
        if (this.f25111d != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(this.f25111d);
        }
        return sb2.toString();
    }

    private v(EnumMap<y6.a, Boolean> enumMap, int i10) {
        this(enumMap, i10, (Boolean) null, (String) null);
    }

    v(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap<y6.a, Boolean> enumMap = new EnumMap<>(y6.a.class);
        this.f25112e = enumMap;
        enumMap.put(y6.a.AD_USER_DATA, bool);
        this.f25108a = i10;
        this.f25109b = k();
        this.f25110c = bool2;
        this.f25111d = str;
    }

    private v(EnumMap<y6.a, Boolean> enumMap, int i10, Boolean bool, String str) {
        EnumMap<y6.a, Boolean> enumMap2 = new EnumMap<>(y6.a.class);
        this.f25112e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f25108a = i10;
        this.f25109b = k();
        this.f25110c = bool;
        this.f25111d = str;
    }
}
