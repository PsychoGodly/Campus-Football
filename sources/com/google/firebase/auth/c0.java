package com.google.firebase.auth;

import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    private String f26177a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Object> f26178b;

    public c0(String str, Map<String, Object> map) {
        this.f26177a = str;
        this.f26178b = map;
    }

    private final long h(String str) {
        Integer num = (Integer) this.f26178b.get(str);
        if (num == null) {
            return 0;
        }
        return num.longValue();
    }

    public long a() {
        return h("auth_time");
    }

    public Map<String, Object> b() {
        return this.f26178b;
    }

    public long c() {
        return h("exp");
    }

    public long d() {
        return h("iat");
    }

    public String e() {
        Map map = (Map) this.f26178b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    public String f() {
        Map map = (Map) this.f26178b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_second_factor");
        }
        return null;
    }

    public String g() {
        return this.f26177a;
    }
}
