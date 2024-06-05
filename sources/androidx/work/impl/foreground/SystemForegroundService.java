package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.t;
import androidx.work.impl.foreground.a;
import androidx.work.p;

public class SystemForegroundService extends t implements a.b {

    /* renamed from: g  reason: collision with root package name */
    private static final String f5250g = p.f("SystemFgService");

    /* renamed from: h  reason: collision with root package name */
    private static SystemForegroundService f5251h = null;

    /* renamed from: b  reason: collision with root package name */
    private Handler f5252b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5253c;

    /* renamed from: d  reason: collision with root package name */
    a f5254d;

    /* renamed from: f  reason: collision with root package name */
    NotificationManager f5255f;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5256a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Notification f5257b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f5258c;

        a(int i10, Notification notification, int i11) {
            this.f5256a = i10;
            this.f5257b = notification;
            this.f5258c = i11;
        }

        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f5256a, this.f5257b, this.f5258c);
            } else {
                SystemForegroundService.this.startForeground(this.f5256a, this.f5257b);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5260a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Notification f5261b;

        b(int i10, Notification notification) {
            this.f5260a = i10;
            this.f5261b = notification;
        }

        public void run() {
            SystemForegroundService.this.f5255f.notify(this.f5260a, this.f5261b);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5263a;

        c(int i10) {
            this.f5263a = i10;
        }

        public void run() {
            SystemForegroundService.this.f5255f.cancel(this.f5263a);
        }
    }

    private void e() {
        this.f5252b = new Handler(Looper.getMainLooper());
        this.f5255f = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f5254d = aVar;
        aVar.m(this);
    }

    public void b(int i10, int i11, Notification notification) {
        this.f5252b.post(new a(i10, notification, i11));
    }

    public void c(int i10, Notification notification) {
        this.f5252b.post(new b(i10, notification));
    }

    public void d(int i10) {
        this.f5252b.post(new c(i10));
    }

    public void onCreate() {
        super.onCreate();
        f5251h = this;
        e();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f5254d.k();
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f5253c) {
            p.c().d(f5250g, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f5254d.k();
            e();
            this.f5253c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f5254d.l(intent);
        return 3;
    }

    public void stop() {
        this.f5253c = true;
        p.c().a(f5250g, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f5251h = null;
        stopSelf();
    }
}
