package com.unity3d.ads.core.domain.events;

import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import vb.l3;

/* compiled from: GetTransactionData.kt */
public interface GetTransactionData {
    l3 invoke(PurchaseBridge purchaseBridge, SkuDetailsBridge skuDetailsBridge);
}
