package g5;

import android.os.Bundle;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class w extends u<Bundle> {
    w(int i10, int i11, Bundle bundle) {
        super(i10, 1, bundle);
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(JsonStorageKeyNames.DATA_KEY);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return false;
    }
}
