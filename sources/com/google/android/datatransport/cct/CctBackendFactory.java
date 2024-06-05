package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import c2.d;
import c2.h;
import c2.m;

@Keep
public class CctBackendFactory implements d {
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
