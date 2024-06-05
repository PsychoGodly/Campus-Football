package com.applovin.impl;

import java.util.Map;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private final String f11249a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11250b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f11251c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11252d;

    public s(String str, String str2) {
        this(str, str2, (Map) null, false);
    }

    public String a() {
        return this.f11250b;
    }

    public Map b() {
        return this.f11251c;
    }

    public String c() {
        return this.f11249a;
    }

    public boolean d() {
        return this.f11252d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f11249a + '\'' + ", backupUrl='" + this.f11250b + '\'' + ", headers='" + this.f11251c + '\'' + ", shouldFireInWebView='" + this.f11252d + '\'' + '}';
    }

    public s(String str, String str2, Map map, boolean z10) {
        this.f11249a = str;
        this.f11250b = str2;
        this.f11251c = map;
        this.f11252d = z10;
    }
}
