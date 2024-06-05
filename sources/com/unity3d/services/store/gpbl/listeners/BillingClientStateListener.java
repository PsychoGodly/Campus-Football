package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;

/* compiled from: BillingClientStateListener.kt */
public interface BillingClientStateListener {
    void onBillingServiceDisconnected();

    void onBillingSetupFinished(BillingResultBridge billingResultBridge);
}
