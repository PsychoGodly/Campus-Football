package com.unity3d.services.ads.operation;

import com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation;

public abstract class AdOperation implements IAdOperation {
    private static String invocationClassName = "webview";
    private String _invocationMethodName;
    private IWebViewBridgeInvocation _webViewBridgeInvocation;

    protected AdOperation(IWebViewBridgeInvocation iWebViewBridgeInvocation, String str) throws NullPointerException {
        this._invocationMethodName = str;
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("invocationMethodName cannot be null");
        }
        this._webViewBridgeInvocation = iWebViewBridgeInvocation;
        if (iWebViewBridgeInvocation == null) {
            throw new IllegalArgumentException("webViewBridgeInvocation cannot be null");
        }
    }

    public void invoke(int i10, Object... objArr) {
        this._webViewBridgeInvocation.invoke(invocationClassName, this._invocationMethodName, i10, objArr);
    }
}
