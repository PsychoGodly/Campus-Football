package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.m;

/* compiled from: NotificationOpenedReceiverBase.kt */
public abstract class o0 extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n0.g(this, getIntent());
        finish();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        m.e(intent, "intent");
        super.onNewIntent(intent);
        n0.g(this, getIntent());
        finish();
    }
}
