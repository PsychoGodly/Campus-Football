package cb;

import android.content.Context;
import bb.d;
import com.applovin.mediation.MaxReward;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: SignalsCollectorBase */
public abstract class e implements c {

    /* compiled from: SignalsCollectorBase */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31953a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                bb.d[] r0 = bb.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31953a = r0
                bb.d r1 = bb.d.f31611c     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31953a     // Catch:{ NoSuchFieldError -> 0x001d }
                bb.d r1 = bb.d.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31953a     // Catch:{ NoSuchFieldError -> 0x0028 }
                bb.d r1 = bb.d.REWARDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cb.e.a.<clinit>():void");
        }
    }

    /* compiled from: SignalsCollectorBase */
    private class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private b f31954a;

        /* renamed from: b  reason: collision with root package name */
        private f f31955b;

        public b(b bVar, f fVar) {
            this.f31954a = bVar;
            this.f31955b = fVar;
        }

        public void run() {
            Map<String, String> c10 = this.f31955b.c();
            if (c10.size() > 0) {
                this.f31954a.onSignalsCollected(new JSONObject(c10).toString());
            } else if (this.f31955b.b() == null) {
                this.f31954a.onSignalsCollected(MaxReward.DEFAULT_LABEL);
            } else {
                this.f31954a.onSignalsCollectionFailed(this.f31955b.b());
            }
        }
    }

    public void a(Context context, String str, d dVar, b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        aVar.a();
        c(context, str, dVar, aVar, fVar);
        aVar.c(new b(bVar, fVar));
    }

    public void b(Context context, boolean z10, b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        aVar.a();
        d(context, d.INTERSTITIAL, aVar, fVar);
        aVar.a();
        d(context, d.REWARDED, aVar, fVar);
        if (z10) {
            aVar.a();
            d(context, d.f31611c, aVar, fVar);
        }
        aVar.c(new b(bVar, fVar));
    }

    public String e(d dVar) {
        int i10 = a.f31953a[dVar.ordinal()];
        if (i10 == 1) {
            return "gmaScarBiddingBannerSignal";
        }
        if (i10 != 2) {
            return i10 != 3 ? MaxReward.DEFAULT_LABEL : "gmaScarBiddingRewardedSignal";
        }
        return "gmaScarBiddingInterstitialSignal";
    }

    public void f(String str, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        fVar.d(String.format("Operation Not supported: %s.", new Object[]{str}));
        aVar.b();
    }
}
