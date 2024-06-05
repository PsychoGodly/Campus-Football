package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f14787a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f14788b;

    public /* synthetic */ e(t tVar, String str) {
        this.f14787a = tVar;
        this.f14788b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f14787a.i(this.f14788b, dialogInterface, i10);
    }
}
