package com.unity3d.ads.core.data.manager;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements SkuDetailsResponseListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f32005a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f32006b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f32007c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TransactionEventManager f32008d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ PurchaseBridge f32009e;

    public /* synthetic */ b(List list, int i10, List list2, TransactionEventManager transactionEventManager, PurchaseBridge purchaseBridge) {
        this.f32005a = list;
        this.f32006b = i10;
        this.f32007c = list2;
        this.f32008d = transactionEventManager;
        this.f32009e = purchaseBridge;
    }

    public final void onSkuDetailsUpdated(BillingResultBridge billingResultBridge, List list) {
        TransactionEventManager$onPurchasesReceived$1.invokeSuspend$lambda$3$lambda$2(this.f32005a, this.f32006b, this.f32007c, this.f32008d, this.f32009e, billingResultBridge, list);
    }
}
