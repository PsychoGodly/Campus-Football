package p1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.p;

/* compiled from: BroadcastReceiverConstraintTracker */
public abstract class c<T> extends d<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final String f21105h = p.f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g  reason: collision with root package name */
    private final BroadcastReceiver f21106g = new a();

    /* compiled from: BroadcastReceiverConstraintTracker */
    class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, t1.a aVar) {
        super(context, aVar);
    }

    public void e() {
        p.c().a(f21105h, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f21110b.registerReceiver(this.f21106g, g());
    }

    public void f() {
        p.c().a(f21105h, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f21110b.unregisterReceiver(this.f21106g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
