package com.applovin.impl.sdk;

import com.applovin.impl.t7;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EventServiceImpl f11563a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t7 f11564b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f11565c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f11566d;

    public /* synthetic */ c0(EventServiceImpl eventServiceImpl, t7 t7Var, Map map, boolean z10) {
        this.f11563a = eventServiceImpl;
        this.f11564b = t7Var;
        this.f11565c = map;
        this.f11566d = z10;
    }

    public final void run() {
        this.f11563a.a(this.f11564b, this.f11565c, this.f11566d);
    }
}
