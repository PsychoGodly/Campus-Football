package com.unity3d.ads.core.data.manager;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements PurchasesResponseListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TransactionEventManager f32004a;

    public /* synthetic */ a(TransactionEventManager transactionEventManager) {
        this.f32004a = transactionEventManager;
    }

    public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
        TransactionEventManager$invoke$1.invokeSuspend$lambda$1(this.f32004a, billingResultBridge, list);
    }
}
