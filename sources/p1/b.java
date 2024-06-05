package p1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.p;
import com.applovin.sdk.AppLovinEventTypes;
import t1.a;

/* compiled from: BatteryNotLowTracker */
public class b extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    private static final String f21104i = p.f("BatteryNotLowTracker");

    public b(Context context, a aVar) {
        super(context, aVar);
    }

    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    public void h(Context context, Intent intent) {
        if (intent.getAction() != null) {
            p.c().a(f21104i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                d(Boolean.TRUE);
            } else if (action.equals("android.intent.action.BATTERY_LOW")) {
                d(Boolean.FALSE);
            }
        }
    }

    /* renamed from: i */
    public Boolean b() {
        Intent registerReceiver = this.f21110b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            p.c().b(f21104i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
