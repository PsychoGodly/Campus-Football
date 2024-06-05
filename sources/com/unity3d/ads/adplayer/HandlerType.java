package com.unity3d.ads.adplayer;

/* compiled from: HandlerType.kt */
public enum HandlerType {
    CALLBACK("handleCallback"),
    INVOCATION("handleInvocation"),
    EVENT("handleEvent");
    
    private final String jsPath;

    private HandlerType(String str) {
        this.jsPath = str;
    }

    public final String getJsPath() {
        return this.jsPath;
    }
}
