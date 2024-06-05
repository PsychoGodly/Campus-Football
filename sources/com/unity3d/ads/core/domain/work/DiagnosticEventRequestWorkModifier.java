package com.unity3d.ads.core.domain.work;

import com.google.protobuf.z;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.repository.SessionRepository;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import s8.b;
import vb.o0;
import vb.o3;
import vb.p0;
import vb.p3;
import vb.s0;
import vb.t0;
import vb.t3;

/* compiled from: DiagnosticEventRequestWorkModifier.kt */
public final class DiagnosticEventRequestWorkModifier {
    private final LifecycleDataSource lifecycleDataSource;
    private final SessionRepository sessionRepository;

    public DiagnosticEventRequestWorkModifier(SessionRepository sessionRepository2, LifecycleDataSource lifecycleDataSource2) {
        m.e(sessionRepository2, "sessionRepository");
        m.e(lifecycleDataSource2, "lifecycleDataSource");
        this.sessionRepository = sessionRepository2;
        this.lifecycleDataSource = lifecycleDataSource2;
    }

    public final t3 invoke(t3 t3Var) {
        m.e(t3Var, "universalRequest");
        o3.a.C0452a aVar = o3.a.f39053b;
        z.a d02 = t3Var.b();
        m.d(d02, "this.toBuilder()");
        o3.a a10 = aVar.a((t3.a) d02);
        t3.b b10 = a10.b();
        p3.a aVar2 = p3.f39058b;
        z.a d03 = b10.b();
        m.d(d03, "this.toBuilder()");
        p3 a11 = aVar2.a((t3.b.a) d03);
        t0 b11 = a11.b();
        p0.a aVar3 = p0.f39055b;
        z.a d04 = b11.b();
        m.d(d04, "this.toBuilder()");
        p0 a12 = aVar3.a((t0.a) d04);
        b<s0> d10 = a12.d();
        ArrayList arrayList = new ArrayList(r.j(d10, 10));
        for (s0 d05 : d10) {
            o0.a aVar4 = o0.f39048b;
            z.a d06 = d05.b();
            m.d(d06, "this.toBuilder()");
            o0 a13 = aVar4.a((s0.a) d06);
            a13.f(a13.c(), "same_session", String.valueOf(m.a(t3Var.i0().n0(), this.sessionRepository.getSessionToken())));
            a13.f(a13.c(), "app_active", String.valueOf(this.lifecycleDataSource.appIsForeground()));
            arrayList.add(a13.a());
        }
        a12.c(a12.d());
        a12.b(a12.d(), arrayList);
        a11.f(a12.a());
        a10.c(a11.a());
        return a10.a();
    }
}
