package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.m;

/* compiled from: CommonGetInitializationState.kt */
public final class CommonGetInitializationState implements GetInitializationState {
    private final SessionRepository sessionRepository;

    public CommonGetInitializationState(SessionRepository sessionRepository2) {
        m.e(sessionRepository2, "sessionRepository");
        this.sessionRepository = sessionRepository2;
    }

    public InitializationState invoke() {
        return this.sessionRepository.getInitializationState();
    }
}
