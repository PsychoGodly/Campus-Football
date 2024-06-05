package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.MediationDataSource;
import fe.a;
import kotlin.jvm.internal.m;
import vb.f0;

/* compiled from: AndroidMediationRepository.kt */
public final class AndroidMediationRepository implements MediationRepository {
    private final MediationDataSource mediationDataSource;

    public AndroidMediationRepository(MediationDataSource mediationDataSource2) {
        m.e(mediationDataSource2, "mediationDataSource");
        this.mediationDataSource = mediationDataSource2;
    }

    public a<f0> getMediationProvider() {
        return new AndroidMediationRepository$mediationProvider$1(this);
    }

    public String getName() {
        return this.mediationDataSource.getName();
    }

    public String getVersion() {
        return this.mediationDataSource.getVersion();
    }
}
