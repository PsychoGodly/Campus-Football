package com.unity3d.services.store;

import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.core.StoreLifecycleListener;
import com.unity3d.services.store.gpbl.StoreBilling;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.FeatureSupportedListener;
import com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import se.k0;
import se.v;

/* compiled from: StoreMonitor.kt */
public final class StoreMonitor {
    private final v<Boolean> _isInitialized = k0.a(Boolean.FALSE);
    private StoreBilling storeBilling;
    private final StoreExceptionHandler storeExceptionHandler;
    private StoreLifecycleListener storeLifecycleListener;

    public StoreMonitor(StoreExceptionHandler storeExceptionHandler2) {
        m.e(storeExceptionHandler2, "storeExceptionHandler");
        this.storeExceptionHandler = storeExceptionHandler2;
    }

    public final void getPurchaseHistory(int i10, String str, int i11, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        m.e(purchaseHistoryResponseListener, "purchaseHistoryResponseListener");
        try {
            StoreBilling storeBilling2 = this.storeBilling;
            if (storeBilling2 != null) {
                storeBilling2.getPurchaseHistory(str, i11, purchaseHistoryResponseListener);
            }
        } catch (Exception e10) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_ERROR, i10, e10);
        }
    }

    public final void getPurchases(int i10, String str, PurchasesResponseListener purchasesResponseListener) {
        m.e(purchasesResponseListener, "purchasesResponseListener");
        try {
            StoreBilling storeBilling2 = this.storeBilling;
            if (storeBilling2 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            } else if (storeBilling2 != null) {
                storeBilling2.getPurchases(str, purchasesResponseListener);
            }
        } catch (Exception e10) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.PURCHASES_REQUEST_ERROR, i10, e10);
        }
    }

    public final void getSkuDetails(int i10, String str, List<String> list, SkuDetailsResponseListener skuDetailsResponseListener) {
        m.e(skuDetailsResponseListener, "skuDetailsResponseListener");
        try {
            StoreBilling storeBilling2 = this.storeBilling;
            if (storeBilling2 != null) {
                storeBilling2.getSkuDetails(str, list, skuDetailsResponseListener);
            }
        } catch (Exception e10) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.SKU_DETAILS_LIST_REQUEST_ERROR, i10, e10);
        }
    }

    public final void initialize(BillingInitializationListener billingInitializationListener) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        m.e(billingInitializationListener, "billingInitializationListener");
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        StoreBilling storeBilling2 = new StoreBilling(ClientProperties.getApplicationContext(), billingInitializationListener);
        this.storeBilling = storeBilling2;
        storeBilling2.initialize(billingInitializationListener);
        this._isInitialized.setValue(Boolean.TRUE);
    }

    public final int isFeatureSupported(int i10, String str, FeatureSupportedListener featureSupportedListener) {
        m.e(featureSupportedListener, "featureSupportedListener");
        int i11 = -1;
        try {
            StoreBilling storeBilling2 = this.storeBilling;
            if (storeBilling2 != null) {
                i11 = storeBilling2.isFeatureSupported(str);
            }
            featureSupportedListener.onFeatureSupported(i11);
        } catch (Exception e10) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_ERROR, i10, e10);
        }
        return i11;
    }

    public final boolean isInitialized() {
        return this._isInitialized.getValue().booleanValue();
    }

    public final void startPurchaseTracking(ArrayList<String> arrayList, StoreEventListener storeEventListener) {
        m.e(arrayList, "purchaseTypes");
        m.e(storeEventListener, "storeEventListener");
        if (this.storeLifecycleListener != null) {
            stopPurchaseTracking();
        }
        StoreBilling storeBilling2 = this.storeBilling;
        m.b(storeBilling2);
        this.storeLifecycleListener = new StoreLifecycleListener(arrayList, storeBilling2, storeEventListener);
        ClientProperties.getApplication().registerActivityLifecycleCallbacks(this.storeLifecycleListener);
    }

    public final void stopPurchaseTracking() {
        if (this.storeLifecycleListener != null) {
            ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(this.storeLifecycleListener);
            this.storeLifecycleListener = null;
        }
    }
}
