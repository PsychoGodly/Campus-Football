package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class c1 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    protected final k f6815a;

    /* renamed from: b  reason: collision with root package name */
    protected final String f6816b;

    /* renamed from: c  reason: collision with root package name */
    protected final t f6817c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f6818d;

    /* renamed from: e  reason: collision with root package name */
    protected final AtomicBoolean f6819e = new AtomicBoolean();

    public c1(String str, k kVar) {
        this.f6816b = str;
        this.f6815a = kVar;
        this.f6817c = kVar.L();
        this.f6818d = k.k();
    }

    public Context a() {
        return this.f6818d;
    }

    public void a(boolean z10) {
        this.f6819e.set(z10);
    }
}
