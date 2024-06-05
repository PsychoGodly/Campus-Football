package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f14910a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f14911b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f14912c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f14913d;

    w(x xVar, Context context, String str, boolean z10, boolean z11) {
        this.f14910a = context;
        this.f14911b = str;
        this.f14912c = z10;
        this.f14913d = z11;
    }

    public final void run() {
        t.r();
        AlertDialog.Builder g10 = b2.g(this.f14910a);
        g10.setMessage(this.f14911b);
        if (this.f14912c) {
            g10.setTitle("Error");
        } else {
            g10.setTitle("Info");
        }
        if (this.f14913d) {
            g10.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            g10.setPositiveButton("Learn More", new v(this));
            g10.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        g10.create().show();
    }
}
