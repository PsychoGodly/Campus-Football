package com.onesignal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.jvm.internal.m;

/* compiled from: IntentGeneratorForAttachingToNotifications.kt */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f27656a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<?> f27657b = NotificationOpenedReceiver.class;

    /* renamed from: c  reason: collision with root package name */
    private final Class<?> f27658c = NotificationOpenedReceiverAndroid22AndOlder.class;

    public e0(Context context) {
        m.e(context, "context");
        this.f27656a = context;
    }

    private final Intent c() {
        Intent intent = new Intent(this.f27656a, this.f27658c);
        intent.addFlags(403177472);
        return intent;
    }

    private final Intent d() {
        return new Intent(this.f27656a, this.f27657b);
    }

    public final PendingIntent a(int i10, Intent intent) {
        m.e(intent, "oneSignalIntent");
        return PendingIntent.getActivity(this.f27656a, i10, intent, 201326592);
    }

    public final Intent b(int i10) {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 23) {
            intent = d();
        } else {
            intent = c();
        }
        Intent addFlags = intent.putExtra("androidNotificationId", i10).addFlags(603979776);
        m.d(addFlags, "intent\n            .putE…Y_CLEAR_TOP\n            )");
        return addFlags;
    }
}
