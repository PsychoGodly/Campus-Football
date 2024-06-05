package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import java.lang.reflect.Method;

public class BillingClientStateListenerProxy extends GenericListenerProxy {
    private static String onBillingServiceDisconnectedMethodName = "onBillingServiceDisconnected";
    private static String onBillingSetupFinishedMethodName = "onBillingSetupFinished";
    private BillingClientStateListener billingClientStateListener;

    public BillingClientStateListenerProxy(BillingClientStateListener billingClientStateListener2) {
        this.billingClientStateListener = billingClientStateListener2;
    }

    public static Class<?> getProxyListenerClass() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.BillingClientStateListener");
    }

    private void onBillingServiceDisconnected() {
        BillingClientStateListener billingClientStateListener2 = this.billingClientStateListener;
        if (billingClientStateListener2 != null) {
            billingClientStateListener2.onBillingServiceDisconnected();
        }
    }

    private void onBillingSetupFinished(Object obj) {
        BillingClientStateListener billingClientStateListener2 = this.billingClientStateListener;
        if (billingClientStateListener2 != null) {
            billingClientStateListener2.onBillingSetupFinished(new BillingResultBridge(obj));
        }
    }

    public Class<?> getProxyClass() throws ClassNotFoundException {
        return getProxyListenerClass();
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().equals(onBillingSetupFinishedMethodName)) {
            onBillingSetupFinished(objArr[0]);
        } else if (!method.getName().equals(onBillingServiceDisconnectedMethodName)) {
            return super.invoke(obj, method, objArr);
        } else {
            onBillingServiceDisconnected();
        }
        return null;
    }
}
