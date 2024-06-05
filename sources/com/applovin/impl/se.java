package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

public class se {

    /* renamed from: a  reason: collision with root package name */
    private a f12104a;

    /* renamed from: b  reason: collision with root package name */
    private String f12105b;

    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    private se(a aVar, String str) {
        this.f12104a = aVar;
        this.f12105b = str;
    }

    public a a() {
        return this.f12104a;
    }

    public String b() {
        return this.f12105b;
    }

    public static se a(be beVar) {
        String Q = beVar.Q();
        if (TextUtils.isEmpty(Q)) {
            return null;
        }
        return new se(a.AD, Q);
    }

    public static se a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new se(a.AD_FORMAT, label);
    }

    public static se a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new se(a.AD_UNIT_ID, str);
    }
}
