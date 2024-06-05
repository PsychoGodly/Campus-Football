package ya;

import android.content.Context;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.m;
import sd.s;

/* compiled from: UserMessagingPlatformPlugin.kt */
public final class g {
    /* access modifiers changed from: private */
    public static final ConsentRequestParameters d(Object obj, Context context) {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj2 = map.get("tagForUnderAgeOfConsent");
            if (obj2 != null) {
                builder.setTagForUnderAgeOfConsent(((Boolean) obj2).booleanValue());
            }
            Object obj3 = map.get("debugSettings");
            if (obj3 != null) {
                Map map2 = (Map) obj3;
                ConsentDebugSettings.Builder builder2 = new ConsentDebugSettings.Builder(context);
                Object obj4 = map2.get("testDeviceIds");
                if (obj4 != null) {
                    for (Object next : (List) obj4) {
                        Objects.requireNonNull(next, "null cannot be cast to non-null type kotlin.String");
                        builder2.addTestDeviceHashedId((String) next);
                    }
                }
                Object obj5 = map2.get("geography");
                if (obj5 != null) {
                    builder2.setDebugGeography(Integer.valueOf(e((String) obj5)).intValue());
                }
                builder.setConsentDebugSettings(builder2.build());
            }
        }
        ConsentRequestParameters build = builder.build();
        m.d(build, "parametersBuilder.build()");
        return build;
    }

    private static final int e(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1039725586) {
            if (hashCode != 68513) {
                if (hashCode == 270940796 && str.equals("disabled")) {
                    return 0;
                }
            } else if (str.equals("EEA")) {
                return 1;
            }
        } else if (str.equals("notEEA")) {
            return 2;
        }
        throw new IllegalArgumentException(m.m("Unknown DebugGeography: ", str));
    }

    private static final String f(int i10) {
        if (i10 == 0) {
            return "unknown";
        }
        if (i10 == 1) {
            return "notRequired";
        }
        if (i10 == 2) {
            return "required";
        }
        if (i10 == 3) {
            return "obtained";
        }
        throw new IllegalArgumentException(m.m("Unknown ConsentStatus: ", Integer.valueOf(i10)));
    }

    /* access modifiers changed from: private */
    public static final Map<String, String> g(ConsentInformation consentInformation) {
        return k0.j(s.a("consentStatus", f(consentInformation.getConsentStatus())), s.a("formStatus", i(consentInformation)));
    }

    /* access modifiers changed from: private */
    public static final String h(int i10) {
        if (i10 == 1) {
            return "internal";
        }
        if (i10 == 2) {
            return "network";
        }
        if (i10 == 3) {
            return "invalidOperation";
        }
        if (i10 == 4) {
            return "timeout";
        }
        throw new IllegalArgumentException(m.m("Unknown FormErrorCode: ", Integer.valueOf(i10)));
    }

    private static final String i(ConsentInformation consentInformation) {
        return consentInformation.isConsentFormAvailable() ? "available" : "unavailable";
    }
}
