package com.unity3d.ads.core.domain.privacy;

import com.unity3d.services.core.misc.JsonFlattenerRules;

/* compiled from: LegacyUserConsentFlattenerRulesUseCase.kt */
public final class LegacyUserConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    public JsonFlattenerRules invoke() {
        return new JsonFlattenerRules(q.g("privacy", "unity", "pipl"), p.b("value"), q.g("ts", "exclude", "pii", "nonBehavioral", "nonbehavioral"));
    }
}
