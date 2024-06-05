package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PurchasesResponseListenerProxy extends GenericListenerProxy {
    private static final String onQueryPurchasesResponseMethodName = "onQueryPurchasesResponse";
    private PurchasesResponseListener purchasesResponseListener;

    public PurchasesResponseListenerProxy(PurchasesResponseListener purchasesResponseListener2) {
        this.purchasesResponseListener = purchasesResponseListener2;
    }

    public static Class<?> getProxyListenerClass() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.PurchasesResponseListener");
    }

    public Class<?> getProxyClass() throws ClassNotFoundException {
        return getProxyListenerClass();
    }

    public PurchasesResponseListener getPurchasesResponseListener() {
        return this.purchasesResponseListener;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals(onQueryPurchasesResponseMethodName)) {
            return super.invoke(obj, method, objArr);
        }
        onQueryPurchasesResponse(objArr[0], objArr[1]);
        return null;
    }

    public void onQueryPurchasesResponse(Object obj, List<Object> list) {
        ArrayList arrayList;
        BillingResultBridge billingResultBridge = new BillingResultBridge(obj);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object purchaseBridge : list) {
                arrayList.add(new PurchaseBridge(purchaseBridge));
            }
        } else {
            arrayList = null;
        }
        PurchasesResponseListener purchasesResponseListener2 = this.purchasesResponseListener;
        if (purchasesResponseListener2 != null) {
            purchasesResponseListener2.onPurchaseResponse(billingResultBridge, arrayList);
        }
    }
}
