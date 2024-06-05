package pa;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.domain.GetAndroidAdPlayerContext;
import com.unity3d.ads.metadata.PlayerMetaData;
import dc.a;
import ec.c;
import java.util.Map;
import lc.j;
import lc.k;

/* compiled from: UnityAdsPlugin */
public class d implements a, k.c, ec.a {

    /* renamed from: h  reason: collision with root package name */
    private static final String f29667h = "pa.d";

    /* renamed from: a  reason: collision with root package name */
    private k f29668a;

    /* renamed from: b  reason: collision with root package name */
    private Context f29669b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f29670c;

    /* renamed from: d  reason: collision with root package name */
    private a f29671d;

    /* renamed from: f  reason: collision with root package name */
    private qa.a f29672f;

    /* renamed from: g  reason: collision with root package name */
    private ra.a f29673g;

    private boolean a(Map<?, ?> map) {
        boolean z10;
        String str = (String) map.get(GetAndroidAdPlayerContext.KEY_GAME_ID);
        boolean z11 = false;
        if (b()) {
            String str2 = (String) map.get("firebaseTestLabMode");
            if ("disableAds".equalsIgnoreCase(str2)) {
                return false;
            }
            z10 = "showAdsInTestMode".equalsIgnoreCase(str2);
        } else {
            z10 = false;
        }
        Boolean bool = (Boolean) map.get("testMode");
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        Context context = this.f29669b;
        if (bool.booleanValue() || z10) {
            z11 = true;
        }
        UnityAds.initialize(context, str, z11, new b(this.f29668a));
        return true;
    }

    private boolean b() {
        return "true".equalsIgnoreCase(Settings.System.getString(this.f29669b.getContentResolver(), "firebase.test.lab"));
    }

    private boolean c(Map<?, ?> map) {
        String str = (String) map.get("placementId");
        try {
            UnityAds.load(str, new c(this.f29671d));
            return true;
        } catch (Exception e10) {
            String str2 = f29667h;
            Log.e(str2, "Exception occurs during loading ad: " + str, e10);
            this.f29671d.b("loadFailed", str, "unknown", e10.getMessage());
            return false;
        }
    }

    private boolean d(Map<?, ?> map) {
        String str = (String) map.get("placementId");
        String str2 = (String) map.get("serverId");
        if (str2 != null) {
            PlayerMetaData playerMetaData = new PlayerMetaData(this.f29669b);
            playerMetaData.setServerId(str2);
            playerMetaData.commit();
        }
        try {
            UnityAds.show(this.f29670c, str, (IUnityAdsShowListener) new e(this.f29671d));
            return true;
        } catch (Exception e10) {
            String str3 = f29667h;
            Log.e(str3, "Exception occurs during loading ad: " + str, e10);
            this.f29671d.b("showFailed", str, "unknown", e10.getMessage());
            return false;
        }
    }

    public void onAttachedToActivity(c cVar) {
        Activity activity = cVar.getActivity();
        this.f29670c = activity;
        this.f29672f.a(activity);
        this.f29673g.c(this.f29670c);
    }

    public void onAttachedToEngine(a.b bVar) {
        k kVar = new k(bVar.b(), "com.rebeloid.unity_ads");
        this.f29668a = kVar;
        kVar.e(this);
        this.f29669b = bVar.a();
        lc.c b10 = bVar.b();
        this.f29671d = new a(b10);
        this.f29673g = new ra.a();
        this.f29672f = new qa.a(b10);
        bVar.e().a("com.rebeloid.unity_ads/bannerAd", this.f29672f);
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f29668a.e((k.c) null);
    }

    public void onMethodCall(j jVar, k.d dVar) {
        Map map = (Map) jVar.f36117b;
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1911971970:
                if (str.equals("showVideo")) {
                    c10 = 0;
                    break;
                }
                break;
            case -176012470:
                if (str.equals("isInitialized")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3237136:
                if (str.equals("init")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3327206:
                if (str.equals("load")) {
                    c10 = 3;
                    break;
                }
                break;
            case 880184853:
                if (str.equals("privacyConsent_set")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                dVar.success(Boolean.valueOf(d(map)));
                return;
            case 1:
                dVar.success(Boolean.valueOf(UnityAds.isInitialized()));
                return;
            case 2:
                dVar.success(Boolean.valueOf(a(map)));
                return;
            case 3:
                dVar.success(Boolean.valueOf(c(map)));
                return;
            case 4:
                dVar.success(Boolean.valueOf(this.f29673g.b(map)));
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
    }
}
