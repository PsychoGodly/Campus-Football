package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.ads.core.extensions.TransactionStateExtensionsKt;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import kotlin.jvm.internal.m;
import vb.h3;
import vb.l3;

/* compiled from: GetAndroidTransactionData.kt */
public final class GetAndroidTransactionData implements GetTransactionData {
    private final GetByteStringId getByteStringId;

    public GetAndroidTransactionData(GetByteStringId getByteStringId2) {
        m.e(getByteStringId2, "getByteStringId");
        this.getByteStringId = getByteStringId2;
    }

    public l3 invoke(PurchaseBridge purchaseBridge, SkuDetailsBridge skuDetailsBridge) {
        m.e(purchaseBridge, "purchaseDetail");
        m.e(skuDetailsBridge, "productDetail");
        h3.a aVar = h3.f38975b;
        l3.a m02 = l3.m0();
        m.d(m02, "newBuilder()");
        h3 a10 = aVar.a(m02);
        a10.d(purchaseBridge.getOriginalJson().get(InAppPurchaseMetaData.KEY_PRODUCT_ID).toString());
        a10.b(this.getByteStringId.invoke());
        Object obj = purchaseBridge.getOriginalJson().get("purchaseTime");
        m.c(obj, "null cannot be cast to non-null type kotlin.Long");
        a10.e(TimestampExtensionsKt.fromMillis(((Long) obj).longValue()));
        a10.g(purchaseBridge.getOriginalJson().get("orderId").toString());
        String jSONObject = skuDetailsBridge.getOriginalJson().toString();
        m.d(jSONObject, "productDetail.originalJson.toString()");
        a10.c(jSONObject);
        String jSONObject2 = purchaseBridge.getOriginalJson().toString();
        m.d(jSONObject2, "purchaseDetail.originalJson.toString()");
        a10.f(jSONObject2);
        Object obj2 = purchaseBridge.getOriginalJson().get("purchaseState");
        m.c(obj2, "null cannot be cast to non-null type kotlin.Int");
        a10.h(TransactionStateExtensionsKt.fromPurchaseState(((Integer) obj2).intValue()));
        return a10.a();
    }
}
