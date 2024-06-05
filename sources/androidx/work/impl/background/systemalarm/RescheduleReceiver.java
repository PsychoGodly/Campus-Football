package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.p;
import k1.i;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5204a = p.f("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        p.c().a(f5204a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                i.m(context).v(goAsync());
            } catch (IllegalStateException e10) {
                p.c().b(f5204a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
            }
        } else {
            context.startService(b.e(context));
        }
    }
}
