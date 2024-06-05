package com.google.android.gms.ads.internal.util;

import android.net.Uri;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.internal.ads.zzfkr;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class u1 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Uri f14906a;

    public /* synthetic */ u1(Uri uri) {
        this.f14906a = uri;
    }

    public final Object call() {
        Uri uri = this.f14906a;
        zzfkr zzfkr = b2.f14773i;
        t.r();
        return b2.l(uri);
    }
}
