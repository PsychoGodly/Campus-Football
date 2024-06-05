package y4;

import com.google.android.gms.ads.internal.util.n1;
import n4.n;
import u4.a;
import u4.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class d extends b {
    d(e eVar) {
    }

    public final void onAdFailedToLoad(n nVar) {
        int a10 = nVar.a();
        n1.a("Failed to load ad with error code: " + a10);
    }

    public final /* synthetic */ void onAdLoaded(Object obj) {
        a aVar = (a) obj;
        n1.a("Ad is loaded.");
    }
}
