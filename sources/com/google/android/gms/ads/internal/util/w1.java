package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.d;
import com.google.android.gms.internal.ads.zzbbq;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzgxm;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class w1 implements zzbbq {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzbbs f14915a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f14916b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Uri f14917c;

    w1(b2 b2Var, zzbbs zzbbs, Context context, Uri uri) {
        this.f14915a = zzbbs;
        this.f14916b = context;
        this.f14917c = uri;
    }

    public final void zza() {
        d b10 = new d.b(this.f14915a.zza()).b();
        b10.f1921a.setPackage(zzgxm.zza(this.f14916b));
        b10.b(this.f14916b, this.f14917c);
        this.f14915a.zzf((Activity) this.f14916b);
    }
}
