package q4;

import android.os.Bundle;
import java.util.List;
import n4.a0;
import n4.o;
import n4.p;
import n4.q;
import n4.s;
import n4.y;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class i {

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public interface a {
        void b(i iVar);
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public interface b {
        void a(String str);

        void b();
    }

    public abstract void cancelUnconfirmedClick();

    public abstract void destroy();

    public abstract void enableCustomClickGesture();

    public abstract c getAdChoicesInfo();

    public abstract String getAdvertiser();

    public abstract String getBody();

    public abstract String getCallToAction();

    public abstract Bundle getExtras();

    public abstract String getHeadline();

    public abstract d getIcon();

    public abstract List<d> getImages();

    public abstract o getMediaContent();

    @Deprecated
    public abstract String getMediationAdapterClassName();

    public abstract List<q> getMuteThisAdReasons();

    public abstract String getPrice();

    public abstract y getResponseInfo();

    public abstract Double getStarRating();

    public abstract String getStore();

    @Deprecated
    public abstract a0 getVideoController();

    public abstract boolean isCustomClickGestureEnabled();

    public abstract boolean isCustomMuteThisAdEnabled();

    public abstract void muteThisAd(q qVar);

    public abstract void performClick(Bundle bundle);

    public abstract void recordCustomClickGesture();

    public abstract boolean recordImpression(Bundle bundle);

    public abstract void reportTouchEvent(Bundle bundle);

    public abstract void setMuteThisAdListener(p pVar);

    public abstract void setOnPaidEventListener(s sVar);

    public abstract void setUnconfirmedClickListener(b bVar);

    public abstract Object zza();
}
