package androidx.media2.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.concurrent.futures.d;

class MediaControllerImplLegacy$2 extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f4216a;

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i10, Bundle bundle) {
        this.f4216a.q(new SessionResult(i10, bundle));
    }
}
