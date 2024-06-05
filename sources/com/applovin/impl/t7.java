package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class t7 {

    /* renamed from: a  reason: collision with root package name */
    private final String f12267a = UUID.randomUUID().toString();

    /* renamed from: b  reason: collision with root package name */
    private final String f12268b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f12269c;

    /* renamed from: d  reason: collision with root package name */
    private final long f12270d;

    public t7(String str, Map map, Map map2) {
        this.f12268b = str;
        HashMap hashMap = new HashMap();
        this.f12269c = hashMap;
        hashMap.putAll(map);
        hashMap.put("applovin_sdk_super_properties", map2);
        this.f12270d = System.currentTimeMillis();
    }

    public long a() {
        return this.f12270d;
    }

    public String b() {
        return this.f12267a;
    }

    public String c() {
        return this.f12268b;
    }

    public Map d() {
        return this.f12269c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t7 t7Var = (t7) obj;
        if (this.f12270d != t7Var.f12270d) {
            return false;
        }
        String str = this.f12268b;
        if (str == null ? t7Var.f12268b != null : !str.equals(t7Var.f12268b)) {
            return false;
        }
        Map map = this.f12269c;
        if (map == null ? t7Var.f12269c != null : !map.equals(t7Var.f12269c)) {
            return false;
        }
        String str2 = this.f12267a;
        String str3 = t7Var.f12267a;
        if (str2 != null) {
            if (!str2.equals(str3)) {
                return false;
            }
            return true;
        } else if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f12268b;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f12269c;
        int hashCode2 = map != null ? map.hashCode() : 0;
        long j10 = this.f12270d;
        int i11 = (((hashCode + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str2 = this.f12267a;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return "Event{name='" + this.f12268b + '\'' + ", id='" + this.f12267a + '\'' + ", creationTimestampMillis=" + this.f12270d + ", parameters=" + this.f12269c + '}';
    }
}
