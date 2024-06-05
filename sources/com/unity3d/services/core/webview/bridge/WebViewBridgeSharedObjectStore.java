package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.bridge.IWebViewSharedObject;
import java.util.concurrent.ConcurrentHashMap;

public abstract class WebViewBridgeSharedObjectStore<T extends IWebViewSharedObject> implements IWebViewBridgeSharedObjectStore<T> {
    private ConcurrentHashMap<String, T> _sharedObjects = new ConcurrentHashMap<>();

    public T get(String str) {
        if (str == null) {
            return null;
        }
        return (IWebViewSharedObject) this._sharedObjects.get(str);
    }

    public void remove(T t10) {
        if (t10 != null) {
            remove(t10.getId());
        }
    }

    public void set(T t10) {
        if (t10 != null) {
            this._sharedObjects.put(t10.getId(), t10);
        }
    }

    public void remove(String str) {
        this._sharedObjects.remove(str);
    }
}
