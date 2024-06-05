package com.applovin.impl.mediation;

import com.applovin.impl.mediation.g;
import com.applovin.mediation.adapter.MaxAdapter;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g.d f9421a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdapter.InitializationStatus f9422b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f9423c;

    public /* synthetic */ a1(g.d dVar, MaxAdapter.InitializationStatus initializationStatus, String str) {
        this.f9421a = dVar;
        this.f9422b = initializationStatus;
        this.f9423c = str;
    }

    public final void run() {
        this.f9421a.a(this.f9422b, this.f9423c);
    }
}
