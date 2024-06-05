package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import com.applovin.impl.sdk.k;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f40 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r9 f7620a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f7621b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f7622c;

    public /* synthetic */ f40(r9 r9Var, Activity activity, k kVar) {
        this.f7620a = r9Var;
        this.f7621b = activity;
        this.f7622c = kVar;
    }

    public final void onClick(View view) {
        this.f7620a.a(this.f7621b, this.f7622c, view);
    }
}
