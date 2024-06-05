package com.onesignal;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.onesignal.x2;

public class SyncService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        x2.q().b(this, new x2.a(this));
        return 1;
    }
}
