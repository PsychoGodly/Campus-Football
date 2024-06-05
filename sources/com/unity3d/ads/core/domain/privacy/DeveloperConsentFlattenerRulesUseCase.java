package com.unity3d.ads.core.domain.privacy;

import com.unity3d.services.core.misc.JsonFlattenerRules;

/* compiled from: DeveloperConsentFlattenerRulesUseCase.kt */
public final class DeveloperConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    public JsonFlattenerRules invoke() {
        return new JsonFlattenerRules(q.g("privacy", "gdpr", "pipl", "user"), p.b("value"), q.g("ts"));
    }
}
