package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.m;

/* compiled from: CommonSetInitializationState.kt */
public final class CommonSetInitializationState implements SetInitializationState {
    private final SessionRepository sessionRepository;

    public CommonSetInitializationState(SessionRepository sessionRepository2) {
        m.e(sessionRepository2, "sessionRepository");
        this.sessionRepository = sessionRepository2;
    }

    public void invoke(InitializationState initializationState) {
        m.e(initializationState, "state");
        this.sessionRepository.setInitializationState(initializationState);
    }
}
