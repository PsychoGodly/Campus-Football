package com.google.firebase.messaging;

import android.content.Intent;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f26850a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f26851b;

    public /* synthetic */ o(p pVar, Intent intent) {
        this.f26850a = pVar;
        this.f26851b = intent;
    }

    public final void run() {
        this.f26850a.b(this.f26851b);
    }
}
