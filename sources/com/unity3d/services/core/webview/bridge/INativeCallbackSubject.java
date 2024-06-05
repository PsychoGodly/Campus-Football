package com.unity3d.services.core.webview.bridge;

/* compiled from: INativeCallbackSubject.kt */
public interface INativeCallbackSubject {
    NativeCallback getCallback(String str);

    void remove(NativeCallback nativeCallback);
}
