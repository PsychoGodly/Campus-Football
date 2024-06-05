package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge;
import com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PurchaseHistoryResponseListenerProxy extends GenericListenerProxy {
    private static final String onPurchaseHistoryResponseMethodName = "onPurchaseHistoryResponse";
    private int _maxPurchases;
    private PurchaseHistoryResponseListener purchaseHistoryResponseListener;

    public PurchaseHistoryResponseListenerProxy(PurchaseHistoryResponseListener purchaseHistoryResponseListener2, int i10) {
        this.purchaseHistoryResponseListener = purchaseHistoryResponseListener2;
        this._maxPurchases = i10;
    }

    public static Class<?> getProxyListenerClass() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.PurchaseHistoryResponseListener");
    }

    public Class<?> getProxyClass() throws ClassNotFoundException {
        return getProxyListenerClass();
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals(onPurchaseHistoryResponseMethodName)) {
            return super.invoke(obj, method, objArr);
        }
        onPurchaseHistoryResponse(objArr[0], objArr[1]);
        return null;
    }

    public void onPurchaseHistoryResponse(Object obj, List<Object> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < this._maxPurchases && i10 < list.size()) {
                arrayList.add(new PurchaseHistoryRecordBridge(list.get(i10)));
                i10++;
            }
        } else {
            arrayList = null;
        }
        PurchaseHistoryResponseListener purchaseHistoryResponseListener2 = this.purchaseHistoryResponseListener;
        if (purchaseHistoryResponseListener2 != null) {
            purchaseHistoryResponseListener2.onPurchaseHistoryUpdated(new BillingResultBridge(obj), arrayList);
        }
    }
}
