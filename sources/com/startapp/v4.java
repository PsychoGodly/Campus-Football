package com.startapp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Sta */
public class v4 {

    /* renamed from: b  reason: collision with root package name */
    public static v4 f17398b = new v4();

    /* renamed from: a  reason: collision with root package name */
    public Map<String, u4> f17399a = new ConcurrentHashMap();

    public u4 a(String str) {
        if (this.f17399a.containsKey(str)) {
            return this.f17399a.get(str);
        }
        u4 u4Var = new u4();
        this.f17399a.put(str, u4Var);
        return u4Var;
    }
}
