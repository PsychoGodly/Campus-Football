package t4;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.n1;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class y extends r {
    public y(Activity activity) {
        super(activity);
    }

    public final void zzk(Bundle bundle) {
        n1.a("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f22730u = 4;
        this.f22711a.finish();
    }
}
