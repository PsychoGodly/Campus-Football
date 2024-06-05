package com.unity3d.services.core.webview.bridge;

/* compiled from: IEventSender.kt */
public interface IEventSender {
    boolean canSend();

    boolean sendEvent(Enum<?> enumR, Enum<?> enumR2, Object... objArr);
}
