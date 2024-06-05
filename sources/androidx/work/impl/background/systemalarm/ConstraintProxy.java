package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.c;
import androidx.work.p;
import androidx.work.q;
import java.util.List;

abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5198a = p.f("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    static void a(Context context, List<r1.p> list) {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        for (r1.p pVar : list) {
            c cVar = pVar.f21935j;
            z10 |= cVar.f();
            z11 |= cVar.g();
            z12 |= cVar.i();
            z13 |= cVar.b() != q.NOT_REQUIRED;
            if (z10 && z11 && z12 && z13) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, z10, z11, z12, z13));
    }

    public void onReceive(Context context, Intent intent) {
        p.c().a(f5198a, String.format("onReceive : %s", new Object[]{intent}), new Throwable[0]);
        context.startService(b.a(context));
    }
}
