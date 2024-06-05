package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.onesignal.k0;

public class FCMIntentJobService extends JobIntentService {

    class a implements k0.e {
        a() {
        }

        public void a(k0.f fVar) {
        }
    }

    public static void j(Context context, Intent intent) {
        JobIntentService.d(context, FCMIntentJobService.class, 123890, intent, false);
    }

    /* access modifiers changed from: protected */
    public void g(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            k3.e1(this);
            k0.h(this, extras, new a());
        }
    }

    public /* bridge */ /* synthetic */ boolean h() {
        return super.h();
    }

    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
