package com.unity3d.services.store.gpbl.bridges;

public class PurchaseHistoryRecordBridge extends CommonJsonResponseBridge {
    public PurchaseHistoryRecordBridge(Object obj) {
        super(obj);
    }

    /* access modifiers changed from: protected */
    public String getClassName() {
        return "com.android.billingclient.api.PurchaseHistoryRecord";
    }
}
