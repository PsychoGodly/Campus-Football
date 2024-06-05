package com.startapp;

import java.util.List;

/* compiled from: Sta */
public class ea {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f15788a;

    /* renamed from: b  reason: collision with root package name */
    public String f15789b;

    public ea(List<String> list, String str) {
        this.f15788a = list;
        this.f15789b = str;
    }

    public String toString() {
        StringBuilder a10 = p0.a("[VideoEvent: tag=");
        a10.append(this.f15789b);
        a10.append(", fullUrls=");
        a10.append(this.f15788a.toString());
        a10.append("]");
        return a10.toString();
    }
}
