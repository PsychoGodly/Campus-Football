package com.applovin.impl;

import android.view.Surface;

public class jd extends ed {

    /* renamed from: c  reason: collision with root package name */
    public final int f8740c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8741d;

    public jd(Throwable th, fd fdVar, Surface surface) {
        super(th, fdVar);
        this.f8740c = System.identityHashCode(surface);
        this.f8741d = surface == null || surface.isValid();
    }
}
