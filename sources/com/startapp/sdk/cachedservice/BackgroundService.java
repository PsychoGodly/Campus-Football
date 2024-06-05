package com.startapp.sdk.cachedservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: Sta */
public final class BackgroundService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        return 3;
    }
}
