package com.unity3d.ads.core.data.datasource;

import kotlin.jvm.internal.m;
import vb.m2;
import vb.v;

/* compiled from: PrivacyDeviceInfoDataSource.kt */
public interface PrivacyDeviceInfoDataSource {

    /* compiled from: PrivacyDeviceInfoDataSource.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ m2 fetch$default(PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource, v vVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    vVar = v.h0();
                    m.d(vVar, "getDefaultInstance()");
                }
                return privacyDeviceInfoDataSource.fetch(vVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
        }
    }

    m2 fetch(v vVar);
}
