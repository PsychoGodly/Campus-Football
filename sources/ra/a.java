package ra;

import android.content.Context;
import com.unity3d.ads.metadata.MetaData;
import java.util.Map;

/* compiled from: PrivacyConsent */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f30115a;

    private String a(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1062165910:
                if (str.equals("ageGate")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3048017:
                if (str.equals("ccpa")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3168159:
                if (str.equals("gdpr")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3441077:
                if (str.equals("pipl")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "privacy.useroveragelimit";
            case 1:
                return "privacy.consent";
            case 2:
                return "gdpr.consent";
            case 3:
                return "pipl.consent";
            default:
                return str;
        }
    }

    public boolean b(Map<?, ?> map) {
        MetaData metaData = new MetaData(this.f30115a);
        boolean z10 = metaData.set(a((String) map.get("privacyConsent_type")), (Object) (Boolean) map.get("privacyConsent_value"));
        metaData.commit();
        return z10;
    }

    public void c(Context context) {
        this.f30115a = context;
    }
}
