package com.startapp;

import android.content.SharedPreferences;

/* compiled from: Sta */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f15623a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f15624b;

    /* renamed from: c  reason: collision with root package name */
    public volatile String f15625c;

    /* renamed from: d  reason: collision with root package name */
    public volatile String f15626d;

    public b0(SharedPreferences sharedPreferences) {
        this.f15624b = sharedPreferences;
    }

    public boolean a() {
        boolean contains;
        synchronized (this.f15623a) {
            contains = this.f15624b.contains("2696a7f502faed4b");
        }
        return contains;
    }
}
