package com.unity3d.ads.core.data.repository;

import kotlin.jvm.internal.m;
import re.a;
import se.b0;
import se.g;
import se.u;
import se.z;
import vb.m3;

/* compiled from: AndroidTransactionEventRepository.kt */
public final class AndroidTransactionEventRepository implements TransactionEventRepository {
    private final u<m3> _transactionEvents;
    private final z<m3> transactionEvents;

    public AndroidTransactionEventRepository() {
        u<m3> a10 = b0.a(10, 10, a.DROP_OLDEST);
        this._transactionEvents = a10;
        this.transactionEvents = g.a(a10);
    }

    public void addTransactionEvent(m3 m3Var) {
        m.e(m3Var, "transactionEventRequest");
        this._transactionEvents.c(m3Var);
    }

    public z<m3> getTransactionEvents() {
        return this.transactionEvents;
    }
}
