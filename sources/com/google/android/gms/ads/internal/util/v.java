package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class v implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w f14907a;

    v(w wVar) {
        this.f14907a = wVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        t.r();
        b2.r(this.f14907a.f14910a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
