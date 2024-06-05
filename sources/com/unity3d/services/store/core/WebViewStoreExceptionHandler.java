package com.unity3d.services.store.core;

import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.store.StoreError;
import com.unity3d.services.store.StoreEvent;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.m;
import org.json.JSONException;

/* compiled from: WebViewStoreExceptionHandler.kt */
public final class WebViewStoreExceptionHandler implements StoreExceptionHandler {
    private final WebViewErrorHandler _webViewErrorHandler;

    public WebViewStoreExceptionHandler(WebViewErrorHandler webViewErrorHandler) {
        m.e(webViewErrorHandler, "_webViewErrorHandler");
        this._webViewErrorHandler = webViewErrorHandler;
    }

    private final StoreError getStoreError(Exception exc) {
        if (exc instanceof NoSuchMethodException) {
            return StoreError.NO_SUCH_METHOD;
        }
        if (exc instanceof IllegalAccessException) {
            return StoreError.ILLEGAL_ACCESS;
        }
        if (exc instanceof JSONException) {
            return StoreError.JSON_ERROR;
        }
        if (exc instanceof InvocationTargetException) {
            return StoreError.INVOCATION_TARGET;
        }
        if (exc instanceof ClassNotFoundException) {
            return StoreError.CLASS_NOT_FOUND;
        }
        return StoreError.UNKNOWN_ERROR;
    }

    private final void sendErrorToWebView(StoreEvent storeEvent, StoreError storeError, int i10, Exception exc) {
        this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.m) new StoreWebViewError(storeEvent, exc.getMessage(), Integer.valueOf(i10), storeError, exc.getMessage()));
    }

    public void handleStoreException(StoreEvent storeEvent, int i10, Exception exc) {
        m.e(storeEvent, "storeEvent");
        m.e(exc, "exception");
        sendErrorToWebView(storeEvent, getStoreError(exc), i10, exc);
    }
}
