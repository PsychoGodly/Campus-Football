package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import kotlin.jvm.internal.m;
import xd.d;

/* compiled from: CommonGetOmData.kt */
public final class CommonGetOmData implements GetOmData {
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonGetOmData(OpenMeasurementRepository openMeasurementRepository2) {
        m.e(openMeasurementRepository2, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository2;
    }

    public Object invoke(d<? super OMData> dVar) {
        return this.openMeasurementRepository.getOmData();
    }
}
