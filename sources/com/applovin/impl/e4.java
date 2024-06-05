package com.applovin.impl;

import com.applovin.impl.g4;
import com.applovin.impl.sdk.k;
import java.util.List;

public abstract class e4 {
    public static List a(k kVar) {
        Boolean b10;
        if (!kVar.t().k()) {
            return null;
        }
        if (kVar.t().e() == g4.a.UNIFIED && (b10 = y3.c().b(k.k())) != null && b10.booleanValue()) {
            return null;
        }
        boolean w02 = kVar.w0();
        Boolean bool = (Boolean) kVar.a(qj.f11011o, (Object) Boolean.FALSE);
        if (!w02) {
            return b(kVar);
        }
        if (bool.booleanValue()) {
            return b(kVar);
        }
        return null;
    }

    private static List b(k kVar) {
        if (kVar.t().i() != null) {
            return m4.b(kVar);
        }
        return m4.a(kVar);
    }

    public static List c(k kVar) {
        if (!kVar.t().k()) {
            return null;
        }
        return m4.c(kVar);
    }
}
