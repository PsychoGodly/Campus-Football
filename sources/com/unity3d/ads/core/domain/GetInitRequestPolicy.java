package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import kotlin.jvm.internal.m;

/* compiled from: GetInitRequestPolicy.kt */
public final class GetInitRequestPolicy implements GetRequestPolicy {
    private final SessionRepository sessionRepository;

    public GetInitRequestPolicy(SessionRepository sessionRepository2) {
        m.e(sessionRepository2, "sessionRepository");
        this.sessionRepository = sessionRepository2;
    }

    public RequestPolicy invoke() {
        return new RequestPolicy(this.sessionRepository.getNativeConfiguration().t0().i0().m0(), this.sessionRepository.getNativeConfiguration().t0().i0().o0(), this.sessionRepository.getNativeConfiguration().t0().i0().p0(), this.sessionRepository.getNativeConfiguration().t0().i0().n0(), this.sessionRepository.getNativeConfiguration().t0().j0().j0(), this.sessionRepository.getNativeConfiguration().t0().j0().l0(), this.sessionRepository.getNativeConfiguration().t0().j0().m0(), this.sessionRepository.getNativeConfiguration().t0().i0().q0());
    }
}
