package com.applovin.mediation.adapter.parameters;

import android.os.Bundle;
import java.util.Map;

public interface MaxAdapterParameters {
    String getAdUnitId();

    String getConsentString();

    Bundle getCustomParameters();

    Map<String, Object> getLocalExtraParameters();

    Bundle getServerParameters();

    Boolean hasUserConsent();

    Boolean isAgeRestrictedUser();

    Boolean isDoNotSell();

    boolean isTesting();
}
