package com.applovin.impl.sdk;

import android.view.InputEvent;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f12053a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f12054b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ InputEvent f12055c;

    public /* synthetic */ u1(w wVar, List list, InputEvent inputEvent) {
        this.f12053a = wVar;
        this.f12054b = list;
        this.f12055c = inputEvent;
    }

    public final void run() {
        this.f12053a.a(this.f12054b, this.f12055c);
    }
}
