package com.applovin.impl.privacy.cmp;

import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinCmpError;

public class CmpErrorImpl implements AppLovinCmpError {

    /* renamed from: a  reason: collision with root package name */
    private final AppLovinCmpError.Code f10721a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10722b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10723c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10724d;

    public CmpErrorImpl(AppLovinCmpError.Code code, String str) {
        this(code, str, -1, MaxReward.DEFAULT_LABEL);
    }

    public int getCmpCode() {
        return this.f10723c;
    }

    public String getCmpMessage() {
        return this.f10724d;
    }

    public AppLovinCmpError.Code getCode() {
        return this.f10721a;
    }

    public String getMessage() {
        return this.f10722b;
    }

    public String toString() {
        return "CmpErrorImpl(code=" + getCode() + ", message=" + getMessage() + ", cmpCode=" + getCmpCode() + ", cmpMessage=" + getCmpMessage() + ")";
    }

    public CmpErrorImpl(AppLovinCmpError.Code code, String str, int i10, String str2) {
        this.f10721a = code;
        this.f10722b = str;
        this.f10723c = i10;
        this.f10724d = str2;
    }
}
