package com.applovin.impl;

import android.content.SharedPreferences;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a50 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences.Editor f6292a;

    public /* synthetic */ a50(SharedPreferences.Editor editor) {
        this.f6292a = editor;
    }

    public final void run() {
        this.f6292a.commit();
    }
}
