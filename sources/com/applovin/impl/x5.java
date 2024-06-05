package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.b6;
import com.applovin.impl.ma;
import com.applovin.impl.od;
import com.applovin.impl.w5;
import java.util.Collection;
import java.util.Map;

public final class x5 implements a7 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f13284a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private od.e f13285b;

    /* renamed from: c  reason: collision with root package name */
    private z6 f13286c;

    /* renamed from: d  reason: collision with root package name */
    private ma.b f13287d;

    /* renamed from: e  reason: collision with root package name */
    private String f13288e;

    private z6 a(od.e eVar) {
        ma.b bVar = this.f13287d;
        if (bVar == null) {
            bVar = new b6.b().a(this.f13288e);
        }
        Uri uri = eVar.f10131b;
        na naVar = new na(uri == null ? null : uri.toString(), eVar.f10135f, bVar);
        qp it = eVar.f10132c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            naVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        w5 a10 = new w5.b().a(eVar.f10130a, k9.f8930d).a(eVar.f10133d).b(eVar.f10134e).a(pb.a((Collection) eVar.f10136g)).a((ld) naVar);
        a10.a(0, eVar.b());
        return a10;
    }

    public z6 a(od odVar) {
        z6 z6Var;
        a1.a((Object) odVar.f10105b);
        od.e eVar = odVar.f10105b.f10160c;
        if (eVar == null || yp.f13662a < 18) {
            return z6.f13798a;
        }
        synchronized (this.f13284a) {
            if (!yp.a((Object) eVar, (Object) this.f13285b)) {
                this.f13285b = eVar;
                this.f13286c = a(eVar);
            }
            z6Var = (z6) a1.a((Object) this.f13286c);
        }
        return z6Var;
    }
}
