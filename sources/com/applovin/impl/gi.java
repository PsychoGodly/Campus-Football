package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;

public abstract class gi implements m2 {

    /* renamed from: a  reason: collision with root package name */
    public static final m2.a f8032a = lx.f9284a;

    gi() {
    }

    /* access modifiers changed from: private */
    public static gi a(Bundle bundle) {
        int i10 = bundle.getInt(a(0), -1);
        if (i10 == 0) {
            return (gi) ja.f8713d.a(bundle);
        }
        if (i10 == 1) {
            return (gi) dh.f7240c.a(bundle);
        }
        if (i10 == 2) {
            return (gi) zk.f13939d.a(bundle);
        }
        if (i10 == 3) {
            return (gi) Cdo.f7289d.a(bundle);
        }
        throw new IllegalArgumentException("Encountered unknown rating type: " + i10);
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
