package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbqv;
import com.google.android.gms.internal.ads.zzbqz;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbuw;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbza;
import r4.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class v {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final t4 f14575a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final r4 f14576b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final t3 f14577c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final zzbfw f14578d;

    /* renamed from: e  reason: collision with root package name */
    private final zzbvi f14579e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final zzbqz f14580f;

    /* renamed from: g  reason: collision with root package name */
    private final zzbfx f14581g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public zzbsh f14582h;

    public v(t4 t4Var, r4 r4Var, t3 t3Var, zzbfw zzbfw, zzbvi zzbvi, zzbqz zzbqz, zzbfx zzbfx) {
        this.f14575a = t4Var;
        this.f14576b = r4Var;
        this.f14577c = t3Var;
        this.f14578d = zzbfw;
        this.f14579e = zzbvi;
        this.f14580f = zzbqz;
        this.f14581g = zzbfx;
    }

    static /* bridge */ /* synthetic */ void r(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        x.b().zzo(context, x.c().zza, "gmob-apps", bundle, true);
    }

    public final q0 c(Context context, String str, zzbnf zzbnf) {
        return (q0) new p(this, context, str, zzbnf).d(context, false);
    }

    public final u0 d(Context context, z4 z4Var, String str, zzbnf zzbnf) {
        return (u0) new l(this, context, z4Var, str, zzbnf).d(context, false);
    }

    public final u0 e(Context context, z4 z4Var, String str, zzbnf zzbnf) {
        return (u0) new n(this, context, z4Var, str, zzbnf).d(context, false);
    }

    public final l2 f(Context context, zzbnf zzbnf) {
        return (l2) new d(this, context, zzbnf).d(context, false);
    }

    public final zzbeb h(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbeb) new t(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final zzbip j(Context context, zzbnf zzbnf, b bVar) {
        return (zzbip) new j(this, context, zzbnf, bVar).d(context, false);
    }

    public final zzbqv k(Context context, zzbnf zzbnf) {
        return (zzbqv) new h(this, context, zzbnf).d(context, false);
    }

    public final zzbrc m(Activity activity) {
        b bVar = new b(this, activity);
        Intent intent = activity.getIntent();
        boolean z10 = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzbza.zzg("useClientJar flag not found in activity intent extras.");
        } else {
            z10 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzbrc) bVar.d(activity, z10);
    }

    public final zzbuw o(Context context, String str, zzbnf zzbnf) {
        return (zzbuw) new u(this, context, str, zzbnf).d(context, false);
    }

    public final zzbxr p(Context context, zzbnf zzbnf) {
        return (zzbxr) new f(this, context, zzbnf).d(context, false);
    }
}
