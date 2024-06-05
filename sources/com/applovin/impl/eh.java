package com.applovin.impl;

import android.content.Context;
import com.applovin.mediation.MaxReward;

public class eh {

    /* renamed from: a  reason: collision with root package name */
    private final String f7426a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7427b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7428c;

    eh(String str, String str2, Context context) {
        this.f7426a = str.replace("android.permission.", MaxReward.DEFAULT_LABEL);
        this.f7427b = str2;
        this.f7428c = x3.a(str, context);
    }

    public String a() {
        return this.f7427b;
    }

    public String b() {
        return this.f7426a;
    }

    public boolean c() {
        return this.f7428c;
    }
}
