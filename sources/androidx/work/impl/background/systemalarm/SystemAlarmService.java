package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.t;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.p;
import s1.j;

public class SystemAlarmService extends t implements e.c {

    /* renamed from: d  reason: collision with root package name */
    private static final String f5205d = p.f("SystemAlarmService");

    /* renamed from: b  reason: collision with root package name */
    private e f5206b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5207c;

    private void e() {
        e eVar = new e(this);
        this.f5206b = eVar;
        eVar.m(this);
    }

    public void a() {
        this.f5207c = true;
        p.c().a(f5205d, "All commands completed in dispatcher", new Throwable[0]);
        j.a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        e();
        this.f5207c = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f5207c = true;
        this.f5206b.j();
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f5207c) {
            p.c().d(f5205d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f5206b.j();
            e();
            this.f5207c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f5206b.a(intent, i11);
        return 3;
    }
}
