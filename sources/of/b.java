package of;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.startapp.sdk.ads.banner.Banner;
import com.startapp.sdk.ads.banner.BannerListener;
import io.flutter.plugin.platform.e;
import io.flutter.plugin.platform.f;
import lc.c;
import lc.j;
import lc.k;

/* compiled from: FlutterBannerView */
public class b implements f, k.c, ec.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f36789a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Context f36790b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final k f36791c;

    /* compiled from: FlutterBannerView */
    class a implements BannerListener {
        a() {
        }

        public void onClick(View view) {
            if (c.e(b.this.f36790b)) {
                b.this.e(view);
                return;
            }
            b.this.f36789a.setVisibility(8);
            b.this.f36789a.removeAllViews();
        }

        public void onFailedToReceiveAd(View view) {
            b.this.f36789a.setVisibility(8);
            Log.e("start.io", "banner onFailedToReceiveAd");
            b.this.f36791c.c("onFailedToReceiveAd", (Object) null);
        }

        public void onImpression(View view) {
        }

        public void onReceiveAd(View view) {
            b.this.e(view);
        }
    }

    b(Context context, c cVar, int i10) {
        this.f36790b = context;
        this.f36789a = new FrameLayout(context);
        k kVar = new k(cVar, "vn.momo.plugin.startapp.StartAppBannerPlugin_" + i10);
        this.f36791c = kVar;
        kVar.e(this);
    }

    /* access modifiers changed from: private */
    public void e(View view) {
        this.f36789a.removeAllViews();
        this.f36789a.addView(view);
    }

    public void dispose() {
        this.f36789a.removeAllViews();
    }

    public View getView() {
        return this.f36789a;
    }

    public void onAttachedToActivity(ec.c cVar) {
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
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

    public void onMethodCall(j jVar, k.d dVar) {
        if (!"loadAd".equals(jVar.f36116a)) {
            dVar.notImplemented();
        } else if (c.f(this.f36790b)) {
            Log.e("start.io", "banner blocked for 24hrs");
            this.f36789a.setVisibility(8);
            this.f36789a.removeAllViews();
        } else {
            try {
                new Banner((Context) f.f(), (BannerListener) new a()).loadAd();
            } catch (Exception e10) {
                Log.e("start.io", "banner onFailedToReceiveAd with e : " + e10.getMessage());
                this.f36791c.c("onFailedToReceiveAd", (Object) null);
            }
        }
    }

    public void onReattachedToActivityForConfigChanges(ec.c cVar) {
    }
}
