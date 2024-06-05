package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.log.DeviceLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Invocation {
    private static AtomicInteger _idCount = new AtomicInteger(0);
    private static Map<Integer, Invocation> _invocationSets;
    private IInvocationCallbackInvoker _invocationCallbackInvoker;
    private int _invocationId;
    private ArrayList<ArrayList<Object>> _invocations;
    private ArrayList<ArrayList<Object>> _responses;
    private final IWebViewBridge _webViewBridge;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Invocation() {
        /*
            r2 = this;
            com.unity3d.services.core.webview.bridge.SharedInstances r0 = com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE
            com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker r1 = r0.getWebViewAppInvocationCallbackInvoker()
            com.unity3d.services.core.webview.bridge.IWebViewBridge r0 = r0.getWebViewBridge()
            r2.<init>(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.webview.bridge.Invocation.<init>():void");
    }

    public static synchronized Invocation getInvocationById(int i10) {
        synchronized (Invocation.class) {
            Map<Integer, Invocation> map = _invocationSets;
            if (map == null || !map.containsKey(Integer.valueOf(i10))) {
                return null;
            }
            Invocation invocation = _invocationSets.get(Integer.valueOf(i10));
            return invocation;
        }
    }

    public void addInvocation(String str, String str2, Object[] objArr, WebViewCallback webViewCallback) {
        if (this._invocations == null) {
            this._invocations = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(objArr);
        arrayList.add(webViewCallback);
        this._invocations.add(arrayList);
    }

    public int getId() {
        return this._invocationId;
    }

    public ArrayList<ArrayList<Object>> getResponses() {
        return this._responses;
    }

    public boolean nextInvocation() {
        ArrayList<ArrayList<Object>> arrayList = this._invocations;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        ArrayList remove = this._invocations.remove(0);
        String str = (String) remove.get(0);
        String str2 = (String) remove.get(1);
        Object[] objArr = (Object[]) remove.get(2);
        try {
            this._webViewBridge.handleInvocation(str, str2, objArr, (WebViewCallback) remove.get(3));
        } catch (Exception e10) {
            DeviceLog.exception(String.format("Error handling invocation %s.%s(%s)", new Object[]{str, str2, Arrays.toString(objArr)}), e10);
        }
        return true;
    }

    public void sendInvocationCallback() {
        _invocationSets.remove(Integer.valueOf(getId()));
        this._invocationCallbackInvoker.invokeCallback(this);
    }

    public void setInvocationResponse(CallbackStatus callbackStatus, Enum enumR, Object... objArr) {
        if (this._responses == null) {
            this._responses = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(callbackStatus);
        arrayList.add(enumR);
        arrayList.add(objArr);
        this._responses.add(arrayList);
    }

    public Invocation(IWebViewBridge iWebViewBridge) {
        this(SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker(), iWebViewBridge);
    }

    public Invocation(IInvocationCallbackInvoker iInvocationCallbackInvoker, IWebViewBridge iWebViewBridge) {
        this._invocationCallbackInvoker = iInvocationCallbackInvoker;
        this._webViewBridge = iWebViewBridge;
        this._invocationId = _idCount.getAndIncrement();
        if (_invocationSets == null) {
            _invocationSets = new HashMap();
        }
        _invocationSets.put(Integer.valueOf(this._invocationId), this);
    }
}
