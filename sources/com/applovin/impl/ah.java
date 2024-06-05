package com.applovin.impl;

import java.io.IOException;

public class ah extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6535a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6536b;

    protected ah(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f6535a = z10;
        this.f6536b = i10;
    }

    public static ah a(String str, Throwable th) {
        return new ah(str, th, true, 1);
    }

    public static ah b(String str, Throwable th) {
        return new ah(str, th, true, 0);
    }

    public static ah a(String str) {
        return new ah(str, (Throwable) null, false, 1);
    }
}
