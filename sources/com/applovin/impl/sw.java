package com.applovin.impl;

import android.content.DialogInterface;
import android.net.Uri;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class sw implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f4 f12192a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Uri f12193b;

    public /* synthetic */ sw(f4 f4Var, Uri uri) {
        this.f12192a = f4Var;
        this.f12193b = uri;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f12192a.a(this.f12193b, dialogInterface, i10);
    }
}
