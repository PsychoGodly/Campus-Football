package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import vb.h0;
import vb.i0;
import vb.k0;
import vb.l0;
import vb.m0;
import vb.n0;

/* compiled from: AndroidDeveloperConsentDataSource.kt */
public final class AndroidDeveloperConsentDataSource implements DeveloperConsentDataSource {
    private final FlattenerRulesUseCase flattenerRulesUseCase;
    private final JsonStorage publicStorage;

    public AndroidDeveloperConsentDataSource(FlattenerRulesUseCase flattenerRulesUseCase2, JsonStorage jsonStorage) {
        m.e(flattenerRulesUseCase2, "flattenerRulesUseCase");
        m.e(jsonStorage, "publicStorage");
        this.flattenerRulesUseCase = flattenerRulesUseCase2;
        this.publicStorage = jsonStorage;
    }

    private final List<m0> developerConsentList() {
        ArrayList arrayList = new ArrayList();
        JSONObject fetchData = fetchData();
        Iterator<String> keys = fetchData.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = fetchData.get(next);
            i0.a aVar = i0.f38977b;
            m0.a j02 = m0.j0();
            m.d(j02, "newBuilder()");
            i0 a10 = aVar.a(j02);
            a10.d(getDeveloperConsentType(next));
            if (a10.b() == n0.DEVELOPER_CONSENT_TYPE_CUSTOM) {
                m.d(next, "key");
                a10.c(next);
            }
            a10.e(getDeveloperConsentChoice((Boolean) obj));
            arrayList.add(a10.a());
        }
        return arrayList;
    }

    private final JSONObject fetchData() {
        if (this.publicStorage.getData() == null) {
            return new JSONObject();
        }
        JSONObject flattenJson = new JsonFlattener(this.publicStorage.getData()).flattenJson(".", this.flattenerRulesUseCase.invoke());
        m.d(flattenJson, "flattener.flattenJson(\".… flattenerRulesUseCase())");
        return flattenJson;
    }

    private final l0 getDeveloperConsentChoice(Boolean bool) {
        if (m.a(bool, Boolean.TRUE)) {
            return l0.DEVELOPER_CONSENT_CHOICE_TRUE;
        }
        if (m.a(bool, Boolean.FALSE)) {
            return l0.DEVELOPER_CONSENT_CHOICE_FALSE;
        }
        return l0.DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
    }

    private final n0 getDeveloperConsentType(String str) {
        if (str == null) {
            return n0.DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
        }
        switch (str.hashCode()) {
            case -1998919769:
                if (str.equals("user.nonbehavioral")) {
                    return n0.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case -1078801183:
                if (str.equals("pipl.consent")) {
                    return n0.DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
                }
                break;
            case -5454905:
                if (str.equals(JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY)) {
                    return n0.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case 194451659:
                if (str.equals("gdpr.consent")) {
                    return n0.DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
                }
                break;
            case 519433140:
                if (str.equals("privacy.consent")) {
                    return n0.DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
                }
                break;
            case 2033752033:
                if (str.equals("privacy.useroveragelimit")) {
                    return n0.DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
                }
                break;
        }
        return n0.DEVELOPER_CONSENT_TYPE_CUSTOM;
    }

    public k0 getDeveloperConsent() {
        h0.a aVar = h0.f38966b;
        k0.a j02 = k0.j0();
        m.d(j02, "newBuilder()");
        h0 a10 = aVar.a(j02);
        a10.b(a10.c(), developerConsentList());
        return a10.a();
    }
}
