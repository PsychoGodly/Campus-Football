package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.m;
import vb.c0;
import vb.e0;
import vb.f0;
import vb.g0;

/* compiled from: GetAndroidClientInfo.kt */
public final class GetAndroidClientInfo implements GetClientInfo {
    private final MediationRepository mediationRepository;
    private final SessionRepository sessionRepository;

    public GetAndroidClientInfo(SessionRepository sessionRepository2, MediationRepository mediationRepository2) {
        m.e(sessionRepository2, "sessionRepository");
        m.e(mediationRepository2, "mediationRepository");
        this.sessionRepository = sessionRepository2;
        this.mediationRepository = mediationRepository2;
    }

    public e0 invoke() {
        c0.a aVar = c0.f38928b;
        e0.a o02 = e0.o0();
        m.d(o02, "newBuilder()");
        c0 a10 = aVar.a(o02);
        a10.h(41200);
        a10.i("4.12.0");
        a10.d(this.sessionRepository.getGameId());
        a10.j(this.sessionRepository.isTestModeEnabled());
        a10.g(g0.PLATFORM_ANDROID);
        a10.e(this.mediationRepository.getMediationProvider().invoke());
        String name = this.mediationRepository.getName();
        if (name != null && a10.b() == f0.MEDIATION_PROVIDER_CUSTOM) {
            a10.c(name);
        }
        String version = this.mediationRepository.getVersion();
        if (version != null) {
            a10.f(version);
        }
        return a10.a();
    }
}
