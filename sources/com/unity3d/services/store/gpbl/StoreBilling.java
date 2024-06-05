package com.unity3d.services.store.gpbl;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientBuilderFactory;
import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseHistoryResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class StoreBilling {
    private final IBillingClient _billingClientBridge;

    public StoreBilling(Context context, PurchaseUpdatedResponseListener purchaseUpdatedResponseListener) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        this._billingClientBridge = BillingClientBuilderFactory.getBillingClientBuilder(context).setListener(new PurchaseUpdatedListenerProxy(purchaseUpdatedResponseListener)).enablePendingPurchases().build();
    }

    public void getPurchaseHistory(String str, int i10, PurchaseHistoryResponseListener purchaseHistoryResponseListener) throws ClassNotFoundException {
        this._billingClientBridge.queryPurchaseHistoryAsync(str, new PurchaseHistoryResponseListenerProxy(purchaseHistoryResponseListener, i10));
    }

    public void getPurchases(String str, PurchasesResponseListener purchasesResponseListener) throws ClassNotFoundException {
        this._billingClientBridge.queryPurchasesAsync(str, new PurchasesResponseListenerProxy(purchasesResponseListener));
    }

    public void getSkuDetails(String str, List<String> list, SkuDetailsResponseListener skuDetailsResponseListener) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        this._billingClientBridge.querySkuDetailsAsync(SkuDetailsParamsBridge.newBuilder().setSkuList(list).setType(str).build(), new SkuDetailsResponseListenerProxy(skuDetailsResponseListener));
    }

    public void initialize(BillingClientStateListener billingClientStateListener) throws ClassNotFoundException {
        this._billingClientBridge.startConnection(new BillingClientStateListenerProxy(billingClientStateListener));
    }

    public int isFeatureSupported(String str) {
        boolean z10;
        if (str.equals("inapp")) {
            z10 = this._billingClientBridge.isReady();
        } else {
            if (str.equals("subs")) {
                str = "subscriptions";
            }
            z10 = this._billingClientBridge.isFeatureSupported(str) == BillingResultResponseCode.OK;
        }
        if (z10) {
            return 0;
        }
        return -1;
    }
}
