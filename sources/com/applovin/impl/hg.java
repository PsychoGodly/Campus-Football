package com.applovin.impl;

import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.List;

public interface hg {
    ig getAdEventTracker();

    String getOpenMeasurementContentUrl();

    String getOpenMeasurementCustomReferenceData();

    List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources();

    boolean isOpenMeasurementEnabled();
}
