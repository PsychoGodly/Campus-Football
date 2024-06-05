package of;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import dc.a;
import io.flutter.plugin.platform.h;
import lc.c;
import lc.j;
import lc.k;

/* compiled from: StartAppBannerPlugin */
public class f implements dc.a, ec.a {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static Activity f36797b;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public StartAppAd f36798a;

    /* compiled from: StartAppBannerPlugin */
    class a implements AdDisplayListener {
        a() {
        }

        public void adClicked(Ad ad2) {
            c.e(f.f36797b);
        }

        public void adDisplayed(Ad ad2) {
        }

        public void adHidden(Ad ad2) {
        }

        public void adNotDisplayed(Ad ad2) {
        }
    }

    /* compiled from: StartAppBannerPlugin */
    class b implements AdEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f36800a;

        b(k kVar) {
            this.f36800a = kVar;
        }

        public void onFailedToReceiveAd(Ad ad2) {
            this.f36800a.c("onFailedToReceiveAd", ad2.getErrorMessage());
            Log.e("StartAppPlugin", "Failed to load rewarded video with reason: " + ad2.getErrorMessage());
        }

        public void onReceiveAd(Ad ad2) {
            f.this.f36798a.showAd();
            this.f36800a.c("onReceiveAd", (Object) null);
        }
    }

    private void e(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        boolean z10 = true;
        try {
            z10 = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData.getBoolean("vn.momo.plugin.startapp.SPLASH_AD_ENABLED", true);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (!z10) {
            StartAppAd.disableSplash();
        }
        StartAppSDK.setTestAdsEnabled(false);
        f36797b = activity;
        this.f36798a = new StartAppAd(applicationContext);
        c.c(f36797b);
    }

    public static Activity f() {
        return f36797b;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void g(k kVar) {
        kVar.c("onVideoCompleted", (Object) null);
        Log.d("onVideoCompleted", "Complete");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(k kVar, j jVar, k.d dVar) {
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1009162322:
                if (str.equals("showRewardedAd")) {
                    c10 = 0;
                    break;
                }
                break;
            case -903145472:
                if (str.equals("showAd")) {
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
            case 1143927581:
                if (str.equals("enableReturnAds")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f36798a.setVideoListener(new d(kVar));
                this.f36798a.loadAd(StartAppAd.AdMode.REWARDED_VIDEO, (AdEventListener) new b(kVar));
                dVar.success((Object) null);
                return;
            case 1:
                if (c.f(f36797b)) {
                    dVar.error("User blocked for 24h", (String) null, (Object) null);
                    return;
                }
                this.f36798a.showAd((AdDisplayListener) new a());
                dVar.success((Object) null);
                return;
            case 2:
                String str2 = (String) jVar.a("app_id");
                if (str2 == null) {
                    dVar.error("start.io init: app id must not be null", (String) null, (Object) null);
                    return;
                }
                StartAppSDK.setTestAdsEnabled(false);
                StartAppSDK.init((Context) f36797b, str2, true);
                Log.i("start_app", "init app_id start.io : " + str2);
                dVar.success((Object) null);
                return;
            case 3:
                Boolean bool = (Boolean) jVar.a("enableReturnAds");
                if (bool == null) {
                    bool = Boolean.FALSE;
                }
                Log.e("start.io", "enableReturnAds: " + bool);
                StartAppSDK.enableReturnAds(bool.booleanValue());
                dVar.success((Object) null);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }

    private void i(h hVar, c cVar) {
        hVar.a("vn.momo.plugin.startapp.StartAppBannerPlugin", new a(cVar));
        k kVar = new k(cVar, "flutter_startapp");
        kVar.e(new e(this, kVar));
    }

    public void onAttachedToActivity(ec.c cVar) {
        e(cVar.getActivity());
    }

    public void onAttachedToEngine(a.b bVar) {
        i(bVar.e(), bVar.b());
    }

    public void onDetachedFromActivity() {
        f36797b = null;
        this.f36798a = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(a.b bVar) {
    }

    public void onReattachedToActivityForConfigChanges(ec.c cVar) {
        e(cVar.getActivity());
    }
}
