package kc;

import android.os.Build;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import lc.j;
import lc.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LocalizationChannel */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final k f35827a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public b f35828b;

    /* renamed from: c  reason: collision with root package name */
    public final k.c f35829c;

    /* compiled from: LocalizationChannel */
    class a implements k.c {
        a() {
        }

        public void onMethodCall(j jVar, k.d dVar) {
            if (g.this.f35828b != null) {
                String str = jVar.f36116a;
                str.hashCode();
                if (!str.equals("Localization.getStringResource")) {
                    dVar.notImplemented();
                    return;
                }
                JSONObject jSONObject = (JSONObject) jVar.b();
                try {
                    dVar.success(g.this.f35828b.a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                } catch (JSONException e10) {
                    dVar.error("error", e10.getMessage(), (Object) null);
                }
            }
        }
    }

    /* compiled from: LocalizationChannel */
    public interface b {
        String a(String str, String str2);
    }

    public g(zb.a aVar) {
        a aVar2 = new a();
        this.f35829c = aVar2;
        k kVar = new k(aVar, "flutter/localization", lc.g.f36115a);
        this.f35827a = kVar;
        kVar.e(aVar2);
    }

    public void b(List<Locale> list) {
        xb.b.f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale next : list) {
            xb.b.f("LocalizationChannel", "Locale (Language: " + next.getLanguage() + ", Country: " + next.getCountry() + ", Variant: " + next.getVariant() + ")");
            arrayList.add(next.getLanguage());
            arrayList.add(next.getCountry());
            arrayList.add(Build.VERSION.SDK_INT >= 21 ? next.getScript() : MaxReward.DEFAULT_LABEL);
            arrayList.add(next.getVariant());
        }
        this.f35827a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.f35828b = bVar;
    }
}
