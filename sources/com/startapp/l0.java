package com.startapp;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: Sta */
public class l0 {

    /* renamed from: a  reason: collision with root package name */
    public Context f16076a;

    /* renamed from: b  reason: collision with root package name */
    public String f16077b;

    public l0(Context context, AttributeSet attributeSet) {
        this.f16076a = context;
        this.f16077b = a(attributeSet, "adTag");
    }

    public final String a(AttributeSet attributeSet, String str) {
        String str2;
        try {
            int attributeResourceValue = attributeSet.getAttributeResourceValue((String) null, str, -1);
            if (attributeResourceValue != -1) {
                str2 = this.f16076a.getResources().getString(attributeResourceValue);
            } else {
                str2 = attributeSet.getAttributeValue((String) null, str);
            }
            return str2;
        } catch (Exception unused) {
            return null;
        }
    }
}
