package com.applovin.impl;

import java.util.Map;

public class ch {

    /* renamed from: a  reason: collision with root package name */
    private final String f6981a;

    /* renamed from: b  reason: collision with root package name */
    private Map f6982b;

    private ch(String str, Map map) {
        this.f6981a = str;
        this.f6982b = map;
    }

    public static ch a(String str) {
        return a(str, (Map) null);
    }

    public String b() {
        return this.f6981a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f6981a + '\'' + "params='" + this.f6982b + '\'' + '}';
    }

    public Map a() {
        return this.f6982b;
    }

    public static ch a(String str, Map map) {
        return new ch(str, map);
    }
}
