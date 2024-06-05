package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbyt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import n4.x;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class y4 {

    /* renamed from: a  reason: collision with root package name */
    public static final y4 f14626a = new y4();

    protected y4() {
    }

    public final u4 a(Context context, z2 z2Var) {
        List list;
        Context context2;
        String str;
        z2 z2Var2 = z2Var;
        Date l10 = z2Var.l();
        long time = l10 != null ? l10.getTime() : -1;
        String i10 = z2Var.i();
        int a10 = z2Var.a();
        Set o10 = z2Var.o();
        if (!o10.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(o10));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean q10 = z2Var2.q(context2);
        Bundle e10 = z2Var2.e(AdMobAdapter.class);
        String j10 = z2Var.j();
        z2Var.g();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            x.b();
            str = zzbyt.zzr(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean p10 = z2Var.p();
        x d10 = m3.g().d();
        return new u4(8, time, e10, a10, list, q10, Math.max(z2Var.c(), d10.b()), false, j10, (k4) null, (Location) null, i10, z2Var.f(), z2Var.d(), Collections.unmodifiableList(new ArrayList(z2Var.n())), z2Var.k(), str, p10, (a1) null, Math.max(-1, d10.c()), (String) Collections.max(Arrays.asList(new String[]{null, d10.a()}), x4.f14604a), z2Var.m(), z2Var.b(), z2Var.h());
    }
}
