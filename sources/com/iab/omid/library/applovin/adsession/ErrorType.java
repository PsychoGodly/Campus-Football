package com.iab.omid.library.applovin.adsession;

import com.unity3d.services.core.device.MimeTypes;

public enum ErrorType {
    GENERIC("generic"),
    VIDEO(MimeTypes.BASE_TYPE_VIDEO);
    
    private final String errorType;

    private ErrorType(String str) {
        this.errorType = str;
    }

    public String toString() {
        return this.errorType;
    }
}
