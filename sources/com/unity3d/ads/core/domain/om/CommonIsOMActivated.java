package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import kotlin.jvm.internal.m;

/* compiled from: CommonIsOMActivated.kt */
public final class CommonIsOMActivated implements IsOMActivated {
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonIsOMActivated(OpenMeasurementRepository openMeasurementRepository2) {
        m.e(openMeasurementRepository2, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository2;
    }

    public boolean invoke() {
        return this.openMeasurementRepository.isOMActive();
    }
}
