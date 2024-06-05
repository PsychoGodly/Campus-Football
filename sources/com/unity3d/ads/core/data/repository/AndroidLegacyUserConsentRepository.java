package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import kotlin.jvm.internal.m;

/* compiled from: AndroidLegacyUserConsentRepository.kt */
public final class AndroidLegacyUserConsentRepository implements LegacyUserConsentRepository {
    private final LegacyUserConsentDataSource legacyUserConsentDataSource;

    public AndroidLegacyUserConsentRepository(LegacyUserConsentDataSource legacyUserConsentDataSource2) {
        m.e(legacyUserConsentDataSource2, "legacyUserConsentDataSource");
        this.legacyUserConsentDataSource = legacyUserConsentDataSource2;
    }

    public String getLegacyFlowUserConsent() {
        return this.legacyUserConsentDataSource.getPrivacyData();
    }
}
