package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.List;

public class z implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    private final String f13724a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13725b;

    /* renamed from: c  reason: collision with root package name */
    private final MaxAdFormat f13726c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f13727d;

    /* renamed from: f  reason: collision with root package name */
    private final List f13728f;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.applovin.impl.a0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z(org.json.JSONObject r7, java.util.Map r8, com.applovin.impl.sdk.k r9) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "name"
            java.lang.String r1 = ""
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r7, r0, r1)
            r6.f13724a = r0
            java.lang.String r0 = "display_name"
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r7, r0, r1)
            r6.f13725b = r0
            java.lang.String r0 = "format"
            r1 = 0
            java.lang.String r0 = com.applovin.impl.sdk.utils.JsonUtils.getString(r7, r0, r1)
            com.applovin.mediation.MaxAdFormat r0 = com.applovin.mediation.MaxAdFormat.formatFromString(r0)
            r6.f13726c = r0
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.String r2 = "waterfalls"
            org.json.JSONArray r7 = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(r7, r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r7.length()
            r0.<init>(r2)
            r6.f13728f = r0
            r0 = 0
            r2 = 0
        L_0x003a:
            int r3 = r7.length()
            if (r2 >= r3) goto L_0x0055
            org.json.JSONObject r3 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject((org.json.JSONArray) r7, (int) r2, (org.json.JSONObject) r1)
            if (r3 == 0) goto L_0x0052
            com.applovin.impl.a0 r4 = new com.applovin.impl.a0
            com.applovin.mediation.MaxAdFormat r5 = r6.f13726c
            r4.<init>(r3, r8, r5, r9)
            java.util.List r3 = r6.f13728f
            r3.add(r4)
        L_0x0052:
            int r2 = r2 + 1
            goto L_0x003a
        L_0x0055:
            java.util.List r7 = r6.f13728f
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0066
            java.util.List r7 = r6.f13728f
            java.lang.Object r7 = r7.get(r0)
            r1 = r7
            com.applovin.impl.a0 r1 = (com.applovin.impl.a0) r1
        L_0x0066:
            r6.f13727d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.z.<init>(org.json.JSONObject, java.util.Map, com.applovin.impl.sdk.k):void");
    }

    /* renamed from: a */
    public int compareTo(z zVar) {
        return this.f13725b.compareToIgnoreCase(zVar.f13725b);
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.f13726c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public String c() {
        return this.f13724a;
    }

    public String d() {
        return this.f13725b;
    }

    public String e() {
        return "\n---------- " + this.f13725b + " ----------" + "\nIdentifier - " + this.f13724a + "\nFormat     - " + b();
    }

    public a0 f() {
        return this.f13727d;
    }

    public List g() {
        return this.f13728f;
    }

    public MaxAdFormat a() {
        return this.f13726c;
    }
}
