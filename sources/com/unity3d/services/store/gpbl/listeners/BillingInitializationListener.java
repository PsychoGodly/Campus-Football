package com.unity3d.services.store.gpbl.listeners;

/* compiled from: BillingInitializationListener.kt */
public interface BillingInitializationListener extends BillingClientStateListener, PurchaseUpdatedResponseListener {
    void onIsAlreadyInitialized();
}
