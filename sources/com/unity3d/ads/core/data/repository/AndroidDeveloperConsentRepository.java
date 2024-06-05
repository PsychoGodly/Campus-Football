package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import kotlin.jvm.internal.m;
import vb.k0;

/* compiled from: AndroidDeveloperConsentRepository.kt */
public final class AndroidDeveloperConsentRepository implements DeveloperConsentRepository {
    private final k0 developerConsent;

    public AndroidDeveloperConsentRepository(DeveloperConsentDataSource developerConsentDataSource) {
        m.e(developerConsentDataSource, "developerConsentDataSource");
        this.developerConsent = developerConsentDataSource.getDeveloperConsent();
    }

    public k0 getDeveloperConsent() {
        return this.developerConsent;
    }
}
