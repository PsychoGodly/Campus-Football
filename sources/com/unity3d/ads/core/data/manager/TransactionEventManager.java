package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.c2;
import pe.p0;
import pe.r0;
import xd.d;
import xd.g;

/* compiled from: TransactionEventManager.kt */
public final class TransactionEventManager {
    public static final Companion Companion = new Companion((h) null);
    private static final String INAPP = "inapp";
    private static final int dummyOperationId = 42;
    /* access modifiers changed from: private */
    public final GetTransactionData getTransactionData;
    /* access modifiers changed from: private */
    public final GetTransactionRequest getTransactionRequest;
    /* access modifiers changed from: private */
    public final ByteStringDataSource iapTransactionStore;
    private final p0 scope;
    /* access modifiers changed from: private */
    public final StoreMonitor storeMonitor;
    /* access modifiers changed from: private */
    public final TransactionEventRepository transactionEventRepository;

    /* compiled from: TransactionEventManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public TransactionEventManager(p0 p0Var, StoreMonitor storeMonitor2, GetTransactionData getTransactionData2, GetTransactionRequest getTransactionRequest2, TransactionEventRepository transactionEventRepository2, ByteStringDataSource byteStringDataSource) {
        m.e(p0Var, "scope");
        m.e(storeMonitor2, "storeMonitor");
        m.e(getTransactionData2, "getTransactionData");
        m.e(getTransactionRequest2, "getTransactionRequest");
        m.e(transactionEventRepository2, "transactionEventRepository");
        m.e(byteStringDataSource, "iapTransactionStore");
        this.scope = p0Var;
        this.storeMonitor = storeMonitor2;
        this.getTransactionData = getTransactionData2;
        this.getTransactionRequest = getTransactionRequest2;
        this.transactionEventRepository = transactionEventRepository2;
        this.iapTransactionStore = byteStringDataSource;
    }

    /* access modifiers changed from: private */
    public final void onPurchasesReceived(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list) {
        if (billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
            if (!(list == null || list.isEmpty())) {
                c2 unused = k.d(this.scope, (g) null, (r0) null, new TransactionEventManager$onPurchasesReceived$1(list, this, (d<? super TransactionEventManager$onPurchasesReceived$1>) null), 3, (Object) null);
            }
        }
    }

    public final void invoke() {
        c2 unused = k.d(this.scope, (g) null, (r0) null, new TransactionEventManager$invoke$1(this, (d<? super TransactionEventManager$invoke$1>) null), 3, (Object) null);
    }
}
