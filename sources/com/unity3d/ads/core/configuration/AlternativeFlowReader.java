package com.unity3d.ads.core.configuration;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.configuration.ConfigurationReader;
import kotlin.jvm.internal.m;
import se.k0;
import se.v;

/* compiled from: AlternativeFlowReader.kt */
public final class AlternativeFlowReader {
    private final ConfigurationReader configurationReader;
    private final v<Boolean> isAlternativeFlowEnabled;
    private final v<Boolean> isAlternativeFlowRead;
    private final SessionRepository sessionRepository;

    public AlternativeFlowReader(ConfigurationReader configurationReader2, SessionRepository sessionRepository2) {
        m.e(configurationReader2, "configurationReader");
        m.e(sessionRepository2, "sessionRepository");
        this.configurationReader = configurationReader2;
        this.sessionRepository = sessionRepository2;
        Boolean bool = Boolean.FALSE;
        this.isAlternativeFlowRead = k0.a(bool);
        this.isAlternativeFlowEnabled = k0.a(bool);
    }

    public final boolean invoke() {
        if (!this.isAlternativeFlowRead.getValue().booleanValue()) {
            this.isAlternativeFlowEnabled.setValue(Boolean.valueOf(this.configurationReader.getCurrentConfiguration().getExperiments().isBoldSdkNextSessionEnabled() || this.sessionRepository.getNativeConfiguration().s0().f0()));
            this.isAlternativeFlowRead.setValue(Boolean.TRUE);
        }
        return this.isAlternativeFlowEnabled.getValue().booleanValue();
    }
}
