package com.onesignal;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.k0;

public class FCMIntentService extends IntentService {

    class a implements k0.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f27486a;

        a(Intent intent) {
            this.f27486a = intent;
        }

        public void a(k0.f fVar) {
            n0.a.b(this.f27486a);
        }
    }

    public FCMIntentService() {
        super("FCMIntentService");
        setIntentRedelivery(true);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            k3.e1(this);
            k0.h(this, extras, new a(intent));
        }
    }
}
