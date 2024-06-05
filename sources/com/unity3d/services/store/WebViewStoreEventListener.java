package com.unity3d.services.store;

import com.unity3d.ads.core.extensions.JsonSerializableExtensionsKt;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import org.json.JSONArray;

/* compiled from: WebViewStoreEventListener.kt */
public final class WebViewStoreEventListener implements StoreEventListener {
    private final boolean isLifecycleListener;
    private final int operationId;
    private final StoreWebViewEventSender storeWebViewEventSender;

    public WebViewStoreEventListener(int i10, StoreWebViewEventSender storeWebViewEventSender2, boolean z10) {
        m.e(storeWebViewEventSender2, "storeWebViewEventSender");
        this.operationId = i10;
        this.storeWebViewEventSender = storeWebViewEventSender2;
        this.isLifecycleListener = z10;
    }

    public int getOperationId() {
        return this.operationId;
    }

    public void onBillingServiceDisconnected() {
        this.storeWebViewEventSender.send(StoreEvent.DISCONNECTED_RESULT, new Object[0]);
    }

    public void onBillingSetupFinished(BillingResultBridge billingResultBridge) {
        m.e(billingResultBridge, "billingResult");
        if (billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
            StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
            StoreEvent storeEvent = StoreEvent.INITIALIZATION_REQUEST_RESULT;
            BillingResultResponseCode responseCode = billingResultBridge.getResponseCode();
            m.d(responseCode, "billingResult.responseCode");
            storeWebViewEventSender2.send(storeEvent, responseCode);
            return;
        }
        StoreWebViewEventSender storeWebViewEventSender3 = this.storeWebViewEventSender;
        StoreEvent storeEvent2 = StoreEvent.INITIALIZATION_REQUEST_FAILED;
        BillingResultResponseCode responseCode2 = billingResultBridge.getResponseCode();
        m.d(responseCode2, "billingResult.responseCode");
        storeWebViewEventSender3.send(storeEvent2, responseCode2);
    }

    public void onFeatureSupported(int i10) {
        this.storeWebViewEventSender.send(StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_RESULT, Integer.valueOf(getOperationId()), Integer.valueOf(i10));
    }

    public void onIsAlreadyInitialized() {
        this.storeWebViewEventSender.send(StoreEvent.INITIALIZATION_REQUEST_RESULT, Integer.valueOf(BillingResultResponseCode.OK.getResponseCode()));
    }

    public void onPurchaseHistoryUpdated(BillingResultBridge billingResultBridge, List<? extends PurchaseHistoryRecordBridge> list) {
        JSONArray jSONArray;
        m.e(billingResultBridge, "billingResult");
        StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        StoreEvent storeEvent = StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_RESULT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(getOperationId());
        BillingResultResponseCode responseCode = billingResultBridge.getResponseCode();
        m.d(responseCode, "billingResult.responseCode");
        objArr[1] = responseCode;
        if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
            jSONArray = new JSONArray();
        }
        objArr[2] = jSONArray;
        storeWebViewEventSender2.send(storeEvent, objArr);
    }

    public void onPurchaseResponse(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list) {
        JSONArray jSONArray;
        m.e(billingResultBridge, "billingResult");
        ArrayList arrayList = new ArrayList();
        if (getOperationId() != -1) {
            arrayList.add(Integer.valueOf(getOperationId()));
        }
        if (billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
            if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
                jSONArray = new JSONArray();
            }
            arrayList.add(jSONArray);
            StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
            StoreEvent storeEvent = this.isLifecycleListener ? StoreEvent.PURCHASES_ON_RESUME_RESULT : StoreEvent.PURCHASES_REQUEST_RESULT;
            Object[] array = arrayList.toArray(new Object[0]);
            storeWebViewEventSender2.send(storeEvent, Arrays.copyOf(array, array.length));
            return;
        }
        arrayList.add(billingResultBridge.getResponseCode());
        StoreWebViewEventSender storeWebViewEventSender3 = this.storeWebViewEventSender;
        StoreEvent storeEvent2 = this.isLifecycleListener ? StoreEvent.PURCHASES_ON_RESUME_ERROR : StoreEvent.PURCHASES_REQUEST_ERROR;
        Object[] array2 = arrayList.toArray(new Object[0]);
        storeWebViewEventSender3.send(storeEvent2, Arrays.copyOf(array2, array2.length));
    }

    public void onPurchaseUpdated(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list) {
        JSONArray jSONArray;
        m.e(billingResultBridge, "billingResult");
        if (billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
            StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
            StoreEvent storeEvent = StoreEvent.PURCHASES_UPDATED_RESULT;
            Object[] objArr = new Object[1];
            if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
                jSONArray = new JSONArray();
            }
            objArr[0] = jSONArray;
            storeWebViewEventSender2.send(storeEvent, objArr);
            return;
        }
        StoreWebViewEventSender storeWebViewEventSender3 = this.storeWebViewEventSender;
        StoreEvent storeEvent2 = StoreEvent.PURCHASES_UPDATED_ERROR;
        BillingResultResponseCode responseCode = billingResultBridge.getResponseCode();
        m.d(responseCode, "billingResult.responseCode");
        storeWebViewEventSender3.send(storeEvent2, responseCode);
    }

    public void onSkuDetailsUpdated(BillingResultBridge billingResultBridge, List<? extends SkuDetailsBridge> list) {
        JSONArray jSONArray;
        m.e(billingResultBridge, "billingResult");
        StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        StoreEvent storeEvent = StoreEvent.SKU_DETAILS_LIST_REQUEST_RESULT;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(getOperationId());
        if (list == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(list)) == null) {
            jSONArray = new JSONArray();
        }
        objArr[1] = jSONArray;
        storeWebViewEventSender2.send(storeEvent, objArr);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebViewStoreEventListener(int i10, StoreWebViewEventSender storeWebViewEventSender2, boolean z10, int i11, h hVar) {
        this(i10, storeWebViewEventSender2, (i11 & 4) != 0 ? false : z10);
    }
}
