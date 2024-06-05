package tc;

import android.content.Intent;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import java.util.concurrent.CountDownLatch;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Intent f38565a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f38566b;

    public /* synthetic */ d(Intent intent, CountDownLatch countDownLatch) {
        this.f38565a = intent;
        this.f38566b = countDownLatch;
    }

    public final void run() {
        FlutterFirebaseMessagingBackgroundService.f33863l.d(this.f38565a, this.f38566b);
    }
}
