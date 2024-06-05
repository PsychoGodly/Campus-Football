package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PurchaseUpdatedListenerProxy extends GenericListenerProxy {
    private static final String onPurchasesUpdatedMethodName = "onPurchasesUpdated";
    private PurchaseUpdatedResponseListener purchaseUpdatedResponseListener;

    public PurchaseUpdatedListenerProxy(PurchaseUpdatedResponseListener purchaseUpdatedResponseListener2) {
        this.purchaseUpdatedResponseListener = purchaseUpdatedResponseListener2;
    }

    public static Class<?> getProxyListenerClass() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.PurchasesUpdatedListener");
    }

    public Class<?> getProxyClass() throws ClassNotFoundException {
        return getProxyListenerClass();
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals(onPurchasesUpdatedMethodName)) {
            return super.invoke(obj, method, objArr);
        }
        onPurchasesUpdated(objArr[0], objArr[1]);
        return null;
    }

    public void onPurchasesUpdated(Object obj, List<Object> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object purchaseBridge : list) {
                arrayList.add(new PurchaseBridge(purchaseBridge));
            }
        } else {
            arrayList = null;
        }
        PurchaseUpdatedResponseListener purchaseUpdatedResponseListener2 = this.purchaseUpdatedResponseListener;
        if (purchaseUpdatedResponseListener2 != null) {
            purchaseUpdatedResponseListener2.onPurchaseUpdated(new BillingResultBridge(obj), arrayList);
        }
    }
}
