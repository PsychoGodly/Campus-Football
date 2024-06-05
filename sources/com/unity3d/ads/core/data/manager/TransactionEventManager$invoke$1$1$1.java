package com.unity3d.ads.core.data.manager;

import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import java.util.List;
import kotlin.jvm.internal.m;
import sd.o;
import sd.p;
import sd.w;
import xd.d;

/* compiled from: TransactionEventManager.kt */
public final class TransactionEventManager$invoke$1$1$1 implements BillingInitializationListener {
    final /* synthetic */ d<w> $it;
    final /* synthetic */ TransactionEventManager this$0;

    TransactionEventManager$invoke$1$1$1(d<? super w> dVar, TransactionEventManager transactionEventManager) {
        this.$it = dVar;
        this.this$0 = transactionEventManager;
    }

    public void onBillingServiceDisconnected() {
        d<w> dVar = this.$it;
        o.a aVar = o.f38128b;
        dVar.resumeWith(o.b(p.a(new Exception("Billing service disconnected"))));
    }

    public void onBillingSetupFinished(BillingResultBridge billingResultBridge) {
        m.e(billingResultBridge, "billingResult");
        if (billingResultBridge.getResponseCode() != BillingResultResponseCode.OK) {
            d<w> dVar = this.$it;
            o.a aVar = o.f38128b;
            dVar.resumeWith(o.b(p.a(new Exception("Billing setup failed"))));
            return;
        }
        d<w> dVar2 = this.$it;
        o.a aVar2 = o.f38128b;
        dVar2.resumeWith(o.b(w.f38141a));
    }

    public void onIsAlreadyInitialized() {
        d<w> dVar = this.$it;
        o.a aVar = o.f38128b;
        dVar.resumeWith(o.b(w.f38141a));
    }

    public void onPurchaseUpdated(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list) {
        m.e(billingResultBridge, "billingResult");
        this.this$0.onPurchasesReceived(billingResultBridge, list);
    }
}
