package qa;

import android.app.Activity;
import android.view.View;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import io.flutter.plugin.platform.e;
import io.flutter.plugin.platform.f;
import java.util.Map;
import lc.k;

/* compiled from: BannerAdView */
public class c implements f {

    /* renamed from: b  reason: collision with root package name */
    private static final UnityBannerSize f29764b = new UnityBannerSize(320, 50);

    /* renamed from: a  reason: collision with root package name */
    private final BannerView f29765a;

    public c(Activity activity, int i10, Map<?, ?> map, lc.c cVar) {
        k kVar = new k(cVar, "com.rebeloid.unity_ads/bannerAd_" + i10);
        Integer num = (Integer) map.get("width");
        Integer num2 = (Integer) map.get("height");
        BannerView bannerView = new BannerView(activity, (String) map.get("placementId"), (num == null || num2 == null) ? f29764b : new UnityBannerSize(num.intValue(), num2.intValue()));
        this.f29765a = bannerView;
        bannerView.setListener(new b(kVar));
        bannerView.load();
    }

    public void dispose() {
    }

    public View getView() {
        return this.f29765a;
    }

    public /* synthetic */ void onFlutterViewAttached(View view) {
        e.a(this, view);
    }

    public /* synthetic */ void onFlutterViewDetached() {
        e.b(this);
    }

    public /* synthetic */ void onInputConnectionLocked() {
        e.c(this);
    }

    public /* synthetic */ void onInputConnectionUnlocked() {
        e.d(this);
    }
}
