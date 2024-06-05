package com.facebook.ads.internal.api;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;

@Keep
public class AdViewConstructorParams {
    public static final int CONTEXT = 0;
    public static final int CONTEXT_ATTRS = 1;
    public static final int CONTEXT_ATTRS_STYLE_ATTR = 2;
    public static final int CONTEXT_ATTRS_STYLE_ATTR_STYLE_RES = 3;
    private final AttributeSet mAttributeSet;
    private final Context mContext;
    private final int mDefStyleAttr;
    private final int mDefStyleRes;
    private final int mInitializationType = 0;

    public AdViewConstructorParams(Context context) {
        this.mContext = context;
        this.mAttributeSet = null;
        this.mDefStyleAttr = 0;
        this.mDefStyleRes = 0;
    }

    public AttributeSet getAttributeSet() {
        return this.mAttributeSet;
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getDefStyleAttr() {
        return this.mDefStyleAttr;
    }

    public int getDefStyleRes() {
        return this.mDefStyleRes;
    }

    public int getInitializationType() {
        return this.mInitializationType;
    }

    public AdViewConstructorParams(Context context, AttributeSet attributeSet) {
        this.mContext = context;
        this.mAttributeSet = attributeSet;
        this.mDefStyleAttr = 0;
        this.mDefStyleRes = 0;
    }

    public AdViewConstructorParams(Context context, AttributeSet attributeSet, int i10) {
        this.mContext = context;
        this.mAttributeSet = attributeSet;
        this.mDefStyleAttr = i10;
        this.mDefStyleRes = 0;
    }

    public AdViewConstructorParams(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.mContext = context;
        this.mAttributeSet = attributeSet;
        this.mDefStyleAttr = i10;
        this.mDefStyleRes = i11;
    }
}
