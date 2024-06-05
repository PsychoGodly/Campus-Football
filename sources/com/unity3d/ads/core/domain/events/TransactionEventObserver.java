package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.jvm.internal.m;
import pe.i;
import pe.k0;
import sd.w;
import se.v;
import xd.d;

/* compiled from: TransactionEventObserver.kt */
public final class TransactionEventObserver {
    /* access modifiers changed from: private */
    public final k0 defaultDispatcher;
    /* access modifiers changed from: private */
    public final GatewayClient gatewayClient;
    /* access modifiers changed from: private */
    public final GetRequestPolicy getRequestPolicy;
    /* access modifiers changed from: private */
    public final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    /* access modifiers changed from: private */
    public final ByteStringDataSource iapTransactionStore;
    /* access modifiers changed from: private */
    public final v<Boolean> isRunning = se.k0.a(Boolean.FALSE);
    /* access modifiers changed from: private */
    public final TransactionEventRepository transactionEventRepository;

    public TransactionEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2, k0 k0Var, TransactionEventRepository transactionEventRepository2, GatewayClient gatewayClient2, GetRequestPolicy getRequestPolicy2, ByteStringDataSource byteStringDataSource) {
        m.e(getUniversalRequestForPayLoad2, "getUniversalRequestForPayLoad");
        m.e(k0Var, "defaultDispatcher");
        m.e(transactionEventRepository2, "transactionEventRepository");
        m.e(gatewayClient2, "gatewayClient");
        m.e(getRequestPolicy2, "getRequestPolicy");
        m.e(byteStringDataSource, "iapTransactionStore");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad2;
        this.defaultDispatcher = k0Var;
        this.transactionEventRepository = transactionEventRepository2;
        this.gatewayClient = gatewayClient2;
        this.getRequestPolicy = getRequestPolicy2;
        this.iapTransactionStore = byteStringDataSource;
    }

    public final Object invoke(d<? super w> dVar) {
        Object g10 = i.g(this.defaultDispatcher, new TransactionEventObserver$invoke$2(this, (d<? super TransactionEventObserver$invoke$2>) null), dVar);
        return g10 == d.c() ? g10 : w.f38141a;
    }
}
