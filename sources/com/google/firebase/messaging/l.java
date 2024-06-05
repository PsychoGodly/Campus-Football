package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f26840a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f26841b;

    public /* synthetic */ l(Context context, Intent intent) {
        this.f26840a = context;
        this.f26841b = intent;
    }

    public final Object call() {
        return Integer.valueOf(u0.b().g(this.f26840a, this.f26841b));
    }
}
