package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.m;
import pe.g3;
import xd.d;

/* compiled from: CommonAwaitInitialization.kt */
public final class CommonAwaitInitialization implements AwaitInitialization {
    /* access modifiers changed from: private */
    public final SessionRepository sessionRepository;

    public CommonAwaitInitialization(SessionRepository sessionRepository2) {
        m.e(sessionRepository2, "sessionRepository");
        this.sessionRepository = sessionRepository2;
    }

    public Object invoke(long j10, d<? super InitializationState> dVar) {
        return g3.d(j10, new CommonAwaitInitialization$invoke$2(this, (d<? super CommonAwaitInitialization$invoke$2>) null), dVar);
    }
}
