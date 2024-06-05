package com.unity3d.ads.core.data.repository;

import kotlin.jvm.internal.m;
import re.a;
import se.b0;
import se.g;
import se.u;
import se.z;
import vb.i2;

/* compiled from: OperativeEventRepository.kt */
public final class OperativeEventRepository {
    private final u<i2> _operativeEvents;
    private final z<i2> operativeEvents;

    public OperativeEventRepository() {
        u<i2> a10 = b0.a(10, 10, a.DROP_OLDEST);
        this._operativeEvents = a10;
        this.operativeEvents = g.a(a10);
    }

    public final void addOperativeEvent(i2 i2Var) {
        m.e(i2Var, "operativeEventRequest");
        this._operativeEvents.c(i2Var);
    }

    public final z<i2> getOperativeEvents() {
        return this.operativeEvents;
    }
}
