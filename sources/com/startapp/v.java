package com.startapp;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: Sta */
public class v implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedBlockingQueue<IBinder> f17385a = new LinkedBlockingQueue<>(1);

    /* renamed from: b  reason: collision with root package name */
    public boolean f17386b = false;

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f17385a.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
