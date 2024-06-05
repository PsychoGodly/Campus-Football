package com.google.ads.mediation;

import android.view.View;
import java.util.Map;
import q4.i;
import q4.m;
import q4.o;
import v4.x;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
final class a extends x {

    /* renamed from: s  reason: collision with root package name */
    private final i f14155s;

    public a(i iVar) {
        this.f14155s = iVar;
        w(iVar.getHeadline());
        y(iVar.getImages());
        u(iVar.getBody());
        x(iVar.getIcon());
        v(iVar.getCallToAction());
        t(iVar.getAdvertiser());
        C(iVar.getStarRating());
        D(iVar.getStore());
        B(iVar.getPrice());
        J(iVar.zza());
        A(true);
        z(true);
        K(iVar.getVideoController());
    }

    public final void E(View view, Map<String, View> map, Map<String, View> map2) {
        if (view instanceof o) {
            o oVar = (o) view;
            throw null;
        } else if (((m) m.f21835a.get(view)) != null) {
            throw null;
        }
    }
}
