package com.applovin.impl;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a00 implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f6282a;

    public /* synthetic */ a00(Runnable runnable) {
        this.f6282a = runnable;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f6282a.run();
    }
}
