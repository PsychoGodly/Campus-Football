package g5;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class t extends u<Void> {
    t(int i10, int i11, Bundle bundle) {
        super(i10, 2, bundle);
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new v(4, "Invalid response to one way request", (Throwable) null));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return true;
    }
}
